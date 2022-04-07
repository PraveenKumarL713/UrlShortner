package com.wissen.urlShortner.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Url {
	@Id
	private int id;
	private String originalUrl;
	private String shortenUrl;
	private LocalDate createdDate;
	private LocalDate expireDate;

	public Url() {
		super();
	}

	public Url(int id, String originalUrl, String shortenUrl, LocalDate createdDate, LocalDate expireDate) {
		super();
		this.id = id;
		this.originalUrl = originalUrl;
		this.shortenUrl = shortenUrl;
		this.createdDate = createdDate;
		this.expireDate = expireDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOriginalUrl() {
		return originalUrl;
	}

	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}

	public String getShortenUrl() {
		return shortenUrl;
	}

	public void setShortenUrl(String shortenUrl) {
		this.shortenUrl = shortenUrl;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}

	@Override
	public String toString() {
		return "Url [id=" + id + ", originalUrl=" + originalUrl + ", shortenUrl=" + shortenUrl + ", createdDate="
				+ createdDate + ", expireDate=" + expireDate + "]";
	}

}
