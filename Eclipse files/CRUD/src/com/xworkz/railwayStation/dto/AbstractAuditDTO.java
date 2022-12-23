package com.xworkz.railwayStation.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class AbstractAuditDTO implements Serializable {
	private String createdBy;
	private LocalDateTime createdDate;
	private String updated;
	private LocalDateTime updatedDate;

	public AbstractAuditDTO() {
		super();
	}

	@Override
	public String toString() {
		return "AbstractAuditDTO [createdBy=" + createdBy + ", createdDate=" + createdDate + ", updated=" + updated
				+ ", updatedDate=" + updatedDate + "]";
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

}
