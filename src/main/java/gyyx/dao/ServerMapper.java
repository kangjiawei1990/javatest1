package gyyx.dao;

import gyyx.model.GameServer;

import java.util.List;

public interface ServerMapper {
	//获取服务器列表
	List<GameServer> getServerList(int gameCode);
}
