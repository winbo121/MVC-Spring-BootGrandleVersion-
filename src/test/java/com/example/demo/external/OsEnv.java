package com.example.demo.external;


import java.util.Map;

public class OsEnv {

    public static void main(String[] args) {
        //Os환경변수들 가져오는 방법
        Map<String, String> env = System.getenv();

        for (String key : env.keySet()) {
            System.out.println(key + "=" + env.get(key));
        }
    }
}
