package action;

import java.util.ArrayList;
import java.util.List;

import model.User;
import model.Message;


import service.MessageService;
import service.UserService;

public class ShowMessagesAction {
	
	private static final long serialVersionUID = 1L;
	
	private MessageService messageService;
	private UserService userService;
	
	public void setMessageService(MessageService messageService){
		this.messageService = messageService;
	}
	
	public void setUserService(UserService userService){
		this.userService = userService;
	}
	
	@Override
	public String execute() throws Exception{
		String sender = ((User) session.get("user")).getUsername();
		List<Message> messages = messageService.getMessageBySender(sender);
		List<User> users = new ArrayList<User>();
		for(Message message : messages){
			String accepter = message.getAccepter();
			User user = userService.getUserByUsername(accepter);
			users.add(user);
		}
		request.put("users",users);
		return SUCCESS;
	}
}
