package com.loiane.model;

import org.codehaus.jackson.annotate.JsonAutoDetect;

/**
 * Contains some data to represent a state.
 * POJO class
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
@JsonAutoDetect
public class State {
	
	private String code;
	
	private String name;
	

	public State(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
