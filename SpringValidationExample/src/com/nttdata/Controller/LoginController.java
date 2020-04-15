package com.nttdata.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nttdata.Model.User;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String loginCheck(@Valid  User user,BindingResult result,ModelMap model)
	{
		if(result.hasErrors())
		{
			return "login";
		}
		else
		{
			model.addAttribute("ifobj", user);
			return "welcome";
		}
	}
}
