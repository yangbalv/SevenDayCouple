package com.jiuyuetian.sevendaycouple.configs.dataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Configuration
@MapperScan(value = "com.springboot.live_comm.mappers.mybatiss2", sqlSessionFactoryRef = "sqlSessionFactoryBean2")
public class MyBatisConfigTwo {
    @Autowired
    @Qualifier("dsTwo")
    DataSource dsTwo;

    @Bean
    SqlSessionFactory sqlSessionFactoryBean2() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dsTwo);
        return factoryBean.getObject();
    }

    @Bean
    SqlSessionTemplate sqlSessionTemplate2() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactoryBean2());
    }
    public static void main(String[] args) throws UnsupportedEncodingException {


//        许昊:
//        http://wxtest.allinfinance.com/evercos/assets/nonfinance/index.html#/limit/adjust
//
//        许昊:
//        http://wxtest.allinfinance.com/evercos/assets/nonfinance/index.html#/limit/Fixed
//
//        许昊:
//        http://wxtest.allinfinance.com/evercos/assets/nonfinance/index.html#/balance/query

//        System.out.println(URLEncoder.encode("https://weixin.allinfinance.com/evercos/credit/temp/index#/limit/Fixed", "UTF-8"));
//        System.out.println(URLEncoder.encode("https://weixin.allinfinance.com/evercos/assets/nonfinance/index.html#/limit/adjust", "UTF-8"));
//        System.out.println(URLEncoder.encode("https://weixin.allinfinance.com/evercos/assets/nonfinance/index.html#/limit/Fixed", "UTF-8"));
        System.out.println(URLEncoder.encode("https://www.baidu.com/", "UTF-8"));

   }
}
