package State;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {


    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    String location;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(String location, int numberGumballs) throws RemoteException {
        this.count = numberGumballs;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        if(numberGumballs > 0) {
            state = noQuarterState;
        }
        this.location = location;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if(count != 0) {
            count--;
        }
    }

    State getNoQuarterState() {
        return noQuarterState;
    }
    State getSoldState() {
        return soldState;
    }
    State getHasQuarterState() {
        return hasQuarterState;
    }
    State getSoldOutState() {
        return soldOutState;
    }
    State getWinnerState() {
        return winnerState;
    }
    void setState(State state) {
        this.state = state;
    }

    @Override
    public State getState() {
        return state;
    }
    public int getCount() {
        return count;
    }
    public void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }
    public String getLocation() {
        return location;
    }
    @Override
    public String toString() {
        return "\nInventory: " + count + " gumball" + (count != 1 ? "s" : "") +
                "\nMachine is " + state + "\n";
    }
}
