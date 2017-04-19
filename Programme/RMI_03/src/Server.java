import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class Server {
	
	public static void main(String [] args){
		
		try {
			long longval = 2;
			// Create a Hello remote object
			QuestionImpl h = new QuestionImpl();
			Question h_stub = (Question) UnicastRemoteObject.exportObject(h, 0);
			
			
			// Register the remote object in RMI registry with a given identifier
			Registry registry= LocateRegistry.getRegistry(4242);
			registry.bind("Hello1", h_stub);
			
			System.out.println ("Server ready");
			
		} catch (Exception e) {
			
			System.err.println("Error on server :" + e) ;
			e.printStackTrace();
		}
	}
}
