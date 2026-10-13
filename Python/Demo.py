print("hello world: ")

def fact(num):
    if(num <=1): return 1 
    return num*fact(num-1) ; 

print(fact(4))



import sys 
from time import sleep

sys.setrecursionlimit(1000)

def greet(n):
    print("hello")
    print(n)
    # sleep(0.2) ;  
    greet(n+1)

greet(0)  