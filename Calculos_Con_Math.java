
public class Calculos_Con_Math {

	public static void main(String[] args) {
		//double raiz = Math.sqrt(9);
		
		float num1= 8.85F;
		int resultado1 = Math.round(num1);
		
		double num2= 8.85;
		int resultado2 = (int)Math.round(num2);
		
		System.out.println(resultado1); 
		System.out.println(resultado2); 
		
		double num3 = 5;
		double exp= 3;
		int res =(int)Math.pow(num3, exp);
		
		System.out.println(res);
	}

}
