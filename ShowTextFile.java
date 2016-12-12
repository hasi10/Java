import java.io.*;

public class ShowTextFile {
	public static void main(String[] args) {
		String fileName = args[0];
		FileReader inFile = null;

		try{
			inFile = new FileReader(fileName);
			System.out.println("file open...done.");

			int data = 0;
			While((data = inFile.read()) != -1){
				System.out.print((char)data);
			}

			inFile.close();

		} catch (Exception e){
			System.out.println("エラー");
		}
	}
}