package quanlysinhvien;

import java.util.Scanner;

public class sinhvien {
	private String nameSv;
	private int yearSv;
	private String addressSv;
	private float point;
	
	public sinhvien() {
		
	}
	
	public sinhvien(String nameSv, int yearSv, String addressSv, float point) {
		super();
		this.nameSv = nameSv;
		this.yearSv = yearSv;
		this.addressSv = addressSv;
		this.point = point;
	}
	
	public void inputInfo() {
		Scanner input =new Scanner(System.in);		
		
		System.out.println("moi ban nhap ten sv :");
		nameSv=input.nextLine();
		System.out.println("moi ban nhap nam sinh sv :");
		yearSv=input.nextInt();
		input.nextLine();
		System.out.println("moi ban nhap dia chi cho sv :");
		addressSv=input.nextLine();
		System.out.println("moi ban nhap diem sv :");
		point=input.nextFloat();

		
		
	}
	public String getNameSv() {
		return nameSv;
	}
	public void setNameSv(String nameSv) {
		this.nameSv = nameSv;
	}
	public int getYearSv() {
		return yearSv;
	}
	public void setYearSv(int yearSv) {
		this.yearSv = yearSv;
	}
	public String getAddressSv() {
		return addressSv;
	}
	public void setAddressSv(String addressSv) {
		this.addressSv = addressSv;
	}
	public float getPoint() {
		return point;
	}
	public void setPoint(float point) {
		this.point = point;
	}
	
	

}
