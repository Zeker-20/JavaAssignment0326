package assignment0326;

public class CurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalmillisec=System.currentTimeMillis();
		long totalsec=totalmillisec/1000;
		long currentsec=totalsec%60;
		long totalmin=totalsec/60;
		long currentmin=totalmin%60;
		long totalhour=totalmin/60;
		long currenthour=totalhour%24;
		System.out.println("current time: "+currenthour+":"
				+currentmin+":"+currentsec+" GMT");
		//注意此时求出来的只是GMT格林威治时间
	}

}
