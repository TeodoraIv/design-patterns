package Mediator;

public abstract class User {

	protected MessageMediator Mediator;
	protected String name;
	
	public User(MessageMediator Mediator, String name) {
		this.Mediator = Mediator;
		this.name = name;
	}
	
	public abstract void send(String message);
	
	public abstract void receive(String message);

}