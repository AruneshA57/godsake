package com.example.demo.data.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Address extends BaseEntity{
    String address;
    String city;
    String state;
    Long pinCode;
}
