from abc import ABC, abstractmethod

# Abstract class
class Payment(ABC):
    
    @abstractmethod
    def pay(self, amount):
        """Abstract method to be implemented by subclasses"""
        pass

# Concrete class 1
class CreditCardPayment(Payment):
    def pay(self, amount):
        print(f"Processing credit card payment of USD {amount:.2f}")

# Concrete class 2
class CashPayment(Payment):
    def pay(self, amount):
        print(f"Accepting cash payment of USD {amount:.2f}")

# Concrete class 3
class EWalletPayment(Payment):
    def pay(self, amount):
        print(f"Paying USD {amount:.2f} using e-wallet")


# Using the abstraction
def complete_payment(payment_method: Payment, amount):
    payment_method.pay(amount)

import os
os.system('cls')

# Example usage
if __name__ == "__main__":
    payment1 = CreditCardPayment()
    payment2 = CashPayment()
    payment3 = EWalletPayment()

    complete_payment(payment1, 150.65)
    complete_payment(payment2, 80.35)
    complete_payment(payment3, 45.76) 


