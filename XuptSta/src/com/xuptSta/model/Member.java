package com.xuptSta.model;

public class Member {

	private int memberId;
	private String title;
	private String content;
	private String imageName;
	private int memberTypeId;
	
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
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
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public int getMemberTypeId() {
		return memberTypeId;
	}
	public void setMemberTypeId(int memberTypeId) {
		this.memberTypeId = memberTypeId;
	}
	
}
