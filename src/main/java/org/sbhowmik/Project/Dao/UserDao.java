package org.sbhowmik.Project.Dao;

import java.util.List;

import org.neo4j.graphdb.Result;
import org.sbhowmik.Project.Entity.User;

public interface UserDao {
	public User getUserByUserName(String userName);

	public Result createUser(User user);

	public Result updateUser(User user);

	public List<User> getBlocked(String userName);

	public List<User> getFavorite(String userName);

	public List<User> getBlockedBy(String userName);

	public List<User> getFavoriteBy(String userName);

}
