package demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import demo.domain.User;
import demo.mapper.UserMapper;
import demo.service.base.IUserService;

@Service("userService")
public class UserService implements IUserService{

	@Autowired
	@Qualifier("userMapper")
	private UserMapper userMapper;
	
	@Override
	public User getUser(int id) {
		return userMapper.getUser(id);
	}

}
