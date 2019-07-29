package view.play;

import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JPanel;

public class UtilityButtons extends JPanel {

	public UtilityButtons(LayoutManager layout) {
		super(layout);
		
        //BOTTONI IN BASSO
        
        //quattro bottoni da mettere in un box 
        final JButton buy = new JButton("buy");
        final JButton sell = new JButton("sell");
        final JButton build = new JButton("build");
        final JButton menu = new JButton("menu'");
        
        //box per bottoni

        this.add(buy);
        this.add(sell);
        this.add(build);
        this.add(menu);
	}

	

}
