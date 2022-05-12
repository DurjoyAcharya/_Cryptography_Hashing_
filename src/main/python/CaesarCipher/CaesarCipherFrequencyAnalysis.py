import matplotlib.pylab as plt

#these are the letter  are inhterested in when dealing with frequency-analysis
#white space letter is most frequent letter in english alphabet
ALPHABET=" ABCDEFGHIJKLMNOPQRSTUVXYZ"

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
if __name__=='__main__':
    object= Frequency_Analysis;
    plan='Durjoy Acharya'
    frequency=object.frequency_analysis(plan)
    object.frequency_distribution(frequency)
