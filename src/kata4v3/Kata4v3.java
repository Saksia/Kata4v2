package kata4v3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Kata4v3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String from = "C:\\Users\\usuario\\Desktop\\mail.txt";
        String to = "C:\\Users\\usuario\\Desktop\\mail (1).txt";
        InputStream input = new BufferedInputStream(new FileInputStream(new File(from)));
        OutputStream output = new BufferedOutputStream(new FileOutputStream(new File(to)));
        long start = System.currentTimeMillis();
        byte [] buffer = new byte [1024];
        while(true){
            int read = input.read();
            if(read < 0) break;
            output.write(read);
            output.write(buffer);
        }
        System.out.println(System.currentTimeMillis()-start);
        input.close();
        output.flush();
        output.close();
    }
    
}
