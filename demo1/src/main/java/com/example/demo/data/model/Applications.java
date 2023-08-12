package com.example.demo.data.model;

import com.example.demo.data.enums.ApplicationStatus;
import jakarta.persistence.*;
import lombok.*;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class Applications extends BaseEntity{

    Integer applicationId;
    Date dateCreated;
    ApplicationStatus applicationStatus;
    String creditCardType;
    String aadharFileName;
    String panFileName;
    String incomeProofFileName;

}
