import java.util.Scanner;

public class exercicio2 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Para que posição deseja calcular a série de Fibonacci?");
	int n = input.nextInt();
	if (n==0) {
		System.out.println(0);
	}else {
	int[] serie = new int[n+1];
	
	for(int i = 0;i<n+1;i++) {
		if(i==0) {
			serie[i]= 0;
		}else if(i==1){
			serie[i]=1;
		}else {
		serie[i]=serie[i-1]+serie[i-2];
	}


	}
	for (int i =0;i<n+1;i++) {
		System.out.println(serie[i]);
	}
	}
	input.close();
}
}
