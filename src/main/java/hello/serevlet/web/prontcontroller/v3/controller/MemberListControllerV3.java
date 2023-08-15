package hello.serevlet.web.prontcontroller.v3.controller;

import hello.serevlet.domain.member.Member;
import hello.serevlet.domain.member.MemberRepository;
import hello.serevlet.web.prontcontroller.ModelView;
import hello.serevlet.web.prontcontroller.v3.ControllerV3;

import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {

        List<Member> members = memberRepository.findAll();
        ModelView mv = new ModelView("members");
        mv.getModel().put("members", members);

        return mv;
    }
}
