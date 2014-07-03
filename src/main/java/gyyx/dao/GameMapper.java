package gyyx.dao;

import gyyx.model.Game;

import java.util.List;

public interface GameMapper {
	
	//获取游戏列表
	List<Game> getGameList();
}
