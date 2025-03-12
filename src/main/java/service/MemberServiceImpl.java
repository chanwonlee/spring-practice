package service;

import domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Override
    public Member findById(Long id) {
        for (Member member : memberRepository.getMembers()) {
            if (member.id().equals(id)) {
                return member;
            }
        }
        throw new IllegalArgumentException("Member not found");
    }
}
