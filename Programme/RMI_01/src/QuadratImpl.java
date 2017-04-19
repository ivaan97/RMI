import java.rmi.*;
import java.rmi.server.*;

public class QuadratImpl	implements Quadrat {
	
	public QuadratImpl(){
		super();
	}
	

	public long power(long z) throws RemoteException{
		return z*z;
	}
	
}