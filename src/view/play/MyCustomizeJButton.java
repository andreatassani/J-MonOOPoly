package view.play;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 * 
 *
 */

public class MyCustomizeJButton extends JButton {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /**
     * 
     */
    private final Image img;
    /**
     * 
     */
    private final Dimension dimension;

    /**
     * @param imgAddr
     *                      Address of the image
     * @param dimension
     *                      Dimension of the image
     */
    public MyCustomizeJButton(final String imgAddr, final Dimension dimension) {
        super();

        this.dimension = dimension;
        final Image tmpImg = new ImageIcon(getClass().getResource(imgAddr)).getImage();
        this.img = new ImageIcon(tmpImg.getScaledInstance(dimension.width, dimension.height, Image.SCALE_FAST))
                .getImage();
        final Dimension size = new Dimension(dimension.width, dimension.width);
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
    }

    @Override
    public final void paintComponent(final Graphics g) {
        g.drawImage(this.img, 0, 0, this.dimension.width, this.dimension.width, this);
    }
}
