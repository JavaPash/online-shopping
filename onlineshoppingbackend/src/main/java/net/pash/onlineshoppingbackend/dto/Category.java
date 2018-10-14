package net.pash.onlineshoppingbackend.dto;

public class Category {

/*
 * Private Fields
 * */
	
	private int cid;
	private String cname;
	private String cdescription;
	private String imageUrl;
	private boolean active = true;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCdescription() {
		return cdescription;
	}
	public void setCdescription(String cdescription) {
		this.cdescription = cdescription;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Category [cid=" + cid + ", cname=" + cname + ", cdescription=" + cdescription + ", imageUrl=" + imageUrl
				+ ", active=" + active + "]";
	}
	
	
	
	
}
