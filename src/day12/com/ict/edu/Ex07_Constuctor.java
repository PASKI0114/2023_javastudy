package day12.com.ict.edu;

public class Ex07_Constuctor {
	private String name = "홍길동";
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	private int sum = 0;
	private double avg = 0.0;
	private String hak = "";
	
	//생성자
	public Ex07_Constuctor() {
		
		
	}
	
	public Ex07_Constuctor(String name) {
		//생성자가 다른 생성자를 호출할수있다. 
		//무조건 첫째줄에서 호출. 
		//생성자 이름대신 this()
		this(70,80,70);
		this.name = name;
	}

	public Ex07_Constuctor(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	

	//총점구하기
	
	public void gSum(int kor, int eng, int avg) {
		sum = kor + eng + math;
		
	}

	public void gSum() {
		sum = kor + eng + math;
		
	}
	
	//평군 구하기
	public void gAvg() {
		avg = (int)(sum/3.0*10)/10.0;
		
	}
	//학점구하기
	public void ghak() {
		if(avg>=90) {
			hak="A";
		}else if(avg>=80) {
			hak="B";
		}else if(avg>=70) {
			hak="C";
		}else {
			hak="F";
		}
		
	}
	
	//출력하는 메서드
	public void prn() {
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}
	
	
	
	
	
	
	
	
	
	
	
}

