timeHour = float(input("Enter Hour: "))
timeMin = float(input("Enter Min: "))
hourEllap = float(input("Enter hour ellapsed: "))
minEllap = float(input("Enter min ellapsed: "))

currentTimeAsMinutes = timeHour*60 + timeMin
ellapsedTimeAsMinutes = hourEllap*60 + minEllap

finalTimeAsMinutes = currentTimeAsMinutes + ellapsedTimeAsMinutes
finalHour = int(finalTimeAsMinutes/60)
print(finalHour, ':', int(finalTimeAsMinutes%60))