package lk.ac.vau.fas.ict.model;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Session {
@Id
private String id;
private String name;
private String description;
private Date date;
private Time time;

}
