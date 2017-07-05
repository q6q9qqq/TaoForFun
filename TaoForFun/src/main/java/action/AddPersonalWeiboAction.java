package action;

import model.Weibo;
import service.WeiboService;

public class AddPersonalWeiboAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	
	private String content;
	
	
	public String getContent(){
		return content;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	
	public void setWeiboService(WeiboService weiboService){
		this.weiboService = weiboService;
	}
	
	public String checkWeibo(){
		if(session.get("weibo") == null){
			if (!((content == null || content.length()<=0)||(content.length()>140))){
				Weibo weibo = new Weibo(content);
				session.put("weibo",weibo);
				return "success";
			}
			else
				return "input";
		}
		else	
			return "input";
	}
	
	
}
