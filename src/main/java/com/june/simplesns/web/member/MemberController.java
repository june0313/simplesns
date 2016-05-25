package com.june.simplesns.web.member;

import com.june.simplesns.domain.member.Member;
import com.june.simplesns.domain.member.MemberForm;
import com.june.simplesns.repository.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wayne on 2016. 5. 15..
 */
@Controller
@RequestMapping(value = "/members")
public class MemberController {
	@Autowired
	private MemberRepository memberRepository;

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String getRegisterMemberFrom() {
		return "registerMemberForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String registerMember(@ModelAttribute MemberForm memberForm) {
		Member member = new Member();
		member.setId(memberForm.getId());
		member.setName(memberForm.getName());
		member.setEmail(memberForm.getEmail());
		member.setPassword(memberForm.getPassword());

		memberRepository.save(member);

		return "redirect:/";
	}
}
