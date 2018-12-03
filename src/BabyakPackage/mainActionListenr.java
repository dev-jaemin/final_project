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
		nowcp.remove(nowpanel);
		nowcp.add(newpanel);
		newpanel.updateUI();
	}
	
}
