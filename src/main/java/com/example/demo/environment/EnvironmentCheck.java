package com.example.demo.environment;

import jakarta.annotation.PostConstruct;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentCheck {

    /*
    프로펄티 가져오는 방식중에 원래는 톰캣에 dev, prod를 호출해서 했지만 여기서는 좀 다르게 한다.
    현 상황으로는 application.properties로 통합이 된 상태고
    나머지 ,application-dev.properties 와 application-prod.properties는 주석처리 되어있는 상태이다.
    */
    private final Environment environment;

    public EnvironmentCheck(Environment env) {
        this.environment = env;
    }


    /*
       프로퍼티 가져오는 방식 연구
        1. 서버에 Edit Configration 선택한다.
        2. Modify options를 선택한다.
        3. Add VM options를 선택한다.
        4. VM options에 다음을 추가한다.
        -Dspring.profiles.active=dev (개발) 또는 -Dspring.profiles.active=prod (운영) 를 추가
     */
    @PostConstruct
    public void init(){
      
        /*profile 또는 vm 사용*/
        
        String useProfile = environment.getProperty("spring.config.activate.useProfile");
        String driver = environment.getProperty("spring.config.activate.driver");
        String jdbc_url = environment.getProperty("spring.config.activate.jdbc-url");
        String username = environment.getProperty("spring.config.activate.username");
        String password = environment.getProperty("spring.config.activate.password");
        
        System.out.println("useProfile: " + useProfile);
        System.out.println("driver: " + driver);
        System.out.println("jdbc_url: " + jdbc_url);
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        
    }

}
