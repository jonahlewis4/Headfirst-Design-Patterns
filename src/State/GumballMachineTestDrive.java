package State;

import java.rmi.RemoteException;

public class GumballMachineTestDrive {
    public static void main(String[] args) throws RemoteException {
        GumballMachine gumballMachine = new GumballMachine("machine", 1000);
        testMachine(gumballMachine);

        while(gumballMachine.state != gumballMachine.soldOutState) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
        }

        System.out.println(gumballMachine);
    }
    public static void testMachine(GumballMachine gumballMachine) {
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}