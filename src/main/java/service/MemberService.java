package service;

import domain.Member;

public interface MemberService {
    Member findById(Long id);
}
