package com.example.demo.profile;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    /*
       프로파일에 명칭에 따른 빈즈 사용 미사용
        1. 서버에 Edit Configration 선택한다.
        2. Active Profiles에서 dev 또는 prod를 쓴다
     */

    @Bean
    @Profile("dev")
    public String devPayClient() {
        System.out.println("프로파일 확인 : devPayClient");
        return "devPayClient";
    }

    @Bean
    @Profile("prod")
    public String prodPayClient() {
        System.out.println("프로파일 확인 : prodPayClient");
        return "prodPayClient";
    }

}
