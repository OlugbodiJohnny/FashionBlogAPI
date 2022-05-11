package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.servicesImpl;

import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.dto.CategoryDto;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.dto.CommentDto;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.dto.PostDto;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.models.*;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.repositories.AdminRepository;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.repositories.CategoryRepository;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.repositories.LikeRepository;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.repositories.PostRepository;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.services.AdminServices;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.repositories.CommentRepository;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.services.CommonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Time;
import java.util.Optional;

@Service
public class AdminServicesImpl implements AdminServices, CommonServices {

    private final AdminRepository adminRepository;
    private final PostRepository postRepository;
    private final CategoryRepository categoryRepository;
    private final LikeRepository likeRepository;
    private final CommentRepository commentRepository;

    @Autowired
    public AdminServicesImpl (AdminRepository adminRepository, PostRepository postRepository, CategoryRepository categoryRepository, LikeRepository likeRepository, CommentRepository commentRepository) {
        this.adminRepository = adminRepository;
        this.postRepository = postRepository;
        this.categoryRepository = categoryRepository;
        this.likeRepository = likeRepository;
        this.commentRepository = commentRepository;
    }

    @Override
    @Transactional
    public void createCategory(Long adminId,CategoryDto categoryDto) {
        Optional<Admin> admin = adminRepository.findById(adminId);

        //Create new category
        Category category = new Category();
        category.setName(categoryDto.getName());
        category.setDescription(categoryDto.getDescription());
        category.setAdmin(admin.orElseThrow());
        categoryRepository.save(category);
    }

    @Override
    @Transactional
    public void createPost(PostDto postDto, Long adminId, Long categoryId) {

        Optional<Admin> admin = adminRepository.findById(adminId);
        Optional<Category> category = categoryRepository.findById(categoryId);
        //Create new post
        Post post = new Post();
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        post.setAdmin(admin.orElseThrow());
        post.setCategory(category.orElseThrow());
        Time createdTime = new Time(System.currentTimeMillis());
        post.setCreatedAt(createdTime);
        Time updatedTime = new Time(System.currentTimeMillis());
        post.setCreatedAt(updatedTime);
        postRepository.save(post);

    }

    @Override
    @Transactional
    public void addPostToCategory(Long adminId, Long postId, Long categoryId) {

//        //Fetch the post from the post repository
//        Optional<Post> post = postRepository.findById(postId);
//
//        //Fetch the category from the category repository
//        Optional<Category> category = categoryRepository.findById(categoryId);
//
//        //Fetch the admin from the admin repository
//        Optional<Admin> admin = adminRepository.findById(adminId);
//
//        //Get the admin set of categories
//        Set<Category> adminSetOfCategories = admin.orElseThrow().getSetOfCategories();
//
//        //loop through and get the category by the id. Then create the post and add the post to the category list of posts
//        for (Category cat : adminSetOfCategories) {
//
//            if (Objects.equals(cat.getId(), categoryId)) {
//
//                //Update the post list of categories and save to the post repository
//                Set<Category> postSetOfCategories = post.orElseThrow().getSetOfCategories();
//                postSetOfCategories.add(cat);
//                post.orElseThrow().setSetOfCategories(postSetOfCategories);
//                postRepository.save(post.orElseThrow());
//
//                //Update the category list of posts and update the category repository
//                Set<Post> catSetOfPosts = cat.getSetOfPosts();
//                catSetOfPosts.add(post.orElseThrow());
//                cat.setSetOfPosts(catSetOfPosts);
//                categoryRepository.save(cat);
//                break;
//            }
//        }
//
//        //Update the admin list of categories and save to the admin repository
//        admin.orElseThrow().setSetOfCategories(adminSetOfCategories);
//        adminRepository.save(admin.orElseThrow());

    }

    @Override
    @Transactional
    public void removePostFromCategory(Long adminId, Long postId, Long categoryId) {

//        //Fetch the post from the post repository
//        Optional<Post> post = postRepository.findById(postId);
//
//        //Fetch the category from the category repository
//        Optional<Category> category = categoryRepository.findById(categoryId);
//
//        //Fetch the admin from the admin repository
//        Optional<Admin> admin = adminRepository.findById(adminId);
//
//        //Get the admin set of categories
//        Set<Category> adminSetOfCategories = admin.orElseThrow().getSetOfCategories();
//
//        //loop through and get the category by the id
//        for (Category cat : adminSetOfCategories) {
//
//            if (Objects.equals(cat.getId(), categoryId)) {
//
//                //Get the post list of categories then delete the category
//                Set<Category> postSetOfCategories = post.orElseThrow().getSetOfCategories();
//
//                postSetOfCategories.remove(cat);
//
//                post.orElseThrow().setSetOfCategories(postSetOfCategories);
//
//                postRepository.save(post.orElseThrow());//Save to the post repository
//
//                //Get the category list of posts then delete the post
//                Set<Post> catSetOfPosts = cat.getSetOfPosts();
//
//                catSetOfPosts.remove(post.orElseThrow());
//
//                cat.setSetOfPosts(catSetOfPosts);
//
//                categoryRepository.save(cat);
//
//                break;
//
//            }
//        }
//
//        //Update the admin list of categories and save to the admin repository
//        admin.orElseThrow().setSetOfCategories(adminSetOfCategories);
//        adminRepository.save(admin.orElseThrow());

    }

