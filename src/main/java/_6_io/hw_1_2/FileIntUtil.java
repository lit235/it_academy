package _6_io.hw_1_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * Создать программно и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.
 */
public class FileIntUtil {
    static void writeRandom(File file, int count) {
        Random random = new Random();
        try (OutputStream outputStream = new FileOutputStream(file,false)) {
            DataOutput out = new DataOutputStream(outputStream);
            for (int i = 0; i < count; i++) {
                out.writeInt(random.nextInt());
            }
            outputStream.flush();
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    static void sort(File file) {
        List<Integer> integerList = new ArrayList<>();
        try (InputStream inputStream = new FileInputStream(file)) {
            DataInput in = new DataInputStream(inputStream);

            long count = file.length() / 4;

            for (long i = 0; i < count; i++) {
                integerList.add(in.readInt());
            }
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }

        //sort
        integerList.sort(Comparator.naturalOrder());

        try (OutputStream outputStream = new FileOutputStream(file,false)){
            DataOutput out = new DataOutputStream(outputStream);
            for (Integer number:integerList){
                out.writeInt(number.intValue());
            }
        }catch (IOException ex){
            throw new UncheckedIOException(ex);
        }
    }

    public static void main(String[] args) {
        FileIntUtil.writeRandom(new File("10"),10);
        FileIntUtil.sort(new File("10"));
    }
}
