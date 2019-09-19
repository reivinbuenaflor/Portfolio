public class CalculatorModel{
	private int calculationvalue;
	
	public void addTwoVal(int firstnum, int secondnum) {
		calculationvalue = firstnum+secondnum;
	}
	
	public int getValue() {
		return calculationvalue;
	}
}