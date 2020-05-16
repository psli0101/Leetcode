class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        list = []
        for i in range(n):
            s = str(i+1)
            if (i+1) % 3 == 0 :
                s = "Fizz"
            if (i+1) % 5 == 0 :
                s = "Buzz"
            if (i+1) % 15 == 0 :
                s = "FizzBuzz"
            list.append(s)
        return list