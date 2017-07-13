package action;

import model.Message;
import service.MessageService;

public class DeleteMessageAction {
	
	private static final long serialVersionUID = 1L;
	
	private int messageid;
	private MessageService messageService;
	
	public int getMessageid(){
		return messageid;
	}
	
	public void setMessageid(int messageid){
		this.messageid = messageid;
	}
	
	public void setMessageService(MessageService messageService){
		this.messageService =messageService;
	}
	
	@Override
	public String execute() throws Exception{
		Message message = messageService.getMessageByMessageid(messageid);
		messageService.deleteMessage(message);
		
		return "success";
		
	
	}
}
