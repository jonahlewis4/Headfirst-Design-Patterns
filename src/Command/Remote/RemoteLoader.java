public class RemoteLoader {
    public static void main(String[] args) {
        Light light = new Light("Living Room");
        Light tv = new Light("Living Room TV");
        Stereo stereo = new Stereo("Living Room");


        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        LightOnCommand tvOn = new LightOnCommand(tv);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        LightOffCommand tvOff = new LightOffCommand(tv);

        Command[] partyOn = {lightOn, stereoOn, tvOn};
        Command[] partyOff = {lightOff, stereoOff, tvOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
    }
}