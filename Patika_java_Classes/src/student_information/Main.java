package student_information;

public class Main {

	public static void main(String[] args) {
		Course mat = new Course("CALCULUS", "CAL101", "CAL");
        Course physic = new Course("PHYSIC", "PSY101", "PSY");
        Course chemistry = new Course("CHEMISTRY", "CHEM101", "CHEM");

        Teacher t1 = new Teacher("PROF. VELIEVSKI", "90550000000", "CAL");
        Teacher t2 = new Teacher("DR. AYÞE", "90550000001", "PSY");
        Teacher t3 = new Teacher("PROF. GOBALOV", "90550000002", "CHEM");

        mat.addTeacher(t1);
        physic.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Ahmet Gürsoy", "140144015",4, mat, physic, chemistry);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkMidterm(50,50,50);
        s1.isPass();

        Student s2 = new Student("Juan Alonso", "2211133",4, mat, physic, chemistry);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkMidterm(60,60,60);
        s2.isPass();

        Student s3 = new Student("Adrian Colmar", "221121312",4, mat, physic, chemistry);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkMidterm(70,70,70);
        s3.isPass();

	}

}
