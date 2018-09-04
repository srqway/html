package idv.hsiehpinghan.javascripthtml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/javascript")
public class JavascriptController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "javascript/index";
	}

	@RequestMapping(value = "/elementByXpath", method = RequestMethod.GET)
	public String elementByXpath() {
		return "javascript/elementByXpath";
	}

	@RequestMapping(value = "/xpathOfElement", method = RequestMethod.GET)
	public String xpathOfElement() {
		return "javascript/xpathOfElement";
	}

	@RequestMapping(value = "/for", method = RequestMethod.GET)
	public String for_() {
		return "javascript/for";
	}

	@RequestMapping(value = "/switch", method = RequestMethod.GET)
	public String switch_() {
		return "javascript/switch";
	}

	@RequestMapping(value = "/while", method = RequestMethod.GET)
	public String while_() {
		return "javascript/while";
	}

	@RequestMapping(value = "/regex", method = RequestMethod.GET)
	public String regex() {
		return "javascript/regex";
	}

	@RequestMapping(value = "/string", method = RequestMethod.GET)
	public String string() {
		return "javascript/string";
	}

	@RequestMapping(value = "/copyText", method = RequestMethod.GET)
	public String copyText() {
		return "javascript/copyText";
	}
	
	@RequestMapping(value = "/checkDevice", method = RequestMethod.GET)
	public String checkDevice() {
		return "javascript/checkDevice";
	}
	
	@RequestMapping(value = "/triggerEventAfterResize", method = RequestMethod.GET)
	public String triggerEventAfterResize() {
		return "javascript/triggerEventAfterResize";
	}
	
}
