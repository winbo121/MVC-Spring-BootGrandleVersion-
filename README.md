#MVC-Spring-BootGrandleVersion-

https://start.spring.io/ (부트세팅 사이트)

-배포방법
인텔리제이 터미널에서 
./gradlew build
cd build
war파일 존재한거를 배포하면 되는데 만약 없다면 
build.gradle이라는 곳에서 plugins에 id 'war'를 추가해야 한다.
