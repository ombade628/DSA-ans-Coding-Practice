def outer():
    print("outer")

    def inner(x):
        print("inner ", x)

    return inner 

function = outer() 
function(5) 