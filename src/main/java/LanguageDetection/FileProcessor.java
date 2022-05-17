package LanguageDetection;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileProcessor {

    private List<String> list;
    private FileReader fileReader;
    private BufferedReader bufferedReader;

    public FileProcessor() {
        this.list=new ArrayList<>();
        try {
            getData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getData() throws IOException {
        fileReader=new FileReader(new File("src/main/java/LanguageDetection/english_words.txt"));
        bufferedReader=new BufferedReader(fileReader);

        String line="";
        //I start reading one by one from this file english_words
        //and added to arrayList<>
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

    //this function is going to be maches words along with the file word and given parms
    public int MatchesWords(String message) {
        int count = 0;
        message = message.toUpperCase();
        String[] array = message.split(" ");
           for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < getWords().size(); j++) {
                if (array[i].equals(getWords().get(j)))
                    count++;
            }
        }
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