package day17.com.ict.edu3;

import javax.swing.table.AbstractTableModel;

public class Ex01_JTable extends AbstractTableModel {

	String[] name = {"일","이","일","이","일"};
	
	String[][] data = {
			{"1","a","a2","hh","일"},
			{"2","s","q2","gg","일"},
			{"3","d","we","ff","일"},
			{"4","f","34","bb","일"},
			{"5","g","fd","nn","일"}
	};
	
	// 행의 수 = rows = 줄
	@Override
	public int getRowCount() {
		
		return data.length;
}	
	//열의 수 = Column = 열
	@Override
	public int getColumnCount() {
		return name.length;
	}
	
	//내용삽입
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		return data [rowIndex][columnIndex];
		
	}
	
	//컬럼명 넣기
	@Override
	public String getColumnName(int column) {
		return name[column];
	}
	
	//고친내용 적용하기
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		if(columnIndex != 0)
		data [rowIndex][columnIndex] = (String) aValue;
	}
	
}
