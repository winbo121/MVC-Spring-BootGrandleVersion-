# MVC-Spring-BootGrandleVersion-
```
https://start.spring.io/ (부트세팅 사이트)
```
https://www.egovframe.go.kr/wiki/doku.php?id=egovframework:dev4.2:dep:build_tool:togradle (egovFrameWork 사용할시 grandle 프로젝트 세팅 방법 )
```
# 배포방법
```
인텔리제이 터미널에서 
./gradlew clean build
cd build
cd libs
```
```
war파일 존재한거를 배포하면 되는데 만약 없다면 
build.gradle이라는 곳에서 plugins에 id 'war'를 추가해야 한다.
```
