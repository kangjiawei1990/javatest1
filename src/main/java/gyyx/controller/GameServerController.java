package gyyx.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import gyyx.model.Game;
import gyyx.model.GameServer;
import gyyx.service.ServerServiceI;

import gyyx.service.GameServiceI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/gameServerController")
public class GameServerController {

	private GameServiceI gameService;
	
	public GameServiceI getgameService(){
		return gameService;
	}
	
	@Autowired
	public void setGameService(GameServiceI gameService) {
		this.gameService = gameService;
	}
	
	private ServerServiceI serverService;
	
	public ServerServiceI getServerService(){
		return serverService;
	}
	
	@Autowired
	public void setServerService(ServerServiceI serverService) {
		this.serverService = serverService;
	}				
	
	@RequestMapping("/gameserver")
	public String showGameServer(Model model, HttpServletRequest request) {
		List<Game> list = gameService.GetGameList();
		model.addAttribute("gameList",list);
		return "showGameServer";
	}
	
	
	@RequestMapping("/serverlist")
	@ResponseBody
	public List<GameServer> getServerList(int code)
	{
		List<GameServer> serverList = serverService.GetServerList(code);				
		return serverList;
	}
	
	
	
}
