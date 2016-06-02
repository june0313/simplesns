package com.june.simplesns.web.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wayne on 2016. 5. 26..
 *
 */

@Controller
@RequestMapping(value = "/")
public class HomeController {
	@RequestMapping(method = RequestMethod.GET)
	public String home() {
		return "home";
	}
}
