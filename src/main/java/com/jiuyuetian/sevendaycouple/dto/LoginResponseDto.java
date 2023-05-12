package com.jiuyuetian.sevendaycouple.dto;

import com.jiuyuetian.sevendaycouple.base.dto.BaseResponseDto;
import lombok.*;

//lombok依赖使用
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
public class LoginResponseDto extends BaseResponseDto {
    private String userId;

}
