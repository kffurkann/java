package exceptionThrow;

public class Student {

	public Student() {
		System.out.println("��renci bulundu");
	}// throws exception veya aritmetic de olabilir

	public static Student find(String id) throws StudentException {// throws exception de olabilir

		if (id.equals("123"))
			return new Student();
		else
			throw new StudentException("��renci bulunamad�.");// �zel excp. olmal�

	}
//hepsini arithmetic excp da yapabilirsin test s�n�f� dahil

}
