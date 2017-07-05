package action;

import model.Weibo;
import service.WeiboService;

public class ShowWeiboAction extends BaseAction{
	private static final long serialVersionUID = 1L;
	
	private list<Weibo> weiboList;
	private WeiboService weiboService;
	
	
	public list<Weibo> getWeiboList(){
		return weiboList;
	}
	
	public void setWeiboList(list<Weibo> weiboList){
		this.weiboList = weiboList;
	}
	
	public String checkShowWeibo(){
		if(weiboService.getAllWeibo() != null){
			if(session.get("weibo") == null){
				return "success";
			}
			else
				return "input";
		}
		else
			return "input";
	}
}
