package project.entity;

import project.service.TextService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {
    private List<String> sentenceList = new ArrayList<>();

    public Sentence(Text text) {
        this.sentenceList = TextService.parseSentence(text);
    }

    public List<String> getSentenceList() {
        return sentenceList;
    }

    public void setSentenceList(List<String> sentenceList) {
        this.sentenceList = sentenceList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(sentenceList, sentence.sentenceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentenceList);
    }

    @Override
    public String toString() {
        return "Sentence{ " + sentenceList + '}';
    }
}
