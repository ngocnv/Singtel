package com.sg.assigment.bonus.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sg.assigment.bonus.dto.PageResponse;
import com.sg.assigment.bonus.service.PageService;
import com.sg.assigment.bonus.utils.RestUtil;

@Controller
@RequestMapping("/api/page/")
public class PageController {
	
	private static final Logger log = Logger.getLogger(PageController.class);

	
	@Autowired
	private PageService pageService;

	@RequestMapping(value = "{apiCode}", method = { RequestMethod.POST, RequestMethod.GET })
	public @ResponseBody PageResponse remote(@PathVariable String apiCode,
			HttpServletRequest request) {

		int time = Integer.valueOf(request.getParameter("time") == null ? "1" : request.getParameter("time"));
		int start = Integer.valueOf(request.getParameter("start") == null ? "0" : request.getParameter("start"));
		int length = Integer.valueOf(request.getParameter("length") == null ? "10" : request.getParameter("length"));
		
		Map<String, String> parms = RestUtil.getRequestParm(request);
		log(parms);
		PageResponse res = pageService.getCoreResonse(apiCode, parms, start / length + 1, length);
		res.setTime(time);
		log(res);
		return res;
	}
	
	public void log(Map<String,String> parms) {log.info("[REQ][" + parms + "]");}
	public void log( PageResponse response) {
		log.info("[RES][" + response + "]");
	}
	
}