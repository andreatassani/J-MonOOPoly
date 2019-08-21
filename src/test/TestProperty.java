package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.awt.Color;
import org.junit.Test;

import model.allTypeOfCard.Property;
import model.myEnum.Pawns;
import model.player.ListOfPlayers;
import model.player.PlayerImpl;

public class TestProperty {
    public void TestProperty() {
        final ListOfPlayers listPl = new ListOfPlayers();
        final Property property1 = new Property("prova1", Color.RED, 4, listPl.getBank());
        assertTrue(property1.getOwner() == listPl.getBank());
        assertFalse(property1.getPrice() == 100);
        property1.addHouse();
        property1.addHouse();
        property1.addHouse();
        property1.addHouse();
        assertFalse(property1.getHotel());
        property1.addHouse();
        assertTrue(property1.getHotel());
        final PlayerImpl pl1 = new PlayerImpl("player1", Color.BLUE, Pawns.BALL, "EASY");
        pl1.buyProperty(property1);
        assertTrue(property1.getOwner() == pl1);
    }
}
