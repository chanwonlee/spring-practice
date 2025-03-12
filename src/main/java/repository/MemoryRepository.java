package repository;

import domain.Member;
import java.util.List;

public class MemoryRepository implements MemberRepository {
    private final List<Member> members;

    public MemoryRepository() {
        this.members = List.of(
                new Member(1L, "memberA", 20),
                new Member(2L, "memberB", 25),
                new Member(3L, "memberC", 30)
        );
    }

    @Override
    public List<Member> getMembers() {
        return members;
    }
}
