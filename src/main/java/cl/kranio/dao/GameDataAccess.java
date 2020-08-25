package cl.kranio.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import cl.kranio.entities.Game;

@Component
public class GameDataAccess {

	public List<Game> getGames(){
		
		List<Game> gameList = new ArrayList();
		
		Game game = new Game();
		Game game1 = new Game();
		Game game2 = new Game();
		Game game3 = new Game();
		
		game.setId(110);
		game.setName("Mortal Kombat XL");
		game.setCategory("Fight");
		game.setYear(2019);
		gameList.add(game);
		
		game1.setId(111);
		game1.setName("Street Fighter V");
		game1.setCategory("Fight");
		game1.setYear(2019);
		gameList.add(game1);
		
		game2.setId(112);
		game2.setName("Space Invaders");
		game2.setCategory("Arcade");
		game2.setYear(1978);
		gameList.add(game2);
		
		game3.setId(113);
		game3.setName("God of War");
		game3.setCategory("Adventures");
		game3.setYear(2016);
		gameList.add(game3);
		
		return gameList;
	}
}
