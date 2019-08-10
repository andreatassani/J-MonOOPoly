package model.images;

import java.util.Optional;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ShowImages {

    public static void propertyMessage(String ownerName, int numberHouses, String propertyName, int rgb){
        JOptionPane.showMessageDialog(null,"Owner:"+ownerName+"\nNumber of houses:"+numberHouses,propertyName,
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("res/Messages/"+rgb+".png"));
    }
    public static void nonPropertyMessage(String name) {
        JOptionPane.showMessageDialog(null,null,null,
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("res/Messages/"+name+".png"));
    }
    public static String propertyCell(int rgb) {
        return Optional.of("res/Cells/città"+rgb+".png").get();
    }
    public static Optional<String> nonPropertyCell(String name) {
        if(name.equals("stazione N")||
           name.equals("stazione E")||
           name.equals("stazione S")||
           name.equals("stazione O")){
            name = "Stazione";
        }
        return Optional.of("res/Cells/"+name+".png");
    }
    public static void dice(int result) {
        JOptionPane.showMessageDialog(null,"il risultato è stato: "+result, "Tiro del dado", 
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("res/Dice/dado"+result+".png "));
    }
}
