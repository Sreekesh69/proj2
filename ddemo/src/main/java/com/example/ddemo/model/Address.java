package com.example.ddemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column( name = "address_id")
    private Long address_id; 

    @Column( name = "city")
    private String city;

    @Column( name = "addressType")
    private String addressType;

    public Address(){

    }

    public Long getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Long address_id) {
        this.address_id = address_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    @Override
    public String toString() {
        return "Address [address_id=" + address_id + ", city=" + city + ", addressType=" + addressType + "]";
    }

    @OneToOne(mappedBy = "address")
    private Employee employee;

    
}
