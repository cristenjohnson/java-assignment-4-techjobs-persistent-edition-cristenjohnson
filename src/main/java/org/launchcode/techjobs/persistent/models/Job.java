package org.launchcode.techjobs.persistent.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;
//import java.util.List;

@Entity
public class Job extends AbstractEntity {


//    @Id
//    @GeneratedValue
//    private int id;

    @ManyToOne
    private Employer employer;
    @ManyToMany
    private List<Skill> skills;

    public Job() {
    }

    public Job(Employer employer, List<Skill> someSkills) {
        super();
        this.employer = employer;
        this.skills = someSkills;
    }

    // Getters and setters.


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Iterable<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}

