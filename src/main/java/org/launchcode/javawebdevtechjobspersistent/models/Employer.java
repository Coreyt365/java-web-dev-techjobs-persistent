package org.launchcode.javawebdevtechjobspersistent.models;

import org.hibernate.loader.collection.OneToManyJoinWalker;
import org.launchcode.javawebdevtechjobspersistent.models.data.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @Size(max = 255)
    private String location;

    @OneToMany
    @JoinColumn(name = "jobs_id")
    private List<Job> jobs= new ArrayList();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer(){}
}
