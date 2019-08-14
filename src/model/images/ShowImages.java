package model.images;

import java.util.Optional;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import controller.audio.AudioManager;
import model.allTypeOfCard.Property;

public final class ShowImages {

    private static AudioManager sound = new AudioManager();
    
    private ShowImages() {
        
    }
    
    public static void propertyMessage(Property pr){
        sound.getCardSound().play();
        JOptionPane.showMessageDialog(null,"Owner: "+pr.getOwner().getName()+"\nNumber of houses: "+pr.getHouses()+"\n Hotel: "+ pr.getHotel(),pr.getName(),
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("res/Messages/"+pr.getColor().getRGB()+".png"));
    }
    public static void nonPropertyMessage(String name) {
        sound.getCardSound().play();
        if(name.equals("Station N")||
           name.equals("Station E")|
           name.equals("Station S")||
           name.equals("Station O")){
           name = "Station";
             }
        if(name.equals("Hera")||
           name.equals("Enel")) {
            name = "Society";
        }
        JOptionPane.showMessageDialog(null,null,null,
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("res/Messages/"+name+".png"));
    }
    public static String propertyCell(int rgb) {
        return Optional.of("res/Cells/"+rgb+".png").get();
    }
    public static Optional<String> nonPropertyCell(String name) {
        if(name.equals("Station N")||
           name.equals("Station E")||
           name.equals("Station S")||
           name.equals("Station O")){
            name = "Station";
        }
        return Optional.of("res/Cells/"+name+".png");
    }
    public static void dice(int result) {
        JOptionPane.showMessageDialog(null,"Result of the roll: "+result, "Dice", 
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("res/Dice/"+result+".png "));
    }
}
