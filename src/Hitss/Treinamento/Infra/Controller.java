package Hitss.Treinamento.Infra;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Controller {
	
	public static void Play() {
		try {
			
		
		System.out.println("");
		System.out.println("      Hitss Treinamento");
		System.out.println("");
		System.out.println("Digite o Número");
		System.out.println("");
		Scanner teclado = new Scanner(System.in);
		/*int num = teclado.nextInt();
		
		if (num % num == 0 &&  num % 1 == 0) {
			System.out.println("");
			System.out.println("É Primo");
		}*/
		
		int n[] = new int[9];
        for (int i = 0; i < n.length; i++) {

            n[i] = teclado.nextInt();
            if (n[i] <= 1) {
            	System.out.println("");
				System.out.println("Número menor ou igual a 1.");
				break;
			}
        }
        
        if (n[0] > 1 || n[1] > 1 || n[2] > 1 || n[3] > 1 || n[4] > 1 || n[5] > 1 || n[6] > 1 || n[7] > 1 || n[8] > 1 || n[9] > 1) {
        for (int i = 1; i < n.length; i++) {
            boolean primo = true;
            for (int j = 2; j < n.length; j++) {
                if (n[i] % i == 0) {
                    primo = false;
                    System.out.println("");
                    System.out.println("Não é Primo.");
                    break;
                }
            }
            if (primo == true) {
                //System.out.println(n[i]);
                //System.out.println(i);
            	System.out.println("");
                System.out.println("É Primo.");
            }
        }
        }
		} finally{
			// TODO: handle exception
		}
	}
}
