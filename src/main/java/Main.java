import config.AnnotationConfig;
import domain.Member;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.MemberService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        MemberService memberService = (MemberService) context.getBean("memberService");

        Member memberA = memberService.findById(1L);
        Member memberB = memberService.findById(2L);
        Member memberC = memberService.findById(3L);

        System.out.println(memberA);
        System.out.println(memberB);
        System.out.println(memberC);
    }
}
