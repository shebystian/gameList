package cl.kranio.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cl.kranio.dao.GameDao;
import cl.kranio.dao.entities.Game;
import cl.kranio.dao.repository.GameRepository;

@Component
public class GameDaoImpl implements GameDao{
	
	
	@Autowired GameRepository gameRepository;

	public List<Game> getGames(){
		
		List<Game> gameList = new ArrayList();
		gameList = gameRepository.getGames();
		
		return gameList;
	}


	public Game getGame(String name) {
		Game game = new Game();
		game = gameRepository.getGame(name);
		
		return game;
	}
	
	public List<Game> getGame4Catgory(String category) {
		List<Game> listGame = new ArrayList<Game>();
		listGame= gameRepository.getGame4Catgory(category);
		
		return listGame;
	}

	
}
