package projectStudentManage;

public class Students {
	int namsinh, stt;
	double diem1, diem2, diem3;
	String mssv, hoten, gioitinh, lop, email, mon1, mon2, mon3;
	public Students(String mamon, String tenmon, String xeploai, double diembt, double diemkt, double diemck,
			double diemtong) {
		this.mamon = mamon;
		this.tenmon = tenmon;
		this.xeploai = xeploai;
		this.diembt = diembt;
		this.diemkt = diemkt;
		this.diemck = diemck;
		this.diemtong = diemtong;
	}

	String mamon,tenmon,xeploai;
	double diembt,diemkt,diemck,diemtong;
	
	public Students(int stt, String hoten, String mssv,  int namsinh, String gioitinh, String lop, String email, String mon1, double diem1, String mon2, double diem2, String mon3, double diem3) {
		this.stt = stt;
		this.mssv = mssv;
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.namsinh = namsinh;
		this.lop = lop;
		this.email = email;
		this.mon1 = mon1;
		this.diem1 = diem1;
		this.mon2 = mon2;
		this.diem2 = diem2;
		this.mon3 = mon3;
		this.diem3 = diem3;
	}
	
	public Students(String hoten, String mssv, int namsinh, String gioitinh, String lop, String email, String mon1, double diem1, String mon2, double diem2, String mon3, double diem3) {
		this.mssv = mssv;
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.namsinh = namsinh;
		this.lop = lop;
		this.email = email;
		this.mon1 = mon1;
		this.diem1 = diem1;
		this.mon2 = mon2;
		this.diem2 = diem2;
		this.mon3 = mon3;
		this.diem3 = diem3;
	}
	
	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	public String getMssv() {
		return mssv;
	}
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public double getDiem1() {
		return diem1;
	}

	public void setDiem1(double diem1) {
		this.diem1 = diem1;
	}

	public double getDiem2() {
		return diem2;
	}

	public void setDiem2(double diem2) {
		this.diem2 = diem2;
	}

	public double getDiem3() {
		return diem3;
	}

	public void setDiem3(double diem3) {
		this.diem3 = diem3;
	}

	public String getMon1() {
		return mon1;
	}

	public void setMon1(String mon1) {
		this.mon1 = mon1;
	}

	public String getMon2() {
		return mon2;
	}

	public void setMon2(String mon2) {
		this.mon2 = mon2;
	}

	public String getMon3() {
		return mon3;
	}

	public void setMon3(String mon3) {
		this.mon3 = mon3;
	}
	
	public String getMamon() {
		return mamon;
	}

	public void setMamon(String mamon) {
		this.mamon = mamon;
	}

	public String getTenmon() {
		return tenmon;
	}

	public void setTenmon(String tenmon) {
		this.tenmon = tenmon;
	}

	public String getXeploai() {
		if(diemtong <= 2) {
			xeploai = "Rớt môn";
		}else if(diemtong <= 5) {
			xeploai = "Trung bình";
		}else if (diemtong >5 && diemtong <= 6.5) {
			xeploai = "Khá";
		}else {
			xeploai = "Giỏi";
		}
		return xeploai;
	}

	public void setXeploai(String xeploai) {
		this.xeploai = xeploai;
	}

	public double getDiembt() {
		return diembt;
	}

	public void setDiembt(double diembt) {
		this.diembt = diembt;
	}

	public double getDiemkt() {
		return diemkt;
	}

	public void setDiemkt(double diemkt) {
		this.diemkt = diemkt;
	}

	public double getDiemck() {
		return diemck;
	}

	public void setDiemck(double diemck) {
		this.diemck = diemck;
	}

	public double getDiemtong() {
		diemtong = (diembt + diemkt*2 + diemck*3)/6;
		return (double)Math.round(diemtong*100)/100;
	}

	public void setDiemtong(double diemtong) {
		this.diemtong = diemtong;
	}
	
}
