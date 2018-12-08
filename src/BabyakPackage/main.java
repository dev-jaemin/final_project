package BabyakPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class main extends JFrame{
	static ArrayList<restaurantClass> reslist = new ArrayList<>();

	JPanel mainpanel = new JPanel();
	JPanel listpanel = new JPanel();
	JPanel recommandpanel = new JPanel();
	JPanel newpanel = new JPanel();
	JLabel option =  new JLabel("<검색 조건>");

	JPanel listpanel1 = new JPanel();
	static JLabel priceLabel = new JLabel("가격대");
	static JCheckBox under5000 = new JCheckBox("5000원 미만");
	static JCheckBox under7500 = new JCheckBox("5000원 ~ 7500원");
	static JCheckBox under10000 = new JCheckBox("7500원 ~ 10000원");
	static JCheckBox under15000 = new JCheckBox("10000원 ~ 15000원");
	static JCheckBox over15000 = new JCheckBox("15000원 이상");

	JPanel listpanel2 = new JPanel();
	static JLabel locationLabel = new JLabel("<위치>");
	static JCheckBox loc_A = new JCheckBox("정후");
	static JCheckBox loc_B = new JCheckBox("개운사길");
	static JCheckBox loc_C = new JCheckBox("참살이길");
	static JCheckBox loc_D = new JCheckBox("옆살이, 옆옆살이");
	static JCheckBox loc_E = new JCheckBox("법후");
	static JCheckBox loc_F = new JCheckBox("제기동");
	static JCheckBox loc_G = new JCheckBox("학교 안");

	JPanel listpanel3 = new JPanel();
	static JLabel categoryLabel = new JLabel("<종류>");
	static JCheckBox cat_A = new JCheckBox("양식");
	static JCheckBox cat_B = new JCheckBox("한식");
	static JCheckBox cat_C = new JCheckBox("중식");
	static JCheckBox cat_D = new JCheckBox("일식");
	static JCheckBox cat_E = new JCheckBox("분식 & 간단한");
	static JCheckBox cat_F = new JCheckBox("기타 국가");
	
	static JTextArea listResult = new JTextArea(10, 20);

	JPanel recommandpanel1 = new JPanel();
	JLabel priceLabel_ = new JLabel("<가격대>");
	static JCheckBox under5000_ = new JCheckBox("5000원 미만");
	static JCheckBox under7500_ = new JCheckBox("5000원 ~ 7500원");
	static JCheckBox under10000_ = new JCheckBox("7500원 ~ 10000원");
	static JCheckBox under15000_ = new JCheckBox("10000원 ~ 15000원");
	static JCheckBox over15000_ = new JCheckBox("15000원 이상");

	JPanel recommandpanel2 = new JPanel();
	JLabel locationLabel_ = new JLabel("<위치>");
	static JCheckBox loc_A_ = new JCheckBox("정후");
	static JCheckBox loc_B_ = new JCheckBox("개운사길");
	static JCheckBox loc_C_ = new JCheckBox("참살이길");
	static JCheckBox loc_D_ = new JCheckBox("옆살이, 옆옆살이");
	static JCheckBox loc_E_ = new JCheckBox("법후");
	static JCheckBox loc_F_ = new JCheckBox("제기동");
	static JCheckBox loc_G_ = new JCheckBox("학교 안");

	JPanel recommandpanel3 = new JPanel();
	JLabel categoryLabel_ = new JLabel("<종류>");
	static JCheckBox cat_A_ = new JCheckBox("양식");
	static JCheckBox cat_B_ = new JCheckBox("한식");
	static JCheckBox cat_C_ = new JCheckBox("중식");
	static JCheckBox cat_D_ = new JCheckBox("일식");
	static JCheckBox cat_E_ = new JCheckBox("분식 & 간단한");
	static JCheckBox cat_F_ = new JCheckBox("기타 국가");
	
	static JButton getRecommandbtn = new JButton("추천 받기");
	static JTextField recommandResult = new JTextField(10);

	JPanel newpanel1 = new JPanel();
	ButtonGroup group1 = new ButtonGroup();
	static JRadioButton under5000__ = new JRadioButton("5000원 미만");
	static JRadioButton under7500__ = new JRadioButton("5000원 ~ 7500원");
	static JRadioButton under10000__ = new JRadioButton("7500원 ~ 10000원");
	static JRadioButton under15000__ = new JRadioButton("10000원 ~ 15000원");
	static JRadioButton over15000__ = new JRadioButton("15000원 이상");

	JPanel newpanel2 = new JPanel();
	ButtonGroup group2 = new ButtonGroup();
	static JRadioButton loc_A__ = new JRadioButton("정후");
	static JRadioButton loc_B__ = new JRadioButton("개운사길");
	static JRadioButton loc_C__ = new JRadioButton("참살이길");
	static JRadioButton loc_D__ = new JRadioButton("옆살이, 옆옆살이");
	static JRadioButton loc_E__ = new JRadioButton("법후");
	static JRadioButton loc_F__ = new JRadioButton("제기동");
	static JRadioButton loc_G__ = new JRadioButton("학교 안");

	JPanel newpanel3 = new JPanel();
	ButtonGroup group3 = new ButtonGroup();
	static JRadioButton cat_A__ = new JRadioButton("양식");
	static JRadioButton cat_B__ = new JRadioButton("한식");
	static JRadioButton cat_C__ = new JRadioButton("중식");
	static JRadioButton cat_D__ = new JRadioButton("일식");
	static JRadioButton cat_E__ = new JRadioButton("분식 & 간단한");
	static JRadioButton cat_F__ = new JRadioButton("기타 국가");
	static JTextField newResName = new JTextField(10);
	static JButton addResbtn = new JButton("추가하기");

	static JButton backbtn1 = new JButton("뒤로");
	static JButton backbtn2 = new JButton("뒤로");
	static JButton backbtn3 = new JButton("뒤로");

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
		listActionListener boxItemListener = new listActionListener();

		under5000.addItemListener(boxItemListener);
		under7500.addItemListener(boxItemListener);
		under10000.addItemListener(boxItemListener);
		under15000.addItemListener(boxItemListener);
		over15000.addItemListener(boxItemListener);
		listpanel1.add(priceLabel);
		listpanel1.add(under5000);
		listpanel1.add(under7500);
		listpanel1.add(under10000);
		listpanel1.add(under15000);
		listpanel1.add(over15000);

		loc_A.addItemListener(boxItemListener);
		loc_B.addItemListener(boxItemListener);
		loc_C.addItemListener(boxItemListener);
		loc_D.addItemListener(boxItemListener);
		loc_E.addItemListener(boxItemListener);
		loc_F.addItemListener(boxItemListener);
		loc_G.addItemListener(boxItemListener);
		listpanel2.add(locationLabel);
		listpanel2.add(loc_A);
		listpanel2.add(loc_B);
		listpanel2.add(loc_C);
		listpanel2.add(loc_D);
		listpanel2.add(loc_E);
		listpanel2.add(loc_F);
		listpanel2.add(loc_G);

		cat_A.addItemListener(boxItemListener);
		cat_B.addItemListener(boxItemListener);
		cat_C.addItemListener(boxItemListener);
		cat_D.addItemListener(boxItemListener);
		cat_E.addItemListener(boxItemListener);
		cat_F.addItemListener(boxItemListener);
		listpanel3.add(categoryLabel);
		listpanel3.add(cat_A);
		listpanel3.add(cat_B);
		listpanel3.add(cat_C);
		listpanel3.add(cat_D);
		listpanel3.add(cat_E);
		listpanel3.add(cat_F);

		JButton addRestaurantBtn = new JButton("식당 추가");
		addRestaurantBtn.addActionListener(new mainActionListener(contentPane, listpanel, newpanel));

		JList<String> resultList = new JList<String>();
		backbtn1.addActionListener(new mainActionListener(contentPane, listpanel, mainpanel));

		listpanel.add(option);
		listpanel.add(listpanel1);
		listpanel.add(listpanel2);
		listpanel.add(listpanel3);
		listpanel.add(new JScrollPane(listResult));
		listpanel.add(addRestaurantBtn);
		listpanel.add(resultList);
		listpanel.add(backbtn1);


		//recommand panel 코드

		recommandActionListener recommandItemListener = new recommandActionListener();

		under5000_.addItemListener(recommandItemListener);
		under7500_.addItemListener(recommandItemListener);
		under10000_.addItemListener(recommandItemListener);
		under15000_.addItemListener(recommandItemListener);
		over15000_.addItemListener(recommandItemListener);

		loc_A_.addItemListener(recommandItemListener);
		loc_B_.addItemListener(recommandItemListener);
		loc_C_.addItemListener(recommandItemListener);
		loc_D_.addItemListener(recommandItemListener);
		loc_E_.addItemListener(recommandItemListener);
		loc_F_.addItemListener(recommandItemListener);
		loc_G_.addItemListener(recommandItemListener);

		cat_A_.addItemListener(recommandItemListener);
		cat_B_.addItemListener(recommandItemListener);
		cat_C_.addItemListener(recommandItemListener);
		cat_D_.addItemListener(recommandItemListener);
		cat_E_.addItemListener(recommandItemListener);
		cat_F_.addItemListener(recommandItemListener);

		getRecommandbtn.addActionListener(recommandItemListener);
		JLabel option_ =  new JLabel("<추천 조건>");

		recommandpanel1.add(priceLabel_);
		recommandpanel1.add(under5000_);
		recommandpanel1.add(under7500_);
		recommandpanel1.add(under10000_);
		recommandpanel1.add(under15000_);
		recommandpanel1.add(over15000_);


		recommandpanel2.add(locationLabel_);
		recommandpanel2.add(loc_A_);
		recommandpanel2.add(loc_B_);
		recommandpanel2.add(loc_C_);
		recommandpanel2.add(loc_D_);
		recommandpanel2.add(loc_E_);
		recommandpanel2.add(loc_F_);
		recommandpanel2.add(loc_G_);

		recommandpanel3.add(categoryLabel_);
		recommandpanel3.add(cat_A_);
		recommandpanel3.add(cat_B_);
		recommandpanel3.add(cat_C_);
		recommandpanel3.add(cat_D_);
		recommandpanel3.add(cat_E_);
		recommandpanel3.add(cat_F_);


		JList<String> resultRecommand = new JList<String>();
		backbtn2.addActionListener(new mainActionListener(contentPane, recommandpanel, mainpanel));

		recommandpanel.add(option_);
		recommandpanel.add(recommandpanel1);
		recommandpanel.add(recommandpanel2);
		recommandpanel.add(recommandpanel3);
		recommandpanel.add(resultRecommand);
		recommandpanel.add(recommandResult);
		recommandpanel.add(getRecommandbtn);
		recommandpanel.add(backbtn2);

		//new panel

		group1.add(under5000__);group1.add(under7500__);group1.add(under10000__);group1.add(under15000__);group1.add(over15000__);
		group2.add(loc_A__);group2.add(loc_B__);group2.add(loc_C__);group2.add(loc_D__);group2.add(loc_E__);group2.add(loc_F__);group2.add(loc_G__);
		group3.add(cat_A__);group3.add(cat_B__);group3.add(cat_C__);group3.add(cat_D__);group3.add(cat_E__);group3.add(cat_F__);

		newpanelActionListener newItemListener = new newpanelActionListener();

		under5000__.addItemListener(newItemListener);
		under7500__.addItemListener(newItemListener);
		under10000__.addItemListener(newItemListener);
		under15000__.addItemListener(newItemListener);
		over15000__.addItemListener(newItemListener);

		loc_A__.addItemListener(newItemListener);
		loc_B__.addItemListener(newItemListener);
		loc_C__.addItemListener(newItemListener);
		loc_D__.addItemListener(newItemListener);
		loc_E__.addItemListener(newItemListener);
		loc_F__.addItemListener(newItemListener);
		loc_G__.addItemListener(newItemListener);

		cat_A__.addItemListener(newItemListener);
		cat_B__.addItemListener(newItemListener);
		cat_C__.addItemListener(newItemListener);
		cat_D__.addItemListener(newItemListener);
		cat_E__.addItemListener(newItemListener);
		cat_F__.addItemListener(newItemListener);

		addResbtn.addActionListener(new listActionListener2());


		newpanel.add(newResName);
		newpanel1.add(under5000__);
		newpanel1.add(under7500__);
		newpanel1.add(under10000__);
		newpanel1.add(under15000__);
		newpanel1.add(over15000__);

		newpanel2.add(loc_A__);
		newpanel2.add(loc_B__);
		newpanel2.add(loc_C__);
		newpanel2.add(loc_D__);
		newpanel2.add(loc_E__);
		newpanel2.add(loc_F__);
		newpanel2.add(loc_G__);

		newpanel3.add(cat_A__);
		newpanel3.add(cat_B__);
		newpanel3.add(cat_C__);
		newpanel3.add(cat_D__);
		newpanel3.add(cat_E__);
		newpanel3.add(cat_F__);

		backbtn3.addActionListener(new mainActionListener(contentPane, newpanel, listpanel));

		newpanel.add(newpanel1);
		newpanel.add(newpanel2);
		newpanel.add(newpanel3);
		newpanel.add(addResbtn);
		newpanel.add(backbtn3);


		//시작화면 기본 설정
		contentPane.add(mainpanel);
		setSize(800,600);
		setVisible(true);
	}


	public static void main(String[] args) {
		//실행 코드 구현
		//메모장 파일이 없을 경우, 파일을 생성하는 기능 구현
		File file = new File("data.txt");
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()) {
				restaurantClass res = new restaurantClass(scanner.next(), scanner.next(), scanner.next(), scanner.next());
				reslist.add(res);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다.");
		}
		new main();
	}

}
