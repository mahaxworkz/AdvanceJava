package com.xworkz.annotations.dto;

public class AnnotationDto {
	
	private Integer id;
	private String topic;
	private String conceptFrom;
	private Boolean IsUnderstandable;
	private Integer duration;
	
	
	public AnnotationDto() {
		System.out.println("default");
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
	}


	public String getConceptFrom() {
		return conceptFrom;
	}


	public void setConceptFrom(String conceptFrom) {
		this.conceptFrom = conceptFrom;
	}


	public Boolean getIsUnderstandable() {
		return IsUnderstandable;
	}


	public void setIsUnderstandable(Boolean isUnderstandable) {
		IsUnderstandable = isUnderstandable;
	}


	public Integer getDuration() {
		return duration;
	}


	public void setDuration(Integer duration) {
		this.duration = duration;
	}


	public AnnotationDto(Integer id, String topic, String conceptFrom, Boolean isUnderstandable, Integer duration) {
		super();
		this.id = id;
		this.topic = topic;
		this.conceptFrom = conceptFrom;
		IsUnderstandable = isUnderstandable;
		this.duration = duration;
	}


	@Override
	public String toString() {
		return "AnnotationDto [id=" + id + ", topic=" + topic + ", conceptFrom=" + conceptFrom + ", IsUnderstandable="
				+ IsUnderstandable + ", duration=" + duration + "]";
	}
	
	

}
