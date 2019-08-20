package model.UtilityFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * Class used to load a text file into a string.
 */
public class UtilityFileImpl implements UtilityFile {
/**
 * Class fields.	
 */
	private String text;
	private String temp;
	private File file;
	private BufferedReader reader;
/**
 * Class builder.
 * @throws FileNotFoundException : the file was not found
 * @throws IOException : problems during Input/Output 
 */
	public UtilityFileImpl() throws FileNotFoundException, IOException  {
/**
 * Fields declarations.		
 */
		this.text = "";
		this.file = new File("res/regole.txt");
		this.reader = new BufferedReader(new FileReader(file));
/**
 * I fill the string with all the lines of the text and at
 * the end of each line i start a new paragraph.		
 */			
		while((temp = reader.readLine()) != null) {
		text +=temp + "\n"; 
		}	
	}
/**
 * 
 * {@inheritDoc}
 */	
	public String getString() {
		return text;
	}
}
