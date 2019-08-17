package controller.actionListeners;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//import javax.swing.JTextField;
//
//import controller.menu.ControllerSettingPlayersMenu;
//import model.player.ListOfPlayers;
//
//public class Done implements ActionListener {
//	
//		ControllerSettingPlayersMenu action;
//		JFrame frame;
//		ListOfPlayers list;
//		JTextField namePlayer1;
//		JTextField namePlayer2;
//		JTextField namePlayer3;
//		JTextField namePlayer4;
//		int color1;
//		int color2;
//		int color3;
//		int color4;
//		int pawn1;
//		int pawn2;
//		int pawn3;
//		int pawn4;
//	
//
//	public Done(ControllerSettingPlayersMenu action, JFrame frame, ListOfPlayers list, JTextField namePlayer1,
//				JTextField namePlayer2, JTextField namePlayer3, JTextField namePlayer4, int color1, int color2,
//				int color3, int color4, int pawn1, int pawn2, int pawn3, int pawn4) {
//			super();
//			this.action = action;
//			this.frame = frame;
//			this.list = list;
//			this.namePlayer1 = namePlayer1;
//			this.namePlayer2 = namePlayer2;
//			this.namePlayer3 = namePlayer3;
//			this.namePlayer4 = namePlayer4;
//			this.color1 = color1;
//			this.color2 = color2;
//			this.color3 = color3;
//			this.color4 = color4;
//			this.pawn1 = pawn1;
//			this.pawn2 = pawn2;
//			this.pawn3 = pawn3;
//			this.pawn4 = pawn4;
//		}
//
//
//
//
//
//
//
//
//
//
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if(!(namePlayer1.getText().equals("Name Player"))) {
//	    	list.addPlayer(action.start(namePlayer1.getText(),action.chosenColor(color1) , 
//	    			action.chosenPawn(pawn1)), list.getNumberPlayer()+1);
//	    	}
//	    	if(!(namePlayer2.getText().equals("Name Player"))) {
//	    	list.addPlayer(action.start(namePlayer2.getText(),action.chosenColor(color2) , 
//	    			action.chosenPawn(pawn2)), list.getNumberPlayer()+1);
//	    	}
//	    	if(!(namePlayer3.getText().equals("Name Player"))) {
//	    	list.addPlayer(action.start(namePlayer3.getText(),action.chosenColor(color3) , 
//	    			action.chosenPawn(pawn3)), list.getNumberPlayer()+1);
//	    	}
//	    	if(!(namePlayer4.getText().equals("Name Player"))) {
//	    	list.addPlayer(action.start(namePlayer4.getText(), action.chosenColor(color4) , 
//	    			action.chosenPawn(pawn4)), list.getNumberPlayer()+1);
//	    	}
//	    	
//	    	if(action.checkName(namePlayer1) && action.checkName(namePlayer2) && action.checkName(namePlayer3) && action.checkName(namePlayer4)) {
//	    		JOptionPane.showMessageDialog(null, "non puoi chiamarti Name Player");
//	    		
//	    	}
//	    	
//	    	System.out.println(pawn1);
//	    	action.areYouAlone(list);
//		
//	}
//
//}
