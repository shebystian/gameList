package cl.kranio.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.kranio.entities.Game;
import cl.kranio.model.GameDataAccess;

@Service
public class GameService {
	
	@Autowired GameDataAccess gameDA;
	
	public List<Game> getList(){
		return gameDA.getGames();
	}

	public List<Game> getListForCategory(String categoryGame){
		List<Game> gameList = new ArrayList();
		List<Game> gameListFilter = new ArrayList();
		gameList = gameDA.getGames();
		
		for(Game obj : gameList) 
		{
			if(obj.getCategory().equals(categoryGame)) {
				gameListFilter.add(obj);
			}
		}
		return gameList;
	}
	
	public Game getGame(String name) {
		return gameDA.getGame(name);
	}
}
