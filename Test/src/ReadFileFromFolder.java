import java.io.*;
public class ReadFileFromFolder {
	public static void main(String[] args) {
		String[] tasks = new String[100];
		int amountOfFiles = 0;
		File folderToRead = new File("public");
		File[] fileNamesInTheFolder = folderToRead.listFiles();
		
		amountOfFiles = folderToRead.listFiles().length;
		
		for (int i = 0; i < fileNamesInTheFolder.length; ++i) {
			//System.out.println(fileNamesInTheFolder[i].getName());
			tasks[i] = fileNamesInTheFolder[i].getName().replaceFirst("[.][^.]+$", "");
		}
		
		tasks[amountOfFiles] = "Exit";
		
		for (String task : tasks) {
//			if (task != null) {
//				System.out.println(task);
//			}
			System.out.println(task);
		}
		
		System.out.println("Amount of Files is: "+amountOfFiles);
		
//		for (File fileName : fileNamesInTheFolder) {
//			System.out.println(fileName.getName().replaceFirst("[.][^.]+$", ""));
//		}
	}
}
