package design_pattern.adapter.translatewords;

public class TranslatorAdapter implements VietnameseTarget {

    private JapaneseAdaptee japaneseAdaptee;

    public TranslatorAdapter(JapaneseAdaptee japaneseAdaptee) {
        this.japaneseAdaptee = japaneseAdaptee;
    }

    @Override
    public void Send(String words) {
        System.out.println("Reading words...");
        System.out.println(words);
        String vietnameseWords = this.translate(words);
        System.out.println("Sending words...");
        japaneseAdaptee.receive(vietnameseWords);
    }

    private String translate(String vietnameseWords) {
        System.out.println("Translated!");
        return "ohaiyo gozaimas";
    }
}
