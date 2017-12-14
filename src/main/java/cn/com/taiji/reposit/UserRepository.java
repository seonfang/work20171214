package cn.com.taiji.reposit;

import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import cn.com.taiji.entity.UserDoc;

@Repository
public interface UserRepository extends MongoRepository<UserDoc, Long> {

	UserDoc findByUsername(String username);
	UserDoc findByArticleName(String articlename);
	List<UserDoc> findByUsernameLikeAndArticleName(String username,String articlename);
	List<UserDoc> findById(String userid);
	List<UserDoc> findByIdBetween(String userid1,String userid2);
	
	@Query("{'_id': ?0, 'article.name': { '$regex':?1} }")
	List<UserDoc> searchUser(String userId,String desc);
	
	
//	public Map<String,Object> findUserBySearcher(int pageNo,int pageSize,String username){
//		Criteria criteria = new Criteria();
//		if(null != username && !username.equals("")) {
//			criteria.andOperator(
//					Criteria.where("username").regex(".*?" + username + ".*"),
//					Criteria.where("article.name").exists(true)
//					);
//		}
//	}
}
