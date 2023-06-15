package student_information;

public class Course {
	
		Teacher courseTeacher;
		String name;
		String code;
		String prefix;
		int note;
		int midterm;
		public Course(String name, String code, String prefix) {
			this.name = name;
			this.code = code;
			this.prefix = prefix;
		}
		public void addTeacher(Teacher t) {
			if(this.prefix.equals(t.branch)) {
				this.courseTeacher=t;
				System.out.println("Successful");
			}
			else {
				System.out.println(t.name+" can't handle this lesson!!");
			}
			
		}
		public void printTeacher() {
			if(courseTeacher!=null) {
				System.out.println(courseTeacher.name +" academician of the course "+this.name);
			}
			else {
				 System.out.println(" No academician has been assigned to the course " + this.name);
			}
			
		}
		
	

}
