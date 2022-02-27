package com.bilgeadam.repository.entity;

import lombok.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Document
public class Profile {

    @Id
    String id;
    long authid;
    String firstname;
    String lastname;
    String email;
    String birthdate;
    String country;
    String city;
    String gender;
    String about;
    List<Interest> interest;


class Education {
    String name;
    int from;
    int to;
    String about;
}
class Work {
    String company;
    String designation;
    int from;
    int to;
    String town;
    String description;

}
}