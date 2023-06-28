package com.jun.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 스프링부트의 자동설정, 스프링 Bean읽기와 생성을 모두 자동 // 꼭 최상단 위치!
public class SpringbootApplication {

	//
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
		// run 으로 인해 내부 WAS 실행 -> 항상 서버에 톰캣을 설치할 필요가 없어지고, 스프링 부트로 만든 Jar로 실행
		// 내장 WAS 사용 권장 -> 언제 어디서나 같은 스프링 부트 배포 가능
	}

}
