package ua.polina.springApps;

import lombok.*;

@Getter
@Setter
@Builder
public class User {
    private String name;
    private String surname;
    private int age;
}
