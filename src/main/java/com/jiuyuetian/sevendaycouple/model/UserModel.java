package com.jiuyuetian.sevendaycouple.model;

import com.jiuyuetian.sevendaycouple.base.model.impl.BaseModelAdapter;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel extends BaseModelAdapter<String> {
    private String userName;
    private String password;
}
