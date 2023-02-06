package com.xworkz.tilak.dto;

import java.time.LocalTime;

import lombok.Data;
@Data
public class ChatDTO {
private String name;
private double price;
private boolean goodForHealth;
private boolean available;
private String shopName;
private String ownerName;
private boolean tastesGood;
private String location;
private int distance;
private LocalTime shopOpensAt;
private LocalTime shopClosesAt;



}
