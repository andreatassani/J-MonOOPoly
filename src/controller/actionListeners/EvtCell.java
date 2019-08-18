package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.allTypeOfCard.Entity;
import model.myUtility.ShowImages;

public class EvtCell implements ActionListener{

    private Entity en;
    
    public EvtCell(Entity en) {
        this.en = en;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
           ShowImages.message(en);
    }
}
