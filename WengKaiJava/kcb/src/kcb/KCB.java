package kcb;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class KCB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ee");
		
		
		JFrame frame = new JFrame();
		
		JTable table = new JTable(new Data());
		JScrollPane pane = new JScrollPane(table);
		frame.add(pane);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}

}
