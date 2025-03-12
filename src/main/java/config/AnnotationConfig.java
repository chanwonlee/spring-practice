package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.MemberRepository;
import repository.MemoryRepository;
import service.MemberService;
import service.MemberServiceImpl;

@Configuration
public class AnnotationConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryRepository();
    }
}
