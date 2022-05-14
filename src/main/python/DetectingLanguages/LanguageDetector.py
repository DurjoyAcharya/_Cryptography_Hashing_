English_World=[]
class LanguageDetection:
    def __init__(self) -> None:
        pass
    #Load English Word
    def GetData():
        dictionary=open("english_words.txt","r")
        #Initialize the english world of the list which is present in the file
        #Every word is distinct line so that why we have to split '\n'
        for word in dictionary.read().split("\n"):
            English_World.append(word.upper())
        dictionary.close()
        print(len(English_World))
    def Find(message):
        for word in English_World:
            if(word==message):
                print('Done')
    def Count_Words(message):
        message=message.upper()
        text=message.split(' ')
        count=0;

        for words in text:
            if words in English_World:
                count+=1
        return count
    def isEnglish(text):
        matches=LanguageDetection.Count_Words(text)
        count=len(text.split(' '));
        if((float(matches)/count)*100>=90):
            return True
        else:
             return False
        

if __name__=='__main__':
    LanguageDetection.GetData()
   # LanguageDetection.Find("CAT");
    print(LanguageDetection.Count_Words("I Love You"))
    print(LanguageDetection.isEnglish("Hi This is My Love is kona paul"))
