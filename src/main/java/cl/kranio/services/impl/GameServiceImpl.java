package cl.kranio.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.kranio.dao.GameDao;
import cl.kranio.dao.entities.Game;
import cl.kranio.services.GameService;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	GameDao gameDAO;

	public List<Game> getList() {
		try {
			List<Game> result = new ArrayList<Game>();
			result = gameDAO.getGames();

			return result;
		} catch (Exception ex) {
			throw ex;
		}
	}

	public List<Game> getListForCategory(String categoryGame) {
		List<Game> result = new ArrayList();
		List<Game> gameListFilter = new ArrayList();

		try {
			result = gameDAO.getGames();

			for (Game obj : result) {
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
			return gameDAO.getGame(name);
		} catch (Exception ex) {
			throw ex;
		}

	}
}
