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
		
		ortalamalar.add(1,0.95); //1.indexe alýr
		
		System.out.println("Doðrudan Yazdýrma");
		System.out.println("Ortalama Deðerler = "+ortalamalar);
		System.out.println(ayrac);
		
		System.out.println("For ile Yazdýrma");
		for(int i=0;i<ortalamalar.size();i++) //eleman sayýsý verir
			System.out.println(ortalamalar.get(i));//get içine sadece int deðer alýr.
		System.out.println(ayrac);
		
		System.out.println("ForEach() ile Yazdýrma");
		ortalamalar.forEach((i)->{
			System.out.println(i);
		});
		System.out.println(ayrac);
		
		System.out.println("for(Referans : ArrayListName) ile Yazdýrma");
		for(Object i:ortalamalar)//double yerine geçer aslýnda flutterda var gibidir
			System.out.println(i);
		System.out.println(ayrac);
		
		System.out.println("forEachREamining() ile Yazdýrma");
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
			System.out.println("Temperatures = " + i + " -> " +januaryTemperature.indexOf(i));//içine object
		System.out.println(ayrac);
		System.out.println("get(çaðýrýlan index) access komutu = " + januaryTemperature.get(2));//ulaþýyourz
		System.out.println(ayrac);

		ArrayList<Integer> februaryTemperature = new ArrayList<Integer>();
		
		februaryTemperature.add(14);
		februaryTemperature.add(15);
		februaryTemperature.add(16);
		
		februaryTemperature.addAll(januaryTemperature);//iki arraylisti birleþtirir
		System.out.println("addAll() Komutu = "+februaryTemperature);//yukarýdaki ögeyi direk yazdýramýyoruz
		System.out.println(ayrac);
		boolean TF =februaryTemperature.isEmpty();
		System.out.println(TF);
		System.out.println(ayrac);
		
		februaryTemperature.remove(0);
		Integer a=15;//only Object Class istersen Object yap
		februaryTemperature.remove(a);
		System.out.println("remove(index) komutu = "+ februaryTemperature);
		
		januaryTemperature.remove(0);//geriye dönük etki etmez
		System.out.println(januaryTemperature);
		System.out.println(februaryTemperature);
		System.out.println(ayrac);
		
		boolean varYok = februaryTemperature.contains(14);//object
		System.out.println("Sildiðimiz deðer 14 = "+ varYok);
		System.out.println(ayrac);
		
		januaryTemperature.clear();// = removeAll();
		System.out.println("ArrayListin içini boþaltýr"+januaryTemperature +"   "+
				"Eleman sayýsý = "+januaryTemperature.size());
		System.out.println(ayrac);
///////////////////////////////////////////////////////////////////////////////////////////
		ArrayList<String> renk = new ArrayList<String>();
		renk.add("Sarý");
		renk.add("Kýrmýzý");
		renk.add("Beyaz");
		renk.forEach((i)->{
			System.out.println("Renkler = " +i);
		});System.out.println(ayrac);
		renk.set(0, "Turuncu");
		
		System.out.println("set(int index, Yerine gelen string) change kullanýmý");
		for(Object i: renk)
			System.out.println(i);
		System.out.println(ayrac);
		renk.add("Turuncu");
		renk.add("Mavi");
		renk.add("Turuncu");
		renk.remove("Turuncu");//tek siler
		System.out.println("lastIndexOf kullanýmý = "+renk.lastIndexOf("Turuncu"));
		//birden fazla ayný öðe var ise sonuncu kullanýlan indexi verir.
		System.out.println(ayrac);
/////////////////////////////////////////////////////////////////////////////////////////////		
		System.out.println("En büyük = "+Collections.max(renk));
		System.out.println("En küçük = "+Collections.min(renk));
		Collections.shuffle(renk);//karýþtýrýr------sonrasýnda sabit kalýr yapýlan
		System.out.println("Rastgele sýra = "+renk);
		
		Collections.sort(renk);//sonrasýnda sabit kalýr yapýlan
		System.out.println("Alfabetik sýra = "+ renk);
		System.out.println(ayrac);
/////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("Ýteratör ile ArrayList yazdýrma");
		Iterator<String> renkITR = renk.iterator();//iteratorü açýyoruz
		while(renkITR.hasNext())//iteratorde eleman var mý kontrol ediyoruz. bir eleman var mý daha var mý T/F
			System.out.println(renkITR.next());//elemaný yazdýrýp bir sonraki elemana geçiyoruz
		System.out.println(ayrac);
///////////////////////////////////////////////////////////////////////////////////////////////
		ArrayList<Object> hepsi = new ArrayList<Object>(renk);//boþ arrayliste bu þekilde ekleme yapabiliyoruz
		//ekleme yapmak için veri türleri ayný olmak zorunda
		hepsi.addAll(ortalamalar);
		hepsi.addAll(januaryTemperature);//boþaltmýþtýk
		hepsi.addAll(februaryTemperature);
		System.out.println(hepsi);
		
	}

}
