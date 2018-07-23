package idv.hsiehpinghan.leaflethtml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/vectorLayers")
public class VectorLayersController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "vectorLayers/index";
	}

	@RequestMapping(value = "/circle", method = RequestMethod.GET)
	public String circle() {
		return "vectorLayers/circle";
	}
	
	@RequestMapping(value = "/polygon", method = RequestMethod.GET)
	public String polygon() {
		return "vectorLayers/polygon";
	}

}
