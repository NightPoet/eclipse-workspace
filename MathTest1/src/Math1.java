
public class Math1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int calendar[] = new int[365];
		calendar[0] = 1;
		calendar[1] = 1;
		calendar[2] = 1;
		calendar[3] = 1;
		
		for (int i=4;i < calendar.length; i++) {
			if (calendar[i-1] + calendar[i-2] + calendar[i-3] >=2) {
				calendar[i] = 0;
			} else {
				calendar[i] = 1;
			}
		}
		
		int sum = 0;
		for (int i=0;i < calendar.length; i++) {
			sum += calendar[i];
			System.out.println("第" + (i+1) + "天：" +calendar[i]);
			
		}
		
		System.out.println(sum);
	}

}
