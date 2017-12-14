package cn.com.taiji.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Controller;

import com.mongodb.MongoClient;

@Controller
@ComponentScan("cn.com.taiji.config")
@EnableMongoRepositories(basePackages = {"cn.com.taiji.config"})
public class SpringMongoConfig extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "mydb";
	}
	
	@Override
	public MongoClient mongoClient() {
		// TODO Auto-generated method stub
		return new MongoClient("127.0.0.1");
	}

	

	
}
