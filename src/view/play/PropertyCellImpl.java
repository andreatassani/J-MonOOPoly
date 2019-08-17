package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import model.allTypeOfCard.*;
import model.myUtility.ShowImages;

public class PropertyCellImpl extends JPanel implements Cell {
    
    private static final long serialVersionUID = 1L;
    private Dimension dim = new Dimension(MainExternContainerImpl.getLeftSide().getWidth() / 11, 
                                            MainExternContainerImpl.getLeftSide().getHeight() / 12);
    private JLabel name;
    private JButton image;
    private ImageIcon icon;
    private PositionPawnsImpl posPawn = new PositionPawnsImpl();
                
        public PropertyCellImpl(Entity en) {
                
                
                name = new JLabel("" + en.getName(), SwingConstants.CENTER);
                name.setBackground(en.getColor());
                this.setLayout(new BorderLayout());
                mySetSize(dim);
                
                

                
                this.setBackground(en.getColor());
                image = new JButton();
                image.setSize(40, 30);
                image.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        ShowImages.Message(en);
                    }
                });
                
                this.add(posPawn, BorderLayout.SOUTH);
                this.add(name, BorderLayout.NORTH);
                
                this.add(image, BorderLayout.CENTER);
                this.setBorder(new LineBorder(Color.BLACK));
                
                mySetIcon(image, ShowImages.Cell(en));
                

        }
        
        public PositionPawnsImpl getPositionPawns() {
            return this.posPawn;
        }
        
        public void mySetSize(Dimension d) {
                //this.setMaximumSize(d);
                //this.setMinimumSize(d);
                this.setPreferredSize(d);
                this.setSize(d);
        }
        
        public void mySetIcon(JButton b, String s) {
                icon = new ImageIcon(s);
                Image scaledImage = icon.getImage().getScaledInstance(MainExternContainerImpl.getLeftSide().getWidth() / 30, MainExternContainerImpl.getLeftSide().getHeight() / 27 , Image.SCALE_DEFAULT);
                icon.setImage(scaledImage);
                b.setIcon(icon);
        }
}