package core.spring_basic;

import core.spring_basic.member.Grade;
import core.spring_basic.member.Member;
import core.spring_basic.member.MemberService;
import core.spring_basic.order.Order;
import core.spring_basic.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}