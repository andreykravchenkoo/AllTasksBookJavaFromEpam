package Task12.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) {
        PoemService poemService = (poem) -> {
            Pattern pattern = Pattern.compile("(^|[^а-яА-ЯёЁ]+)([яыуаиеоюэЯЫУАИЕОЮЭ])([а-яА-ЯёЁ]*[яыуаиеоюэЯЫУАИЕОЮЭ]|)[^а-яА-ЯёЁ]+");
            Matcher matcher = pattern.matcher(poem);

            int count = 0;

            while (matcher.find()) {
                count++;
            }

            System.out.println("Number of words starting and ending with a vowel count: " + count);
        };

        String poem = "Серые глаза — рассвет,\n" +
                "Пароходная сирена,\n" +
                "Дождь, разлука, серый след\n" +
                "За винтом бегущей пены.\n" +
                "\n" +
                "Чёрные глаза — жара,\n" +
                "В море сонных звёзд скольженье,\n" +
                "И у борта до утра\n" +
                "Поцелуев отраженье.\n" +
                "\n" +
                "Синие глаза — луна,\n" +
                "Вальса белое молчанье,\n" +
                "Ежедневная стена\n" +
                "Неизбежного прощанья.\n" +
                "\n" +
                "Карие глаза — песок,\n" +
                "Осень, волчья степь, охота,\n" +
                "Скачка, вся на волосок\n" +
                "От паденья и полёта.\n" +
                "\n" +
                "Нет, я не судья для них,\n" +
                "Просто без суждений вздорных\n" +
                "Я четырежды должник\n" +
                "Синих, серых, карих, чёрных.\n" +
                "\n" +
                "Как четыре стороны\n" +
                "Одного того же света,\n" +
                "Я люблю — в том нет вины —\n" +
                "Все четыре этих цвета.";

        poemService.letterCounter(poem);
    }
}
