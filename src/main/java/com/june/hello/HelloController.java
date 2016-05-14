package com.june.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wayne on 2016. 5. 15..
 */
@Controller
public class HelloController {

	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "hello controller!";
	}
}
