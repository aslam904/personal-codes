import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ReadTxtFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File folder = new File("D:\\New Folder");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
		  File file = listOfFiles[i];
		  if (file.isFile() && file.getName().endsWith(".txt")) {
		    String content = FileUtils.readFileToString(file);
		    System.out.println(content);
		    System.out.println("===========================================================================================================");
	
		  } 
		}

	}

}