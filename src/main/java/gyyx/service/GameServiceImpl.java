package gyyx.service;

import java.util.List;

import gyyx.dao.GameMapper;
import gyyx.model.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("gameService")
public class GameServiceImpl implements  GameServiceI {
	private GameMapper gameMapper;
	
	public GameMapper getGameMapper() {
		return gameMapper;
	}

	@Autowired
	public void setGameMapper(GameMapper gameMapper) {
		this.gameMapper = gameMapper;
	}
	
	@Override
    public List<Game> GetGameList(){
		return gameMapper.getGameList();
	}
}
