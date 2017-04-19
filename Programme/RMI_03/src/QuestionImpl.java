import java.rmi.*;
import java.rmi.server.*;

public class QuestionImpl	implements Question {
	
	public QuestionImpl(){
		super();
	}
	

	public String question(String q1) throws RemoteException{
		String response = "Die Antwort auf deine Frage <" + q1 + "> ist wahrscheinlich 62!";
		return response;
	}
	
}