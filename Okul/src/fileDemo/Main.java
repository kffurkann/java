package fileDemo;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//String path ="C:\\Users\\Pc\\Desktop/dosya.txt";
		File file =new File("dosya.txt");//(path) yazarsak bu klasörde oluþur
		
			/*try {
				if(!file.exists())
			file.createNewFile();
			}*//*catch (IOException e) {
				e.printStackTrace();
			}*/
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		String val = "Furkan";
		String val2="gs";
		FileWriter fWriter= new FileWriter(file,false);//true ekleme görevi görür
		//true her runda yazýlarý ekleme yapar
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		bWriter.write(val);
		bWriter.append(val);
		bWriter.write("\nKýlýç");bWriter.newLine();
		bWriter.write(val);bWriter.newLine();
		String valD=String.format("%10s",val2);
		bWriter.write(valD);
		bWriter.write(valD);
		bWriter.close();
		
		 
		
		FileReader fReader= new FileReader(file);
		String line;
		BufferedReader bReader =new BufferedReader(fReader);
		while((line=bReader.readLine()) != null) {
			System.out.println(line);
			//string sýnýfýný buralarda kullanabilriz.
			val2=line.substring(0,3);//logic of computer
		}
		bReader.close();
	}

}
