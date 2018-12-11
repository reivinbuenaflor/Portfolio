timeHour = float(input("Enter Hour: "))
timeMin = float(input("Enter Min: "))
hourEllap = float(input("Enter hour ellapsed: "))
minEllap = float(input("Enter min ellapsed: "))

timebyHour = round((timeHour + hourEllap))
timebyMin = round((timeMin + minEllap))

print("Time: " , (timebyHour)%60 ,":", (timebyMin)%360)