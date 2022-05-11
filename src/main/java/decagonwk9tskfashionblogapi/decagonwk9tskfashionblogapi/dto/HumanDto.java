package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.dto;

import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.enums.Gender;
import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.enums.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class HumanDto {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Role role;

    private Gender gender;
}
