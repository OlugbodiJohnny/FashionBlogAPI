package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor

@AllArgsConstructor

@Getter

@Setter

@Entity

public class Likes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Admin admin;

//    @OneToOne
//    private Member member;

    @ManyToOne
    private Post post;

}
