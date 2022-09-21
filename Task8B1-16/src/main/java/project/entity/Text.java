package project.entity;

import project.service.TextService;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class Text {
    private String text;

    public Text(String fileName) throws IOException {
        String tempText = TextService.readFromFile(fileName);
        this.text = tempText;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text1 = (Text) o;
        return Objects.equals(text, text1.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return "Text{ " + text + '\'' + '}';
    }
}
