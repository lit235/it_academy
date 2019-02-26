package _7_concurrent.hw_1;

import static java.lang.Thread.*;

/**
 * Создайте атрибуты нити. Установите приоритет нити. Запустите нить с указанными атрибутами,
 * распечатайте приоритет и атрибуты нити. Убедитесь, что параметры соответствуют установленным.
 */
public class Atribot {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                System.out.println(currentThread().getName());
                System.out.println(currentThread().getPriority());
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

        sleep(1000);

        thread.setName("My thread");
        thread.setPriority(1);
    }
}
