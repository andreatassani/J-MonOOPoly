package view.menu;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
import java.lang.Object;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.FileChooserUI;
import javax.swing.text.AbstractDocument.Content;

import model.customComponent.CustomMethodsImpl;

public class Tutorial extends JFrame {
	
	private final CustomMethodsImpl methods = new CustomMethodsImpl();
	private JPanel text = new JPanel();
	
	private JLabel rule = new JLabel();
	
	
	
	public Tutorial() throws FileNotFoundException, IOException {
		
		read("res/regole.txt");
		
		rule.setMaximumSize(methods.getDim());
		rule.setMinimumSize(methods.getDim());
		this.setLayout(new BorderLayout());
		this.add(rule,BorderLayout.CENTER);
		
		
		
		
		
		
		
	}
	
	public void read(String path) throws FileNotFoundException, IOException {
		File file = new File(path);
		BufferedReader reader = new BufferedReader(
										new FileReader(file) );
		String m;
		while((m = reader.readLine()) != null) {
			rule.setText(m);
			
		}
	}
	
	

		
	

}
