package array04;

public class Array05 {

	public static void main(String[] args) {
		// 자리바꿈
		int a = 10;
		int b = 35;
		int tmp = 0;
		
		tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		// 로또 1~45
		// 배열 45개에 1~45까지 값 넣기
		// for 
		// index번호 랜덤으로 추출하여 자리바꿈하기
		
		int[] lotto = new int[45];
		
		for(int i=0; i<lotto.length; i++) 
			lotto[i] = i+1;
		
		
		for(int i=0; i<6; i++) {
			int index = (int)(Math.random()*45);
			int temp = lotto[i];
			lotto[i] = lotto[index];
			lotto[index] = temp;
		}
		
		for(int i=0; i<6; i++) 
			System.out.print(lotto[i] + ", ");	
		
		System.out.println();
		System.out.println("=====================");
		
		// 중복제거로 6개만 추출
		int lotto2[] = new int[6];
		for(int i=0; i<lotto2.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}			
		}
		
		for(int i=0; i<lotto2.length; i++) {
			System.out.print(lotto[i] + ", ");
		}
	}
}
