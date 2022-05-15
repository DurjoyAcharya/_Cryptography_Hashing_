package LanguageDetection;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileProcessor {
    private List<String> list;
    private FileReader fileReader;
    private BufferedReader bufferedReader;
    public FileProcessor() {
        this.list=new ArrayList<>();
        try {
            getDate();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void getDate() throws IOException {
        fileReader=new FileReader(new File("src/main/java/LanguageDetection/english_words.txt"));
        bufferedReader=new BufferedReader(fileReader);
        String line="";
        while ((line=bufferedReader.readLine())!=null)
        {
            list.add(line.toUpperCase());
        }
        fileReader.close();
        bufferedReader.close();

    }
    public List<String> getWords()
    {
        return this.list;
    }
    public int MatchesWords(String message)
    {
        int count=0;
        message=message.toUpperCase();
        String[] array=new String[message.split(" ").length];
        for (int i = 0; i < array.length; i++) {
            //array[i]=message.split(" ");
        }
        getWords().forEach(e->{

        });

        return count;
    }
    public boolean isEnglish(String message)
    {
        boolean flag=false;
        message=message.toUpperCase();
        int count=message.split(" ").length;
        int matches=MatchesWords(message);
        if (((float)matches/count)*100>=80)
            flag=true;
        return flag;
    }
}