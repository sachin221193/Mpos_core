package com.vestige.core.search;

import com.vestige.core.utils.StringsUtil;

/**
 * @author ashutosh.sharma
 *
 *         this is Searching Criteria
 * 
 */

public class SearchCriteria implements Comparable<SearchCriteria> {

	public static final String SEARCHING_PATTERN = "(\\w.+?)(:|=|<|>|\\[\\])((?:\\[.*?\\])|[^,]*)";
	public static final String ORDER_LIST_SEARCH_PATTERN = "^\\d+(-\\d+)?$"; // example: q=search=12 or q=search=12-20
	public static final String PRE_ORDER_LIST_SEARCH_PATTERN = "^\\d+(\\d+)?$";
	public static final String LESS_THAN = ">";
	public static final String GREATER_THAN = "<";
	public static final String CONTAINS = "=";
	public static final String PERCENTAGE = "%";
	public static final String SORTING = ":";
	public static final String DESC = "desc";
	public static final String ASC = "asc";
	public static final String SEARCH_ANYTHING = "(.*?)";
	public static final String NUMERIC_VALUES ="^(0|[1-9][0-9]*)$";

	private String key;
	private String operation;
	private Object value;

	public SearchCriteria() {
		super();
	}

	public SearchCriteria(String key, String operation, Object value) {
		this.key = key;
		this.operation = operation;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	@Override
	public int compareTo(SearchCriteria criteria) {
		if (!StringsUtil.isNullOrEmpty(criteria.getOperation()) && criteria.getOperation().equalsIgnoreCase(":")) {
			return -1;
		}
		return 0;
	}
}