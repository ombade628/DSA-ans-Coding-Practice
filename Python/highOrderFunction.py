

def square(num):
    return num*num  

def cube(num):
    return num *num * num 

value=5 
print(square(value))
print(cube(value))
 
def operate(num,operation):
    return operation(num)

print(operate(value, square))
print(operate(value, cube))