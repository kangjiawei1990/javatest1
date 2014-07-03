package gyyx.service;

import gyyx.model.GameServer;

import java.util.List;

public interface ServerServiceI {
	//获取服务器列表
	List<GameServer> GetServerList(int code);
}
