package cn.com.taiji.reposit;

import java.util.Map;

public interface UserRepositoryCustom {

	Map<String,Object> findUserBySearcher(int pageNo,int pageSize,String username);
	
	
}
