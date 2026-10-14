public class CeilingFanMediumCommand implements Command {
    CeilingFan ceilingFan;
    CeilingFan.Speed prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.prevSpeed = ceilingFan.getSpeed();
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.Speed.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.Speed.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.Speed.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.Speed.OFF) {
            ceilingFan.off();
        }
    }
}