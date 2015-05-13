package org.sbhowmik.Project.Services;

import java.util.List;

import org.neo4j.graphdb.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.template.Neo4jOperations;
import org.springframework.stereotype.Service;
import org.sbhowmik.Project.Dao.UserDao;
import org.sbhowmik.Project.DaoImpl.UserDaoImpl;
import org.sbhowmik.Project.Entity.User;

@Service
public class UserService {
	
	UserDao userDaoImpl = new UserDaoImpl();
	

	
	public Result addUserNode(User user) {
		
		return userDaoImpl.createUser(user);	
	}

	public Result updateUserNode(User user) {
		
		return userDaoImpl.updateUser(user);	
	}
	
	public User getUserByUserName(String userName) {
		return userDaoImpl.getUserByUserName(userName);
	}
	
	public List<User> getBlocked(String userName)
	{
		return userDaoImpl.getBlocked(userName);
	}
	
	public List<User> getFavorite(String userName)
	{
		return userDaoImpl.getFavorite(userName);
	}
	
	public List<User> getBlockedBy(String userName)
	{
		return userDaoImpl.getBlockedBy(userName);
	}
	
	public List<User> getFavoriteBy(String userName)
	{
		return userDaoImpl.getFavoriteBy(userName);
	}
}
