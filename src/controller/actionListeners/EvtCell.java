package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.allTypeOfCard.Entity;
import model.myUtility.ShowImages;

public class EvtCell implements ActionListener{
/**
 * field
 */
    private final Entity en;
/**
 * constructor
 */
    public EvtCell(final Entity en) {
        this.en = en;
    }
    @Override
    public void actionPerformed(final ActionEvent e) {
           new ShowImages().message(en);
    }
}
