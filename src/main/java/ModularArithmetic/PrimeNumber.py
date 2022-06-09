from math import floor, sqrt


class PrimeNumbers:
    def __init__(self) -> None:
        pass
    def is_Prime(num):
        if num<2:
            return False
        if num==2:
            return True
        if num%2==0:
            return False
        for i in range(3,floor(sqrt(num)),2):
            if num%i==0:
                return False
        return True
if __name__=='__main__':
    print(PrimeNumbers.is_Prime(11))
