package assignment0326;
import java.util.Scanner;
public class Pz2_2inputScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����뾶����Բ�����
		Scanner input=new Scanner(System.in);
		System.out.println("������뾶��");
		double r=input.nextDouble();
		double s=Math.pow(r,2)*3.14;//�˴���Ҫ��������
		System.out.println("Բ�������"+s);
		input.close();
	}
//Math.pow(r,2)������Java API�� ����ֱ�ӵ���
}
