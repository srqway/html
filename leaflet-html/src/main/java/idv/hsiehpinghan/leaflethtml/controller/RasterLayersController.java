package idv.hsiehpinghan.leaflethtml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/rasterLayers")
public class RasterLayersController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "rasterLayers/index";
	}

	@RequestMapping(value = "/tileLayer", method = RequestMethod.GET)
	public String tileLayer() {
		return "rasterLayers/tileLayer";
	}

}
