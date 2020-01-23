package com.altimetrik.orkio.EntityMapperDemo;

public class EmplDiffField {
	private int id;
	private String name;
	private String residence;
	private String accounts;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
	public String getAccounts() {
		return accounts;
	}
	public void setAccounts(String accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "EmplDiffField [id=" + id + ", name=" + name + ", residence=" + residence + ", accounts=" + accounts
				+ "]";
	}
	
}
