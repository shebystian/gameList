package cl.kranio.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.kranio.entities.Game;
import cl.kranio.model.GameDataAccess;

@Service
public class GameService {

	@Autowired
	GameDataAccess gameDA;

	public List<Game> getList() {
		try {
			return gameDA.getGames();
		} 
		catch (Exception ex) {
			throw ex;
		}
	}

	public List<Game> getListForCategory(String categoryGame) {

		List<Game> gameList = new ArrayList();
		List<Game> gameListFilter = new ArrayList();

		try {
			gameList = gameDA.getGames();
			for (Game obj : gameList) {
				if (obj.getCategory().equals(categoryGame))
					gameListFilter.add(obj);
			}
		} catch (Exception ex) {
			throw ex;
		}

		return gameListFilter;
	}

	public Game getGame(String name) {
		try {
			return gameDA.getGame(name);
		} 
		catch (Exception ex) {
			throw ex;
		}

	}
}
