package day_5;

public class Student 
{
	private int eid;
	private String sname;
	private String course;
	
	public Student()
	{
		this.eid=200;
		this.sname="Willfard";
		this.course="Java";
				
	}
	public Student (int sid,String sname,String course)
	{
		this();
		this.eid=eid;
		this.sname=sname;
		this.course=course;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [eid=" + eid + ", sname=" + sname + ", course=" + course + "]";
	}

}
