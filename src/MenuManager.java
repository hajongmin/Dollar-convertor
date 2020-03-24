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
		System.out.println("이번달 환율을 입력하세요.");
		double dollarrate = input.nextDouble();
		System.out.print("How much won do you like to exchange?");
		int won = input.nextInt();	
		double dollar = won / dollarrate;   //원화 액수를 달러환율로 나눈 값
		System.out.printf("환전하실 금액 %d원은 %.2f달러입니다.\n", won, dollar);
	}
	
	public static void conversiontowon() {
		Scanner input = new Scanner(System.in);
		System.out.println("이번달 환율을 입력하세요.");
		double dollarrate = input.nextDouble();
		System.out.print("How much dollar do you like to exchange?");
		int dollar = input.nextInt();
		double won = dollar *  dollarrate;  //달러액수를 달러환율과 곱한 값
		System.out.printf("환전하실 금액 %d달러는 %.2f원입니다.\n", dollar, won);
	}
	
	public static void viewrate() {
		Scanner input = new Scanner(System.in);
		double[] RATE = new double[24];//각 달의 환율을 입력하기위해선 12개의 배열만 있으면 되지만 뒤에 나오는 if문에서 RATE[13]과 RATE[23]이 필요하기 때문에 24개를 만들어 줍니다.
		System.out.println("1월 ~ 12월 까지 매달 환율을 입력하세요.");
		
		for(int i = 1 ; i <= 12 ; i++) {     //for반복문을 통해 각 배열에 입력값을 저장합니다.
			double rate = input.nextDouble();
			System.out.println(i + "월 환율 : " + rate );
			RATE[i] = rate;
		}	 
		
		 RATE[13] = RATE[1];  
		 RATE[23] = RATE[11]; 
		
		System.out.println("지금은 몇월 입니까?(숫자만 입력하세요)");
		int month = input.nextInt();         
		
		
		
		if(RATE[month] > RATE[month+1]) {
			double x = (RATE[month]-RATE[month+1]) / RATE[month] ;
			System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 상승했습니다.\n",month,month,x);
			}
			
		else if(RATE[month] < RATE[month+1]) {
			double x = (RATE[month+1]-RATE[month]) / RATE[month] ;
			System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 하락했습니다.\n",month,month,x);
			}
			
		else {
			System.out.printf("%d월 환율은 작년과 동일합니다\n.",month);
			}
				
		if(RATE[month] > RATE[month+11]) {
			double x = (RATE[month]-RATE[month+11]) / RATE[month] ;
			System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 상승했습니다.\n",month,x);
			}
				
		else if(RATE[month+11] > RATE[month]) {
			double x = (RATE[month+11]-RATE[month]) / RATE[month] ;
			System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 하락했습니다.\n",month,x);
			}
				
		else  {
			System.out.printf("%d월 환율은 저번달 환율과 동일합니다.\n",month);
			}
		
		
	}
		
		
}