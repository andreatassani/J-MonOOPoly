package controller.UtilityFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Optional;
/**
 * Class used to load a text file into a string.
 */
public class UtilityFileImpl implements UtilityFile {
/**
 * Class fields.
 */
	private String text;
	private String temp;
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
	    this.temp = "";
            this.reader = new BufferedReader(new FileReader("res/rules.txt"));
/**
 * I fill the string with all the lines of the text and at
 * the end of each line i start a new paragraph.
 */		
		while((text = reader.readLine()) != null) {
		temp += text + "\n";
		
		}	
		reader.close();
	}
/**
 * 
 * {@inheritDoc}
 */	
	public String getString() {
		return temp;
	}
}
