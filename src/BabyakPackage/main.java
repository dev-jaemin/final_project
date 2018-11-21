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
		
		listbtn.addActionListener(new mainActionListener());
		recommandbtn.addActionListener(new mainActionListener());
		
		mainpanel.add(recommandbtn);
		mainpanel.add(listbtn);
		
		//list panel 코드
		
		
		
		//recommand panel 코드
		
		
		
		
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
