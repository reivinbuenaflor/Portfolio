import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController{
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addCalculationListener(new CalculateListener());
 	}
	
	class CalculateListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int firstNumber, secondNumber = 0;
			
			try {
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				
				theModel.addTwoVal(firstNumber, secondNumber);
				theView.setCalcSolution(theModel.getValue());
			}catch(NumberFormatException ex){
				theView.displayErrorMessage("You need to enter 2 Integers");
			}
			
		}
		
	}
	
}