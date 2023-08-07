package core.spring_basic;

import core.spring_basic.discount.FixDiscountPolicy;
import core.spring_basic.member.MemberService;
import core.spring_basic.member.MemberServiceImpl;
import core.spring_basic.member.MemoryMemberRepository;
import core.spring_basic.order.OrderService;
import core.spring_basic.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
