package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {

			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) ) {
				break;
			}
			
			String[] tokens = expression.split( " " );
			
			if( tokens.length != 3 ) {
				System.out.println( ">> 알 수 없는 식입니다.");
				continue;
			}
			
			switch(tokens[1]) {
			case "+" :
				Add add = new Add();
				add.setValue(tokens[0], tokens[2]);
				add.calculate();
				continue;
			
			case "-" :
				Sub sub = new Sub();
				sub.setValue(tokens[0], tokens[2]);
				sub.calculate();
				continue;
			case "*" :
				Mul mul = new Mul();
				mul.setValue(tokens[0], tokens[2]);
				mul.calculate();
				continue;
			case "/" :
				Div div = new Div();
				div.setValue(tokens[0], tokens[2]);
				div.calculate();
				continue;
			default :
				System.out.println("오류");
			}
		}
		
		scanner.close();

	}

}
