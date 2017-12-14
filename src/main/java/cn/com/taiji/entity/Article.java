package cn.com.taiji.entity;

public class Article {

	
	private  String name;
	private  String url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Article [name=" + name + ", url=" + url + "]";
	}
	public Article(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}
	public Article() {
		super();
	}
	
}
