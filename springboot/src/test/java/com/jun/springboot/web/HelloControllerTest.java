package com.jun.springboot.web;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class) // RunWith -> 스프링부트 테스트랑 Junit 연결역할
@WebMvcTest(controllers = HelloController.class) // SpringMvc에 집중, 선언하면 @Controller, @ControllerAdvice등 사용가능, @Service,@Repository는 불가능, 컨트롤러 전용
public class HelloControllerTest {

    @Autowired // 스프링이 관리하는 빈 주입 받기
    private MockMvc mvc; // MVC테스트 시작점, API테스트 가능

    @Test
    public void helloReturn() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello")) // 요청함, 체이닝이 지원돼 여러 검증기능 이어서 가능
                .andExpect(status().isOk()) // status검증
                .andExpect(content().string(hello)); // 응답내용 검증
    }
}
