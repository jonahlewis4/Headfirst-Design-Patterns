public class StereoOffCommand  implements  Command{
    private Stereo stereo;
    private Stereo.MediaType prevType;
    private int prevVolume;
    public StereoOffCommand(Stereo stereo) {
        this.prevType = stereo.getCurrentMediaType();
        this.prevVolume = stereo.getVolume();
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        prevVolume = stereo.getVolume();
        prevType = stereo.getCurrentMediaType();
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setVolume(prevVolume);
        switch (prevType) {
            case Stereo.MediaType.DVD -> stereo.setDvd();
            case Stereo.MediaType.CD -> stereo.setCd();
            case Stereo.MediaType.RADIO -> stereo.setRadio();
        }
    }
}
