package BabyakPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class main extends JFrame{
	JPanel mainpanel = new JPanel();
	JPanel listpanel = new JPanel();
	JPanel recommandpanel = new JPanel();
	//시작화면 GUI구현
	public main() {
		setTitle("밥약해요!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		mainpanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 200));
		
		
		//main panel 코드
		JButton recommandbtn = new JButton("추천해드릴게요!");
		JButton listbtn = new JButton("맛집이 뭐가 있지?");
		
		listbtn.addActionListener(new mainActionListener(contentPane, mainpanel, listpanel));
		recommandbtn.addActionListener(new mainActionListener(contentPane, mainpanel, recommandpanel));
		
		mainpanel.add(recommandbtn);
		mainpanel.add(listbtn);
		
		//list panel 코드
		listpanel.setLayout(new GridLayout(1, 2));
		
		JPanel listpanel1 = new JPanel();
		JLabel option =  new JLabel("<검색 조건>");
		
		JLabel priceLabel = new JLabel("가격대");
		JCheckBox under5000 = new JCheckBox("5000원 미만");
		JCheckBox under7500 = new JCheckBox("5000원 ~ 7500원");
		JCheckBox under10000 = new JCheckBox("7500원 ~ 10000원");
		JCheckBox under15000 = new JCheckBox("10000원 ~ 15000원");
		JCheckBox over15000 = new JCheckBox("15000원 이상");
		listpanel1.add(priceLabel);
		listpanel1.add(under5000);
		listpanel1.add(under7500);
		listpanel1.add(under10000);
		listpanel1.add(under15000);
		listpanel1.add(over15000);
		
		JPanel listpanel2 = new JPanel();
		JLabel locationLabel = new JLabel("<위치>");
		JCheckBox loc_A = new JCheckBox("정후");
		JCheckBox loc_B = new JCheckBox("개운사길");
		JCheckBox loc_C = new JCheckBox("참살이길");
		JCheckBox loc_D = new JCheckBox("옆살이, 옆옆살이");
		JCheckBox loc_E = new JCheckBox("법후");
		JCheckBox loc_F = new JCheckBox("제기동");
		JCheckBox loc_G = new JCheckBox("학교 안");
		listpanel2.add(locationLabel);
		listpanel2.add(loc_A);
		listpanel2.add(loc_B);
		listpanel2.add(loc_C);
		listpanel2.add(loc_D);
		listpanel2.add(loc_E);
		listpanel2.add(loc_F);
		listpanel2.add(loc_G);
		
		JPanel listpanel3 = new JPanel();
		JLabel categoryLabel = new JLabel("<종류>");
		JCheckBox cat_A = new JCheckBox("양식");
		JCheckBox cat_B = new JCheckBox("한식");
		JCheckBox cat_C = new JCheckBox("중식");
		JCheckBox cat_D = new JCheckBox("일식");
		JCheckBox cat_E = new JCheckBox("분식 & 간단한");
		JCheckBox cat_F = new JCheckBox("기타 국가");
		listpanel3.add(categoryLabel);
		listpanel3.add(cat_A);
		listpanel3.add(cat_B);
		listpanel3.add(cat_C);
		listpanel3.add(cat_D);
		listpanel3.add(cat_E);
		listpanel3.add(cat_F);
		
		JButton addRestaurantBtn = new JButton("식당 추가");
		
		JList<String> resultList = new JList<String>();
		
		listpanel.add(option);
		listpanel.add(listpanel1);
		listpanel.add(listpanel2);
		listpanel.add(listpanel3);
		listpanel.add(addRestaurantBtn);
		listpanel.add(resultList);
		
		
		//recommand panel 코드
		
		//recommandpanel.add(testbtn11);
		
		
		//시작화면 기본 설정
		contentPane.add(mainpanel);
		setSize(400,400);
		setVisible(true);
	}
	
	
	//시작화면 이벤트 구현
	
	
	

	public static void main(String[] args) {
		//실행 코드 구현
		//메모장 파일이 없을 경우, 파일을 생성하는 기능 구현
		new main();
	}

}
