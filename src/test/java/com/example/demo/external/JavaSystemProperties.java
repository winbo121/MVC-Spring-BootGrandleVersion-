package com.example.demo.external;

import java.util.Properties;

public class JavaSystemProperties {

    public static void main(String[] args) {

        //프로퍼티 가져오는 방법 가져오는 방법 
       Properties properties = System.getProperties();

       for(Object key : properties.keySet()) {
           System.out.println(key + "=" + properties.get(key));
       }
       
       /*
        위에 javaSystemProperties를 클릭후 edit Configuration 클릭후
        1. Modify options를 선택한다.
        2. Add VM options를 선택한다.
        3. VM options에 다음을 추가한다.
        -Durl=devdb -Dusername=dev_user -Dpassword=dev_pw 를 추가
        */

        String url = System.getProperty("url");
        String username = System.getProperty("username");
        String password = System.getProperty("password");
        System.out.println("url=>"+url);
        System.out.println("username=>"+username);
        System.out.println("password=>"+password);

    }
}
