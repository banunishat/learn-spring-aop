package com.in28minutes.rest.webserives.restful_web_services.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

//@JsonIgnoreProperties({"key1","key2"})
@JsonFilter("SomeBeanFilter")
public class SomeBean {
	private String key1;
	//@JsonIgnore
	private String key2;
	private String key3;
	public SomeBean(String key1, String key2, String key3) {
		super();
		this.key1 = key1;
		this.key2 = key2;
		this.key3 = key3;
	}
	public String getKey1() {
		return key1;	
	}
	public void setKey1(String key1) {
		this.key1 = key1;
	}
	public String getKey2() {
		return key2;
	}
	public void setKey2(String key2) {
		this.key2 = key2;
	}
	public String getKey3() {
		return key3;
	}
	public void setKey3(String key3) {
		this.key3 = key3;
	}
	@Override
	public String toString() {
		return "SomeBean [key1=" + key1 + ", key2=" + key2 + ", key3=" + key3 + "]";
	}
	

}
