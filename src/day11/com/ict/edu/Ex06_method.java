package day11.com.ict.edu;

public class Ex06_method {
	String name;
	int kor;
	int eng;
	int math;
	double avg;
	String hak;
	double sum;
	
	
	// 이름받는 메서드
	public void setName(String k1) {			
		name = k1;
		}
	
	// 한글받는 메서드
	public void setKor(int k2) {			
		kor = k2;
		}
	
	// 영어받는 메서드
	public void setEng(int k3) {			
		eng = k3;
	}
	
	// 수학받는 메서드
	public void setMath(int k4) {			
		math = k4;
	}
	
	//평균, 총점, 학점은 들어와있음.
	
	//이름 영어 국어 수학 받아서 리턴
	public String getName(String k1) {
		return name = k1;
	}
	
	public int getKor(int k2) {
		return kor = k2;
	}
	
	public int getEng(int k3) {
		return eng = k3;
	}
	
	public int getMath(int k4) {
		return math = k4;
	}
	
	//총점을 구하는 메서드
	public double getSum(double scores, double scores2, double scores3) {
		sum = scores+scores2+scores3;
		return sum;
	}
	
	//평균을 구하는 메서드
	public double getAvg(double scores) {
		avg= (int)(scores/3.0*10)/10.0;
		return avg;
	}
	
	//학점을 구하는 메서드
	public String getHak(double avg) {
		if(avg >= 90) {
		    hak = "A";
		}else if(avg >= 80) {
		    hak = "B";
		}else if(avg >= 70) {
		    hak = "C";
		}else{
		    hak = "F";
		}
		return hak;
	}
}
