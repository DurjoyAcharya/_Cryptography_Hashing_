import matplotlib.pylab as plt

#these are the letter  are inhterested in when dealing with frequency-analysis
#white space letter is most frequent letter in english alphabet
ALPHABET="ABCDEFGHIJKLMNOPQRSTUVXYZ"

class Frequency_Analysis:
    def __init__(self) -> None:
        pass
    def frequency_analysis(text):
        text=text.upper()
        letter_frequency={}
        for letter in ALPHABET:
            letter_frequency[letter]=0
        for letter in text:
            if letter in ALPHABET:
                letter_frequency[letter]+=1
        return letter_frequency
    def frequency_distribution(frequency):
        plt.bar(frequency.keys(),frequency.values())
        plt.show()
    def CeaserCrack(ceasertext):
       frequency = Frequency_Analysis.frequency_analysis(ceasertext)
       freq=sorted(frequency.items(),key=lambda x:x[1],reverse=True)
       print(freq)
       print("Possible Key: %s" % (ALPHABET.find(freq[0][0])-ALPHABET.find(' ')))
    #    Frequency_Analysis.frequency_distribution(frequency)

if __name__=='__main__':
     Ceaser="NEQT JECTZ"
    #Frequency_Analysis.CeaserCrack("I LOVE YOU")
     Frequency_Analysis.CeaserCrack(Ceaser)
    # Frequency_Analysis.CeaserCrack("NEQT JECTZ")
    # Frequency_Analysis.CeaserCrack("I LOVE YOU")
    # object= Frequency_Analysis;
    # plan='Durjoy Acharya'
    # frequency=object.frequency_analysis(plan)
    # object.frequency_distribution(frequency)
