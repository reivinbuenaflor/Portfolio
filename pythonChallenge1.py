#Given a string, return a new string where "not" has been added to the front. However, if the string already begins with "not", return the string unchanged.
#ex. output:
#not_string('Candy') -> "not candy", not_string('x') -> "not x", not_string('not bad') -> "not bad"
not_string1 = 'Candy'
not_string2 = 'x'
not_string3 ='not bad'

if not_string1[0] == 'not':
    print(not_string1)
else:
    print('not',not_string1)

if not_string2[0] == 'not':
    print(not_string2)
else:
    print('not',not_string2)

if not_string3[0] == 'not':
    print(not_string3)
else:
    print('not',not_string3)
print()

#Given a string, return a new string where the first and last chars have been exchanged.
#ex. output front_back('code') -> 'eodc', front_back('a') -> 'a', front_back('ab') -> 'ba'
front_back1 = 'code'
front_back2 = 'a'
front_back3 = 'ab'

frontBack = list(front_back1)

frontBack[0], frontBack[-1] = frontBack[-1],frontBack[0]
print(''.join(frontBack))

frontBack = list(front_back2)

frontBack[0], frontBack[-1] = frontBack[-1],frontBack[0]
print(''.join(frontBack))

frontBack = list(front_back3)

frontBack[0], frontBack[-1] = frontBack[-1],frontBack[0]
print(''.join(frontBack))
print()

#When squirrels get together for a party, they like to have cigars. A squirrel party is successfull
#when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case 
#there is no upper bound on the number of cigars. Return True if the party with given values is succ-
#essfull, or False ortherwise.
#ex. output cigar_party(30,False) -> False, cigar_party(50,False) -> True, cigar_party(70,True) -> True
cigar_party1 = 30
cigar_party2 = 50
cigar_party3 = 70

if cigar_party1 >= 40:
    print(True)
else:
    print(False)

if cigar_party2 >= 40:
    print(True)
else:
    print(False)

if cigar_party2 >= 40:
    print(True)
else:
    print(False)
print()

#We have two monkeys, A and B, and the parameters a_smile and b_smile indicate if each is smiling.
#We are in trouble if they are both smiling or if neither of them is smiling. Return True if we are in trouble.
#ex. output monkey_trouble(True,True) -> True, monkey_trouble(False,False) -> True, monkey_trouble(True,False) -> False

def monkey_trouble(monkeySmile_A,monkeySmile_B):
   if monkeySmile_A == monkeySmile_B:
       print(True)
   else:
        print(False)

monkey_trouble(True,True)
monkey_trouble(False,False)
monkey_trouble(False,True)
