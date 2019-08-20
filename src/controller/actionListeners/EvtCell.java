package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.allTypeOfCard.Entity;
import model.myUtility.ShowImages;

public class EvtCell implements ActionListener{

    private final Entity en;
    
    public EvtCell(final Entity en) {
        this.en = en;
    }
    @Override
    public void actionPerformed(final ActionEvent e) {
           ShowImages.message(en);
    }
}
