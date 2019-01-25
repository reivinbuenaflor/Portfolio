'''
Computes the price of the item/s bought by the user, and output customer details and shipping info
'''

from Order import CustomerOrder

class CustomerShippedOrder:
    def __init__(self,shippingInfo):
        self.shippingInfo = shippingInfo
    
    def computePrice(self):
        CustomerShippedOrder.gettingshipInfo = self.shippingInfo
        CustomerShippedOrder.computePrice = (CustomerOrder.gettingTotalPrice +  CustomerShippedOrder.gettingshipInfo)
        return CustomerShippedOrder.computePrice
    
    def getCustomerDetails(self):
        print("Customer Details and Shipping Info: ")
        print("Customer Name: ", CustomerOrder.gettingCustomerName)
        print("Customer Number: ", "+63",CustomerOrder.gettingCustomerNumber)
        print("Quantity Ordered: ", CustomerOrder.gettingQuantityOrdered)
        print("Unit Price: ", CustomerOrder.gettingUnitPrice)
        print("Shipping Fee: ",  CustomerShippedOrder.gettingshipInfo)
        print("Total Price: ", CustomerShippedOrder.computePrice)

