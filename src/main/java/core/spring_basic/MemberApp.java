package core.spring_basic;

import core.spring_basic.member.Grade;
import core.spring_basic.member.Member;
import core.spring_basic.member.MemberService;
import core.spring_basic.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member" + member.getName());
        System.out.println("find Member" + findMember.getName());
    }
}
