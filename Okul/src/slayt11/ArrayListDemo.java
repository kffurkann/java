package slayt11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ayrac ="---------------------------------------";
		ArrayList<Double> ortalamalar=new ArrayList<Double>();
		ortalamalar.add(0.15);
		ortalamalar.add(0.45);
		ortalamalar.add(0.25);
		ortalamalar.add(0.85);
		ortalamalar.add(0.35);
		
		ortalamalar.add(1,0.95); //1.indexe al�r
		
		System.out.println("Do�rudan Yazd�rma");
		System.out.println("Ortalama De�erler = "+ortalamalar);
		System.out.println(ayrac);
		
		System.out.println("For ile Yazd�rma");
		for(int i=0;i<ortalamalar.size();i++) //eleman say�s� verir
			System.out.println(ortalamalar.get(i));//get i�ine sadece int de�er al�r.
		System.out.println(ayrac);
		
		System.out.println("ForEach() ile Yazd�rma");
		ortalamalar.forEach((i)->{
			System.out.println(i);
		});
		System.out.println(ayrac);
		
		System.out.println("for(Referans : ArrayListName) ile Yazd�rma");
		for(Object i:ortalamalar)//double yerine ge�er asl�nda flutterda var gibidir
			System.out.println(i);
		System.out.println(ayrac);
		
		System.out.println("forEachREamining() ile Yazd�rma");
		Iterator<Double> yinele = ortalamalar.iterator();
		yinele.forEachRemaining(aktarici->{
			System.out.println(aktarici);
		});
		System.out.println(ayrac);
///////////////////////////////////////////////////////////////////////////////
		ArrayList<Integer> januaryTemperature = new ArrayList<Integer>();
		
		januaryTemperature.add(11);
		januaryTemperature.add(12);
		januaryTemperature.add(13);
		
		for(int i : januaryTemperature)
			System.out.println("Temperatures = " + i + " -> " +januaryTemperature.indexOf(i));//i�ine object
		System.out.println(ayrac);
		System.out.println("get(�a��r�lan index) access komutu = " + januaryTemperature.get(2));//ula��yourz
		System.out.println(ayrac);

		ArrayList<Integer> februaryTemperature = new ArrayList<Integer>();
		
		februaryTemperature.add(14);
		februaryTemperature.add(15);
		februaryTemperature.add(16);
		
		februaryTemperature.addAll(januaryTemperature);//iki arraylisti birle�tirir
		System.out.println("addAll() Komutu = "+februaryTemperature);//yukar�daki �geyi direk yazd�ram�yoruz
		System.out.println(ayrac);
		boolean TF =februaryTemperature.isEmpty();
		System.out.println(TF);
		System.out.println(ayrac);
		
		februaryTemperature.remove(0);
		Integer a=15;//only Object Class istersen Object yap
		februaryTemperature.remove(a);
		System.out.println("remove(index) komutu = "+ februaryTemperature);
		
		januaryTemperature.remove(0);//geriye d�n�k etki etmez
		System.out.println(januaryTemperature);
		System.out.println(februaryTemperature);
		System.out.println(ayrac);
		
		boolean varYok = februaryTemperature.contains(14);//object
		System.out.println("Sildi�imiz de�er 14 = "+ varYok);
		System.out.println(ayrac);
		
		januaryTemperature.clear();// = removeAll();
		System.out.println("ArrayListin i�ini bo�alt�r"+januaryTemperature +"   "+
				"Eleman say�s� = "+januaryTemperature.size());
		System.out.println(ayrac);
///////////////////////////////////////////////////////////////////////////////////////////
		ArrayList<String> renk = new ArrayList<String>();
		renk.add("Sar�");
		renk.add("K�rm�z�");
		renk.add("Beyaz");
		renk.forEach((i)->{
			System.out.println("Renkler = " +i);
		});System.out.println(ayrac);
		renk.set(0, "Turuncu");
		
		System.out.println("set(int index, Yerine gelen string) change kullan�m�");
		for(Object i: renk)
			System.out.println(i);
		System.out.println(ayrac);
		renk.add("Turuncu");
		renk.add("Mavi");
		renk.add("Turuncu");
		renk.remove("Turuncu");//tek siler
		System.out.println("lastIndexOf kullan�m� = "+renk.lastIndexOf("Turuncu"));
		//birden fazla ayn� ��e var ise sonuncu kullan�lan indexi verir.
		System.out.println(ayrac);
/////////////////////////////////////////////////////////////////////////////////////////////		
		System.out.println("En b�y�k = "+Collections.max(renk));
		System.out.println("En k���k = "+Collections.min(renk));
		Collections.shuffle(renk);//kar��t�r�r------sonras�nda sabit kal�r yap�lan
		System.out.println("Rastgele s�ra = "+renk);
		
		Collections.sort(renk);//sonras�nda sabit kal�r yap�lan
		System.out.println("Alfabetik s�ra = "+ renk);
		System.out.println(ayrac);
/////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("�terat�r ile ArrayList yazd�rma");
		Iterator<String> renkITR = renk.iterator();//iterator� a��yoruz
		while(renkITR.hasNext())//iteratorde eleman var m� kontrol ediyoruz. bir eleman var m� daha var m� T/F
			System.out.println(renkITR.next());//eleman� yazd�r�p bir sonraki elemana ge�iyoruz
		System.out.println(ayrac);
///////////////////////////////////////////////////////////////////////////////////////////////
		ArrayList<Object> hepsi = new ArrayList<Object>(renk);//bo� arrayliste bu �ekilde ekleme yapabiliyoruz
		//ekleme yapmak i�in veri t�rleri ayn� olmak zorunda
		hepsi.addAll(ortalamalar);
		hepsi.addAll(januaryTemperature);//bo�altm��t�k
		hepsi.addAll(februaryTemperature);
		System.out.println(hepsi);
		
	}

}
