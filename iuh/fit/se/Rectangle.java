package iuh.fit.se;

/**
 * @description TODO
 * @author Le Minh Sang
 * @version 1.0
 * @created 2-Sep-2025 2:15:20 PM
 */

public class Rectangle {
	private double length;
	private double width;
	
	//Constructor
	public Rectangle(double length, double width) {
		setChieuDai(length);
		setChieuRong(width);
	}

	public Rectangle() {
		this(0,0);
	}

	//getter va setter
	public double getChieuDai() {
		return length;
	}

	public void setChieuDai(double length) {
		if(length < 0) {
			throw new IllegalArgumentException("Chieu dai khong duoc am!");
		}
		this.length = length;
	}

	public double getChieuRong() {
		return width;
	}

	public void setChieuRong(double width) {
		if(width< 0) {
			throw new IllegalArgumentException("Chieu rong khong duoc am!");
		}
		this.width = width;
	}
	
	//Chu vi va Dien Tich
	public double ChuVi() {
		return (length + width)*2;
	}
	public double DienTich() {
		return length*width;
	}
	
	//toString
	@Override
		public String toString() {
			return String.format("Hinh chu nhat co [chieu dai = %.2f, chieu rong = %.2f] co C = %.2f va S = %.2f",length, width,ChuVi(), DienTich());
		}
	
	
}

	