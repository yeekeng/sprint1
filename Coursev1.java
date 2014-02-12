package studentbooking;

public class Course {
	
	
	private int courseID;
	private String coursename;
	private String lecturername;
	public Course(int courseID, String coursename, String lecturername) {
		super();
		this.courseID = courseID;
		this.coursename = coursename;
		this.lecturername = lecturername;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getLecturername() {
		return lecturername;
	}
	public void setLecturername(String lecturername) {
		this.lecturername = lecturername;
	}

	
	
}
