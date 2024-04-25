package main;

public class Main {

	public static void main(String[] args) {
		
		String 이름 = "성지현";
		
		String 선생님 = new String("성지현");
		
		System.out.println(이름 == 선생님);
		
		String 주민번호 = "0706024123456";
		int 성별 = Character.getNumericValue(주민번호.charAt(6));
		System.out.println(성별);
		
		switch (성별) {
		case 1 :
		case 3 :
			System.out.println("남자");
			break;
		case 2 :
		case 4 :
			System.out.println("여자");
			break;
		}
		
		String 변수 = "성,지,현";
		String 배열[] = 변수.split(",");
		
		/*
		System.out.println(배열);
		for (int i = 0; i < 배열.length; i++) {
			System.out.println(배열[i]);
		}
		*/
		
		for (String i : 배열) {
			System.out.println(i);
		}
		
		Human h1 = new Human();
		h1.자기소개();
		
		h1.키 = 162;
		h1.몸무게 = 53;
		h1.이름 = "성지현";
		
		h1.자기소개();
		
		
			
	}

}
