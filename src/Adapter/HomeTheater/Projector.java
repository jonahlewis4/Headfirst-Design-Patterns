public class Projector {
    private final String brandPrefix = "Top-O-Line Projector";
    public void on() {
        System.out.println(brandPrefix + " on");
    }

    public void wideScreenMode() {
        System.out.println(brandPrefix + " in widescreen mode (16x9 aspect ratio)");
    }

    public void off() {
        System.out.println(brandPrefix + " off");
    }
}
