package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.services;

import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.dto.CategoryDto;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.dto.CommentDto;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.dto.PostDto;

public interface AdminServices {

    void createCategory (Long adminId,CategoryDto categoryDto);

    void createPost(PostDto postDto, Long adminId, Long categoryId);

    void addPostToCategory (Long adminId, Long postId, Long categoryId);

    void removePostFromCategory(Long adminId, Long postId, Long categoryId);

    void deleteCategory (Long adminId,Long categoryId);

    void deletePost(Long adminId, Long postId);

    void editPost (Long adminId, Long postId, PostDto postDto);

//    void likePost(Long postId,Long adminId);
//
//    void unlikePost(Long postId, Long adminId);
//
//
    void commentOnPost(Long postId, Long adminId, CommentDto commentDto);

//    void editComment(Long commentId, CommentDto commentDto);

//    void deleteComment(Long commentId);

    /*
    @Bean
public RestTemplate restTemplate(RestTemplateBuilder builder) {

return builder
.setConnectTimeout(Duration.ofMillis(3000))
.setReadTimeout(Duration.ofMillis(3000))
.build();
}

REST API
@PostMapping("users")
public ResponseEntity&lt;User&gt; create(@RequestBody User newUser) {
User user = userService.save(newUser);
if (user == null) {
throw new ServerException();
} else {
return new ResponseEntity&lt;&gt;(user, HttpStatus.CREATED);
}
}

Consume REST API
private final String URI_USERS = "/users";

@Autowired
RestTemplate restTemplate;

//Using RestTemplate

User newUser = new User(1, "Alex", "Golan", "a@mail.com");
User createdUser = restTemplate.postForObject(URI_USERS, newUser, User.class);
//Use the object as needed
     */

}
