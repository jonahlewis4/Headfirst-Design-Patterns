public class Amplifier {
    final String brandPrefix = "Top-O-Line Amplifier";
    public void on() {
        System.out.println(brandPrefix + " on");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println(brandPrefix + " setting DVD player to " + dvd.getName());
    }

    public void setSurroundSound() {
        System.out.println(brandPrefix + " surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int i) {
        System.out.println(brandPrefix + " setting volume to " + i);
    }

    public void off() {
        System.out.println(brandPrefix + " off");
    }
}
