package _7_concurrent.hw_1;

import java.io.*;
import java.net.URL;

/**
 * Напишите программу, которая в несколько потоков скачивает файлы по заданному списку URL-адресов.
 * Скачать файл можно например так:
 * BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream())
 */
public class DownloadFile {
    public static void dowload(URL fileUrl) {
        try (InputStream in = new BufferedInputStream(fileUrl.openStream());
             OutputStream out = new BufferedOutputStream(new FileOutputStream(
                     new File("temp", fileUrl.getHost())))) {
            int buf;
            while ((buf = in.read()) > -1) {
                out.write(buf);
            }
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static void downloadFiles(File input) throws IOException {
        String dir = input.getCanonicalPath();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(input)))) {
            String url;

            while ((url = in.readLine()) != null) {
                URL finalUrl = new URL(url);
                new Thread(() -> dowload(finalUrl)).start();
            }
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static void main(String[] args) throws IOException {
        downloadFiles(new File("Url"));
    }
}
