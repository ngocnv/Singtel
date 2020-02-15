package com.sg.assigment.bonus.service;

import java.util.Map;

import com.sg.assigment.bonus.dto.PageResponse;


public interface PageService {
	PageResponse getCoreResonse(String apiCode, Map<String, String> parms, int pageNo, int pageSize);
}
