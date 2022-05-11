package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.services;

import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.dto.CommentDto;

public interface CommonServices {

    void editComment(Long commentId, CommentDto commentDto);

    void deleteComment(Long commentId);

}
