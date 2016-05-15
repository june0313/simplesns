package com.june.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wayne on 2016. 5. 15..
 */
@Controller
public class HelloController {
	@ResponseBody
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "hello controller!";
	}

	@ResponseBody
	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public String helloWithName(@PathVariable String name) {
		return "hello " + name;
	}
}
