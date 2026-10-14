

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
    protected MyRemoteImpl() throws RemoteException {
    }

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            System.out.println("RMI Registry started on port 1099.");

            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (RemoteException | MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }
}
