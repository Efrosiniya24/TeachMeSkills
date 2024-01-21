package homework31Pattern.Adapter;

public class LanguageAdapter implements Russian {
    English english;

    public LanguageAdapter(English english) {
        this.english = english;
    }

    @Override
    public void sayGoodDay() {
        english.sayGoodDay();
    }
}
