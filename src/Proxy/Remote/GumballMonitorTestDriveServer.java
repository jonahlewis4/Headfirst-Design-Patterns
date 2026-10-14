import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class GumballMonitorTestDriveServer {
    public static void main(String[] args) throws RemoteException {
        int count = 0;

        if(args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            GumballMachine gumballMachine = new GumballMachine(args[0], count);
            LocateRegistry.createRegistry(1099);
            Naming.rebind("//localhost/" + args[0] + "/gumballmachine", gumballMachine);

            //GumballMachineTestDrive.testMachine(gumballMachine);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
