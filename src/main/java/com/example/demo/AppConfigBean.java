package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@PropertySource("classpath:application-${spring.profiles.active}.properties")
public class AppConfigBean {

	@Value("${db_url}")
	private String db_url;

	@Value("${db_user}")
	private String db_user;

	public String getDb_url() {
		return db_url;
	}

	public void setDb_url(String db_url) {
		this.db_url = db_url;
	}

	public String getDb_user() {
		return db_user;
	}

	public void setDb_user(String db_user) {
		this.db_user = db_user;
	}

	@Override
	public String toString() {
		return String.format("AppConfigBean [db_url=%s, db_user=%s]", db_url, db_user);
	}

}
