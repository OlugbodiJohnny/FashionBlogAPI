package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@NoArgsConstructor

@AllArgsConstructor

@Getter

@Setter

@Entity

public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @ManyToOne
    private Admin admin;

    @ManyToOne
    Member member;

    @ManyToOne
    private Post post;

    @OneToMany
    Set<Reply> setOfReplies;

}
