package consolejunk;

import consolejunk.Console;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileConsole implements Console {

        private File file;
        public FileConsole(String fileName){
            file = new File(fileName);
            if(!file.exists()){
                try {
                    boolean created = file.createNewFile();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    @Override
    public void logger(String message) {
        try (PrintWriter out = new PrintWriter(new FileOutputStream(file, true))){
            out.println("[ACT]" + message);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
