package gyyx.model;

public class Game {

	private int code;
	
	private String game;
	
	public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    public String getGame() {
    	return game;
    }
    
    public void setGame(String game)
    {
    	this.game = game == null ? null : game.trim();
    }
}
