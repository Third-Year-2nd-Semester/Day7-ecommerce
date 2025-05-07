package lk.ac.vau.fas.ict.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PostGraduate {
@Id
private String id;
private String name;
private String gender;
private int phone;
private String institute;
private String researchInterest;
private String secondDegree;

}
