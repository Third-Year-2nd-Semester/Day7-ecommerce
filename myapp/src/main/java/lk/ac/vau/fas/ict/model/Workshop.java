package lk.ac.vau.fas.ict.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity 
public class Workshop {
@Id
private String id;
private String description;
private String name;
private Date startDate;
private Date endDate;

@OneToMany(mappedBy="workshops")
private List<Session>sessions;

}
