package exceptionThrow;

//Burda �nemli olan throws sayesinde StudentException hatas� yani kendi hata t�r�m�z� verebilmek.

public class Test {
	public static void main(String[] args) throws StudentException {// throws exception de olabilir
		Student s = Student.find("12"); // ya trycatch ya da throws kullan�caks�n.
	}
}
