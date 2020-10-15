package cl.kranio.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.kranio.entities.Game;
import cl.kranio.entities.Request;
import cl.kranio.entities.Wrapper;
import cl.kranio.services.GameService;

@RestController
public class GameController {

	@Autowired
	GameService serviceGame;

	@RequestMapping(value = "/games", method = RequestMethod.GET)
	public ResponseEntity<Wrapper> getGameList() {
		Wrapper wp = new Wrapper();
		try {
			List<Game>listGame = serviceGame.getList();
			wp.setData(listGame);
			wp.setOK(true);
			wp.setInformation("Consulta realizada correctamente");
			
			if(listGame.size()==0)
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(wp);
			else
				return ResponseEntity.ok(wp);
		} catch (Exception ex) {
			wp.setError(true);
			wp.setInformation(ex.getMessage());
			wp.setOK(false);
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(wp);
		}
	}

	@RequestMapping(value = "/game/{name}", method = RequestMethod.GET)
	public ResponseEntity<Wrapper> getGame(@PathVariable("name") String nameRequest) {
		Wrapper wp = new Wrapper();
		try {
			Game game = serviceGame.getGame(nameRequest);
			wp.setData(game);
			wp.setOK(true);
			wp.setInformation("Consulta realizada correctamente");
			if(game==null)
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(wp);
			else
				return ResponseEntity.ok(wp);
			
		} catch (Exception ex) {
			wp.setError(true);
			wp.setInformation(ex.getMessage());
			wp.setOK(false);
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(wp);
		}
	}
	
	@RequestMapping(value = "/game/category", method = RequestMethod.GET)
	public ResponseEntity<Wrapper> getGame4Category(@RequestBody Request game) {
		Wrapper wp = new Wrapper();
		try {
			List<Game>listGame = serviceGame.getListForCategory(game.getCategory());
			wp.setData(listGame);
			wp.setOK(true);
			wp.setInformation("Consulta realizada correctamente");
			
			if(listGame.size()==0)
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(wp);
			else
				return ResponseEntity.ok(wp);
		} catch (Exception ex) {
			wp.setError(true);
			wp.setInformation(ex.getMessage());
			wp.setOK(false);
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(wp);
		}
	}

}
