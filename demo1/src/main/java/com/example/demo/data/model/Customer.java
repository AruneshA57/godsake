package com.example.demo.data.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class Customer extends BaseEntity {


     Long CustomerId;
     String customerName;
     String email;
     String phone;


     @OneToOne
     Address address;


     Boolean isManhattanAvailable;
     Boolean isPetrolAvailable;
     Boolean isTravelAvailable;

     Integer creditScore;






}
