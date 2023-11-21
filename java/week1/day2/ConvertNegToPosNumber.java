package week1.day2;

public class ConvertNegToPosNumber {
	public static void main(String[] args) {
		int number=-30;
		int positivenumber=0;
		if(number<0) {
			positivenumber=-(number);
		}
		System.out.println("The number "+number+" is converted to "+positivenumber);
	}


}
