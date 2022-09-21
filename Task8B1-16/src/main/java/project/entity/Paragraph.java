package project.entity;

import project.service.TextService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Paragraph {
    private List<String> paragraphList = new ArrayList<>();

    public Paragraph(Text text) {
        this.paragraphList = TextService.parseParagraph(text);
    }

    public List<String> getParagraphList() {
        return paragraphList;
    }

    public void setParagraphList(List<String> paragraphList) {
        this.paragraphList = paragraphList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paragraph paragraph = (Paragraph) o;
        return Objects.equals(paragraphList, paragraph.paragraphList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paragraphList);
    }

    @Override
    public String toString() {
        return "Paragraph{ " + paragraphList + '}';
    }
}
