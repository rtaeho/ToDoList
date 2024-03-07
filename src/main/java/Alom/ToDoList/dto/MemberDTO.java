package Alom.ToDoList.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberDTO {
    private Long id;
    private String email;
    private String password;
    private String nickname;

    @Builder
    public MemberDTO(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.nickname = name;
    }
}