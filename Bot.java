package Mediator;

public class Bot {
	
private static Bot instance;
	
	public Bot() {
		
	}
	
	
	public static Bot getInstance() {
		
		if(instance == null) {
			instance = new Bot();
		}		
		
		return instance;
		
	}
	
	public boolean checkmessage(String message) {
		
		if(message.contains("Cat")) {
			
			System.out.println("This particular word is not accepted: " + message);
			System.out.println("User removed.");
			return false;
			
		}
		
		return true;
	}
	
}