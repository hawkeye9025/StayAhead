package com.stayahead.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class stayAheadController {
		@RequestMapping(method = RequestMethod.GET)
		public String StayAhead(ModelMap model) {
			model.addAttribute("message", "Stay Ahead!");
			return "stayahead";
		}
}