package br.edu.ifsp.view.model;

import javax.swing.table.DefaultTableModel;

public class ClientModel extends DefaultTableModel {

	private static final long serialVersionUID = 3472716354338896651L;

	public ClientModel(String[] header, Object[][] rows) {

		for (String c : header)
			super.addColumn(c);

		for (Object[] o : rows)
			super.addRow(o);
	};

	public void clearRows() {
		
		while (super.getColumnCount() > 0)
			super.removeRow(0);
	}

	public Class<?>[] types = new Class[] {
		Integer.class, String.class, String.class 
	};
	
	boolean[] canEdit = new boolean[] {false, false, false};

	public Class<?> getColumnClass(int columnIndex) {
		return types[columnIndex];
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return canEdit[columnIndex];
	}
	
	public void addRow(Integer idClient, String fullname, String birthdate) {
		super.addRow(new Object[] {idClient, fullname, birthdate});
	}
}