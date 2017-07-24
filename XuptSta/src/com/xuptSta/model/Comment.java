package com.xuptSta.model;

import java.util.Date;

public class Comment {

	private int commentId;
	private String userIp;
	private int blogId;
	private String content;
	private Date commentDate;     //ÆÀÂÛÈÕÆÚ
	private int state;
	private int bloggerId;
	
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getUserIp() {
		return userIp;
	}
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getBloggerId() {
		return bloggerId;
	}
	public void setBloggerId(int bloggerId) {
		this.bloggerId = bloggerId;
	}
	
}
