package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {


    @NotBlank
    @Size(min = 3, max = 255)
    private String description;

    //    @Override
//    public String getName() {
//        return name;
//    }
    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    public Skill() {
    }
    public List<Job> getJobs(){
        return jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}