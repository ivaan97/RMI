import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import javax.swing.JOptionPane;


public class Namensdienst {

	public static void main (String args[]) throws RemoteException {
		LocateRegistry.createRegistry(4242);
		
		JOptionPane.showConfirmDialog(null, "Beenden");
	}
	
}
