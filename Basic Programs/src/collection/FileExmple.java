package collection;

import java.io.FileReader;
import java.io.IOException;

public class FileExmple {
     
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("D:/myile.txt");
        int character;

        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
        reader.close();
	}
}
