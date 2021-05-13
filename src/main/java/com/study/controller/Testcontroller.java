package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 陳亞軍:
 * @version 创建时间：2020年3月18日 下午10:16:28 类说明
 */
@Controller
public class Testcontroller {

	@RequestMapping("/")
	@ResponseBody
	public String helloWorld() {
		return "Hello World";
	}
}
