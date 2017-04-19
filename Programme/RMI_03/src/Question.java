import java.rmi.*;

public interface Question	extends Remote {
	public String question(String q1) throws RemoteException;
}
