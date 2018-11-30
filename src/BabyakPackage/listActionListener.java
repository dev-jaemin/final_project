package BabyakPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class listActionListener implements ItemListener{
	ArrayList<restaurantClass> selected_res = new ArrayList<>();
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			if(e.getSource() == main.under5000)
				selected_res.add(new restaurantClass("A"));
			
		}
	}
	
}
