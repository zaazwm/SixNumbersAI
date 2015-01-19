import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class ButtonActionListener implements ActionListener,KeyListener {
	public void actionPerformed(ActionEvent e) {
		String s = GUI.text.getText();
		String[] ss = s.split(" ");
		int[] in = new int[s.length()];
		int i=0;
		for(String sl : ss) {
			in[i]=new Integer(sl).intValue();
			i++;
		}
		int target =new Integer(GUI.textt.getText()).intValue();
		GUI.texto.setText("");

		Algorithm.run(in, target);
		
		
		GUI.text.setText("");
		GUI.textt.setText("");
		
		GUI.text.requestFocus();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			this.actionPerformed(null);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
