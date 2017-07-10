package action;

import java.sql.Date;

import model.Weibo;
import service.WeiboService;

public class AddPersonalWeiboAction extends BaseAction{
	private static final long serialVersionUID = 1L;

	private String username;
	private String content;
	private Date time;
	
	private WeiboService weiboService;
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getContent(){
		return content;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	
	public Date getTime(){
		return time;
	}
	
	public void setTime(Date time){
		this.time = time;
	}
	
	public void setWeiboService(WeiboService weiboService){
		this.weiboService = weiboService;
	}
	
	@Override
	public String execute() throws Exception {
		Weibo weibo = new Weibo(username, content, time);
		weiboService.addWeibo(weibo);
		return SUCCESS;
	}
	
}
