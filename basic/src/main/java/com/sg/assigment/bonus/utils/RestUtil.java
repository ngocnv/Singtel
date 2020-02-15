package com.sg.assigment.bonus.utils;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RestUtil {
	public static Map<String, String> getRequestParm(HttpServletRequest request) {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> parms = new HashMap<String, String>();
		String condition = request.getParameter("condition");
		if (StringUtils.isNotEmpty(condition)) {
			Map<String, Object> m;
			try {
				m = mapper.readValue(condition, Map.class);
			} catch (JsonProcessingException e1) {
				throw new RuntimeException("Parse failed");
			}

			for (Entry<String, Object> e : m.entrySet()) {
				if (e.getValue() != null && (!"".equals(e.getValue().toString().trim()))) {
					parms.put(e.getKey(), e.getValue().toString());
				}
			}
		}

		String order = request.getParameter("order[0][column]");
		String orderDir = request.getParameter("order[0][dir]");
		String orderColumn = request.getParameter("columns[" + order + "][data]");

		String regex = "^[a-zA-Z_][\\w$#]*";
		if (StringUtils.isNotEmpty(orderColumn) && !orderColumn.equals("0") && Pattern.matches(regex, orderColumn)) {
			parms.put("sfield", orderColumn);
			parms.put("sord", "asc".equalsIgnoreCase(orderDir) ? "asc" : "desc");
		}

		return parms;
	}

	public static Map<String, Object> convertToMap(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		Enumeration<?> em = request.getParameterNames();
		while (em.hasMoreElements()) {
			String name = (String) em.nextElement();
			Object value = request.getParameter(name);
			map.put(name, value);
		}
		return map;
	}

}
