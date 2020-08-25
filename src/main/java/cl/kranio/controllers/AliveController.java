package cl.kranio.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.kranio.services.GameService;

@RestController
public class AliveController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AliveController.class);
	
	@Autowired GameService gameService;
	
	@RequestMapping(value = "/alive", method = RequestMethod.GET)
	public String getAlive(){
		return "ok";
		
	}
}
