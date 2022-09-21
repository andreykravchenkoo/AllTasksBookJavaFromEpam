package project.main;

import project.entity.Paragraph;
import project.entity.Sentence;
import project.entity.Text;
import project.entity.Word;
import project.service.TextService;

import java.io.IOException;
import java.util.List;

public class MainClass {
    public static void main(String[] args) throws IOException {
        Text text = new Text("Text.txt");
        System.out.println(text);
        Word word = new Word(text);
        System.out.println(word);
        Sentence sentence = new Sentence(text);
        System.out.println(sentence);
        Paragraph paragraph = new Paragraph(text);
        System.out.println(paragraph);
        TextService.duplicateWord(sentence);
        TextService.sentenceSorted(sentence);
        TextService.wordSortedAlphabet(word);
    }
}
