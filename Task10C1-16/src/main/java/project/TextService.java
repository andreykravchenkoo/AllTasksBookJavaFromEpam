package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextService {

    public static void randomNumbers() {
        try {
            File file = new File("C:\\Users\\Andrey\\IdeaProjects\\Task10C1-16\\Numbers.txt");

            Random random = new Random();
            int[] array = new int[10];

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(20);
            }

            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(Arrays.toString(array) + " ");
            printWriter.println(" ");
            Arrays.sort(array);
            printWriter.println(Arrays.toString(array) + " ");
            printWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void replace() {
        try {
            Path path = FileSystems.getDefault().getPath("Class.txt");
            List<String> list = Files.readAllLines(path);
            String code = "";

            for (String sb : list) {
                code += sb + "\n";
            }

            code = code.replaceAll("public", "private");

            File file = new File("C:\\Users\\Andrey\\IdeaProjects\\Task10C1-16\\Class2.txt");

            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(code);
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reverseLine() {
        try {
            Path path = FileSystems.getDefault().getPath("Text.txt");
            List<String> list = Files.readAllLines(path);

            for (int i = 0; i < list.size(); i++) {
                list.set(i, new StringBuilder(list.get(i)).reverse().toString());
            }

            String result = "";

            for (String str : list) {
                result += str + "\n";
            }

            File file = new File("C:\\Users\\Andrey\\IdeaProjects\\Task10C1-16\\TextReverse.txt");

            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(result);
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void capitalizeSymbol() {
        try {
            Path path = FileSystems.getDefault().getPath("Text.txt");
            List<String> list = Files.readAllLines(path);
            String text = "";

            for (String str : list) {
                text += str + "\n";
            }

            String[] array = text.split("\\s+");

            for (int i = 0; i < array.length; i++) {
                if (array[i].length() > 2) {
                    array[i] = array[i].toUpperCase(Locale.ROOT);
                }
            }

            String result = "";

            for (String str : array) {
                result += str + " ";
            }


            File file = new File("C:\\Users\\Andrey\\IdeaProjects\\Task10C1-16\\TextCapitalize.txt");

            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(result);
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void capitalizeName() {
        try {
            Path path = FileSystems.getDefault().getPath("Grade.txt");
            List<String> list = Files.readAllLines(path);

            double sum = 0;

            File file = new File("GradeResult.txt");
            PrintWriter printWriter = new PrintWriter(file);


            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i).trim().replaceAll("[^0-9]", " ");
                String[] arrayStr = str.trim().split(" ");
                int[] arrayInt = Arrays.stream(arrayStr).mapToInt(Integer::parseInt).toArray();

                sum = Arrays.stream(arrayInt).sum();

                if (sum / arrayStr.length > 7) {
                    printWriter.println(list.get(i).toUpperCase(Locale.ROOT));
                } else {
                    printWriter.println(list.get(i));
                }
            }

            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Pattern findPattern(Type type) {
        Pattern pattern;

        switch (type) {
            case DOUBLE:
                pattern = Pattern.compile("[-]?[0-9]*\\.{1}[0-9]++");
                break;
            case STRING:
                pattern = Pattern.compile("[a-zA-Z]+");
                break;
            case SYMBOL:
                pattern = Pattern.compile("(^|\\s+)\\w(?=\\s+|$)");
                break;
            case INTEGER:
                pattern = Pattern.compile("[0-9]++");
                break;
            default:
                pattern = Pattern.compile("");
        }

        return pattern;
    }

    public static void printAllMatchingData(Type type) {
        try {
            Path path = FileSystems.getDefault().getPath("Type.txt");
            List<String> list = Files.readAllLines(path);
            String result = "";

            for (String str : list) {
                result += str + " ";
            }

            Pattern pattern = findPattern(type);
            Matcher matcher = pattern.matcher(result);

            File file = new File("TypeResult.txt");
            PrintWriter printWriter = new PrintWriter(file);

            while (matcher.find()) {
                printWriter.println(matcher.group());
            }

            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void replaceTab() {
        try {
            Path path = FileSystems.getDefault().getPath("Class3.txt");
            List<String> list = Files.readAllLines(path);
            String code = "";

            for (String sb : list) {
                code += sb + "\n";
            }

                code = code.replaceAll("    ", "");

            File file = new File("Class3Result.txt");

            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(code);
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void replaceComment() {
        try {
            Path path = FileSystems.getDefault().getPath("Class3.txt");
            List<String> list = Files.readAllLines(path);
            String code = "";

            for (String sb : list) {
                code += sb + "\n";
            }

            code = code.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)", "");

            File file = new File("Class4Result.txt");

            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(code);
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void phoneNumbers() {
        Map<String, String> map = new HashMap<>();
        map.put("Andrey", "k32456");
        map.put("Anastasia", "j3951");
        map.put("Danil", "w45523");
        map.put("Elena", "t56341");
        map.put("Vitaliy", "e31444");

        try {
            File file = new File("PhoneNumbers.txt");
            PrintWriter printWriter = new PrintWriter(file);

            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!entry.getValue().isEmpty() && (entry.getValue().charAt(0) == 'k' || entry.getValue().charAt(0) == 'j')) {
                    printWriter.println(entry.getKey() + " " + entry.getValue());
                }
            }

            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
