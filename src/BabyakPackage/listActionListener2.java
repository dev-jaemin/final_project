package BabyakPackage;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class listActionListener2 implements ActionListener {
	boolean success = false;
	public void actionPerformed(ActionEvent e) {
		for(int k=0;k<main.reslist.size();k++) {
			for(int l=0;l<newpanelActionListener._pricelist.size();l++) {
				if(main.reslist.get(k).price.equals(newpanelActionListener._pricelist.get(l))) {
					for(int m=0;m<newpanelActionListener._loclist.size();m++) {
						if(main.reslist.get(k).location.equals(newpanelActionListener._loclist.get(m))) {
							for(int n=0;n<newpanelActionListener._catlist.size();n++) {
								if(main.reslist.get(k).category.equals(newpanelActionListener._catlist.get(n))) {
									try{
										FileWriter fout = new FileWriter("data.txt", true);
										fout.write(main.newResName.getText()+" "+newpanelActionListener._pricelist.get(0)+" "+newpanelActionListener._loclist.get(0)+" "+newpanelActionListener._catlist.get(0)+"\n");
										fout.close();
										//main.reslist.add(new restaurantClass(main.newResName.getText(), newpanelActionListener._pricelist.get(0), newpanelActionListener._loclist.get(0), newpanelActionListener._catlist.get(0)));
										success = true;
									} catch (IOException err) {
										System.out.println("입출력 에러");
									}
								}
							}
						}
					}
				}
			}
		}
		//if(success)
			//JOptionPane.showMessageDialog(null, "추가 완료!", "식당 데이터 추가", JOptionPane.INFORMATION_MESSAGE);
		//else
			//JOptionPane.showMessageDialog(null, "조건을 확인하세요!", "식당 데이터 추가", JOptionPane.ERROR_MESSAGE);

	}

}
