package gyyx.service;

import gyyx.model.GameServer;

import java.util.List;

public interface ServerServiceI {
	//��ȡ�������б�
	List<GameServer> GetServerList(int code);
}
