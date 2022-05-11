package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.models;

import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.enums.Gender;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.enums.Role;
import lombok.AllArgsConstructor;

import lombok.Getter;

import lombok.NoArgsConstructor;

import lombok.Setter;

import javax.persistence.*;
import java.util.Set;


@NoArgsConstructor

@AllArgsConstructor

@Getter

@Setter

@Entity

public class Member{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Role role;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany
    private Set<Comment> setOfComments;
}
