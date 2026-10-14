public class DvdPlayer {
    final String brandPrefix = "Top-O-Line DVD Player";
    String movie = "(no movie selected)";
    public void on() {
        System.out.println(brandPrefix + " on");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println(brandPrefix + " playing " + movie);
    }

    public void stop() {
        System.out.println(brandPrefix + " stopped " + movie);
    }

    public void eject() {
        System.out.println(brandPrefix + " eject");
        this.movie = "(no movie selected)";
    }

    public void off() {
        System.out.println(brandPrefix + " off");
    }

    public String getName() {
        return brandPrefix;
    }
}
