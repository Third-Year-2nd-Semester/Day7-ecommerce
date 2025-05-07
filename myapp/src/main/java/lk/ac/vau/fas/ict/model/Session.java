package lk.ac.vau.fas.ict.model;


import java.sql.Date;
import java.sql.Time;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Session {
@Id
private String id;
private String name;
private String description;
private Date date;
private Time time;

@ManyToOne
@JoinColumn(name="Workshop_id")
private Workshop workshops;

@ManyToMany(mappedBy="sessions")
private List<PostGraduate>postgraduates;

@ManyToMany(mappedBy="sessions")
private List<UnderGraduate>undergraduates;

@ManyToMany(mappedBy="sessions")
private List<Presenter>presenters;

}
