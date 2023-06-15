package student_information;

public class Student {
	String name, stuNo;
	int classes;
	Course mat;
	Course physic;
	Course chemistry;
	double average;
	boolean isPass;
	public Student(String name, String stuNo, int classes, Course matCourse, Course physic, Course chemistry) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.mat = matCourse;
		this.physic = physic;
		this.chemistry = chemistry;
		calcAverage();
		this.isPass = false;
	}
	
	public void addBulkExamNote(int mat, int psy, int chem) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (psy >= 0 && psy <= 100) {
            this.physic.note = psy;
        }

        if (chem >= 0 && chem <= 100) {
            this.chemistry.note = chem;
        }

    }
	public void addBulkMidterm(int matM, int psyM, int chemM) {

        if (matM >= 0 && matM <= 100) {
            this.mat.midterm = matM;
        }

        if (psyM >= 0 && psyM <= 100) {
            this.physic.midterm = psyM;
        }
        
        if (chemM >= 0 && chemM <= 100) {
            this.chemistry.midterm = chemM;
        }



    }
	public void isPass() {
		if(this.mat.note == 0 || this.physic.note == 0 || this.chemistry.note == 0 ) {
			System.out.println("No notes were entered in the system.");
		} else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("The Average : " + this.average);
            if (this.isPass) {
                System.out.println("Pass the class. ");
            } else {
                System.out.println("Fail the class.");
            }
        }
			
		
	}
	public void calcAverage() {
		this.average=(((this.mat.note*0.80+this.mat.midterm*0.20)+(this.physic.note*0.80+
				this.physic.midterm*0.20)+(this.chemistry.note*0.80+this.chemistry.midterm*0.20))/3);
	}
	public boolean isCheckPass() {
		calcAverage();
		return this.average>55;
	}
	public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Note is : " + this.mat.note);
        System.out.println("Math Midterm is : " + this.mat.midterm);
        System.out.println("Physic Note is : " + this.physic.note);
        System.out.println("Physic Midterm is : " + this.physic.midterm);
        System.out.println("Chemistry Note is : " + this.chemistry.note);
        System.out.println("Chemistry Midterm is : " + this.chemistry.midterm);
    }
}
