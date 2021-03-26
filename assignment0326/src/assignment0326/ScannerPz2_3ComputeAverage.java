package assignment0326;
import java.util.Scanner;
public class ScannerPz2_3ComputeAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("输入三个数字");
		Double a=input.nextDouble();
		Double b=input.nextDouble();
		Double c=input.nextDouble();
		Double aver=(a+b+c)/3;
		System.out.println("平均数为"+aver);
		input.close();
		
	}

}
