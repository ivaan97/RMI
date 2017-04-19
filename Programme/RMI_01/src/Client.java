import java.rmi.*;
import java.rmi.registry.*;

import javax.swing.JOptionPane;

public class Client {
	
	public static void main(String [] args) {
		
	try {
		
		if (args.length < 1) {
		System.out.println("Usage: java HelloClient <rmiregistry host>");
		return;
		}
		
		String host = args[0];
		
		// Get remote object reference
		Registry registry = LocateRegistry.getRegistry(host,4242);
		Quadrat h = (Quadrat) registry.lookup("Hello1");
		
		// Remote method invocation
		long z1 = 0;
		String input = null;
		input = JOptionPane.showInputDialog("Geben Sie die zu quadrierende Zahl ein!");
		z1 = Integer.parseInt(input);
		z1 = h.power(z1);
		JOptionPane.showConfirmDialog(null, z1);
		
	} catch (Exception e) {
		System.err.println("Error on client: " + e) ;
		}
	}
}