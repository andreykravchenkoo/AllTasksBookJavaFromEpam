package project;

public class MainClass {
    public static void main(String[] args) {
        TextService.randomNumbers();
        TextService.replace();
        TextService.reverseLine();
        TextService.capitalizeSymbol();
        TextService.capitalizeName();
        TextService.printAllMatchingData(Type.SYMBOL);
        TextService.replaceTab();
        TextService.replaceComment();
        TextService.phoneNumbers();
    }
}
