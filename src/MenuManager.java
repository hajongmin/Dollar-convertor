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
		double dollar = won / dollarrate;
		System.out.printf("환전하실 금액 %d원은 %.2f달러입니다.\n", won, dollar);
	}
	
	public static void conversiontowon() {
		Scanner input = new Scanner(System.in);
		System.out.println("이번달 환율을 입력하세요.");
		double dollarrate = input.nextDouble();
		System.out.print("How much dollar do you like to exchange?");
		int dollar = input.nextInt();
		double won = dollar *  dollarrate;
		System.out.printf("환전하실 금액 %d달러는 %.2f원입니다.\n", dollar, won);
	}
	
	public static void viewrate() {
		Scanner input = new Scanner(System.in);
		double[] RATE = new double[13];; 
		System.out.println("1월 ~ 12월 까지 매달 환율을 입력하세요.");
		
		for(int i = 1 ; i <= 12 ; i++) {
			double rate = input.nextDouble();
			System.out.println(i + "달 환율 : " + rate );
			RATE[i] = rate;
		}	
		System.out.println("지금은 몇월 입니까?(숫자만 입력하세요)");
		int month = input.nextInt();
		
		if(month == 1) 
		{
			int y = 1;
			
			if(RATE[y] > RATE[y+1]) {
				double x = (RATE[y]-RATE[y+1]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,y,x);
				}
			
			else if(RATE[y] < RATE[y+1]) {
				double x = (RATE[y+1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,y,x);
				}
			
			else {
				System.out.printf("%d월 환율은 작년과 동일합니다\n.",month);
				}
				
			if(RATE[y] > RATE[y+11]) {
				double x = (RATE[y]-RATE[y+11]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,x);
					}
				
			else if(RATE[y+11] > RATE[y]) {
				double x = (RATE[y+11]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,x);
				}
				
			else  {
				System.out.printf("%d월 환율은 저번달 환율과 동일합니다.\n",month);
				}
		}
		
		else if(month == 2) 
		{
			
			int y = 2;
			
			if(RATE[y] > RATE[y+1]) {
				double x = (RATE[y]-RATE[y+1]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,y,x);
				}
			
			else if(RATE[y] < RATE[y+1]) {
				double x = (RATE[y+1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,y,x);
				}
			
			else {
				System.out.printf("%d월 환율은 작년과 동일합니다.\n",month);
				}
				
			if(RATE[y] > RATE[y-1]) {
				double x = (RATE[y]-RATE[y-1]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,x);
					}
				
			else if(RATE[y-1] > RATE[y]) {
				double x = (RATE[y-1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,x);
				}
				
			else  {
				System.out.printf("%d월 환율은 저번달 환율과 동일합니다.\n",month);
				}
		}
		
		else if(month == 3) 
		{
			int y = 3;
			
			if(RATE[y] > RATE[y+1]) {
				double x = (RATE[y]-RATE[y+1]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,y,x);
				}
			
			else if(RATE[y] < RATE[y+1]) {
				double x = (RATE[y+1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,y,x);
				}
			
			else {
				System.out.printf("%d월 환율은 작년과 동일합니다.\n",month);
				}
				
			if(RATE[y] > RATE[y-1]) {
				double x = (RATE[y]-RATE[y-1]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,x);
					}
				
			else if(RATE[y-1] > RATE[y]) {
				double x = (RATE[y-1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,x);
				}
				
			else  {
				System.out.printf("%d월 환율은 저번달 환율과 동일합니다.\n",month);
				}
		}
		
		else if(month == 4) 
		{
			int y = 4 ;
			
			if(RATE[y] > RATE[y+1]) {
				double x = (RATE[y]-RATE[y+1]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,y,x);
				}
			
			else if(RATE[y] < RATE[y+1]) {
				double x = (RATE[y+1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,y,x);
				}
			
			else {
				System.out.printf("%d월 환율은 작년과 동일합니다.\n",month);
				}
				
			if(RATE[y] > RATE[y-1]) {
				double x = (RATE[y]-RATE[y-1]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,x);
					}
				
			else if(RATE[y-1] > RATE[y]) {
				double x = (RATE[y-1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,x);
				}
				
			else  {
				System.out.printf("%d월 환율은 저번달 환율과 동일합니다.\n",month);
				}
		}
		
		else if(month == 5) 
		{
			
			int y = 5;
			
			if(RATE[y] > RATE[y+1]) {
				double x = (RATE[y]-RATE[y+1]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,y,x);
				}
			
			else if(RATE[y] < RATE[y+1]) {
				double x = (RATE[y+1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,y,x);
				}
			
			else {
				System.out.printf("%d월 환율은 작년과 동일합니다.\n",month);
				}
				
			if(RATE[y] > RATE[y-1]) {
				double x = (RATE[y]-RATE[y-1]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,x);
					}
				
			else if(RATE[y-1] > RATE[y]) {
				double x = (RATE[y-1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,x);
				}
				
			else  {
				System.out.printf("%d월 환율은 저번달 환율과 동일합니다.\n",month);
				}
		}
		
		else if(month == 6) 
		{
			int y = 6;
			
			if(RATE[y] > RATE[y+1]) {
				double x = (RATE[y]-RATE[y+1]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,y,x);
				}
			
			else if(RATE[y] < RATE[y+1]) {
				double x = (RATE[y+1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,y,x);
				}
			
			else {
				System.out.printf("%d월 환율은 작년과 동일합니다.\n",month);
				}
				
			if(RATE[y] > RATE[y-1]) {
				double x = (RATE[y]-RATE[y-1]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,x);
					}
				
			else if(RATE[y-1] > RATE[y]) {
				double x = (RATE[y-1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,x);
				}
				
			else  {
				System.out.printf("%d월 환율은 저번달 환율과 동일합니다.\n",month);
				}
		}
		
		else if(month == 7) 
		{
			
			int y = 7;
			
			if(RATE[y] > RATE[y+1]) {
				double x = (RATE[y]-RATE[y+1]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,y,x);
				}
			
			else if(RATE[y] < RATE[y+1]) {
				double x = (RATE[y+1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,y,x);
				}
			
			else {
				System.out.printf("%d월 환율은 작년과 동일합니다.\n", month);
				}
				
			if(RATE[y] > RATE[y-1]) {
				double x = (RATE[y]-RATE[y-1]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,x);
					}
				
			else if(RATE[y-1] > RATE[y]) {
				double x = (RATE[y-1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,x);
				}
				
			else  {
				System.out.printf("%d월 환율은 저번달 환율과 동일합니다.\n",month);
				}
		}
		
		else if(month == 8) 
		{
			
			int y = 8;
			
			if(RATE[y] > RATE[y+1]) {
				double x = (RATE[y]-RATE[y+1]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,y,x);
				}
			
			else if(RATE[y] < RATE[y+1]) {
				double x = (RATE[y+1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,y,x);
				}
			
			else {
				System.out.printf("%d월 환율은 작년과 동일합니다.\n",month);
				}
				
			if(RATE[y] > RATE[y-1]) {
				double x = (RATE[y]-RATE[y-1]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,x);
					}
				
			else if(RATE[y-1] > RATE[y]) {
				double x = (RATE[y-1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,x);
				}
				
			else  {
				System.out.printf("%d월 환율은 저번달 환율과 동일합니다.\n",month);
				}
		}
		
		else if(month == 9) 
		{
			
			int y = 9;
			
			if(RATE[y] > RATE[y+1]) {
				double x = (RATE[y]-RATE[y+1]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,y,x);
				}
			
			else if(RATE[y] < RATE[y+1]) {
				double x = (RATE[y+1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,y,x);
				}
			
			else {
				System.out.printf("%d월 환율은 작년과 동일합니다.\n",month);
				}
				
			if(RATE[y] > RATE[y-1]) {
				double x = (RATE[y]-RATE[y-1]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,x);
					}
				
			else if(RATE[y-1] > RATE[y]) {
				double x = (RATE[y-1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,x);
				}
				
			else  {
				System.out.printf("%d월 환율은 저번달 환율과 동일합니다.\n",month);
				}
		}
		
		else if(month == 10) 
		{
			
			int y = 10;
			
			if(RATE[y] > RATE[y+1]) {
				double x = (RATE[y]-RATE[y+1]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,y,x);
				}
			
			else if(RATE[y] < RATE[y+1]) {
				double x = (RATE[y+1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,y,x);
				}
			
			else {
				System.out.printf("%d월 환율은 작년과 동일합니다.\n",month);
				}
				
			if(RATE[y] > RATE[y-1]) {
				double x = (RATE[y]-RATE[y-1]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,x);
					}
				
			else if(RATE[y-1] > RATE[y]) {
				double x = (RATE[y-1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,x);
				}
				
			else  {
				System.out.printf("%d월 환율은 저번달 환율과 동일합니다.\n",month);
				}
		}
		
		else if(month == 11) 
		{
			
			int y = 11;
			
			if(RATE[y] > RATE[y+1]) {
				double x = (RATE[y]-RATE[y+1]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,y,x);
				}
			
			else if(RATE[y] < RATE[y+1]) {
				double x = (RATE[y+1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,y,x);
				}
			
			else {
				System.out.printf("%d월 환율은 작년과 동일합니다.\n",month);
				}
				
			if(RATE[y] > RATE[y-1]) {
				double x = (RATE[y]-RATE[y-1]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,x);
					}
				
			else if(RATE[y-1] > RATE[y]) {
				double x = (RATE[y-1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,x);
				}
				
			else  {
				System.out.printf("%d월 환율은 저번달 환율과 동일합니다.\n",month);
				}
		}
		
		else 
		{
			int y = 12;
			if(RATE[y] > RATE[y-11]) {
				double x = (RATE[y]-RATE[y-11]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,y,x);
				}
			
			else if(RATE[y] < RATE[y-11]) {
				double x = (RATE[y-11]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 작년%d월에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,y,x);
				}
			
			else {
				System.out.printf("%d월 환율은 작년 과 동일합니다.\n",month);
				}
				
			if(RATE[y] > RATE[y-1]) {
				double x = (RATE[y]-RATE[y-1]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 상승했습니다.\n",y,x);
					}
				
			else if(RATE[y-1] > RATE[y]) {
				double x = (RATE[y-1]-RATE[y]) / RATE[y] ;
				System.out.printf("%d월 환율은 저번달에 비해 %.5f퍼센트 만큼 하락했습니다.\n",y,x);
				}
				
			else  {
				System.out.printf("%d월 환율은 저번달과 동일합니다.\n",month);
				}
		}
	}
		
		
}
	
	
	

