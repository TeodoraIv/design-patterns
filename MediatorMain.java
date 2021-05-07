package Mediator;

public class MediatorMain {

	public static void main(String[] args) {
		
		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Anna");
		User user2 = new ChatUser(chat, "Tim");
		User user3 = new ChatUser(chat, "Peter");
		
		user2.send("Hi!");
		user3.send("addBot");
		user2.send("Cat");
		user1.send("Test");

	}

}