package BabyakPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class restaurant{
	String name;
	String location;
	int price;
	
	public restaurant(String name, String location, int price) {
		this.name = name;
		this.location = location;
		this.price = price;
	}
}

//식당 추가 메소드 구현

//카테고리별 정렬 구현

//파일 입출력을 통해 메모장에서 불러오는 기능 구현

//파일 입출력을 통해 메모장에 저장하는 기능 구현

public class list extends JFrame {
	//List GUI구현하기
	public list() {
		setTitle("밥약해요!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Container listcp = getContentPane();
		public JPanel listpanel = new JPanel();
		
		JButton testbutton1 = new JButton("테스트용");
		JLabel testlabel = new JLabel("테스트라벨");
		
		listpanel.add(testbutton1);
		listpanel.add(testlabel);
		//listcp.add(listpanel);
		
		//listcp.setSize(400,400);
		//listcp.setVisible(true);
	}
	
	
	//그에 맞는 이벤트도 구현하기
	
	

}
