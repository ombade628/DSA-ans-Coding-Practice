

class computer:
    
    # CLASS VARIABLE : 
    # cpu = "i5"


    # Instance Variable :

    def __init__(self, cpu, ram, rom ):
        self.cpu = cpu 
        self.ram =ram 
        self.rom = rom 
 
    def config(self): 
        print(self.cpu, self.ram, self.rom  ) 

com1 = computer("i5", 8 , 256)
print(com1.cpu) 
com1.ram = 8
com1.config()
com2  =computer("i7", 16 , 512)
com2.config()

com3 = computer("i9", 32 , 1024)

com2.config() 