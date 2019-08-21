package test;

import static org.junit.Assert.assertEquals;
import java.awt.Color;
import org.junit.Test;
import controller.menu.ControllerSettingPlayersMenu;
import model.myEnum.Pawns;
import model.player.ListOfPlayersImpl;
import model.player.PlayerImpl;
/**
 * 
 * JUnit test for ControllerSettingPlayersMenu class.
 *
 */
public class TestControllerSettingPlayersMenu {
/**
 * I tested if with the start method the player is created correctly.
 */

@Test
	public void testIsStartWorking() {
	
	ControllerSettingPlayersMenu action = new ControllerSettingPlayersMenu();
	ListOfPlayersImpl list = new ListOfPlayersImpl();
	PlayerImpl p1 = new PlayerImpl("FABI", Color.BLACK, Pawns.BALL, "EASY");
	PlayerImpl p2 = new PlayerImpl("FAB", Color.BLACK, Pawns.BALL, "EASY");
	PlayerImpl p3 = new PlayerImpl("FA", Color.BLACK, Pawns.BALL, "EASY");
	PlayerImpl p4 = new PlayerImpl("F", Color.BLACK, Pawns.BALL, "EASY");
	list.addPlayer(p1, 0);
	list.addPlayer(p2, 1);
	list.addPlayer(p3, 2);
	list.addPlayer(p4, 3);
	list.addPlayer(action.start("Luigi", Color.WHITE, Pawns.IRON, "EASY"),4);
	assertEquals(list.getPlayerFromIndex(4), list.getPlayerFromName("Luigi"));
	
}
/**
 * I tested if the method that chooses the color returns
 * the correct color.
 */
@Test
	public void testIsChosenColorWorking() {
	
	ControllerSettingPlayersMenu action = new ControllerSettingPlayersMenu();
	assertEquals(action.chosenColor(0), Color.red);
	
}
/**
 * I tested if the method that chose the pawn returns the 
 * correct pawn.
 */
@Test public void testIsChosenPawnWorking() {
	ControllerSettingPlayersMenu action = new ControllerSettingPlayersMenu();
	assertEquals(action.chosenPawn(0), Pawns.CAR);
}
}
