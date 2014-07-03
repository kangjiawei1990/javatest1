package gyyx.service;

import gyyx.dao.ServerMapper;
import gyyx.model.GameServer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("aServerService")
public class ServerServiceImpl implements ServerServiceI {

	private ServerMapper serverMapper;
	
	public ServerMapper getServerMapper() {
		return serverMapper;
	}

	@Autowired
	public void setServerMapper(ServerMapper serverMapper) {
		this.serverMapper = serverMapper;
	}
	
	@Override
    public List<GameServer> GetServerList(int code){
		return serverMapper.getServerList(code);
	}
}
