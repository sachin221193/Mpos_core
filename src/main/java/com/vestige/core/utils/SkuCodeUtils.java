
package com.vestige.core.utils;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SkuCodeUtils {

	private static final Logger logger = LoggerFactory.getLogger(SkuCodeUtils.class);

	private SkuCodeUtils() {
	}

	public static String formatSku(String sku) {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> codes = new HashMap<>();
		String json = null;
		String[] skuCodes = sku.split(",");

		try {
			for (int i = 0; i < skuCodes.length; i++) {
				codes.put(String.valueOf(i + 1), skuCodes[i]);
			}
			json = mapper.writeValueAsString(codes);
		} catch (JsonProcessingException e) {
			logger.error("error while parsing skuCode : {}", e.getMessage());
		}
		return json;
	}
}
