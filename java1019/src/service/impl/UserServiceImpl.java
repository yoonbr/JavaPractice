package service.impl;

// 3. 실제 작업 내용을 가진 서비스 클래스 생성  (+ Impl)
import domain.User;
import service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public boolean join(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User mypage(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean edit(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delet(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
		
	}
}
