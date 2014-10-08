package demo.service.base;

import demo.domain.User;

public interface IUserService {

	/**
	 * 根据id获取用户
	 * @param id
	 * @return
	 */
	public User getUser(int id);

}
