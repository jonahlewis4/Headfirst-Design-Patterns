public class GarageDoor {
    private String roomName;
    public GarageDoor(String roomName) {
        this.roomName = roomName;
    }

    void up(){
        System.out.println(roomName + " Garage door going up");
    }
    void down(){
        System.out.println(roomName + " Garage door going down");

    }
    void stop(){
        System.out.println(roomName + " Garage door stopping");
    }
    void lightOn(){
        System.out.println(roomName + " Garage door light is on");
    }
    void lightOff(){
        System.out.println(roomName + " Garage door light is off");
    }
}
