import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI {
	public static JFrame mainwindow;
	public static JTextField text;
	public static JTextField textt;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainwindow = new JFrame();
		JPanel panel = new JPanel(new FlowLayout());
		mainwindow.setTitle("6 Number AI");
		mainwindow.setSize(300, 60);
		//mainwindow.setLocation(100, 100);
		mainwindow.setLocationRelativeTo(null);
		panel.setSize(mainwindow.getSize());
		text = new JTextField(10);
		textt = new JTextField(5);
		textt.addKeyListener(new ButtonActionListener());
		JButton btn = new JButton("Run");
		btn.addActionListener(new ButtonActionListener());
		
		panel.setVisible(true);
		panel.add(text);
		text.setVisible(true);
		panel.add(textt);
		textt.setVisible(true);
		panel.add(btn);
		btn.setVisible(true);
		
		mainwindow.add(panel);
		mainwindow.setVisible(true);
		
		mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		text.requestFocus();
		
	}

}
