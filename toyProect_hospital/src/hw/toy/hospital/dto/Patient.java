package hw.toy.hospital.dto;

public class Patient {

	private String name;
	private String birth;
	private char gender;
	private String pNumber;
	private String department;
	private int day;
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}

	


	public Patient(String name, String birth, char gender, String pNumber, String department, int day) {
		super();
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.pNumber = pNumber;
		this.department = department;
		this.day = day;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public char getGender() {
		return gender;
	}

	public void setGnder(char gnder) {
		this.gender = gnder;
	}

	public String getpNumber() {
		return pNumber;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public int getDay() {
		return day;
	}
	
	
	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "환자 이름: "+name +"  생년월일: " + birth +"  성별: "+ gender +"  연락처: "+pNumber+ "  담당과: "+ department+ "   입원일: "+ day +"\n";	

	}



}