package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.services;

import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.dto.CommentDto;

public interface HumanServices {

    //    void signUp();
//
//    Human login();
//
//    void likePost(Long postId,Long memberId);
//
//    void unlikePost(Long postId, Long memberId);
//
    void commentOnPost(Long postId, Long memberId, CommentDto commentDto);
}
