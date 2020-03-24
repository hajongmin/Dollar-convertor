import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num  = 4;
		while(num !=5 ) {
			
			System.out.println(" -- Dollar Conversion Program  -- ");
			System.out.println("   What do you want to do? " );
			System.out.println(" 1. Conversion to Dollar ");
			System.out.println(" 2. Conversion to Won ");
			System.out.println(" 3. View the Rate of change  ");
			System.out.println(" 4. Show a menu " );
			System.out.println(" 5. Exit the program " );  
			System.out.println(" Selcet one number between 1 ~ 5 :" ); 
			
			num = input.nextInt();
			
			
			if(num == 1) {
				conversiontodolla();
			}
			
			else if(num == 2) {
				conversiontowon();
			}
			
			else if(num == 3) {
				viewrate();
			}
			
			else if(num == 4) {
				continue;
			}
		}

	}
	
	public static void conversiontodolla() {
		Scanner input = new Scanner(System.in);
		System.out.println("�̹��� ȯ���� �Է��ϼ���.");
		double dollarrate = input.nextDouble();
		System.out.print("How much won do you like to exchange?");
		int won = input.nextInt();	
		double dollar = won / dollarrate;   //��ȭ �׼��� �޷�ȯ���� ���� ��
		System.out.printf("ȯ���Ͻ� �ݾ� %d���� %.2f�޷��Դϴ�.\n", won, dollar);
	}
	
	public static void conversiontowon() {
		Scanner input = new Scanner(System.in);
		System.out.println("�̹��� ȯ���� �Է��ϼ���.");
		double dollarrate = input.nextDouble();
		System.out.print("How much dollar do you like to exchange?");
		int dollar = input.nextInt();
		double won = dollar *  dollarrate;  //�޷��׼��� �޷�ȯ���� ���� ��
		System.out.printf("ȯ���Ͻ� �ݾ� %d�޷��� %.2f���Դϴ�.\n", dollar, won);
	}
	
	public static void viewrate() {
		Scanner input = new Scanner(System.in);
		double[] RATE = new double[24];//�� ���� ȯ���� �Է��ϱ����ؼ� 12���� �迭�� ������ ������ �ڿ� ������ if������ RATE[13]�� RATE[23]�� �ʿ��ϱ� ������ 24���� ����� �ݴϴ�.
		System.out.println("1�� ~ 12�� ���� �Ŵ� ȯ���� �Է��ϼ���.");
		
		for(int i = 1 ; i <= 12 ; i++) {     //for�ݺ����� ���� �� �迭�� �Է°��� �����մϴ�.
			double rate = input.nextDouble();
			System.out.println(i + "�� ȯ�� : " + rate );
			RATE[i] = rate;
		}	 
		
		 RATE[13] = RATE[1];  
		 RATE[23] = RATE[11]; 
		
		System.out.println("������ ��� �Դϱ�?(���ڸ� �Է��ϼ���)");
		int month = input.nextInt();         
		
		
		
		if(RATE[month] > RATE[month+1]) {
			double x = (RATE[month]-RATE[month+1]) / RATE[month] ;
			System.out.printf("%d�� ȯ���� �۳�%d���� ���� %.5f�ۼ�Ʈ ��ŭ ����߽��ϴ�.\n",month,month,x);
			}
			
		else if(RATE[month] < RATE[month+1]) {
			double x = (RATE[month+1]-RATE[month]) / RATE[month] ;
			System.out.printf("%d�� ȯ���� �۳�%d���� ���� %.5f�ۼ�Ʈ ��ŭ �϶��߽��ϴ�.\n",month,month,x);
			}
			
		else {
			System.out.printf("%d�� ȯ���� �۳�� �����մϴ�\n.",month);
			}
				
		if(RATE[month] > RATE[month+11]) {
			double x = (RATE[month]-RATE[month+11]) / RATE[month] ;
			System.out.printf("%d�� ȯ���� �����޿� ���� %.5f�ۼ�Ʈ ��ŭ ����߽��ϴ�.\n",month,x);
			}
				
		else if(RATE[month+11] > RATE[month]) {
			double x = (RATE[month+11]-RATE[month]) / RATE[month] ;
			System.out.printf("%d�� ȯ���� �����޿� ���� %.5f�ۼ�Ʈ ��ŭ �϶��߽��ϴ�.\n",month,x);
			}
				
		else  {
			System.out.printf("%d�� ȯ���� ������ ȯ���� �����մϴ�.\n",month);
			}
		
		
	}
		
		
}