package cn.com.taiji.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class UserDoc {

	@Id
	private  String id;
	private  String username;
	private  Integer age;
	private  Article article;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	@Override
	public String toString() {
		return "UserDoc [id=" + id + ", username=" + username + ", age=" + age + ", article=" + article + "]";
	}
	public UserDoc(String id, String username, Integer age, Article article) {
		super();
		this.id = id;
		this.username = username;
		this.age = age;
		this.article = article;
	}
	public UserDoc() {
		super();
	}
	
	
}
