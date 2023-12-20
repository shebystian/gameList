package cl.kranio.dao;

import java.util.List;

import cl.kranio.dao.entities.Game;

public interface GameDao {
	
	public List<Game> getGames();
	public Game getGame(String name);
	public List<Game> getGame4Catgory(String category);
}
