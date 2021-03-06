package de.paul.triebel.schule.WordSort.Gui.Input;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import de.paul.triebel.schule.WordSort.main;
import de.paul.triebel.schule.WordSort.Gui.CustomFont;
import de.paul.triebel.schule.WordSort.Gui.Gui;

public class InputField extends JPanel implements ActionListener {
	
	public Gui gui;
	public JTextField input;
	
	public InputField(Gui gui) {
		super();
		
		this.gui = gui;
		
		setBounds(0, 0, gui.getWidth(), gui.getHeight()/8);
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		setBackground(new Color(204, 248, 239));
		setBorder(BorderFactory.createEmptyBorder(20, 200, 20, 200));
		
		JLabel label = new JLabel((String) main.getLanguageFile().get("input")+"   ");
		
		label.setFont(CustomFont.get(50));
		
		input = new JTextField();
		input.addActionListener(this);
		input.setFont(CustomFont.get(50));
		
		add(label);
		add(input);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (!input.getText().equals("")) {
			gui.dragPanel.addLine(input.getText());
			input.setText("");
		}
	}
	
}
