package homework31Pattern.Adapter;

public class Main {
    public static void main(String[] args) {
        EnglishText englishText = new EnglishText();
        RussianText russianText = new RussianText();
        System.out.print("Translate: ");
        russianText.sayGoodDay();
        System.out.println("...............");
        LanguageAdapter languageAdapter = new LanguageAdapter(englishText);
        languageAdapter.sayGoodDay();
    }
}
