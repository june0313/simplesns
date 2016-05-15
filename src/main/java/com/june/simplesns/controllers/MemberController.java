package com.june.simplesns.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wayne on 2016. 5. 15..
 */
@Controller
public class MemberController {

	@RequestMapping(value = "/register_member")
	public String registerMember(Model model) {
		return "registerMember";
	}
}
