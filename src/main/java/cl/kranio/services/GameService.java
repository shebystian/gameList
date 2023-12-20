package cl.kranio.services;

import java.util.List;

import cl.kranio.dao.entities.Game;

public interface GameService {

	List<Game> getList();
	Game getGame(String nameRequest);
	List<Game> getListForCategory(String category);

}
