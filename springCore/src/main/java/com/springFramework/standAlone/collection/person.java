package com.springFramework.standAlone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class person {
	private List<String> friends;
	private Map<String, Integer>feeStructure;
	private Properties properties;
	
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}	

	public person(List<String> friends, Map<String, Integer> feeStructure) {
		super();
		this.friends = friends;
		this.feeStructure = feeStructure;
	}

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "person [friends=" + friends + ", feeStructure=" + feeStructure + ", properties=" + properties + "]";
	}
}
