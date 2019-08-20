package view.menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Scanner;
import java.lang.Object;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.plaf.FileChooserUI;
import javax.swing.text.AbstractDocument.Content;

import controller.actionListeners.Back;
import controller.audio.AudioManager;
import controller.menu.ControllerNewGameMenu;
import model.UtilityFile.UtilityFileImpl;
import model.customComponent.CustomMethodsImpl;
/**
 * Class that builds the Tutorial frame.
 */
public class Tutorial extends JFrame {
/**
 * Class fields.	
 */
	private static final long serialVersionUID = 1L;
	private final CustomMethodsImpl methods = new CustomMethodsImpl();
	private JPanel container;
	private JTextArea rule;
	private final Font font = new Font("Berlin Sans FB Demi", Font.CENTER_BASELINE,14);
	private JButton back;
	private final Dimension dim = new Dimension(methods.getWidth()/10,methods.getHeight()/18);
	private JLabel title;
	private AudioManager clip;
	private ControllerNewGameMenu action;
/**
 * Class builder.	
 * @throws FileNotFoundException : if it does not find the file
 * @throws IOException : I/O problems
 */
	public Tutorial() throws FileNotFoundException, IOException {
/**
 * Declaration of the fields.		
 */
		this.container = new JPanel();
		this.rule = new JTextArea();
		this.back = new JButton("Back");
		this.title = new JLabel("TUTORIAL");
		this.clip = new AudioManager();
		this.action = new ControllerNewGameMenu();
/**
 * I customize the components.
 */	
		rule.setText(new UtilityFileImpl().getString());
		rule.setFont(font);
		rule.setEditable(false);
		rule.setBorder(new LineBorder(Color.black));		
		title.setFont(new Font("Cooper Black",Font.CENTER_BASELINE,60));
		methods.setPreference(back, dim ,methods.getButton(), Color.black, methods.getFont());
		this.getContentPane().setBackground(methods.getBackground());
		rule.setBackground(methods.getBackground());
		container.setLayout(new FlowLayout());
		this.setLayout(new FlowLayout(FlowLayout.CENTER,methods.getWidth(),50));
/**
 * Check if the sound is to be stopped.
 */
		action.musicStop(MainMenu.getTextButton(), clip);
/**
 * I add the components and action listener to the frame.		
 */
		back.addActionListener(new Back(this, clip,  MainMenu.getTextButton()));
		container.add(rule);
		this.add(title);
		this.add(rule,BorderLayout.CENTER);
		this.add(back,BorderLayout.SOUTH);
	}
	
	
	
	

		
	

}
