package BabyakPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class main extends JFrame{
	private JPanel mainpanel = new JPanel();
	private JPanel listpanel = new JPanel();
	private JPanel recommandpanel = new JPanel();
	//시작화면 GUI구현
	public main() {
		setTitle("밥약해요!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 200));
		
		
		
		JButton recommandbtn = new JButton("추천해드릴게요!");
		JButton listbtn = new JButton("맛집이 뭐가 있지?");
		JButton testbtn1 = new JButton("리스트 테스트");
		JButton testbtn2 = new JButton("추천 테스트");
		
		listbtn.addActionListener(new mainActionListener());
		recommandbtn.addActionListener(new mainActionListener());
		testbtn1.addActionListener(new mainActionListener());
		
		mainpanel.add(recommandbtn);
		mainpanel.add(listbtn);
		listpanel.add(testbtn1);
		recommandpanel.add(testbtn2);
		contentPane.add(mainpanel);
		
		setSize(400,400);
		setVisible(true);
	}
	
	
	//시작화면 이벤트 구현
	private class mainActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			if(btn.getText().equals("추천해드릴게요!")) {
				Container cp = getContentPane();
				cp.remove(mainpanel);
				cp.add(recommandpanel);
				recommandpanel.updateUI();
			}
			else if(btn.getText().equals("맛집이 뭐가 있지?")){
				Container cp = getContentPane();
				cp.remove(mainpanel);
				cp.remove(mainpanel);
				cp.add(listpanel);
				listpanel.updateUI();
			}
			else {
				Container cp = getContentPane();
				cp.remove(listpanel);
				cp.add(mainpanel);
				mainpanel.updateUI();
			}
		}
		
	}
	
	

	public static void main(String[] args) {
		//실행 코드 구현
		//메모장 파일이 없을 경우, 파일을 생성하는 기능 구현
		new main();
	}

}
