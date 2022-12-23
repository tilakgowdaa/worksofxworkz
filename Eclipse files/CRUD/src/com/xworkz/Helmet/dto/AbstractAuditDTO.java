package com.xworkz.Helmet.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AbstractAuditDTO implements Serializable {
	private String createdby;
	private LocalDateTime createdDate;
	private String updatedby;
	private LocalDateTime updatedDate;

	public AbstractAuditDTO() {
		super();
	}

	public AbstractAuditDTO(String createdby, LocalDateTime createdDate, String updatedby, LocalDateTime updatedDate) {
		super();
		this.createdby = createdby;
		this.createdDate = createdDate;
		this.updatedby = updatedby;
		this.updatedDate = updatedDate;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

}
