package com.sg.assigment.bonus.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RpcResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private Map<String, String> header;
	private Map<String, Object> output;
	private Map<String,String> extend;

	public RpcResponse() {
		this.header = new HashMap<>();
		this.output = new HashMap<>();
		this.extend = new HashMap<>();
	}
}
