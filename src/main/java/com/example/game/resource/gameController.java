package com.example.game.resource;

import java.util.Hashtable;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class gameController {

	private static Integer idCounter = 1;
	Map<Integer, Game> gameMap = new Hashtable<>();
	Map<Integer, Game> doorMap = new Hashtable<>();
	// Game game = new Game();

	@RequestMapping(value = "/game", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public void index() {

		Game game = new Game();
		game.setId(idCounter);
		game.setState("INIT");

		Door door1 = new Door();
		door1.setId(1);
		door1.setStatus("CLOSED");

		Door door2 = new Door();
		door2.setId(2);

		Door door3 = new Door();
		door3.setId(3);

		game.setDoor1(door1);
		game.setDoor2(door2);
		game.setDoor3(door3);

		gameMap.put(game.getId(), game);
		idCounter++;
		System.out.println(game);
	}

	@RequestMapping("/game/{id}/Doors")
	public Game listofgame(@PathVariable Integer id) {

		Game game = gameMap.get(id);
		System.out.println(game);
		return game;
	}

	@RequestMapping(value = "/game/{id}/Doors/{id1}", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void selectdoor(@PathVariable Integer id, @PathVariable Integer id1, @RequestBody Door door) {
		Game game = gameMap.get(id);
		if (id1 == 1) {
			Door door1 = game.getDoor1();
			door1.setStatus(door.getStatus());
		} else if (id1 == 2) {
			Door door2 = game.getDoor2();
			door2.setStatus(door.getStatus());
			System.out.println(game.getDoor2());
		} else if (id1 == 3) {
			Door door3 = game.getDoor3();
			door3.setStatus(door.getStatus());
			System.out.println(game.getDoor3());
		}
		// System.out.println(game);

	}

	@RequestMapping("/game/{id}")
	public String finalresult(@PathVariable Integer id) {
		Game game = gameMap.get(id);
		if(id != null) 
		{
		 game.getState();
		}
		//game.getState();
		//System.out.println(game.getState());
		// System.out.println(game);
		return "{ \"State : " + game.getState()+ "\"}";
	}
	
	@RequestMapping(value = "/game/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public void deletedoor(@PathVariable Integer id) {
		Game game = gameMap.get(id);
		gameMap.remove(id);
	}
}
