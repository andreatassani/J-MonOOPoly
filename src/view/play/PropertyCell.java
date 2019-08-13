package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;

import javax.lang.model.type.NullType;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import model.allTypeOfCard.*;
import model.images.ShowImages;

public class PropertyCell extends JPanel {
        
                private Dimension dim = new Dimension(MainExternContainer.getLeftSide().getWidth() / 11, MainExternContainer.getLeftSide().getHeight() / 12);
                //private Dimension dimCorner = new Dimension(MainExternContainer.getLeftSide().getWidth() / 11 + 1, MainExternContainer.getLeftSide().getHeight() / 11 + 1);
                //private Dimension dimEastWest = new Dimension(MainExternContainer.getLeftSide().getWidth() / 11, MainExternContainer.getLeftSide().getHeight() / 12);
                private JLabel name;
                private JButton image;
                private ImageIcon icon;
                int position;
                Entity property;
                
        public PropertyCell(Property p) {
                this.position = p.getPosition();
                
                name = new JLabel("" + p.getName(), SwingConstants.CENTER);
                name.setBackground(p.getColor());
                this.setLayout(new BorderLayout());
                mySetSize(dim);
                
                if (position == 0 || position == 10 || position == 20 || position == 30) {
                        mySetSize(dim);
                }
                if (position >= 11 && position<= 19 || position >= 31 && position<= 39 ) {
                        mySetSize(dim);
                        }

                
                this.setBackground(p.getColor());
                image = new JButton();
                image.setSize(60, 45);
                image.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        p.showCard();
                    }
                });
                
                
                this.add(name, BorderLayout.NORTH);
                
                this.add(image);
                this.setBorder(new LineBorder(Color.BLACK));
                
                mySetIcon(image, ShowImages.propertyCell(p.getColor().getRGB()));
                

        }
        
        public void mySetSize(Dimension d) {
                //this.setMaximumSize(d);
                //this.setMinimumSize(d);
                this.setPreferredSize(d);
                this.setSize(d);
        }
        
        public void mySetIcon(JButton b, String s) {
                icon = new ImageIcon(s);
                Image scaledImage = icon.getImage().getScaledInstance(MainExternContainer.getLeftSide().getWidth() / 20, MainExternContainer.getLeftSide().getHeight() / 19 , Image.SCALE_DEFAULT);
                icon.setImage(scaledImage);
                b.setIcon(icon);
        }
}
