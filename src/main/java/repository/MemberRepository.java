package repository;

import domain.Member;
import java.util.List;

public interface MemberRepository {
    List<Member> getMembers();
}
