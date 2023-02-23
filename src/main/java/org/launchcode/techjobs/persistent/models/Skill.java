package org.launchcode.techjobs.persistent.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Skill extends AbstractEntity {

    @NotBlank
    @Size(min = 255)
    private String name;

    @NotBlank
    @Size(min = 3, max = 255)
    private String description;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}