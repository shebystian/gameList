package cl.kranio.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.kranio.entities.Game;
import cl.kranio.entities.Request;
import cl.kranio.services.GameService;

@RestController
public class GameController {

	@Autowired GameService serviceGame;
	
	@RequestMapping(value = "/games", method = RequestMethod.GET)
	public List<Game> getGameList(){
		return serviceGame.getList();
		
	}
	
	@RequestMapping(value = "/game", method = RequestMethod.POST)
	public List<Game> getGame4Category(@Valid @RequestBody Request game){
		return serviceGame.getListForCategory(game.getCategory());
		
	}
	
	@RequestMapping(value = "/game", method = RequestMethod.POST)
	public Game getGame(@Valid @RequestBody Request game){
		return serviceGame.getGame(game.getName());
	}
}
