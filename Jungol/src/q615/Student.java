package q615;

public class Student {
	String[] name;
	int[] kor;
	int[] eng;
	int ptr;
	
	public Student() {
		this.name = new String[2];
		this.kor = new int[2];
		this.eng = new int[2];
		this.ptr = 0;
	}
	
	public void set(String name, int kor, int eng) {
		this.name[this.ptr] = name;
		this.kor[this.ptr] = kor;
		this.eng[this.ptr] = eng;
		this.ptr++;
	}
	
	public void print() {
		int korAvg=0, engAvg=0;
		for (int i=0; i<ptr; i++) {
			System.out.println(this.name[i] + " " + this.kor[i] + " " + this.eng[i]);
			korAvg = korAvg + this.kor[i];
			engAvg = engAvg + this.eng[i];
		}
		System.out.println("avg " + korAvg/this.ptr + " " + engAvg/this.ptr);
	}
	

}
