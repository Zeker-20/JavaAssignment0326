package assignment0326;
import java.util.Scanner;
public class Pz2_2inputScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输入半径计算圆的面积
		Scanner input=new Scanner(System.in);
		System.out.println("请输入半径：");
		double r=input.nextDouble();
		double s=Math.pow(r,2)*3.14;//此处需要加括号吗
		System.out.println("圆的面积是"+s);
		input.close();
	}
//Math.pow(r,2)定义在Java API中 可以直接调用
}