    @Override
    @Transactional
    public void deleteCategory(Long adminId, Long categoryId) {

//        //Fetch the category from the category repository
//        Optional<Category> category = categoryRepository.findById(categoryId);
//
//        //Fetch all posts in the category repository as a list. Loop through each post list of category and remove the intended category
//        List<Post> listOfAllPostsInPostRepository = postRepository.findAll();
//
//        for (Post p : listOfAllPostsInPostRepository) {
//            Set<Category> pSetOfCategories = p.getSetOfCategories();
//            if (pSetOfCategories.contains(category.orElseThrow())) {
//                pSetOfCategories.remove(category.orElseThrow());
//                p.setSetOfCategories(pSetOfCategories);
//                postRepository.save(p);
//            }
//        }

        //Fetch the admin from the admin repository. Loop through the admin list of categories and remove the category
//        Optional<Admin> admin = adminRepository.findById(adminId);
//
//        Set<Category> adminSetOfCategories = admin.orElseThrow().getSetOfCategories();
//
//        adminSetOfCategories.remove(category.orElseThrow());
//
//        admin.orElseThrow().setSetOfCategories(adminSetOfCategories);
//
//        //save the admin back to the admin repository
//        adminRepository.save(admin.orElseThrow());

        //delete the category from the category repository
//        categoryRepository.delete(category.orElseThrow());
    }

    @Override
    @Transactional
    public void deletePost(Long adminId, Long postId) {

//        //Fetch the post from post repository
//        Optional<Post> post = postRepository.findById(postId);
//
//        //Fetch admin from admin repository
//        Optional<Admin> admin = adminRepository.findById(adminId);
//
//        //Get the admin list of categories and check each to delete that post from the admins list of categories
//        //Also update the category repository after removing the post
//        Set<Category> adminSetOfCategories = admin.orElseThrow().getSetOfCategories();
//        for (Category category : adminSetOfCategories) {
//            category.getSetOfPosts().remove(post.orElseThrow());
//            categoryRepository.save(category);
//        }
//        admin.orElseThrow().setSetOfCategories(adminSetOfCategories);
//        adminRepository.save(admin.orElseThrow());
//
//        //delete the post from post repository
//        postRepository.delete(post.orElseThrow());
    }

    @Override
    public void editPost(Long adminId, Long postId, PostDto postDto) {

//        Optional<Admin> admin = adminRepository.findById(adminId);
//
//        //Fetch the post from post repository
//        Optional<Post> post = postRepository.findById(postId);
//        post.orElseThrow().setContent(postDto.getContent());
//        post.orElseThrow().setDescription(postDto.getDescription());
//        post.orElseThrow().setUpdatedAt(new Time(System.currentTimeMillis()));
//        postRepository.save(post.orElseThrow());
//
//        //Get the admin set of categories
//        Set<Category> adminSetOfCategories = admin.orElseThrow().getSetOfCategories();
//
//        //loop through and get the category by the id. Then create the post and add the post to the category list of posts
//        for (Category cat : adminSetOfCategories) {
//            Set<Post> catSetOfPosts = cat.getSetOfPosts();
//            if (catSetOfPosts.contains(post.orElseThrow())) {
//
//            }
//        }

//        Optional<Category> category = categoryRepository.findById(categoryId);
    }

//
//    @Override
//    @Transactional
//    public void likePost(Long postId,Long adminId) {
//        Optional<Likes> alreadyLiked = likeRepository.findByAdmin_IdAndPost_Id(adminId,postId);
//        if (alreadyLiked.isEmpty()) {
//            Likes likes = new Likes();
//            Optional<Post> post = postRepository.findById(postId);
//            Long countOfLikes = post.orElseThrow().getCountOfLikes();
//            countOfLikes++;
//            post.orElseThrow().setCountOfLikes(countOfLikes);
//            Optional<Admin> admin = adminRepository.findById(adminId);
//            likes.setAdmin(admin.orElseThrow());
//            likes.setPost(post.orElseThrow());
//            likeRepository.save(likes);
//        }
//
//    }
//
//    @Override
//    @Transactional
//    public void unlikePost(Long postId, Long adminId) {
//        Optional<Likes> like = likeRepository.findByAdmin_IdAndPost_Id(postId,adminId);
//        likeRepository.delete(like.orElseThrow());
//        Optional<Post> post = postRepository.findById(postId);
//        Long countOfLikes = post.orElseThrow().getCountOfLikes();
//        if (countOfLikes>0L) {
//            countOfLikes--;
//            post.orElseThrow().setCountOfLikes(countOfLikes);
//        }else{
//            countOfLikes = 0L;
//            post.orElseThrow().setCountOfLikes(countOfLikes);
//        }
//
//    }
//
    @Override
    @Transactional
    public void commentOnPost(Long postId, Long adminId, CommentDto commentDto) {
        Comment comment = new Comment();
        comment.setContent(commentDto.getContent());
        comment.setPost(postRepository.findById(postId).orElseThrow());
        comment.setAdmin(adminRepository.findById(adminId).orElseThrow());
        commentRepository.save(comment);
    }

    @Override
    public void editComment(Long commentId, CommentDto commentDto) {

    }

    @Override
    public void deleteComment(Long commentId) {

    }
//
//    @Override
//    @Transactional
//    public void editComment(Long commentId, CommentDto commentDto) {
//        Optional<Comment> comment = commentRepository.findById(commentId);
//        comment.orElseThrow().setContent(commentDto.getContent());
//        commentRepository.save(comment.orElseThrow());
//    }
//
//    @Override
//    @Transactional
//    public void deleteComment(Long commentId) {
//        Optional<Comment> comment = commentRepository.findById(commentId);
//        commentRepository.delete(comment.orElseThrow());
//    }


}
