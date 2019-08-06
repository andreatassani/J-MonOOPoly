package view.play;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Image;
import java.util.Optional;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.allTypeOfCard.Property;
import model.allTypeOfCard.Start;
import view.play.*;




public class GridCell extends JPanel {

	public GridCell() {
		
		this.setLayout(new BorderLayout());
		
		Box north = new Box(BoxLayout.X_AXIS);
		Box south = new Box(BoxLayout.X_AXIS);
		Box east = new Box(BoxLayout.Y_AXIS);
		Box west = new Box(BoxLayout.Y_AXIS);
		JLabel logo = new JLabel();
		ImageIcon icon;
		
		this.add(north, BorderLayout.NORTH);
		this.add(south, BorderLayout.SOUTH);
		this.add(east, BorderLayout.EAST);
		this.add(west, BorderLayout.WEST);

		north.add(new Cell(0, "Via!", Color.WHITE, Optional.of("res/Cells/Via!.png")));
		north.add(new Cell(1, "Forlì", new Color(204, 102, 0), Optional.of("res/Cells/cittàMARRONE.png")));
		north.add(new Cell(2, "Probabilità", Color.WHITE, Optional.of("res/Cells/Probabilità.png")));
		north.add(new Cell(3, "Cesena", new Color(204, 102, 0), Optional.of("res/Cells/cittàMARRONE.png")));
		north.add(new Cell(4, "Tassa", Color.WHITE, Optional.of("res/Cells/Tassa.png")));
		north.add(new Cell(5, "stazione N", Color.GRAY, Optional.of("res/Cells/Stazione.png")));
		north.add(new Cell(6, "Parma", Color.CYAN, Optional.of("res/Cells/cittàAZZURRA.png")));
		north.add(new Cell(7, "Imprevisto", Color.WHITE, Optional.of("res/Cells/Imprevisto.png")));
		north.add(new Cell(8, "Teramo", Color.CYAN, Optional.of("res/Cells/cittàAZZURRA.png")));
		north.add(new Cell(9, "Cuneo", Color.CYAN, Optional.of("res/Cells/cittàAZZURRA.png")));
		north.add(new Cell(10,"Prigione", Color.WHITE, Optional.of("res/Cells/Prigione.png")));
		east.add(new Cell(11, "Catania", Color.MAGENTA, Optional.of("res/Cells/cittàFUCSIA.png")));
		east.add(new Cell(12, "enel", Color.WHITE, Optional.of("res/Cells/lampadina.png")));
		east.add(new Cell(13, "Bologna", Color.MAGENTA, Optional.of("res/Cells/cittàFUCSIA.png")));
		east.add(new Cell(14, "Verona", Color.MAGENTA, Optional.of("res/Cells/cittàFUCSIA.png")));
		east.add(new Cell(15, "stazione E", Color.GRAY, Optional.of("res/Cells/Stazione.png")));
		east.add(new Cell(16, "Siena", new Color(255, 137, 0), Optional.of("res/Cells/cittàARANCIONE.png")));
		east.add(new Cell(17, "Probabilità", Color.WHITE, Optional.of("res/Cells/Probabilità.png")));
		east.add(new Cell(18, "Messina", new Color(255, 137, 0), Optional.of("res/Cells/cittàARANCIONE.png")));
		east.add(new Cell(19, "Foggia", new Color(255, 137, 0), Optional.of("res/Cells/cittàARANCIONE.png")));
		south.add(new Cell(30, "Polizia", Color.WHITE, Optional.of("res/Cells/Polizia.png")));
		south.add(new Cell(29, "Rieti", Color.YELLOW, Optional.of("res/Cells/cittàGIALLA.png")));
		south.add(new Cell(28, "hera", Color.WHITE, Optional.of("res/Cells/acqua.png")));
		south.add(new Cell(27, "Rimini", Color.YELLOW, Optional.of("res/Cells/cittàGIALLA.png")));
		south.add(new Cell(26, "Caserta", Color.YELLOW, Optional.of("res/Cells/cittàGIALLA.png")));
		south.add(new Cell(25, "stazione S", Color.GRAY, Optional.of("res/Cells/Stazione.png")));
		south.add(new Cell(24, "Cagliari", Color.RED, Optional.of("res/Cells/cittàROSSA.png")));
		south.add(new Cell(23, "Bari", Color.RED, Optional.of("res/Cells/cittàROSSA.png")));
		south.add(new Cell(22, "Imprevisto", Color.WHITE, Optional.of("res/Cells/Imprevisto.png")));
		south.add(new Cell(21, "Salerno", Color.RED, Optional.of("res/Cells/cittàROSSA.png")));
		south.add(new Cell(20, "Parcheggio", Color.WHITE, Optional.of("res/Cells/Parcheggio.png")));
		west.add(new Cell(39, "Milano", Color.BLUE, Optional.of("res/Cells/cittàBLU.png")));
		west.add(new Cell(38, "Tassa", Color.WHITE, Optional.of("res/Cells/Tassa.png")));
		west.add(new Cell(37, "Roma", Color.BLUE, Optional.of("res/Cells/cittàBLU.png")));
		west.add(new Cell(36, "Imprevisto", Color.WHITE, Optional.of("res/Cells/Imprevisto.png")));
		west.add(new Cell(35, "stazione O", Color.GRAY, Optional.of("res/Cells/Stazione.png")));
		west.add(new Cell(34, "Bologna", Color.GREEN, Optional.of("res/Cells/cittàVERDE.png")));
		west.add(new Cell(33, "probabilità", Color.WHITE, Optional.of("res/Cells/probabilità.png")));
		west.add(new Cell(32, "Aosta", Color.GREEN, Optional.of("res/Cells/cittàVERDE.png")));
		west.add(new Cell(31, "Trento", Color.GREEN, Optional.of("res/Cells/cittàVERDE.png")));

		this.setBackground(new Color(149, 255, 213));

		icon = new ImageIcon("res/logo.png");
		Image scaledImage = icon.getImage().getScaledInstance(1110, 400, Image.SCALE_DEFAULT);
		icon.setImage(scaledImage);
		logo.setIcon(icon);
		logo.setAlignmentY(BOTTOM_ALIGNMENT);
		this.add(logo, BorderLayout.CENTER);
		}
	}

    

