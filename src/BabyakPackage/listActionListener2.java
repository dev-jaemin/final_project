package BabyakPackage;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class listActionListener2 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		boolean success = false;
		boolean names = true;
		try{
			String restaurantName = main.newResName.getText().trim();
			for(int i=0;i<restaurantName.length();i++) {
				if(restaurantName.charAt(i) == ' ') {
					JOptionPane.showMessageDialog(null, "식당 이름을 띄어쓰기 하지 마십시오.", "식당 데이터 추가", JOptionPane.ERROR_MESSAGE);
					names = false;
					success = true;
					break;
				}

			}
			if(names) {
				FileWriter fout = new FileWriter("data.txt", true);
				fout.write(restaurantName+" "+newpanelActionListener._pricelist.get(0)+" "+newpanelActionListener._loclist.get(0)+" "+newpanelActionListener._catlist.get(0)+"\r\n");
				fout.close();
				main.reslist.add(new restaurantClass(main.newResName.getText(), newpanelActionListener._pricelist.get(0), newpanelActionListener._loclist.get(0), newpanelActionListener._catlist.get(0)));
				success = true;
			}

		} catch (IOException err) {
			JOptionPane.showMessageDialog(null, "에러 발생", "식당 데이터 추가", JOptionPane.ERROR_MESSAGE);
		}

		if(success && names) {
			JOptionPane.showMessageDialog(null, "추가 완료!", "식당 데이터 추가", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(success == false && names == true)
			JOptionPane.showMessageDialog(null, "조건을 확인하세요!", "식당 데이터 추가", JOptionPane.ERROR_MESSAGE);

	}

}
