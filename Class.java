package main;

class Human {
	// 필드(변수, 속성)
	int 키;
	int 몸무게;
	String 이름;
	
	Human(int 키, int 몸무게, String 이름) {
		this.키 = 키;
		this.몸무게 = 몸무게;
		this.이름 = 이름;
	}
	
	// 메소드(함수, 기능)
	void 자기소개() {
		System.out.printf("제 이름은 %s, 키는 %d, 키는 %d kg입니다. \n", 이름, 키, 몸무게);
	}
	
}