#ref http://www.robindavid.fr/blog/2012/06/15/kasiski-babbage-cryptanalysis-in-python/
def getDivisors(n):
    l=[]
    for i in range(2,n):
        if n % i==0:
            l.append(i);
    return l;
#print(getDivisors());
def getTuples(l):
    res = {}
    freq =[]
    count = 0
    i = 0
    while i < len(l): # Loop through all the list
        elt= l[i:i+3] # Take at least 3-character length for tuples
        long = len(elt)
        if long == 3: #should be 3 if not means we are at the end of the list
            for j in range(i+1,len(l)): #Find further in the list for the same pattern
                if l[i:i+long] == l[j:j+long]: #If match the 3-char check for more
                    while l[i:i+long] == l[j:j+long]:
                        long = long + 1
                    long = long -1
                    elt = l[i:i+long] # Now we have a tuple 
                    diff = j - i # Compute the distance
                    freq.extend(getDivisors(diff)) #Add the divisors to the list 
                    print ("%s\ti:%s\tj:%s\tdiff:%s\t\tDivisors:%s" % (elt,i,j, diff,getDivisors(diff))) #Print information about the tuple (can be deleted)
                    count = count +1
                    j = j + long + 1
            i = i + long -3 +1
        else:
            i = i + 1
    return count, freq
def countOcc(l): # return list with (decimal_char, occ) 
    d={}
    for elt in l:
        if d.has_key(elt):
            d[elt] += 1
        else:
            d[elt] = 1
    return sorted(d.items(),key=lambda x: x[1], reverse=True)
def explode(key,li):
    dic = {}
    for e in range(1,key+1):
        dic[e] = []
    i = 0
    for index in range(len(li)):
        if i == key:
            i = 0
        dic[i+1].append(li[index])
        i = i + 1
    return dic
def recreate(dic):
    i = 0
    output = []
    try:
        while 1:
            for l in dic.values():
                output.append(l[i])
            i = i + 1
    except:
        pass
    return output
res = explode(10, l) #We consider in this exemple a key length of 10 and l the original list
for i in range(1,10+1): #For each sub-list
    occ = countOcc(res[i]) #Make a frequency analysis
    shift = (occ[0][0] - 32) % 256 # Consider the most frequent element of being a space(32 in decimal)
    print ("Frequency analysis for the index: %s\tshift:%s\n%s\n" % (i,shift,occ)) #Print informations (can be deleted)
    res[i] = decipher(res[i],shift) #Try do decipher using a classical ceaser function and the determined shift

final = recreate(res) #Once we have processed all sub-list recreate a list with all the sub-lists.
str= "".join([chr(x) for x in final]) #Print the result
print(str)
