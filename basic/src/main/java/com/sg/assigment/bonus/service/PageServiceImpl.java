package com.sg.assigment.bonus.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.sg.assigment.bonus.dto.PageResponse;
import com.sg.assigment.bonus.dto.RpcRequest;
import com.sg.assigment.bonus.rpc.RpcClient;

@Service
public class PageServiceImpl implements PageService {
	
	private RpcClient client;

	@Override
	public PageResponse getCoreResonse(String apiCode,Map<String, String> parms, int pageNo,
			int pageSize) {
		RpcRequest req = new RpcRequest();		
		PageResponse response = new PageResponse();
		return response;

	}

}
