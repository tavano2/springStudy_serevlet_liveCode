package hello.serevlet.web.prontcontroller.v4.controller;

import hello.serevlet.domain.member.Member;
import hello.serevlet.domain.member.MemberRepository;
import hello.serevlet.web.prontcontroller.ModelView;
import hello.serevlet.web.prontcontroller.v4.ControllerV4;

import java.util.List;
import java.util.Map;

public class MemberListControllerV4 implements ControllerV4 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        List<Member> members = memberRepository.findAll();
        model.put("members", members);
        return "members";
    }
}
