public class Stereo {

    public enum MediaType {
        NONE, CD, DVD, RADIO
    }

    private String location;
    private MediaType currentMediaType;
    private int volume;
    boolean isOn;

    public Stereo(String location) {
        this.location = location;
        this.currentMediaType = MediaType.NONE;
    }

    void on() {
        isOn = true;
        System.out.println(location + " stereo is on");
    }

    void off() {
        isOn = false;
        System.out.println(location + " stereo is off");
    }

    void setCd() {
        this.currentMediaType = MediaType.CD;
        System.out.println(location + " stereo is set for CD input");
    }

    void setDvd() {
        this.currentMediaType = MediaType.DVD;
        System.out.println(location + " stereo is set for DVD input");
    }

    void setRadio() {
        this.currentMediaType = MediaType.RADIO;
        System.out.println(location + " stereo is set for Radio input");
    }

    void setVolume(int volume) {
        this.volume = volume;
        System.out.println(location + " stereo volume set to " + volume);
    }

    public MediaType getCurrentMediaType() {
        return currentMediaType;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getIsOn() {
        return false;
    }

}