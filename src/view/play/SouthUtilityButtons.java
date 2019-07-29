package view.play;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class SouthUtilityButtons extends JPanel {
	
	public SouthUtilityButtons() {
		this.setLayout(new GridLayout());
		
		
		JButton sell = new JButton("SELL");
		JButton buy = new JButton("BUY");
		JButton menù = new JButton("MENU'");
		JButton build = new JButton("BUILD");
		
		this.add(sell);
		this.add(buy);
		this.add(menù);
		this.add(build);
		
		
		
	}

}
