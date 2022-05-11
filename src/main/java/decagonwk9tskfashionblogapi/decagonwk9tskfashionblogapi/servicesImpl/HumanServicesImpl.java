//package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.servicesImpl;
//
//import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.dto.CommentDto;
//import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.models.Comment;
//import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.repositories.*;
//import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.services.HumanServices;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class HumanServicesImpl implements HumanServices {
//
//    private final HumanRepository humanRepository;
//    private final PostRepository postRepository;
//    private final CategoryRepository categoryRepository;
//    private final LikeRepository likeRepository;
//    private final CommentRepository commentRepository;
//
//    @Autowired
//    public HumanServicesImpl (HumanRepository humanRepository, PostRepository postRepository, CategoryRepository categoryRepository, LikeRepository likeRepository, CommentRepository commentRepository) {
//        this.humanRepository = humanRepository;
//        this.postRepository = postRepository;
//        this.categoryRepository = categoryRepository;
//        this.likeRepository = likeRepository;
//        this.commentRepository = commentRepository;
//    }
//    @Override
//    public void commentOnPost(Long postId, Long memberId, CommentDto commentDto) {
//        Comment comment = new Comment();
//        comment.setContent(commentDto.getContent());
//        comment.setPost(postRepository.findById(postId).orElseThrow());
//        comment.setMember(memberRepository.findById(memberId).orElseThrow());
//        commentRepository.save(comment);
//    }
//}
