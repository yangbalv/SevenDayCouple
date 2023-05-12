package com.jiuyuetian.sevendaycouple.base.dto;

import lombok.*;
//lombok用法参考
//@Getter：用于生成get方法，这个方法会自动扫描对象的属性，并为属性生成getter方法。
//@Setter：用于生成set方法，这个方法会自动扫描对象的属性，并为属性生成setter方法。
//@ToString：用于生成对象的toString方法，这个方法可以将对象转换成字符串形式，以便于输出和调试。
//@EqualsAndHashCode：用于生成对象的equals方法和hashCode方法，这两个方法可以用于比较对象的相等性。
//@NoArgsConstructor：用于生成无参构造方法，这个方法可以简化无参构造函数的编写。
//@AllArgsConstructor：用于生成有参构造方法，这个方法可以在构造函数中接收多个参数。
//@Optional：用于生成可选类型，这个类型可以让开发人员在不需要的情况下省略某些属性，从而提高代码的可读性。
//@Value：用于生成值类型的变量，这个变量可以在运行时被赋值，并且不需要使用反射机制。
//@Builder：用于生成构建器类，这个类可以帮助开发人员快速创建对象，并且可以自动处理一些常见的操作，如属性赋值和比较。
//@Slf4j：用于将Lombok的注解转换成Spring框架的注解，这样可以让开发人员更方便地使用Spring框架。


//@Data注解主要用于自动生成getter和setter方法、toString()方法以及hashCode()和equals()方法。
//@Data 会补充未定义的以上方法若进行定义的将会使用单独定义的内容


//callSuper = true ---使用在子类中表示是否采用父类的定义

@Data
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponseDto {

    private boolean result;
    private String resultMsg;
}