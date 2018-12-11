package BabyakPackage;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class listActionListener2 implements ActionListener {
	boolean success = false;
	public void actionPerformed(ActionEvent e) {
		try{
			FileWriter fout = new FileWriter("data.txt", true);
			fout.write(main.newResName.getText().trim()+" "+newpanelActionListener._pricelist.get(0)+" "+newpanelActionListener._loclist.get(0)+" "+newpanelActionListener._catlist.get(0)+"\n");
			fout.close();
			main.reslist.add(new restaurantClass(main.newResName.getText(), newpanelActionListener._pricelist.get(0), newpanelActionListener._loclist.get(0), newpanelActionListener._catlist.get(0)));
			success = true;
			
		} catch (IOException err) {
			JOptionPane.showMessageDialog(null, "에러 발생", "식당 데이터 추가", JOptionPane.ERROR_MESSAGE);
		}
		
		if(success) {
			JOptionPane.showMessageDialog(null, "추가 완료!", "식당 데이터 추가", JOptionPane.INFORMATION_MESSAGE);
		}
		else
			JOptionPane.showMessageDialog(null, "조건을 확인하세요!", "식당 데이터 추가", JOptionPane.ERROR_MESSAGE);

	}

}
