package model;

import java.sql.Date;

public class Message {
	private int messageid;
	private String sender;
	private String accepter;
	private String content;
	private Date time;


	public Message(){
		
	}
	
	public Message(String sender, String accepter, String content, Date time){
		this.sender = sender;
		this.accepter = accepter;
		this.content = content;
		this.time = time;
	}
	
	public void setMessageid(int messageid){
		this.messageid = messageid;
	}
	
	public int getMessageid(){
		return messageid;
	}
	
	public void setSender(String sender){
		this.sender = sender;
	}
	
	public String getSender(){
		return sender;
	}
	
	public void setAccepter(String accepter){
		this.accepter = accepter;
	}
	
	public String getAccepter(){
		return accepter;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	
	public String getContent(){
		return content;
	}
	
	public void setTime(Date time){
		this.time = time;
	}
	
	public Date getTime(){
		return time;
	}


}



