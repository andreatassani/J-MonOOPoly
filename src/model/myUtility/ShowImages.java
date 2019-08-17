package model.myUtility;

import java.util.Optional;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.allTypeOfCard.Entity;

import controller.audio.AudioManager;
import model.allTypeOfCard.Property;

public final class ShowImages {

    private static AudioManager sound = new AudioManager();
    
    private ShowImages() {
        
    }
    
    public static void Message(Entity e) {
        String name = e.getName();
        sound.getCardSound().play();
        if(e.isSalable()) {
            if(e.isBuildable()) {
                sound.getCardSound().play();
                JOptionPane.showMessageDialog(null,"Owner: "+e.getOwner().getName()+"\nNumber of houses: "+((Property)e).getHouses()+"\n Hotel: "+ ((Property)e).getHotel(),e.getName(),
                        JOptionPane.INFORMATION_MESSAGE, new ImageIcon("res/Messages/"+e.getColor().getRGB()+".png"));
            } else {
                if(name.equals("Station N")||
                        name.equals("Station E")|
                        name.equals("Station S")||
                        name.equals("Station O")){
                        name = "Station";
                          }
                else {
                         name = "Society";
                     }
                     JOptionPane.showMessageDialog(null,"Owner: "+e.getOwner().getName(),e.getName(),
                             JOptionPane.INFORMATION_MESSAGE, new ImageIcon("res/Messages/"+name+".png"));
            }
        } else {
            JOptionPane.showMessageDialog(null,null,null,
                    JOptionPane.INFORMATION_MESSAGE, new ImageIcon("res/Messages/"+name+".png"));
        }
    }
    
    public static String Cell(Entity e) {
        String name = e.getName();
        if(name.equals("Station N")||
                name.equals("Station E")||
                name.equals("Station S")||
                name.equals("Station O")){
                name = "Station";
             }
        if(e.isSalable() && e.isBuildable()) {
        return Optional.of("res/Cells/"+e.getColor().getRGB()+".png").get();
        } else {
            return Optional.of("res/Cells/"+name+".png").get();
        }
    }
    
    
    public static void dice(int result) {
        JOptionPane.showMessageDialog(null,"Result of the roll: "+result, "Dice", 
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("res/Dice/"+result+".png "));
    }
}
