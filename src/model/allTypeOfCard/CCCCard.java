package model.allTypeOfCard;

import java.util.Optional;

public class CCCCard implements Entity {

    private String name;
    private int amount;
    
    public CCCCard(final String name, int amount) {
        this.name = name;
        this.amount = amount;
       }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Optional action() {
        return Optional.empty();
       //DISPLAY this.name;
       //player p = game.getCurrentPlayer;
       //p.setMoney(p.getMoney+=this.amount);
       //if (this.amount == 0){
       //       if (this.name == "Vai in PRIGIONE!"){
       //            p.position = POSIZIONEPRIGIONE;
       //            p.setStopTurns = 2;
       //       }
       // if (this.name == "Vai al VIA!"){
       //            p.position = POSIZIONEVIA;
       //            P.setMoney(200);
       //       }
       //}
    }  

}
