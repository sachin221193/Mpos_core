package com.vestige.core.model.dto;

public class GeneralQueryMailDTO {

	private String query;
	
	private String answerTo;
	
	private String answer;
	
	public GeneralQueryMailDTO() {
	}
	
	public GeneralQueryMailDTO(String query,String answerTo,String answer) {
		this.query = query;
		this.answerTo = answerTo;
		this.answer = answer;
	}
	

	public String getAnswerTo() {
		return answerTo;
	}

	public void setAnswerTo(String answerTo) {
		this.answerTo = answerTo;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}
}
