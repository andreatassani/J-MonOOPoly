package model.myUtility;

import java.util.Optional;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.allTypeOfCard.Entity;

import controller.audio.AudioManager;
import model.allTypeOfCard.Property;
/**
 * 
 * Utility class to show main board icons on the cells and relative message with the illustration of the card.
 *
 */
public final class ShowImages {
/**
 * fields.
 */
    private static AudioManager sound = new AudioManager();
    /**
     * constructor.
     */
    public ShowImages() {

    }
    /**
     * Shows the illustration of the relative cell
     * @param e
     */
    public void message(final Entity e) {
        String name = e.getName();
        sound.getCardSound().play();
        if(e.isSalable()) {
            if(e.isBuildable()) {
                sound.getCardSound().play();
                JOptionPane.showMessageDialog(null, "Owner: "+e.getOwner().getName()+"\nNumber of houses: "+((Property)e).getHouses()+"\n Hotel: "+ ((Property)e).getHotel(),e.getName(),
                        JOptionPane.INFORMATION_MESSAGE, new ImageIcon(this.getClass().getResource("/Messages/"+e.getColor().getRGB()+".png")));
            } else {
                if(name.equals("Station N")||
                        name.equals("Station E")||
                        name.equals("Station S")||
                        name.equals("Station O")){
                        name = "Station";
                          }
                else {
                         name = "Society";
                     }
                     JOptionPane.showMessageDialog(null,"Owner: "+e.getOwner().getName(),e.getName(),
                             JOptionPane.INFORMATION_MESSAGE, new ImageIcon(this.getClass().getResource("/Messages/"+name+".png")));
            }
        } else {
            JOptionPane.showMessageDialog(null,null,null,
                    JOptionPane.INFORMATION_MESSAGE,new ImageIcon(this.getClass().getResource("/Messages/"+name+".png")));
        }
    }
    /**
     * @return the string of the icon relative to the cell
     */
    public String cell(final Entity e) {
        String name = e.getName();
        if(name.equals("Station N")||
                name.equals("Station E")||
                name.equals("Station S")||
                name.equals("Station O")){
                name = "Station";
             }
        if(e.isSalable() && e.isBuildable()) {
        return "/Cells/"+e.getColor().getRGB()+".png";
        } else {
            return "/Cells/"+name+".png";
        }
    }
    /**
     * Shows the illustration of the relative result of the dice
     * @param result
     */
    
    public void dice(int result) {
        JOptionPane.showMessageDialog(null,"Result of the roll: "+result, "Dice", 
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon(this.getClass().getResource("/Dice/"+result+".png")));
    }
}
