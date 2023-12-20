package cl.kranio.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AliveController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AliveController.class);

	@RequestMapping(value = "/v1/alive", method = RequestMethod.GET)
	public ResponseEntity<String> alive() {
		LOGGER.info("Servicio responde correctamente!.");
		return ResponseEntity.status(HttpStatus.OK).body("OK");
	}
}
