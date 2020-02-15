package com.sg.assigment.bonus.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import lombok.Setter;

import lombok.Getter;

@Getter
@Setter
public class PageResponse implements Serializable{

	private static final long serialVersionUID = 8553781061572933652L;
	private Integer time;
	private Integer recoredTotal;
	
	private List<Map<String, Object>> data;

}
