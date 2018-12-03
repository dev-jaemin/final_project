package BabyakPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class recommandActionListener implements ItemListener{
	ArrayList<String> pricelist = new ArrayList<>();
	ArrayList<String> loclist = new ArrayList<>();
	ArrayList<String> catlist = new ArrayList<>();
	ArrayList<String> recommandlist = new ArrayList<>();
	
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			if(e.getItem() == main.under5000_)
				pricelist.add("a");
			if(e.getItem() == main.under7500_)
				pricelist.add("b");
			if(e.getItem() == main.under10000_)
				pricelist.add("c");
			if(e.getItem() == main.under15000_)
				pricelist.add("d");
			if(e.getItem() == main.over15000_)
				pricelist.add("e");

			if(e.getItem() == main.loc_A_)
				loclist.add("a");
			if(e.getItem() == main.loc_B_)
				loclist.add("b");
			if(e.getItem() == main.loc_C_)
				loclist.add("c");
			if(e.getItem() == main.loc_D_)
				loclist.add("d");
			if(e.getItem() == main.loc_E_)
				loclist.add("e");
			if(e.getItem() == main.loc_F_)
				loclist.add("f");
			if(e.getItem() == main.loc_G_)
				loclist.add("e");

			if(e.getItem() == main.cat_A_)
				catlist.add("a");
			if(e.getItem() == main.cat_B_)
				catlist.add("b");
			if(e.getItem() == main.cat_C_)
				catlist.add("c");
			if(e.getItem() == main.cat_D_)
				catlist.add("d");
			if(e.getItem() == main.cat_E_)
				catlist.add("e");
			if(e.getItem() == main.cat_F_)
				catlist.add("f");
		}
		
		if(e.getStateChange() == ItemEvent.DESELECTED) {
			if(e.getItem() == main.under5000_)
				pricelist.remove("a");
			if(e.getItem() == main.under7500_)
				pricelist.remove("b");
			if(e.getItem() == main.under10000_)
				pricelist.remove("c");
			if(e.getItem() == main.under15000_)
				pricelist.remove("d");
			if(e.getItem() == main.over15000_)
				pricelist.remove("e");

			if(e.getItem() == main.loc_A_)
				loclist.remove("a");
			if(e.getItem() == main.loc_B_)
				loclist.remove("b");
			if(e.getItem() == main.loc_C_)
				loclist.remove("c");
			if(e.getItem() == main.loc_D_)
				loclist.remove("d");
			if(e.getItem() == main.loc_E_)
				loclist.remove("e");
			if(e.getItem() == main.loc_F_)
				loclist.remove("f");
			if(e.getItem() == main.loc_G_)
				loclist.remove("e");

			if(e.getItem() == main.cat_A_)
				catlist.remove("a");
			if(e.getItem() == main.cat_B_)
				catlist.remove("b");
			if(e.getItem() == main.cat_C_)
				catlist.remove("c");
			if(e.getItem() == main.cat_D_)
				catlist.remove("d");
			if(e.getItem() == main.cat_E_)
				catlist.remove("e");
			if(e.getItem() == main.cat_F_)
				catlist.remove("f");
		}
		
		for(int k=0;k<main.reslist.size();k++) {
			for(int l=0;l<pricelist.size();l++) {
				if(main.reslist.get(k).price.equals(pricelist.get(l))) {
					for(int m=0;m<loclist.size();m++) {
						if(main.reslist.get(k).location.equals(loclist.get(m))) {
							for(int n=0;n<catlist.size();n++) {
								if(main.reslist.get(k).category.equals(catlist.get(n))) {
									recommandlist.add(main.reslist.get(k).name);
								}
							}
						}
					}
				}
			}
		}
		
		String recommandResName = recommandlist.get((int)(Math.random()*recommandlist.size()));
		main.recommandResult.setText(recommandResName);

	}
}
