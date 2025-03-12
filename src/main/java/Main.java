import config.AnnotationConfig;
import domain.Member;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.MemberService;

public class Main {
    public static void main(String[] args) {
        /* spring 사용전
            MemberRepository memberRepository = new MemoryRepository(); -> MemoryRepository 다른 MemberRepository로 변경시 코드 변경 필요
            MemberService memberService = new MemberServiceImpl(memberRepository); -> 사용자가 직접 memberRepository를 생성하고 memberService에 주입
        */

        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        // memberService를 사용할 때 주입해야 하는 객체를 알 필요가 없음
        MemberService memberService = (MemberService) context.getBean("memberService");

        Member memberA = memberService.findById(1L);
        Member memberB = memberService.findById(2L);
        Member memberC = memberService.findById(3L);

        System.out.println(memberA);
        System.out.println(memberB);
        System.out.println(memberC);
    }
}
