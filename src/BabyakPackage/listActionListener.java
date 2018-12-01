package BabyakPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class listActionListener implements ItemListener{
	ArrayList<String> pricelist = new ArrayList<>();
	ArrayList<String> loclist = new ArrayList<>();
	ArrayList<String> catlist = new ArrayList<>();
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			if(e.getItem() == main.under5000)
				pricelist.add("a");
			if(e.getItem() == main.under7500)
				pricelist.add("b");
			if(e.getItem() == main.under10000)
				pricelist.add("c");
			if(e.getItem() == main.under15000)
				pricelist.add("d");
			if(e.getItem() == main.over15000)
				pricelist.add("e");

			if(e.getItem() == main.loc_A)
				loclist.add("a");
			if(e.getItem() == main.loc_B)
				loclist.add("b");
			if(e.getItem() == main.loc_C)
				loclist.add("c");
			if(e.getItem() == main.loc_D)
				loclist.add("d");
			if(e.getItem() == main.loc_E)
				loclist.add("e");
			if(e.getItem() == main.loc_F)
				loclist.add("f");
			if(e.getItem() == main.loc_G)
				loclist.add("e");

			if(e.getItem() == main.cat_A)
				catlist.add("a");
			if(e.getItem() == main.cat_B)
				catlist.add("b");
			if(e.getItem() == main.cat_C)
				catlist.add("c");
			if(e.getItem() == main.cat_D)
				catlist.add("d");
			if(e.getItem() == main.cat_E)
				catlist.add("e");
			if(e.getItem() == main.cat_F)
				catlist.add("f");


		}
		if(e.getStateChange() == ItemEvent.DESELECTED) {
			if(e.getItem() == main.under5000)
				pricelist.remove("a");
			if(e.getItem() == main.under7500)
				pricelist.remove("b");
			if(e.getItem() == main.under10000)
				pricelist.remove("c");
			if(e.getItem() == main.under15000)
				pricelist.remove("d");
			if(e.getItem() == main.over15000)
				pricelist.remove("e");

			if(e.getItem() == main.loc_A)
				loclist.remove("a");
			if(e.getItem() == main.loc_B)
				loclist.remove("b");
			if(e.getItem() == main.loc_C)
				loclist.remove("c");
			if(e.getItem() == main.loc_D)
				loclist.remove("d");
			if(e.getItem() == main.loc_E)
				loclist.remove("e");
			if(e.getItem() == main.loc_F)
				loclist.remove("f");
			if(e.getItem() == main.loc_G)
				loclist.remove("e");

			if(e.getItem() == main.cat_A)
				catlist.remove("a");
			if(e.getItem() == main.cat_B)
				catlist.remove("b");
			if(e.getItem() == main.cat_C)
				catlist.remove("c");
			if(e.getItem() == main.cat_D)
				catlist.remove("d");
			if(e.getItem() == main.cat_E)
				catlist.remove("e");
			if(e.getItem() == main.cat_F)
				catlist.remove("f");


		}
		
		for(int k=0;k<main.reslist.size();k++) {
			for(int l=0;l<pricelist.size();l++) {
				if(main.reslist.get(k).price.equals(pricelist.get(l))) {
					for(int m=0;m<loclist.size();m++) {
						if(main.reslist.get(k).location.equals(loclist.get(m))) {
							for(int n=0;n<catlist.size();n++) {
								if(main.reslist.get(k).category.equals(catlist.get(n))) {
									main.listResult.append(main.reslist.get(k).name);
								}
							}
						}
					}
				}
			}
		}

	}

	

}

