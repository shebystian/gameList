package cl.kranio.model;

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
		Game game4 = new Game();
		
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
		
		game4.setId(114);
		game4.setName("Doom Eternal");
		game4.setCategory("Shooter");
		game4.setYear(2020);
		gameList.add(game4);
		
		return gameList;
	}


	public Game getGame(String name) {
		Game game = new Game();
		if(name.equals("Mortal Kombat XL")) {
			game.setId(110);
			game.setName("Mortal Kombat XL");
			game.setCategory("Fight");
			game.setYear(2019);
		}
		else if(name.equals("Street Fighter V") || name.equals("Street Fighter")) {
			game.setId(111);
			game.setName("Street Fighter V");
			game.setCategory("Fight");
			game.setYear(2019);
		}
		else if(name.equals("Space Invaders")){
			game.setId(112);
			game.setName("Space Invaders");
			game.setCategory("Arcade");
			game.setYear(1978);
		}
		else if(name.equals("God of War")) {
			game.setId(113);
			game.setName("God of War");
			game.setCategory("Adventures");
			game.setYear(2016);
		}
		else if(name.equals("Doom") || name.equals("Doom Eternal")) {
			game.setId(114);
			game.setName("Doom Eternal");
			game.setCategory("Shooter");
			game.setYear(2020);
		}
		else
			return null;
		
		return game;
	}
	
	public List<Game> getGame4Catgory(String category) {
		List<Game> listGame = new ArrayList<Game>();
		Game game = new Game();
		if(category.equals("Fight")) {
			game = new Game();
			game.setId(110);
			game.setName("Mortal Kombat XL");
			game.setCategory("Fight");
			game.setYear(2019);
			listGame.add(game);
		}
		if(category.equals("Fight")) {
			game = new Game();
			game.setId(111);
			game.setName("Street Fighter V");
			game.setCategory("Fight");
			game.setYear(2019);
			listGame.add(game);
		}
		if(category.equals("Arcade")){
			game = new Game();
			game.setId(112);
			game.setName("Space Invaders");
			game.setCategory("Arcade");
			game.setYear(1978);
			listGame.add(game);
		}
		if(category.equals("Adventures")) {
			game = new Game();
			game.setId(113);
			game.setName("God of War");
			game.setCategory("Adventures");
			game.setYear(2016);
			listGame.add(game);
		}
		if(category.equals("Shooter")) {
			game = new Game();
			game.setId(114);
			game.setName("Doom Eternal");
			game.setCategory("Shooter");
			game.setYear(2020);
			listGame.add(game);
		}
		
		return listGame;
	}
}
