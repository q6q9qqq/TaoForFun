package action;

import model.Weibo;
import service.WeiboService;

public class DeleteWeiboAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	
	private int weiboid;
	private WeiboService weiboService;
	
	public void setWeiboid(int weiboid){
		this.weiboid = weiboid;
	}

	public int getWeiboid(){
		return weriboid;
	}
	
	public String checkDeleteWeibo(){
		if(session.get("weibo",weiboid) != null){
			Weibo weibo = Weibo(weiboid);
			weiboService.delete(weibo);
			return "success";
		}
		else
			return "input";
	}
}

