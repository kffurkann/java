package exceptionThrow;

//Burda önemli olan throws sayesinde StudentException hatasý yani kendi hata türümüzü verebilmek.

public class Test {
	public static void main(String[] args) throws StudentException {// throws exception de olabilir
		Student s = Student.find("12"); // ya trycatch ya da throws kullanýcaksýn.
	}
}
