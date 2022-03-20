package kcb;

import java.util.Iterator;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class Data implements TableModel {
	
	String[] colNameStrings = {
			"周一","周二","周三","周四","周五","周六","周日"
	};
	
	String[][] contenStrings = new String[8][7];
	
	

	

	public Data() {
		super();
		// TODO Auto-generated constructor stub
		
		for (int i = 0; i < contenStrings.length; i++) {
			String[] colStrings =  contenStrings[i];
			for (int j = 0; j < colStrings.length; j++) {
				colStrings[j] = "";
			}
		}
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public String getColumnName(int columnIndex) {
		// TODO Auto-generated method stub
		return colNameStrings[columnIndex];
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return contenStrings[rowIndex][columnIndex];
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		contenStrings[rowIndex][columnIndex] = (String)aValue;
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
