public class CeilingFan {
    String roomName;
    public enum Speed {
        HIGH, MEDIUM, LOW, OFF
    }
    Speed speed;
    public CeilingFan(String roomName) {
        this.roomName = roomName;
        speed = Speed.OFF;
    }

    public void high() {
        speed = Speed.HIGH;
        System.out.println(roomName + " ceiling fan is on high");
    }
    public void medium() {
        speed = Speed.MEDIUM;
        System.out.println(roomName + " ceiling fan is on medium");
    }
    public void low() {
        speed = Speed.LOW;
        System.out.println(roomName + " ceiling fan is on low");
    }
    public void off() {
        speed = Speed.OFF;
        System.out.println(roomName + " ceiling fan is off");
    }

    public Speed getSpeed() {
        return speed;
    }
}
