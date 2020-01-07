package zilkiproj;

import java.io.Serializable;

public class Questions implements Serializable,Comparable<Questions>{
	int qno;String q1,ans1,ans2,ans3,wans;

	public Questions(int qno, String q1, String ans1, String ans2, String ans3, String wans) {
		this.qno = qno;
		this.q1 = q1;
		this.ans1 = ans1;
		this.ans2 = ans2;
		this.ans3 = ans3;
		this.wans = wans;
	}

	@Override
	public String toString() {
		return "Questions [qno=" + qno + ", q1=" + q1 + ", ans1=" + ans1 + ", ans2=" + ans2 + ", ans3=" + ans3
				+ ", wans=" + wans + "]";
	}

	public int getQno() {
		return qno;
	}

	public void setQno(int qno) {
		this.qno = qno;
	}

	public String getQ1() {
		return q1;
	}

	public void setQ1(String q1) {
		this.q1 = q1;
	}

	public String getAns1() {
		return ans1;
	}

	public void setAns1(String ans1) {
		this.ans1 = ans1;
	}

	public String getAns2() {
		return ans2;
	}

	public void setAns2(String ans2) {
		this.ans2 = ans2;
	}

	public String getAns3() {
		return ans3;
	}

	public void setAns3(String ans3) {
		this.ans3 = ans3;
	}

	public String getWans() {
		return wans;
	}

	public void setWans(String wans) {
		this.wans = wans;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ans1 == null) ? 0 : ans1.hashCode());
		result = prime * result + ((ans2 == null) ? 0 : ans2.hashCode());
		result = prime * result + ((ans3 == null) ? 0 : ans3.hashCode());
		result = prime * result + ((q1 == null) ? 0 : q1.hashCode());
		result = prime * result + qno;
		result = prime * result + ((wans == null) ? 0 : wans.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Questions other = (Questions) obj;
		if (ans1 == null) {
			if (other.ans1 != null)
				return false;
		} else if (!ans1.equals(other.ans1))
			return false;
		if (ans2 == null) {
			if (other.ans2 != null)
				return false;
		} else if (!ans2.equals(other.ans2))
			return false;
		if (ans3 == null) {
			if (other.ans3 != null)
				return false;
		} else if (!ans3.equals(other.ans3))
			return false;
		if (q1 == null) {
			if (other.q1 != null)
				return false;
		} else if (!q1.equals(other.q1))
			return false;
		if (qno != other.qno)
			return false;
		if (wans == null) {
			if (other.wans != null)
				return false;
		} else if (!wans.equals(other.wans))
			return false;
		return true;
	}
	@Override
	public int compareTo(Questions o) {
		return this.getQno()-o.getQno();
	}
}
