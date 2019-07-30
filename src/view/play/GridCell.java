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

		north.add(new Cell(0, "via", Color.WHITE, Optional.of("res/via.png")));
		north.add(new Cell(1, "Forlì", new Color(204, 102, 0), Optional.of("res/città.png")));
		north.add(new Cell(2, "probabilità", Color.WHITE, Optional.of("res/probabilità.png")));
		north.add(new Cell(3, "Cesena", new Color(204, 102, 0), Optional.of("res/città.png")));
		north.add(new Cell(4, "tassa", Color.WHITE, Optional.of("res/soldi.png")));
		north.add(new Cell(5, "stazione N", Color.WHITE, Optional.of("res/treno.png")));
		north.add(new Cell(6, "Parma", Color.CYAN, Optional.of("res/città.png")));
		north.add(new Cell(7, "imprevisto", Color.WHITE, Optional.of("res/imprevisto.png")));
		north.add(new Cell(8, "Teramo", Color.CYAN, Optional.of("res/città.png")));
		north.add(new Cell(9, "Cuneo", Color.CYAN, Optional.of("res/città.png")));
		north.add(new Cell(10,"prigione", Color.WHITE, Optional.of("res/prigioniero.png")));
		east.add(new Cell(11, "Catania", Color.MAGENTA, Optional.of("res/città.png")));
		east.add(new Cell(12, "enel", Color.WHITE, Optional.of("res/lampadina.png")));
		east.add(new Cell(13, "Bologna", Color.MAGENTA, Optional.of("res/città.png")));
		east.add(new Cell(14, "Verona", Color.MAGENTA, Optional.of("res/città.png")));
		east.add(new Cell(15, "stazione E", Color.WHITE, Optional.of("res/treno.png")));
		east.add(new Cell(16, "Siena", new Color(255, 137, 0), Optional.of("res/città.png")));
		east.add(new Cell(17, "probabilità", Color.WHITE, Optional.of("res/probabilità.png")));
		east.add(new Cell(18, "Messina", new Color(255, 137, 0), Optional.of("res/città.png")));
		east.add(new Cell(19, "Foggia", new Color(255, 137, 0), Optional.of("res/città.png")));
		south.add(new Cell(30, "polizia", Color.WHITE, Optional.of("res/poliziotto.png")));
		south.add(new Cell(29, "Rieti", Color.YELLOW, Optional.of("res/città.png")));
		south.add(new Cell(28, "hera", Color.WHITE, Optional.of("res/acqua.png")));
		south.add(new Cell(27, "Rimini", Color.YELLOW, Optional.of("res/città.png")));
		south.add(new Cell(26, "Caserta", Color.YELLOW, Optional.of("res/città.png")));
		south.add(new Cell(25, "stazione S", Color.WHITE, Optional.of("res/treno.png")));
		south.add(new Cell(24, "Cagliari", Color.RED, Optional.of("res/città.png")));
		south.add(new Cell(23, "Bari", Color.RED, Optional.of("res/città.png")));
		south.add(new Cell(22, "imprevisto", Color.WHITE, Optional.of("res/imprevisto.png")));
		south.add(new Cell(21, "Salerno", Color.RED, Optional.of("res/città.png")));
		south.add(new Cell(20, "parcheggio", Color.WHITE, Optional.of("res/parcheggio.png")));
		west.add(new Cell(39, "Milano", Color.BLUE, Optional.of("res/città.png")));
		west.add(new Cell(38, "tassa", Color.WHITE, Optional.of("res/soldi.png")));
		west.add(new Cell(37, "Roma", Color.BLUE, Optional.of("res/città.png")));
		west.add(new Cell(36, "imprevisto", Color.WHITE, Optional.of("res/imprevisto.png")));
		west.add(new Cell(35, "stazione O", Color.WHITE, Optional.of("res/treno.png")));
		west.add(new Cell(34, "Bologna", Color.GREEN, Optional.of("res/città.png")));
		west.add(new Cell(33, "probabilità", Color.WHITE, Optional.of("res/probabilità.png")));
		west.add(new Cell(32, "Aosta", Color.GREEN, Optional.of("res/città.png")));
		west.add(new Cell(31, "Trento", Color.GREEN, Optional.of("res/città.png")));

		this.setBackground(new Color(149, 255, 213));
		
		icon = new ImageIcon("res/logo.png");
		Image scaledImage = icon.getImage().getScaledInstance(963, 368, Image.SCALE_DEFAULT);
		icon.setImage(scaledImage);
		logo.setIcon(icon);
		this.add(logo, BorderLayout.CENTER);
		
		
		
		}
	}
