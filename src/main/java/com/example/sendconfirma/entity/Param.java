package com.example.sendconfirma.entity;

public class Param {
	  private String environment_id;
	  
	  private String number;
	  
	  private String type;
	  
	  private String text;
	  
	  public Param(String environment_id, String number, String type, String text) {
	    this.environment_id = environment_id;
	    this.number = number;
	    this.type = type;
	    this.text = text;
	  }
	  
	  public String getEnvironment_id() {
	    return this.environment_id;
	  }
	  
	  public void setEnvironment_id(String environment_id) {
	    this.environment_id = environment_id;
	  }
	  
	  public String getNumber() {
	    return this.number;
	  }
	  
	  public void setNumber(String number) {
	    this.number = number;
	  }
	  
	  public String getType() {
	    return this.type;
	  }
	  
	  public void setType(String type) {
	    this.type = type;
	  }
	  
	  public String getText() {
	    return this.text;
	  }
	  
	  public void setText(String text) {
	    this.text = text;
	  }
	}