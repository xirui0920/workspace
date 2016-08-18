package xirui.Practices;
import java.util.Scanner;
//��16����ת����10���� ���õ����ķ�����c

public class HexToDecimalConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hex number: ");
		String hex = input.nextLine();
		
		System.out.println(hexToDecimal(hex.toUpperCase()));
		

	}
	public static int hexToDecimal(String hex){
		int decimalValue = 0;
		for(int i = 0;i < hex.length();i++){
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);			
		}
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch){
		if(ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else
			return ch - '0';
	}
	
}
