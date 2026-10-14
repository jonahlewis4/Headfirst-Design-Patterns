public class GarageDoorDownCommand implements Command {
    GarageDoor door;
    GarageDoorDownCommand(GarageDoor door) {
        this.door = door;
    }
    @Override
    public void execute() {
        door.down();
        door.lightOff();
    }

    @Override
    public void undo() {
        door.up();
        door.lightOn();
    }
}
