package controller;

public class Controller {
	public int fibonacci(int n) {
		//para a compara��o em caso do valor ser 1 ou 2
		if(n==1 || n==2) {
			return 1;
		}else {
			//faz a compara��o dos dois n�meros anteriores e soma seus resultados
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
}
