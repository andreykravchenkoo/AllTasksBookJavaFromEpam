package project.entity;

import project.service.TextService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Word {
    private List<String> wordList = new ArrayList<>();

    public Word(Text text) {
        this.wordList = TextService.parseWord(text);
    }

    public List<String> getWordList() {
        return wordList;
    }

    public void setWordList(List<String> wordList) {
        this.wordList = wordList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(wordList, word.wordList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wordList);
    }

    @Override
    public String toString() {
        return "Word{ " + wordList + '}';
    }
}
