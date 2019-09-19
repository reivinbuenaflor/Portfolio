import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame{
	
	private JTextField firstnumber = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondnumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	
	CalculatorView(){
		JPanel calPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,200);
		calPanel.add(firstnumber);
		calPanel.add(additionLabel);	
		calPanel.add(secondnumber);
		calPanel.add(calculateButton);
		calPanel.add(calcSolution);
		
		this.add(calPanel);
	}
	
	public int getFirstNumber() {
		return Integer.parseInt(firstnumber.getText());
	}
	public int getSecondNumber() {
		return Integer.parseInt(secondnumber.getText());
	}
	public int getCalcSolution() {
		return Integer.parseInt(calcSolution.getText());
	}
	public void setCalcSolution(int solution) {
		calcSolution.setText(Integer.toString(solution));
	}
	void addCalculationListener(ActionListener listenForCalcButton) {
		calculateButton.addActionListener(listenForCalcButton);
	}
	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}