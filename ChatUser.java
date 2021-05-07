package Mediator;

public class ChatUser extends User {
	
	public ChatUser(MessageMediator Mediator, String name) {
		super(Mediator, name);
		Mediator.addUser(this);
	}

	@Override
	public void send(String message) {
		
		System.out.println(this.name + " sends: " + message);
		Mediator.sendMessage(message, this);

	}

	@Override
	public void receive(String message) {
		
		System.out.println(this.name + " received: " + message);

	}

}

