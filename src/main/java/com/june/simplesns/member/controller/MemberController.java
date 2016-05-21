package com.june.simplesns.member.controller;

import com.june.simplesns.member.dao.MemberDao;
import com.june.simplesns.member.domain.Member;
import com.june.simplesns.member.domain.MemberForm;
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
	private MemberDao memberDao;

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

		memberDao.persist(member);

		return "redirect:/";
	}
}
