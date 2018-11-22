package BabyakPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import javax.swing.JButton;

class mainActionListener implements ActionListener{
	Container nowcp;
	JPanel nowpanel;
	JPanel newpanel;
	public mainActionListener(Container container, JPanel panel1, JPanel panel2) {
		this.nowpanel = panel1;
		this.newpanel = panel2;
		this.nowcp = container;
	}
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		if(btn.getText().equals("추천해드릴게요!")) {
			//Container cp = nowcp.getContentPane();
			nowcp.remove(nowpanel);
			nowcp.add(newpanel);
			newpanel.updateUI();
		}
		//else if(btn.getText().equals("맛집이 뭐가 있지?")){
			//Container cp = getContentPane();
			//cp.remove(mainpanel);
			//cp.add(listpanel);
			//listpanel.updateUI();
		//}
		
	}
	
}
