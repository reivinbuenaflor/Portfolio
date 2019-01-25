'''
This is the System that output the table, has input function for user cash, and calculates
the total due of each product bought.
'''

class Drinks:
    def drinkDict(self):
        drinkList = {'Coca Cola':30.00, 'Sprite':31.00, 'Royal Orange':32.00, 'Mountain Dew':35.00, 'Mineral Water':20.00}
        for tableX in drinkList:
            print(tableX , ":" , drinkList[tableX], end='\t') 
        print("\n")
        

class Cash:
    def __init__(self,cash):
        self.cash = cash
    def userCash(self):
        Cash.balance = self.cash
        print("Your Balance is: ")
        print(Cash.balance)
        return Cash.balance

class VendingMachine:
    def __init__(self,drinks):
        self.drinks = drinks
    def vendingMachineSys(self):
        VendingMachine.getUserDrinks = self.drinks
        Drinks.drinkDict
        if  VendingMachine.getUserDrinks == Drinks.drinkDict['Coca Cola']:
            if Cash.balance >= Drinks.drinkDict:
                print("You can now enjoy your ",Drinks.drinkDict)
            else:
                print("Insufficient Balance!")
        else:
            print("Invalid Code!")
        
        
        
       
