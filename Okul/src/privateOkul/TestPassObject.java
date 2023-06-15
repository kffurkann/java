package privateOkul;

public class TestPassObject {
	  /** Main method */
	  public static void main(String[] args) {
	    // Create a Circle object with radius 1
	    CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(2);
	    System.out.println(CircleWithPrivateDataFields.getNumberOfObjects()+" "+myCircle.getRadius());
	    //private olduğu içün get ile çağrıldı. public olsa normal çağırış
	    //ayrıca static olduğu için sınıf ismi ile çağırıldı obje değil.
	    
	    // Print areas for radius 1, 2, 3, 4, and 5.
	    int n = 5;
	    printAreas(myCircle, n); //c = myCircle
	 
	    // See myCircle.radius and times
	    System.out.println("\n" + "Radius is " + myCircle.getRadius());
	    System.out.println("n is " + n);
	  }

	  /** Print a table of areas for radius */
	  public static void printAreas(CircleWithPrivateDataFields c, int times) {//int c gibi düşünüyoruz
	    System.out.println("Radius \t\tArea");
	    while (times >= 1) {
	      System.out.println(c.getRadius() + "\t\t" + c.getArea());
	      c.setRadius(c.getRadius()+1);//double newradius olduğu için 1 var.
	      times--;
	    }
	    
	   


	  }
	}
