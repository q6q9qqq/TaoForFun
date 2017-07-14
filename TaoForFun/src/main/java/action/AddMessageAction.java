package action;

import model.Message;
import model.User;
import service.MessageService;

public class AddMessageAction {
	
	private static final long serialVersionUID = 1L;
	
	private String accepter;
	private String content;
	
	private MessageService messageService;
	
	public void setAccepter(String accepter){
		this.accepter = accepter;
	}
	
	public String getAccepter(){
		return accepter;
	}
	
	public String getContent(){
		return content;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	
	public void setMessageService(MessageService messageService){
		this.messageService = messageService;
	}
	
	@Override
	public String execute() throws Exception{
		String sender = ((User) session.get("user")).getUsername();
		java.sql.Timestamp time = new java.sql.Timestamp(new java.util.Date().getTime());
		Message message = new Message(sender, accepter, content, time);
		if(messageService.addMessage(message))
			return SUCCESS;
		else
			return "input";
	}
	
	
	
}
