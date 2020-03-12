package design_pattern.adapter.translatewords;

public class VietnameseClient {
    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.Send("Xin chao");
    }
}
