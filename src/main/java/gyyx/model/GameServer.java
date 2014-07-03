package gyyx.model;

public class GameServer {

	private int id;
	
	private int gameCode;
	
	private String name;
	
	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getGameCode() {
        return gameCode;
    }

    public void setGameCode(int gameCode) {
        this.gameCode = gameCode;
    }
    
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name)
    {
    	this.name = name == null ? null : name.trim();
    }
}
