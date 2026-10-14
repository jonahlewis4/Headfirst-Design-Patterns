public class StereoOnWithCDCommand implements Command {
    Stereo stereo;
    Stereo.MediaType prevType;
    boolean prevIsOn;
    int prevVolume;
    public StereoOnWithCDCommand(Stereo stereo) {
        prevType = stereo.getCurrentMediaType();
        prevIsOn = stereo.getIsOn();
        prevVolume = stereo.getVolume();
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        prevIsOn = stereo.getIsOn();
        prevType = stereo.getCurrentMediaType();
        prevVolume = stereo.getVolume();
        stereo.setCd();
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.setVolume(prevVolume);
        switch (prevType) {
            case Stereo.MediaType.DVD -> stereo.setDvd();
            case Stereo.MediaType.CD -> stereo.setCd();
            case Stereo.MediaType.RADIO -> stereo.setRadio();
        }
        if (prevIsOn) {
            stereo.on();
        } else {
            stereo.off();
        }
    }
}
