package lk.ac.vau.fas.ict.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Presenter {
@Id
private String id;
private String name;
private String email;
private String affiliation;
private String country;
private String jobTitle;
}
