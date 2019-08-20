package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.awt.Color;
import org.junit.Test;
import model.myEnum.Pawns;
import model.player.ListOfPlayers;
import model.player.PlayerImpl;
/**
 * 
 * JUnit test for ListOfPlayers class.
 *
 */
public class TestListOfPlayer {
/**
 * I have tested if the possible actions that can be
 * performed on the list of players work correctly.
 */
@Test
	public void testingMethodsListOfPlayer() {
	
	ListOfPlayers list = new ListOfPlayers();
	PlayerImpl p1 = new PlayerImpl("FABI", Color.BLACK, Pawns.BALL, "EASY");
	PlayerImpl p2 = new PlayerImpl("FAB", Color.BLACK, Pawns.BALL, "EASY");
	PlayerImpl p3 = new PlayerImpl("FA", Color.BLACK, Pawns.BALL, "EASY");
	PlayerImpl p4 = new PlayerImpl("F", Color.BLACK, Pawns.BALL, "EASY");
	list.addPlayer(p1, 0);
	list.addPlayer(p2, 1);
	list.addPlayer(p3, 2);
	list.addPlayer(p4, 3);
	assertTrue(list.getIndexFromPlayer(p1) == 0);
	assertTrue(list.getPlayerFromIndex(0).equals(p1));
	PlayerImpl p5 = new PlayerImpl("F", Color.BLACK, Pawns.BALL, "EASY");
	list.addPlayer(p5, 4);
	assertTrue(list.getNumberPlayer() == 5);
	list.removePlayer(p5);
	assertTrue(list.getNumberPlayer() == 4);
	assertTrue(list.getPlayerFromName("FAB").equals(list.getPlayerFromIndex(1)));
	assertFalse(list.isPresentSameCustum());
	list.removeAllPlayers();
	assertTrue(list.isEmpty());
	
	
  

}






}
