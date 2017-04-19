import java.rmi.*;
import java.rmi.registry.*;

import javax.swing.JOptionPane;

public class Client {
	
	public static void main(String [] args) {
		
	try {
		
		if (args.length < 1) {
		System.out.println("Usage: java Client <rmiregistry host>");
		return;
		}
		
		String host = args[0];
		
		// Get remote object reference
		Registry registry = LocateRegistry.getRegistry(host,4242);
		Question h = (Question) registry.lookup("Hello1");
		
		// Remote method invocation
		String q1 = null;
		String input = null;
		input = JOptionPane.showInputDialog("Geben Sie die Frage ein!");
		q1 = h.question(input);
		JOptionPane.showConfirmDialog(null, q1);
		
	} catch (Exception e) {
		System.err.println("Error on client: " + e) ;
		}
	}
}