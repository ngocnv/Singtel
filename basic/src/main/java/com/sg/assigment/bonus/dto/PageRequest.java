package com.sg.assigment.bonus.dto;

import java.io.Serializable;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageRequest implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer time;
	private Integer start;  
	private Integer length; 
	private Map<String, String> param; 
		
}
