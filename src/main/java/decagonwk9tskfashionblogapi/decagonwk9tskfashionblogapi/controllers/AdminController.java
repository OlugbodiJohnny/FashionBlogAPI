package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.controllers;

import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.dto.CategoryDto;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.dto.PostDto;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.models.Post;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.services.AdminServices;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.servicesImpl.AdminServicesImpl;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/admin")


public class AdminController {

    private final AdminServices adminServices;

    public AdminController (AdminServices adminServices) {
        this.adminServices = adminServices;
    }

    @PostMapping("/{adminId}/categories/createCategory")
    public String createCategory (@PathVariable(value = "adminId") Long adminId, @RequestBody CategoryDto categoryDto) {
        adminServices.createCategory(adminId, categoryDto);
        return "Category created successfully";
    }

    @DeleteMapping("/{adminId}/categories/{categoryId}/deleteCategory")
    public String deleteCategory (@PathVariable(value = "adminId") Long adminId, @PathVariable(value = "categoryId") Long categoryId) {
        adminServices.deleteCategory(adminId,categoryId);
        return "Category totally deleted";
    }

    @PostMapping("/{adminId}/categories/{categoryId}/createPost")
    public String createPost (@PathVariable(value = "adminId") Long adminId, @PathVariable(value = "categoryId") Long categoryId ,@RequestBody PostDto postDto) {
        adminServices.createPost(postDto,adminId,categoryId);
        return "Created successfully";
    }

    @DeleteMapping("/{adminId}/categories/{categoryId}/posts/{postId}/deletePost")
    public String deletePost (@PathVariable(value = "adminId") Long adminId, @PathVariable(value = "categoryId") Long categoryId,@PathVariable(value = "postId") Long postId) {
        adminServices.deletePost(adminId,postId);
        return "Post completely deleted";
    }

    @PostMapping("/{adminId}/posts/{postId}/{categoryId}/addPostToCategory")
    public String addPostToCategory (@PathVariable(value = "adminId") Long adminId, @PathVariable(value = "postId") Long postId, @PathVariable(value = "categoryId") Long categoryId) {
        adminServices.addPostToCategory(adminId,postId,categoryId);
       return "Able to execute query";
    }

    @PostMapping("/{adminId}/posts/{postId}/removePostFromCategory/{categoryId}")
    public String removePostFromCategory (@PathVariable(value = "adminId") Long adminId, @PathVariable(value = "postId") Long postId, @PathVariable(value = "categoryId") Long categoryId) {
        adminServices.removePostFromCategory(adminId,postId,categoryId);
        return "removed from category";
    }
}
