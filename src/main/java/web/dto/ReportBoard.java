package web.dto;

public class ReportBoard {

	private String userid;
	private int regNo;

	@Override
	public String toString() {
		return "ReportBoard [userid=" + userid + ", regNo=" + regNo + "]";
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

}
