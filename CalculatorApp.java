public class CalculatorApp{

	public static void main(String[] args){

		new CalculatorApp().addFromMaster(1,2);
	}

	public void addFromMaster(int a, int b){
		return a+b;
	}

	//added new feature subtract in feature/subtract
	public void subFromFeatureSub(int a, int b){
		return a-b;
	}
	//added feature multiplication in feature/mul branch
	public int mulFromFeatureMul(int a, int b){
		return a*b;
	}

}