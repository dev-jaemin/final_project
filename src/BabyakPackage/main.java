package BabyakPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class main extends JFrame{
	//시작화면 GUI구현
	public main() {
		setTitle("밥약해요!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 200));
		
		JButton recommandbtn = new JButton("추천해드릴게요!");
		JButton listbtn = new JButton("맛집이 뭐가 있지?");
		
		contentPane.add(recommandbtn);
		contentPane.add(listbtn);
		
		setSize(400,400);
		setVisible(true);
	}
	
	
	//시작화면 이벤트 구현
	private class mainActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Jbutton btn = (JButton)e.getSource();
			if(btn.getText().equals("추천해드릴게요!")) {
				btn.setVisible(false);
				new recommand();
			}
			else {
				//contentPane.setVisible(false);
				new list();
			}
		}
		
	}
	
	

	public static void main(String[] args) {
		//실행 코드 구현
		//메모장 파일이 없을 경우, 파일을 생성하는 기능 구현
		new main();
	}

}
