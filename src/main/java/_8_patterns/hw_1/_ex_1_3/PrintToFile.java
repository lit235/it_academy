package _8_patterns.hw_1._ex_1_3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;

public class PrintToFile extends Facade {
    @Override
    void print(String str) {
        try (Writer wr = new FileWriter("1")) {
            wr.append(str);
        }catch (IOException ex){
            throw new UncheckedIOException(ex);
        }
    }
}
