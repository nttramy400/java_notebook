package page454;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//buffer
public class ReadATextFile {
	public static void main(String[] args) {
		try {
			File myFile = new File("foo.txt"); //co the truyen vao ten file k ton tai ma khong bao loi

			System.out.println("aaaaaaaaaaaaaaa");
			
			//nen kiem tra file ton tai trc
			FileReader fileReader = new FileReader(myFile);//file k ton tai se bay xuong catch
			BufferedReader reader = new BufferedReader(fileReader);
			
			String line = null, line1 = null;
			while ((line = reader.readLine()) != null || (line1 = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
			
			//String toTest = "What is blue + yellow?/green";
			String toTest = "What is blue + yellow?//green";
			String[] result = toTest.split("/");
			for (String token:result) {
				
				if (token == "") {
					System.out.println("aaaaaaaaaaa");
				}else {
					System.out.println(token);
				}
			}
		}catch(Exception ex) {
			System.out.println("error--------------");
			ex.printStackTrace();
		}
	}
}
