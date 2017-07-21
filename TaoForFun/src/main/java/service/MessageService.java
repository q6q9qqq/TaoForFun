package service;

import java.util.List;
import model.Message;

public interface MessageService {
	public boolean addMessage(Message message);
	
	public void deleteMessage(Message message);
	
	public Message getMessageByMessageid(int messageid);
	
	public List<Message> getMessageBySender(String sender);
	

}
