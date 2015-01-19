import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;


public class GUI {
	public static JFrame mainwindow;
	public static JTextField text;
	public static JTextField textt;
	public static JTextArea texto;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithm.onGUI=true;
		mainwindow = new JFrame();
		JPanel panel = new JPanel(new FlowLayout());
		mainwindow.setTitle("6 Number AI");
		mainwindow.setSize(400, 250);
		//mainwindow.setLocation(100, 100);
		mainwindow.setLocationRelativeTo(null);
		panel.setSize(mainwindow.getSize());
		text = new JTextField(10);
		textt = new JTextField(5);
		texto = new JTextArea(10,15);
		textt.addKeyListener(new ButtonActionListener());
		JButton btn = new JButton("Run");
		btn.addActionListener(new ButtonActionListener());
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		texto.setBorder(BorderFactory.createCompoundBorder(border,
				BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		
		panel.setVisible(true);
		JLabel lbt = new JLabel("Input:");
		panel.add(lbt);
		lbt.setVisible(true);
		panel.add(text);
		text.setVisible(true);
		JLabel lbtt = new JLabel("Target:");
		panel.add(lbtt);
		lbtt.setVisible(true);
		panel.add(textt);
		textt.setVisible(true);
		panel.add(btn);
		btn.setVisible(true);
		JLabel lbto = new JLabel("Result:");
		panel.add(lbto);
		lbto.setVisible(true);
		panel.add(texto);
		texto.setVisible(true);
		
		mainwindow.add(panel);
		mainwindow.setVisible(true);
		
		mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		text.requestFocus();
		
	}

}
