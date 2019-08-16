package application;



import view.menu.MainMenu;
import view.menu.MenuGui;


/**
 * class for launching the application
 */
public class LauncherApplication {
	
	
//	/**
//	 * constructor for this class
//	 */
//	LauncherApplication() {
//
//	}
	/**
     * main method to run the view
     */
    public static void main(final String[] args) {
        /**
         * run the game
         */
        
  
    	
    	new MenuGui(new MainMenu());
    	
    }
    
 
}
