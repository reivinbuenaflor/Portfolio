'''
The Main file that allows the user to input order information and output the Shipping Information
'''

from Order import CustomerOrder
from ShippedOrder import CustomerShippedOrder

getUserInfo = CustomerOrder(
input("Enter your name: "),
int(input("Enter your number: ")),
int(input("How many item/s you want to order?: ")),
float(input("What is the price of the item/s ordered?: "))
)
print()

getUserInfo.getCustomerName()
getUserInfo.getCustomerNumber()
getUserInfo.getQuantityOrdered()
getUserInfo.getUnitPrice()
getUserInfo.getTotalPrice()

getShippingInfo = CustomerShippedOrder(4.00)
getShippingInfo.computePrice()
print()

getShippingInfo.getCustomerDetails()