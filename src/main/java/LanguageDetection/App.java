package LanguageDetection;

public class App {
    public static void main(String[] args) {
        var fileProcessor=new FileProcessor();
        String message="I LOVE YOU";
        //System.out.println(fileProcessor.MatchesWords(message));
        var bool= fileProcessor.isEnglish(message);
        System.out.println(bool);
    }
}
