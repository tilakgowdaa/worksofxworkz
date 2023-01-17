package com.xworkz.Terrorist.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class AbstractAuditDTO implements Serializable {
private String createdBy;
private LocalDate createdAt;
private String updatedBy;
private LocalDate updatedAt;

}
