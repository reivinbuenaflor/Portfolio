#1 Ans:
sum1 = ([1,2,3])
sum2 = ([5,11,2])
sum3 = ([7,0,0])

resultSum1 = sum1[0] + sum1[1] + sum1[-1]
print(resultSum1)

resultSum2 = sum2[0] + sum2[1] + sum2[-1]
print(resultSum2)

resultSum3 = sum3[0] + sum3[1] + sum3[-1]
print(resultSum3)
print()
#2 Ans:
not_string1 = 'candy'
not_string2 = 'x'
not_string3 = 'bad'

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
#3 Ans:
sorta_sum1 = [3,4]
sorta_sum2 = [9,4]
sorta_sum3 = [10,11]

result1 = sorta_sum1[0] + sorta_sum1[1]
if result1 >= 10 and result1 <= 19:
    print(20)
else:
    print(result1)

result2 = sorta_sum2[0] + sorta_sum2[1]
if result2 >= 10 and result2 <= 19:
    print(20)
else:
    print(result2)

result3 = sorta_sum3[0] + sorta_sum3[1]
if result3 >= 10 and result3 <= 19:
    print(20)
else:
    print(result3)
print()

#4:
speed = int(input('Input the speed: '))
birthday = input('Is it his/her birthday?: ')

if birthday == 'Yes' or birthday == 'yes':
    if speed == 60 or speed < 60:
        ticket = 0 
        print( ticket, 'No ticket')
    elif speed >= 61 and speed <= 81:
        ticket = 1
        print(ticket, 'Small ticket')
    elif speed > 81:
        ticket = 2 
        print(ticket, 'Big ticket')
else:
    ticket = 5
    print(ticket,'Bigger ticket')
print()

#5 Ans:
sum1 = ([1,2,3]) 
sum1Len = len(sum1)
sum2 = ([1,1]) 
sum2Len = len(sum2)
sum3 = ([1,1,1,1]) 
sum3Len = len(sum3)

if sum1Len < 2:
    result1 = sum1[0] + sum1[0]
else:
    result1 = sum1[0] + sum1[1]
print(result1)

if sum2Len < 2:
    result2 = sum2[0] + sum2[0]         
else:
    result2 = sum2[0] + sum2[1]
print(result2)

if sum3Len < 2:
    result3 = sum3[0] + sum3[0]
else:
    result3 = sum3[0] + sum3[1]
print(result3)
