package view.play;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class SouthUtilityButtons extends JPanel {
	
	public SouthUtilityButtons() {
		this.setLayout(new GridLayout());
		
		JButton sell = new JButton("SELL");
		JButton buy = new JButton("BUY");
		JButton menù = new JButton("MENU'");
		JButton build = new JButton("BUILD");
		
		this.add(sell);
		this.add(buy);
		this.add(build);
		this.add(menù);

		this.setBorder(new LineBorder(Color.BLACK));
	}

}
