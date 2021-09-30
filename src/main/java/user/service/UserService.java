package user.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import user.vo.UserVO;

@Mapper
public interface UserService {
	
	List<UserVO> getUserList();
}
