import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteInFile {
    String fileName;
	PrintWriter file;
	public WriteInFile(String fileName){
		try {
			this.fileName = fileName;
			file = new PrintWriter(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void closeFile(){
		file.close();
	}
	public void write(Object setting){
		file.println(setting);
	}
}
