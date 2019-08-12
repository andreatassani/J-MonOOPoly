package model.images;

import java.util.Optional;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class ShowImages {

    private ShowImages() {
        
    }
    
    public static void propertyMessage(String ownerName, int numberHouses, String propertyName, int rgb){
        JOptionPane.showMessageDialog(null,"Owner:"+ownerName+"\nNumber of houses:"+numberHouses,propertyName,
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("res/Messages/"+rgb+".png"));
    }
    public static void nonPropertyMessage(String name) {
        if(name.equals("Station N")||
           name.equals("Station E")||
           name.equals("Station S")||
           name.equals("Station O")){
           name = "Station";
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
