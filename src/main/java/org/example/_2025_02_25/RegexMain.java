package org.example._2025_02_25;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {
    public static void main(String[] args) {
        String string = "Иван Иванович купил 3 яблока по цене 25.50 рубля за штуку. В магазине 1234567890123456 также были груши (4 штуки)," +
                " но они стоили 30.75 рубля. 21:35:54 Он решил яблоки оплатить картой Mastercard с номером 1234-5678-9012-3456. " +
                "В тот же led.rom.93@gmail.pl день он груша отправил 1234 5678 9012 3456 email другу на адрес ivan_ivanov@example.com, " +
                "а также зашёл на сайт https://shop.example.ru. Вечером в 19:45 он позвонил http://shop.asdgadfgg.ru по номеру +7 (495) 123-45-67, " +
                "чтобы заказать доставку.";

        String string1 = "лимонный торт лимонный пирог лимонный сок";

//        Pattern pattern = Pattern.compile("\\d+\\.\\d+"); // паттерн для цены
//        Pattern pattern = Pattern.compile("\\d{1,2}:\\d{2}(:\\d{2})?"); // паттерн для времени
//        Pattern pattern = Pattern.compile("\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}"); // паттерн для номера карты
//        Pattern pattern = Pattern.compile("\\+[\\d\\s-()]{7,}"); // паттерн для номера телефона
//        Pattern pattern = Pattern.compile("\\+[\\d\\s-()]{7,}"); // паттерн для номера телефона
//        Pattern pattern = Pattern.compile("[\\w.]{6,}@[A-z\\d]{3,}\\.(ru|com|de|pl)"); // паттерн для емейла
//        Pattern pattern = Pattern.compile("https?://[A-Za-z._\\d]+"); // паттерн для сайта
//        Pattern pattern = Pattern.compile("[А-Я][а-я]+\\s[А-Я][а-я]+"); // паттерн для имени отчества
//        Pattern pattern = Pattern.compile("(яблок([иао])|груш([аи]))"); // паттерн для определённых товаров
//        Pattern pattern = Pattern.compile("\\d+\\.?\\d+"); // паттерн для определённых товаров
//        Pattern pattern = Pattern.compile("лимонный(?= пирог)"); // положительный случай после слова
//        Pattern pattern = Pattern.compile("лимонный(?! пирог)"); // отрицательный случай после слова
//        Pattern pattern = Pattern.compile("(?<=пирог )лимонный"); // положительный перед
//        Pattern pattern = Pattern.compile("(?<!пирог )лимонный"); // отрицательный перед
        Pattern pattern = Pattern.compile("(?<=\\+7 )[()\\s-\\d]+");
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Совпадение на индексе " + matcher.start() + " - " + matcher.end() + " : " + matcher.group());
        }

/*        String s = "Егор Алла Александра";

        System.out.println(s.matches("[А-Яа-я\\s]+"));
        String[] strings = s.split("\\.");
        System.out.println(Arrays.toString(strings));*/
    }
}
