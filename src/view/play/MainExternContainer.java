package view.play;

import javax.swing.Box;
import javax.swing.JPanel;
/**
 * 
 * interface that models the frame of play.
 *
 */
public interface MainExternContainer {
    /**
     * 
     * @return the dimension of leftside of this frame where it is the playground.
     */
    public JPanel getLeftSide();
    /**
     * 
     * @return the dimension of rightside of this frame where it is the playground.
     */
    public Box getRightSide();
}
