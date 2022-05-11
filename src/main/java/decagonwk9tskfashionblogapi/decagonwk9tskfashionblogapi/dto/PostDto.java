package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.dto;

import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.models.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter

public class PostDto {

    private String description;

    private String content;

    private List<String> categories;


}
