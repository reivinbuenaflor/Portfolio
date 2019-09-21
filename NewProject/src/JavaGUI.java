import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaGUI{
	
	private static final double WinterMelon = 65.00;
	private static final double BubbleTea = 65.00;
	
	private static void calcTotal(JTable table, JLabel label) {
		double total = 0.00;
		for(int row = 0; row<table.getRowCount(); row++) {
			String price = table.getValueAt(row, 2).toString();
			double val = Double.parseDouble(price);
			total+=val;
		}
		label.setText("Total: "+total);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("DEMO");
		JComboBox box = new JComboBox();
		JCheckBox winterMelon = new JCheckBox("Winter Melon");
		JCheckBox bubbleTea = new JCheckBox("Bubble Tea");
		JButton order = new JButton("Order");
		JButton delete = new JButton("Del");
		JTable table = new JTable();
		JLabel label = new JLabel("TOTAL: ");
		
		
		JScrollPane pane = new JScrollPane(table);
		label.setBounds(30, 321, 200, 35);
		box.setBounds(300, 50, 150, 45);
		String size[] = new String[] {"Small", "Medium"  ,"Large"};
		box.setModel(new DefaultComboBoxModel(size));
		table.setModel(new DefaultTableModel(
				new String[][]{},

				new String[]{

				"Item",

				"Size",

				"Price"

				}));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		winterMelon.setBounds(30, 50, 200, 40);
		bubbleTea.setBounds(30, 100, 200, 40);
		order.setBounds(30, 370, 150, 45);
		table.setBounds(300, 90, 90, 300);
		pane.setBounds(300,120,150,296);
		delete.setBounds(196, 370, 90, 45);

		order.setEnabled(false);
		
		frame.add(label);
		frame.add(box);
		frame.add(winterMelon);
		frame.add(bubbleTea);
		frame.add(order);
		frame.add(pane);
		frame.add(delete);
		
		order.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				String size = box.getSelectedItem().toString();
				String item ="None";
				String price = "0.00";
				if(winterMelon.isSelected()&& bubbleTea.isSelected()) {
					String wintermelon[] = {"WntrMln",size,""+WinterMelon};
					String bubbletea[] = {"BbblTea",size, ""+BubbleTea};
					model.addRow(wintermelon);
					model.addRow(bubbletea);
					calcTotal(table, label);
				}else {
					if(winterMelon.isSelected()) {
						item = "WntrMln";
						price = ""+WinterMelon;
					}
					if(bubbleTea.isSelected()) {
						item = "BbblTea";
						price = ""+BubbleTea;
					}
					String data[] = {item,size,price};
					model.addRow(data);
					calcTotal(table, label);
				}
				
			}
			
		});
		winterMelon.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(winterMelon.isSelected() || bubbleTea.isSelected()) {
					order.setEnabled(true);
				}else {
					order.setEnabled(false);
				}
				
			}
			
		});
		
		bubbleTea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					if(bubbleTea.isSelected()|| winterMelon.isSelected()) {
						order.setEnabled(true);
					}else {
						order.setEnabled(false);
					}
					
				}
		});
		
		delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table.getSelectedRow();
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				if(selectedRow < 0) {
					JOptionPane.showMessageDialog(null, "Please select a row to delete","No Row Selected", JOptionPane.ERROR_MESSAGE);
				}
				else {
					model.removeRow(selectedRow);
					calcTotal(table, label);
				}
				
			}
			
		});
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
