package com.cydeo.model;

import com.cydeo.Enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Mentor {
    private String firstName;
    private String lastName;

    private Gender gender;
}
