package com.paypal.bfs.test.employeeserv.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addressid")
    private long id;

    @Column(name = "line1", nullable =false, length = 255)
    private String line1;

    @Column(name = "line2", nullable =true, length = 255)
    private String line2;

    @Column(name = "city", nullable =false, length = 20)
    private String city;

    @Column(name = "state", nullable =false, length = 15)
    private String state;

    public void setId(long id) {
        this.id = id;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public long getId() {
        return id;
    }

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Column(name = "country", nullable =false, length = 20)
    private String country;

    @Column(name = "zip_code", nullable =false, length = 10)
    private String zipCode;

}
