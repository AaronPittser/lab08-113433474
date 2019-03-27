import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame {
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;
	
	public BoardGame() {
		
	}
	
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation) {
		boolean b = true;
		for (int index = 0; index < playerPieces.size(); ++index) {
			if (playerPieces.get(index).getColor().equals(gamePiece.getColor()) && 
					playerPieces.get(index).getShape().equals(gamePiece.getShape()) ||
					playerPieces.get(index).name().equals(playerName)) {
				b = false;
			}
		}
		if (b == false) {
			return b;
		} else {
			playerPieces.put(playerName, gamePiece);
			return b;
		}
	}
	
	public GamePiece getPlayerGamePiece(String playerName) {
		GamePiece gp = null;
		for (int index = 0; index < playerPieces.size(); ++index) {
			if (playerPieces.get(index).name().equals(playerName)) {
				gp = playerPieces.get(index);
			}
		}
		return gp;
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece) {
		String name = "";
		for (int index = 0; index < playerPieces.size(); ++index) {
			if (playerPieces.get(index).equals(gamePiece)) {
				name = playerPieces.get(index).name();
			}
		}
		return name;
	}
	
//	public void movePlayer(String playerName, Location newLocation) {
//		for (int index = 0; index < playerPieces.size(); ++index) {
//			if (playerPieces.get(index).name().equals(playerName)) {
//				playerPieces.get(index).;
//			}
//		}
//	}
	
//	public Location getPlayersLocation(String player) {
//		GamePiece gp = null;
//		for (int index = 0; index < playerPieces.size(); ++index) {
//			if (playerPieces.get(index).name().equals(playerName)) {
//				gp = playerPieces.get(index);
//			}
//		}
//		return gp;
//	}
	
	public Set<String> getPlayers() {
		Set<String> set = (Set<String>) new ArrayList<String>();
		for (int index = 0; index < playerPieces.size(); ++index) {
			set.add(playerPieces.get(index).name());
		}
		
		return set;
	}
	
	public Set<GamePiece> getPlayerPieces() {
		Set<GamePiece> set = (Set<GamePiece>) new ArrayList<GamePiece>();
		for (int index = 0; index < playerPieces.size(); ++index) {
			set.add(playerPieces.get(index));
		}
		
		return set;
	}
}
