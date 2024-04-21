package myBatis.mapper;

import myBatis.pojo.User;

import java.util.List;

public interface UserMapper {
	Boolean addUser(User user);

	Boolean deleteUserById(int uid);

	Boolean deleteAllUser();

	Boolean updateUser(User user);

	User queryUserById(int uid);

	List<User> queryAllUser();
}
