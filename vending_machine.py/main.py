'''
This is the main file of the Vending Machine.
'''
from vendingMachineSystem import Drinks
from vendingMachineSystem import Cash
from vendingMachineSystem import VendingMachine

getUserCash = Cash(input("How much money you want to input?: "))
getUserCash.userCash()

table = Drinks()
table.drinkDict()

getUserDrinks = VendingMachine(input("Input the code of the drink/s: "))
getUserDrinks.vendingMachineSys()

