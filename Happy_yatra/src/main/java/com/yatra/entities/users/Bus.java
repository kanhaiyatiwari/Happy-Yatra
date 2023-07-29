package com.yatra.entities.users;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Bus {
@Id
private int busNomber;
private String busName;
private  List<String> start_location;

private List<String> endLocation;
private String startTime;
private String endTime;

}
