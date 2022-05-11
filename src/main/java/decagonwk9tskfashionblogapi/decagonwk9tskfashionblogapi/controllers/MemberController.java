package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.controllers;

import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.dto.CommentDto;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.services.AdminServices;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.services.MemberServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class MemberController {
    private final MemberServices memberServices;

    public MemberController (MemberServices memberServices) {
        this.memberServices = memberServices;
    }

    @PostMapping("/{memberId}/{postId}/commentOnPost")
    public String commentOnPost (@PathVariable(value = "memberId") Long memberId, @PathVariable (value = "postId") Long postId, @RequestBody CommentDto commentDto) {
        memberServices.commentOnPost(postId,memberId,commentDto);
        return "Commented successfully";
    }
}
