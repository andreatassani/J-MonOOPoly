package application;



import java.io.FileNotFoundException;
import java.io.IOException;

import view.menu.MainMenu;
import view.menu.MenuGui;
import view.menu.Tutorial;
import view.play.MainExternContainerImpl;


/**
 * class for launching the application
 */
public class LauncherApplication {	
/**
 * constructor for this class
 */
	LauncherApplication() {

	}
/**
 *   main method to run the view
 * @throws IOException 
 * @throws FileNotFoundException 
 */
    public static void main(final String[] args) throws FileNotFoundException, IOException {
/**
 * run the game
 */
        
  
    	
    	new MenuGui(new MainMenu());
    	
    }
    
 
}
