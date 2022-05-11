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

public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @ManyToOne
    private Comment comment;
}
