package dao.impl;

import java.util.List;

import model.User;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.UserDao;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	public Integer save(User user){
		return (Integer) getHibernateTemplate().save(user);
	}

	public void delete(User user){
		getHibernateTemplate().delete(user);
	}

	public void update(User user){
		getHibernateTemplate().merge(user);
	}

	public User getUserByUserid(int userid){
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>) getHibernateTemplate().find(
				"from User as u where u.userid=?", userid);
		User user = users.size() > 0 ? users.get(0) : null;
		return user;
	}
	
	public User getUserByUsername(String username){
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>) getHibernateTemplate().find(
				"from User as u where u.username=?", username);
		User user = users.size() > 0 ? users.get(0) : null;
		return user;
	}
	
	public User getUserByEmail(String email){
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>) getHibernateTemplate().find(
				"from User as u where u.email=?", email);
		User user = users.size() > 0 ? users.get(0) : null;
		return user;
	}

	public List<User> getAllUsers(){
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>) getHibernateTemplate()
				.find("from User");
		return users;
	}
	
	public List<User> getUserByUsernameAndPassword(String username, String password){
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>)getHibernateTemplate()
				.find("from User u where u.username=? and u.password=?", username, password);
		return users;
	}
	
	public List<User> getUserByEmailAndPassword(String email, String password){
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>)getHibernateTemplate()
				.find("from User u where u.email=? and u.password=?", email, password);
		return users;
	}
}
