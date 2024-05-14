package com.example.demo.memory;

import memory.MemoryController;
import memory.MemoryFinder;
import org.springframework.context.annotation.Bean;

//@Configuration
// (현상황으로는 원래 memory-v1.jar의 있는 라이브러리에 있는 함수를
// 사용하려면 @Configuration를 해서 memory-v1.jar 안에 있는 함수를 사용하는 빈즈를
// 만드는 것이지만 이미 memory-v2.jar AutoConfiguration 사용중이라 그냥 @Configuration필요없이 다 가져올수 있게 된다.)

//memory-v2.jar에서 보면 MemoryAutoConfig에서  @Conditional({MemoryCondition.class})를 찾아볼수 있는데
// 저 해당것의 뜻은 MemoryCondition에서 true , false반환을 하고 
// true가 나오면 해당 클레스에 있는 빈즈가 다 등록이 되고 false가 나오면 해당 클레스에 있는 빈즈를 다 등록되지 않는다
public class MemoryConfig {

    /* 원래는 memory-v1.jar의 라이브러리를 가져오는 방식으로 되어있다.
     테스트 url : http://localhost:8080/memory (현재는 memory-v2.jar 에서 AutoConfiguration 사용중이라 빈즈 없이 된다)
    */
    /*
    @Bean
    public MemoryFinder memoryFinder() {
        return new MemoryFinder();
    }

    @Bean
    public MemoryController memoryController(){
        return new MemoryController(memoryFinder());
    }
     */

}
