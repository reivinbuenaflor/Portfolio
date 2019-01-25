#1 Capitalized the 1st and 4th char of a string:

old_mcdonaldcap = 'macdonald'
old_mcdonald = list(old_mcdonaldcap)
old_mcdonald[0],old_mcdonald[3] = old_mcdonald[0].upper(), old_mcdonald[3].upper()
print(''.join(old_mcdonald))
print()

#2 Return a sentence with the words reversed : ex. master_yoda('I am home') -> 'home am I'

master_yodaRev = ['I','am','home']
master_yodaRev.reverse()
print(' '.join(master_yodaRev))
print()

#3 Given an integer n, return True if n is within 10 of either 100 or 200: ex. almost_there(90) -> True

n = 150
if n % 10 == 0:
    print(True)
else:
    print(False)
print()

#4 Given a list of ints, return True if the array contains a 3 next to a 3 somewhere: ex. has_([1,3,3]) -> True

has33 = ([1,3,3]) 
for i in range(len(has33)- 1):
        if has33[i] == 3 and has33[i+1] == 3:
            print(True)
        else:
            print(False)
print()

#5 Given a string, return a string where for every character in the original there are three characters
paper_doll = ['Hello']



#6 Given three integers between 1 and 11, if their sum is less than or equal to 21, return their sum. 
#  If their sum exceeds 21 and there's an eleven, reduce the total sum by 10. Finally, if the sum (even after adjustment) exceeds 21, return 'BUST'

blackjack = [9,9,11]
blackjackRes = blackjack[0] + blackjack[1] + blackjack[2]
if blackjackRes <= 21:
    print(blackjackRes)
elif blackjackRes > 21 and 11 in blackjack:
    blackjackRes-=10
    print(blackjackRes)
else:
    print('BUST')
print()

#7 Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to 
#  the next 9 (every 6 will be followed by at least one 9). Return 0 for no numbers. ex. summer_69(4,5,6,7,8,9) -> 9

summer_69 = [1, 3, 5]
summer_691 = [4, 5, 6, 7, 8, 9] 
summer_69Res = summer_69[0] + summer_69[1] + summer_69[2]
'''
print(summer_69Res)
print()
for x in summer_691:
    if x >=6 and x <=9:
'''        