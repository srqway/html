package idv.hsiehpinghan.leaflethtml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/uiLayers")
public class UiLayersController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "uiLayers/index";
	}

	@RequestMapping(value = "/marker", method = RequestMethod.GET)
	public String marker() {
		return "uiLayers/marker";
	}
	
}
