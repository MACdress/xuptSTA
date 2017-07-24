package com.xuptSta.model;

import java.util.Date;

public class Blog {

	private int blogId;
	private String title;
	private String summary;     //摘要
	private Date releaseDate;      //发布日期
	private int clickHit;        //点击数
	private int replyHit;        //回复数
	private String content;
	private int blogTypeId;
	private int honey;          //喜欢数
	private int bloggerId;
	
	
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public int getClickHit() {
		return clickHit;
	}
	public void setClickHit(int clickHit) {
		this.clickHit = clickHit;
	}
	public int getReplyHit() {
		return replyHit;
	}
	public void setReplyHit(int replyHit) {
		this.replyHit = replyHit;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getBlogTypeId() {
		return blogTypeId;
	}
	public void setBlogTypeId(int blogTypeId) {
		this.blogTypeId = blogTypeId;
	}
	public int getHoney() {
		return honey;
	}
	public void setHoney(int honey) {
		this.honey = honey;
	}
	public int getBloggerId() {
		return bloggerId;
	}
	public void setBloggerId(int bloggerId) {
		this.bloggerId = bloggerId;
	}
	
}
