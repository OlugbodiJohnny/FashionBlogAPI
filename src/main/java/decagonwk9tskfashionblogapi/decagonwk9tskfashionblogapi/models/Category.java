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

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    private String description;

    @ManyToOne
    private Admin admin;

    @ManyToMany
    private Set<Post> setOfPosts;


}
