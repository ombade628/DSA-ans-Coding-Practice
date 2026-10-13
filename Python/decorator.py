

# def devide(a,b):
#     return a/b 

# def sub(a,b):
#     return a-b 

# print(sub(3,4)) 
# print(devide(2,34))


def greatestFirst(func):
    def inner(a,b):
        if(a<b) : 
            a,b = b,a
        return func(a,b) 
    return inner 

@greatestFirst
def devide(a,b):
    return a/b 

@greatestFirst
def sub(a,b):
    return a-b 

print(sub(3,4)) 
print(devide(2,34))

