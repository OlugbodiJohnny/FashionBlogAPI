package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.servicesImpl;

import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.dto.CommentDto;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.models.*;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.repositories.*;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.repositories.CommentRepository;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.services.CommonServices;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.services.MemberServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MemberServicesImpl implements MemberServices, CommonServices {

    private final MemberRepository memberRepository;
    private final PostRepository postRepository;
    private final LikeRepository likeRepository;
    private final CommentRepository commentRepository;

    @Autowired
    public MemberServicesImpl (MemberRepository memberRepository, PostRepository postRepository, LikeRepository likeRepository, CommentRepository commentRepository) {
        this.memberRepository = memberRepository;
        this.postRepository = postRepository;
        this.likeRepository = likeRepository;
        this.commentRepository = commentRepository;
    }

    @Override
    public void signUp() {

    }

    @Override
    public void login() {
    }

    @Override
    @Transactional
    public void likePost(Long postId,Long memberId) {
//        Likes likes = new Likes();
//        Optional<Post> post = postRepository.findById(postId);
//        Optional<Member> member = memberRepository.findById(memberId);
//        likes.setMember(member.orElseThrow());
//        likes.setPost(post.orElseThrow());
//        likeRepository.save(likes);
    }

    @Override
    @Transactional
    public void unlikePost (Long postId, Long memberId) {
//        Optional<Likes> like = likeRepository.findByMember_IdAndPost_Id(postId,memberId);
//        likeRepository.delete(like.orElseThrow());
    }

    @Override
    @Transactional
    public void commentOnPost(Long postId, Long memberId, CommentDto commentDto) {
        Comment comment = new Comment();
        comment.setContent(commentDto.getContent());
        comment.setPost(postRepository.findById(postId).orElseThrow());
        comment.setMember(memberRepository.findById(memberId).orElseThrow());
        commentRepository.save(comment);
    }

    @Override
    @Transactional
    public void editComment(Long commentId, CommentDto commentDto) {
//        Optional<Comment> comment = commentRepository.findById(commentId);
//        comment.orElseThrow().setContent(commentDto.getContent());
//        commentRepository.save(comment.orElseThrow());
    }

    @Override
    @Transactional
    public void deleteComment(Long commentId) {
//        Optional<Comment> comment = commentRepository.findById(commentId);
//        commentRepository.delete(comment.orElseThrow());
    }
}
