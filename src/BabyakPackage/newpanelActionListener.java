package BabyakPackage;

import java.awt.event.*;
import java.util.ArrayList;

public class newpanelActionListener implements ItemListener{
	static ArrayList<String> _pricelist = new ArrayList<>();
	static ArrayList<String> _loclist = new ArrayList<>();
	static ArrayList<String> _catlist = new ArrayList<>();
	String price;
	String location;
	String category;
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getStateChange() == ItemEvent.DESELECTED) {
			if(e.getItem() == main.under5000__)
				_pricelist.remove("a");
			if(e.getItem() == main.under7500__)
				_pricelist.remove("b");
			if(e.getItem() == main.under10000__)
				_pricelist.remove("c");
			if(e.getItem() == main.under15000__)
				_pricelist.remove("d");
			if(e.getItem() == main.over15000__)
				_pricelist.remove("e");

			if(e.getItem() == main.loc_A__)
				_loclist.remove("a");
			if(e.getItem() == main.loc_B__)
				_loclist.remove("b");
			if(e.getItem() == main.loc_C__)
				_loclist.remove("c");
			if(e.getItem() == main.loc_D__)
				_loclist.remove("d");
			if(e.getItem() == main.loc_E__)
				_loclist.remove("e");
			if(e.getItem() == main.loc_F__)
				_loclist.remove("f");
			if(e.getItem() == main.loc_G__)
				_loclist.remove("g");

			if(e.getItem() == main.cat_A__)
				_catlist.remove("a");
			if(e.getItem() == main.cat_B__)
				_catlist.remove("b");
			if(e.getItem() == main.cat_C__)
				_catlist.remove("c");
			if(e.getItem() == main.cat_D__)
				_catlist.remove("d");
			if(e.getItem() == main.cat_E__)
				_catlist.remove("e");
			if(e.getItem() == main.cat_F__)
				_catlist.remove("f");
			if(e.getItem() == main.cat_G__)
				_catlist.remove("g");


		}
		if(e.getStateChange() == ItemEvent.SELECTED) {
			if(e.getItem() == main.under5000__)
				_pricelist.add("a");
			if(e.getItem() == main.under7500__)
				_pricelist.add("b");
			if(e.getItem() == main.under10000__)
				_pricelist.add("c");
			if(e.getItem() == main.under15000__)
				_pricelist.add("d");
			if(e.getItem() == main.over15000__)
				_pricelist.add("e");

			if(e.getItem() == main.loc_A__)
				_loclist.add("a");
			if(e.getItem() == main.loc_B__)
				_loclist.add("b");
			if(e.getItem() == main.loc_C__)
				_loclist.add("c");
			if(e.getItem() == main.loc_D__)
				_loclist.add("d");
			if(e.getItem() == main.loc_E__)
				_loclist.add("e");
			if(e.getItem() == main.loc_F__)
				_loclist.add("f");
			if(e.getItem() == main.loc_G__)
				_loclist.add("g");

			if(e.getItem() == main.cat_A__)
				_catlist.add("a");
			if(e.getItem() == main.cat_B__)
				_catlist.add("b");
			if(e.getItem() == main.cat_C__)
				_catlist.add("c");
			if(e.getItem() == main.cat_D__)
				_catlist.add("d");
			if(e.getItem() == main.cat_E__)
				_catlist.add("e");
			if(e.getItem() == main.cat_F__)
				_catlist.add("f");
			if(e.getItem() == main.cat_G__)
				_catlist.add("g");


		}


	}
}