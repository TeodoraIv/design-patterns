package Mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {

	private List<User> users;
	private Bot bot;
	
	public Chat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {		
		this.users.add(user);		
	}

	@Override
	public void sendMessage(String message, User user) {
		
		if(message.contains("addBot")) {			
			this.bot = 	Bot.getInstance();
			System.out.println("Bot has entered the room.");			
		}
		
		if(bot != null) {
			this.users.remove(user);	
			
			if(bot.checkmessage(message)){
				
				for(User chatUser : this.users) {		
					if(user != chatUser) {
						chatUser.receive(message);
						
					}
				}	
			}
		}			
	}

	@Override
	public void removeUser(User user) {	
		this.users.remove(user);	
	}

}
