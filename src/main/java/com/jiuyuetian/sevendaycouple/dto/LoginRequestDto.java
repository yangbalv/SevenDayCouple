package com.jiuyuetian.sevendaycouple.dto;

import lombok.*;

//lombok依赖使用
@AllArgsConstructor
//@Getter
//@Setter
@Data
@ToString
public class LoginRequestDto {
    private String userName;
    private String password;
}
