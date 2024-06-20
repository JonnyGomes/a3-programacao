import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		
		String valor1 = JOptionPane.showInputDialog
                ("Informe o primerio valor !");
		
		String valor2 = JOptionPane.showInputDialog
                ("Informe o segundo valor !");

		int n1 = Integer.parseInt(valor1);
		int n2 = Integer.parseInt(valor2);
		
		int soma = n1 + n2;
		
		JOptionPane.showMessageDialog
        (null ,"Resultado da soma = " + soma );
		
		
		
	}

}
