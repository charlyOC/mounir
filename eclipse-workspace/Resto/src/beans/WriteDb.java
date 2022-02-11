package beans;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDb {
	
	public void writeDb() {
		FileWriter writer = null;
		try {
			writer = new FileWriter("db.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try(PrintWriter printWriter =
		    new PrintWriter(writer)){

		    printWriter.write("burger " + 6);
		    printWriter.println(); 
		    printWriter.write("pizza ");
		    printWriter.println(9);
		    printWriter.write("kebab ");
		    printWriter.print(6.50);
		   }
	}

}
