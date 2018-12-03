package BabyakPackage;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class listActionListener2 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		
		for(int k=0;k<main.reslist.size();k++) {
			for(int l=0;l<newpanelActionListener._pricelist.size();l++) {
				if(main.reslist.get(k).price.equals(newpanelActionListener._pricelist.get(l))) {
					for(int m=0;m<newpanelActionListener._loclist.size();m++) {
						if(main.reslist.get(k).location.equals(newpanelActionListener._loclist.get(m))) {
							for(int n=0;n<newpanelActionListener._catlist.size();n++) {
								if(main.reslist.get(k).category.equals(newpanelActionListener._catlist.get(n))) {
									//파일에다가 적는 코드
								}
							}
						}
					}
				}
			}
		}
	}
}
