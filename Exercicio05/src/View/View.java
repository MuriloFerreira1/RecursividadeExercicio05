package View;
import javax.swing.JOptionPane;

import controller.Controller;
public class View {
	public static void main(String[] args) {
		Controller c=new Controller();
		int posicao;
		do {
			posicao = Integer.parseInt(JOptionPane.showInputDialog("Insira"));
		}while(posicao<=0 || posicao>10);
		
		System.out.println(c.fibonacci(posicao));
		
	}
}
