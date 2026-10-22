class Acount:
    def __init__(self, name, balance):
        self.name = name 
        self.balance = balance 

    def __str__(self):
        return f'{self.name}:{self.balance}'

    def __add__(self, other):
        return Acount('combined',self.balance+ other.balance )


user1 = Acount("om", 13412)
user2 = Acount("jay", 12123)
user3 = Acount("jagdish", 1244)

combined = user1+user2+user3 

print(user1) 
print(user2) 
print(user3)
print(combined)

print(user1.balance) 
print(user2.balance) 
print(user3.balance)
print(combined.balance)