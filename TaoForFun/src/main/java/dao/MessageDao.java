package dao;

import java.util.List;
import model.Message;

public interface MessageDao {
	public Integer save(Message message);
	
	public void delete(Message message);
	
	public Message getMessageByMessageid(int messageid);
	
	public List<Message> getMessageBySender(String sender);
	
	public List<Message> getMessageByBoth(String sender, String accepter);
}
