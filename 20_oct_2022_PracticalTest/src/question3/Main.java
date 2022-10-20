package question3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
public static void main(String[] args) throws IOException
{
    
    String str1 = "It's java program";

    Path fileName = Path.of("F:\\practice/demo.txt");

    Files.writeString(fileName, str1);

    String str2 = Files.readString(fileName);

    System.out.println(str2);
}
	
}

