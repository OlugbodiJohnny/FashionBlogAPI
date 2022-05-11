package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.models;

import lombok.AllArgsConstructor;

import lombok.Getter;

import lombok.NoArgsConstructor;

import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;

import java.sql.Time;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor

@AllArgsConstructor

@Getter

@Setter

@Entity

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String description;

    @Column(nullable = false)
    private String content;

    private Long countOfLikes;

    @OneToMany
    private Set<Likes> setOfLikes;

//    private String imgUrl;

    @ManyToOne
    private Category category;

    @OneToMany
    private Set<Comment> setOfComments;

    @ManyToOne
    private Admin admin;

    @CreationTimestamp
    @Column(name = "created_at")
    private Time createdAt;

    @CreationTimestamp
    @Column(name = "updated_at")
    private Time updatedAt;
}
