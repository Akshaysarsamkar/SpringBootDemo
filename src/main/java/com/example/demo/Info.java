package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Info {
	@Value("${info.name}")
	String name;
	
	@Value("${info.version}")
	String version;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Info(String name, String version) {
		super();
		this.name = name;
		this.version = version;
	}

	public Info() {
		super();
	}
}
