package lk.ac.vau.fas.ict.model;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

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

@ManyToMany
@JoinTable(
		name="post_graduate_sessions",
		joinColumns=@JoinColumn(name="post_graduates_id"),
		inverseJoinColumns=@JoinColumn(name="sessions_id")
		)
private List<Session>sessions;

}
