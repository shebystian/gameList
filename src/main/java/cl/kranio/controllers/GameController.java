package cl.kranio.controllers;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.kranio.dao.entities.Game;
import cl.kranio.dto.Request;
import cl.kranio.dto.Wrapper;
import cl.kranio.services.GameService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;


@Tag(name = "Game Controller")
@RestController
public class GameController {

	@Autowired
	GameService serviceGame;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GameController.class);
	
	@Operation(description = "metodo que obtiene lista de juegos", summary = "Obtiene lista de juegos", security = {@SecurityRequirement(name = "non-Security")})
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Consulta generada correctamente"),
			@ApiResponse(responseCode = "500", description = "Internal server error") })

	@RequestMapping(value = "v1/games", method = RequestMethod.GET)
	public ResponseEntity<Wrapper> getGameList() {
		Wrapper response = new Wrapper();
		try {
			List<Game>listGame = serviceGame.getList();
			response.setData(listGame);
			response.setOK(true);
			response.setInformation("Consulta realizada correctamente");
			
			if(listGame.size()==0)
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
			else
				return ResponseEntity.ok(response);
		} catch (Exception ex) {
			response.setError(true);
			response.setInformation(ex.getMessage());
			response.setOK(false);
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
	}

	@RequestMapping(value = "/game/{name}", method = RequestMethod.GET)
	public ResponseEntity<Wrapper> getGame(@PathVariable("name") String nameRequest) {
		Wrapper response = new Wrapper();
		try {
			Game game = serviceGame.getGame(nameRequest);
			response.setData(game);
			response.setOK(true);
			response.setInformation("Consulta realizada correctamente");
			if(game==null)
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
			else
				return ResponseEntity.ok(response);
			
		} catch (Exception ex) {
			response.setError(true);
			response.setInformation(ex.getMessage());
			response.setOK(false);
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
	}

	@RequestMapping(value = "/game/category/{category}", method = RequestMethod.GET)
	public ResponseEntity<Wrapper> getGame4Category(@PathVariable("category") String categoryGame) {
		Wrapper response = new Wrapper();
		try {
			List<Game>listGame = serviceGame.getListForCategory(categoryGame);
			response.setData(listGame);
			response.setOK(true);
			response.setInformation("Consulta realizada correctamente");
			
			if(listGame.size()==0)
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
			else
				return ResponseEntity.ok(response);
		} catch (Exception ex) {
			response.setError(true);
			response.setInformation(ex.getMessage());
			response.setOK(false);
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
	}

}
