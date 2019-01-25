'''
Stores User information
'''

class CustomerOrder:
    
    def __init__(self, customerName,customerNumber,quantityOrdered,unitPrice):
        self.customerName = customerName
        self.customerNumber = customerNumber
        self.quantityOrdered = quantityOrdered
        self.unitPrice = unitPrice
    def getCustomerName(self):
        CustomerOrder.gettingCustomerName = self.customerName
    
    def getCustomerNumber(self):
        CustomerOrder.gettingCustomerNumber = self.customerNumber
        
        return CustomerOrder.gettingCustomerNumber
    
    def getQuantityOrdered(self):
        CustomerOrder.gettingQuantityOrdered = self.quantityOrdered
        
        return CustomerOrder.gettingQuantityOrdered
    
    def getUnitPrice(self):
        CustomerOrder.gettingUnitPrice = self.unitPrice
        
        return CustomerOrder.gettingQuantityOrdered
    
    def getTotalPrice(self):
        CustomerOrder.gettingTotalPrice = self.quantityOrdered * self.unitPrice
        
        return CustomerOrder.gettingTotalPrice
    
