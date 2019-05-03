package player;

import utility.Colors;
import utility.Pawns;

public class PlayerImpl implements Player {

    private String name;
    private Colors color;
    private Pawns pawns;
    
    public PlayerImpl(String name, Colors color, Pawns pawns) {
        
        this.name = name;
        this.color = color;
        this.pawns = pawns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Colors getColors() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
    
    public Pawns getPawn() {
        return pawns;
    }
    
    public void setPawns(Pawns pawns) {
        this.pawns = pawns;
    }

  


    
    
    
    
    
}
