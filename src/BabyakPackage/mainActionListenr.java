package BabyakPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import javax.swing.JButton;

class mainActionListener implements ActionListener{
	JFrame frame = new JFrame();
	main mainmenu = new main();
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		if(btn.getText().equals("추천해드릴게요!")) {
			Container cp = frame.getContentPane();
			cp.remove(mainmenu.mainpanel);
			cp.add(mainmenu.recommandpanel);
			mainmenu.recommandpanel.updateUI();
		}
		else if(btn.getText().equals("맛집이 뭐가 있지?")){
			Container cp = getContentPane();
			cp.remove(mainpanel);
			cp.add(listpanel);
			listpanel.updateUI();
		}
		
	}
	
}
