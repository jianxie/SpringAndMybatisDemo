package demo.mapper;

import org.springframework.stereotype.Component;

import demo.domain.User;

@Component("userMapper")
public interface UserMapper {

	/**
	 * 查询用户
	 */
	public User getUser(int id);
}
