package org.example.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.example.springbootdeveloper.Member;
import java.util.List;

@Service
public class TestService {

    @Autowired
    MemberRepository memberRepository; // 빈 주입

    public List<org.example.springbootdeveloper.Member> getAllMembers() {
        return memberRepository.findAll(); // 멤버 목록 얻기
    }
}