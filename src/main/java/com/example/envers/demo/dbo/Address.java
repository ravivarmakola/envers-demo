package com.example.envers.demo.dbo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String houseName;
    private String streetName;
    private Integer zipCode;
    private String city;
    private String country;
    @ManyToOne
    @JsonIgnore
    private Employee employee;
}
