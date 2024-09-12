package com.gn.day24;

public class Solution01 {
	// At our chicken restaurant, when you order chicken, we issue one coupon per chicken.
	// If you collect ten coupons, you can get one free chicken
	// and a coupon will also be issued for the service chicken
	// When the number of chickens ordered chicken is given as a parameter
	// complete the solution function to 
	// return the maximum number of served chickens that can be received
	public int solution(int chicken) {
		// 쿠폰 0개 -> 치킨 1999 먹기 -> 쿠폰 1999
		// 쿠폰 1999개 -> 치킨 199 먹기 -> 남은 쿠폰 9개 + 새 쿠폰 199 = 208개
		// 쿠폰 208개 -> 치킨 20개 먹기 -> 남은 쿠폰 8개 + 새쿠폰 20개 = 28개
		// 쿠폰 28개 -> 치킨 2개 먹기 -> 남은 쿠폰 8개 + 새쿠폰 2개 = 10개
		// 쿠폰 10개 -> 치킨 1개 먹기 -> 남은 쿠폰 0개 + 새쿠폰 1개 = 1개
		int coupon = chicken;
		
		int free = 0;
		while(true) {
			int eat = coupon / 10;
			free += eat;
			coupon -= eat * 10;
			coupon += eat;
			if(coupon/10 == 0)break;
		}
		return free;
//		int eat = chicken / 10;
//		free += eat;
//		coupon -= eat * 10;
//		coupon += eat;
//		
//		System.out.println(free);
//		System.out.println(coupon);
		

	}
	
	public int solution02(int chicken) {
		// 쿠폰 0개 -> 치킨 1999 먹기 -> 쿠폰 1999
		// 쿠폰 1999개 -> 치킨 199 먹기 -> 남은 쿠폰 9개 + 새 쿠폰 199 = 208개

		int coupon = chicken;
		int free = 0;
		free += chicken / 10;
		coupon -= (chicken / 10) * 10;
		coupon += chicken / 10;
		
		System.out.println(free);
		System.out.println(coupon);
		int eat;
		// 쿠폰 208개 -> 치킨 20개 먹기 -> 남은 쿠폰 8개 + 새쿠폰 20개 = 28개
		eat = coupon / 10;
		free += eat;
		coupon -= eat * 10;
		coupon += eat;
		
		System.out.println(free);
		System.out.println(coupon);
		
		// 쿠폰 28개 -> 치킨 2개 먹기 -> 남은 쿠폰 8개 + 새쿠폰 2개 = 10개
		eat = coupon / 10;
		free += eat;
		coupon -= eat * 10;
		coupon += eat;
		
		System.out.println(free);
		System.out.println(coupon);
		
		// 쿠폰 10개 -> 치킨 1개 먹기 -> 남은 쿠폰 0개 + 새쿠폰 1개 = 1개
		eat = coupon / 10;
		free += eat;
		coupon -= eat * 10;
		coupon += eat;
		
		System.out.println(free);
		System.out.println(coupon);
		
		return -1;
	}
	
	
    public int solution01(int chicken) {
    	int answer = chicken;
    	while(chicken / 10 != 0) {
    		System.out.println(chicken +":"+answer);
    		answer += chicken /= 10;
    		System.out.println("뒤 : "+answer);
    	}
    	return answer/10;
//    	chicken %= 10;
//    	int coupon = chicken;
//    	
//    	chicken += coupon / 10 ;
//    	coupon += chicken ;
    	
//    	int coupon = 0; 
//    	int noused = 0 ;
//    	int free = 0 ;
//    	
//    	coupon = chicken;
//    	free = coupon / 10;
//    	noused = chicken % 10 ;
//    	
//    	
//    	free += noused + free / 10;
//    	
//    	System.out.println(coupon);
//    	System.out.println(free);
//    	System.out.println(noused);
    	
    	// 1081 + 108 + 10 + 1
    	// 먹은 건 chicken
    	// 쿠폰 chicken
    	// 쿠폰 / 10 -> 먹은거 추가
    	// 쿠폰 안받은 최초 먹은거 + 먹은거 추가  -> 쿠폰
    	// 쿠폰 / 10 -> 먹은 거 추가
    	
    	
    		
//    	int eat = chicken + ;
//    	int coupon = chicken;
//    	
//    	int service = 0;
//    	
//    	while(chicken / 10 != 0) {
//    		eat = chicken;
//    		coupon = chicken / 10;
//    		chicken /= 10; 
//    	}
//    	1081 -> 108
//    	10 -> 1
//    	1 + 8 +  1 -> 1

    }
}
