package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.models;

import lombok.AllArgsConstructor;

import lombok.Getter;

import lombok.NoArgsConstructor;

import lombok.Setter;

import javax.persistence.*;

import java.util.List;
import java.util.Set;

@NoArgsConstructor

@AllArgsConstructor

@Getter

@Setter

@Entity

public class Guest{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToMany
    private Set<Comment> setOfComments;

}
