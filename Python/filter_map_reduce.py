
from functools import reduce

nums = [2,34,5,6,7,8,4,42,8765,56,85,56,765,65,76,54,45,54,54,74,34,3]

def sum(a,b):
    return a+b

evens = list(filter(lambda n : n%2==0  ,nums))   
odds = list(filter(lambda n : n%2==1  ,nums))    
doubles = list(filter(lambda n:n*2 , evens))
sum = reduce(sum, doubles) 

# arrays.sort(nums)

print (evens)
print(odds)  
print (doubles) 
print (sum )

