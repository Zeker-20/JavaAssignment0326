package assignment0326;
import java.util.Scanner;
public class ScannerPz2_3ComputeAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("������������");
		Double a=input.nextDouble();
		Double b=input.nextDouble();
		Double c=input.nextDouble();
		Double aver=(a+b+c)/3;
		System.out.println("ƽ����Ϊ"+aver);
		input.close();
		
	}

}
