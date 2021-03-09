package com.paypal.bfs.test.employeeserv.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
@Getter
@Setter
public class Employee {

    @Id
    @Column(name = "empid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false,length = 255, unique = true)
    private String firstName;

    @Column(name = "last_name", nullable = false,length = 255)
    private String lastName;

    @Column(name ="date_of_birth", nullable = false, length = 12)
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date dateOfBirth;

    @OneToOne(cascade=CascadeType.ALL,fetch= FetchType.EAGER)
    private Address address;

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
