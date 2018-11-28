userAccount = ['']
for acc in userAccount:
    addAcc = input("Do you want to add an Account? Y/N")
    if addAcc == "y" or addAcc == "Y":
        userAccount.append(input("Enter your name: "))
        print("You add: ")
        print(userAccount)
        continue
    else:
        exit()
