package com.xuptSta.model;

import java.util.Date;

public class Dynamic {

	private int dynamicId;
	private String title;
	private String content;
	private String dynamicImage;
	private String summary;           //ժҪ
	private int dynamicTypeId;
	private Date publishDate;
	
	
	public int getDynamicId() {
		return dynamicId;
	}
	public void setDynamicId(int dynamicId) {
		this.dynamicId = dynamicId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDynamicImage() {
		return dynamicImage;
	}
	public void setDynamicImage(String dynamicImage) {
		this.dynamicImage = dynamicImage;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public int getDynamicTypeId() {
		return dynamicTypeId;
	}
	public void setDynamicTypeId(int dynamicTypeId) {
		this.dynamicTypeId = dynamicTypeId;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
}
