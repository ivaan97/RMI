import java.rmi.*;

public interface Quadrat	extends Remote {
	public long power(long z1) throws RemoteException;
}
