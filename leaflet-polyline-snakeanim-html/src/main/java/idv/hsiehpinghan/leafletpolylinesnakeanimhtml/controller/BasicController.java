package idv.hsiehpinghan.leafletpolylinesnakeanimhtml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/basic")
public class BasicController {

	@RequestMapping(value = "/snakeIn", method = RequestMethod.GET)
	public String snakeIn() {
		return "basic/snakeIn";
	}

}
