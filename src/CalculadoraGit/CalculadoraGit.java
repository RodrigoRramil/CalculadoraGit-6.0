package CalculadoraGit;

public class CalculadoraGit {
	
	private int num1;
	private int num2;
	
	
	public CalculadoraGit (int a, int b)
	{
		setNum1(a);
		setNum2(b);
	}
	
	//m�todo suma
	public int suma ()
	{
		int resul=getNum1()+getNum2();
		return resul;
	}
	
	//m�todo resta
	public int resta()
	{
		int resul=getNum1()-getNum2();
		return resul;
	}
	
	//m�todo multiplicar
	public int multiplica ()
	{
		int resul=getNum1()*getNum2();
		return resul;
	}
	
	//m�todo dividir
	public int divide ()
	{
		int resul=getNum1()/getNum2();
		return resul;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

}
