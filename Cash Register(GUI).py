import tkinter as tk
from tkinter.font import Font
from tkinter import messagebox


root = tk.Tk()
total = 0
getTotal = tk.IntVar()
getCash = tk.IntVar()
getChange = tk.IntVar()

def snackList(event=None):
    frame = tk.Toplevel(width=800,height=600,bg="skyblue")
    frame.title("SNACKS")
        
    novaButton = tk.Button(frame, text="NOVA(12php)", command=lambda:getTotalPrice(price=12),width=15, bg="blue")
    font = Font(family="Helvetica", size=15)
    novaButton.configure(font=font)
    novaButton.place(x=100,y=150)

    piatosButton = tk.Button(frame, text="PIATOS(16php)",command=lambda:getTotalPrice(price=16) , width=15, bg="blue")
    font = Font(family="Helvetica", size=15)
    piatosButton.configure(font=font)
    piatosButton.place(x=100,y=230)

    vcutButton = tk.Button(frame, text="V-CUT(12php)",command=lambda:getTotalPrice(price=12) , width=15, bg="blue")
    font = Font(family="Helvetica", size=15)
    vcutButton.configure(font=font)
    vcutButton.place(x=100,y=310)

    skyflakesButton = tk.Button(frame, text="SKYFLAKES(8php)", command=lambda:getTotalPrice(price=8) ,width=15, bg="blue")
    font = Font(family="Helvetica", size=15)
    skyflakesButton.configure(font=font)
    skyflakesButton.place(x=100,y=390)

    combiButton = tk.Button(frame, text="COMBI(8php)",command=lambda:getTotalPrice(price=8) , width=15, bg="blue")
    font = Font(family="Helvetica", size=15)
    combiButton.configure(font=font)
    combiButton.place(x=500,y=150)

    HanselButton = tk.Button(frame, text="HANSEL(6php)",command=lambda:getTotalPrice(price=6) , width=15, bg="blue")
    font = Font(family="Helvetica", size=15)
    HanselButton.configure(font=font)
    HanselButton.place(x=500,y=230)

def dishList(event=None):
    frame = tk.Toplevel(width=800,height=600,bg="skyblue")
    frame.title("DISH")
        
    adoboButton = tk.Button(frame, text="ADOBO(20php)", command=lambda:getTotalPrice(price=20), width=15, bg="blue")
    font = Font(family="Helvetica", size=15)
    adoboButton.configure(font=font)
    adoboButton.place(x=100,y=150)

    sinigangButton = tk.Button(frame, text="SINIGANG(25php)", command=lambda:getTotalPrice(price=25),width=15, bg="blue")
    font = Font(family="Helvetica", size=15)
    sinigangButton.configure(font=font)
    sinigangButton.place(x=100,y=230)

    tinolaButton = tk.Button(frame, text="TINOLA(25php)", command=lambda:getTotalPrice(price=25),width=15, bg="blue")
    font = Font(family="Helvetica", size=15)
    tinolaButton.configure(font=font)
    tinolaButton.place(x=100,y=310)

    menudoButton = tk.Button(frame, text="MENUDO(30php)", command=lambda:getTotalPrice(price=30),width=15, bg="blue")
    font = Font(family="Helvetica", size=15)
    menudoButton.configure(font=font)
    menudoButton.place(x=100,y=390)

    chopsueyButton = tk.Button(frame, text="CHOPSUEY(40php)", command=lambda:getTotalPrice(price=40),width=16, bg="blue")
    font = Font(family="Helvetica", size=15)
    chopsueyButton.configure(font=font)
    chopsueyButton.place(x=500,y=150)

def drinkList(event=None):
    frame = tk.Toplevel(width=800,height=600,bg="skyblue")
    frame.title("DISH")
        
    cocacolaButton = tk.Button(frame, text="SARSI(12php)", command=lambda:getTotalPrice(price=12), width=15, bg="blue")
    font = Font(family="Helvetica", size=15)
    cocacolaButton.configure(font=font)
    cocacolaButton.place(x=100,y=150)

    spriteButton = tk.Button(frame, text="SPRITE(12php)", command=lambda:getTotalPrice(price=12),width=15, bg="blue")
    font = Font(family="Helvetica", size=15)
    spriteButton.configure(font=font)
    spriteButton.place(x=100,y=230)

    nesteaButton = tk.Button(frame, text="NESTEA(18php)", command=lambda:getTotalPrice(price=18),width=15, bg="blue")
    font = Font(family="Helvetica", size=15)
    nesteaButton.configure(font=font)
    nesteaButton.place(x=100,y=310)

    zestoButton = tk.Button(frame, text="ZESTO(8php)", command=lambda:getTotalPrice(price=8),width=15, bg="blue")
    font = Font(family="Helvetica", size=15)
    zestoButton.configure(font=font)
    zestoButton.place(x=100,y=390)

    mineralButton = tk.Button(frame, text="MINERAL(10php)", command=lambda:getTotalPrice(price=10),width=16, bg="blue")
    font = Font(family="Helvetica", size=15)
    mineralButton.configure(font=font)
    mineralButton.place(x=500,y=150)

def extraList(event=None):
    frame = tk.Toplevel(width=800,height=600,bg="skyblue")
    frame.title("EXTRAS")
    
    riceButton= tk.Button(frame, text="RICE(12php)", command=lambda:getTotalPrice(price=12), width=15, bg="blue")
    font = Font(family="Helvetica", size=15)
    riceButton.configure(font=font)
    riceButton.place(x=100,y=150)

    friedriceButton = tk.Button(frame, text="FRIEDRICE(15php)", command=lambda:getTotalPrice(price=15),width=15, bg="blue")
    font = Font(family="Helvetica", size=15)
    friedriceButton.configure(font=font)
    friedriceButton.place(x=100,y=230)

def submitOrder(event=None):
    tk.Toplevel(width=800,height=600,bg="skyblue")
def getTotalPrice(price):
    global total,getTotal
    total += price
    text = str(total)
    getTotal.set(text)
def calculate(event=None):
    global getCash,getChange,total,cash
    cash = getCash.get()
    cash-=total
    text = str(cash)
    getChange.set(text)
     
    if total == 0:
            messagebox.showwarning('Failed', 'Zero total balance')
    elif getCash.get() >= getTotal.get():
        messagebox.showinfo('Success', 'Transaction complete')
        getCash.set(0)
        getChange.set(0)
        getTotal.set(0)
        sales_window = tk.Toplevel()
        sales_window.geometry('300x100')
        tk.Label(sales_window, text='TOTAL CHANGE: {}'.format(cash), font=('Helvetica', 20)).place(relx=0.2, rely=0.3)
    else:
        messagebox.showwarning('Failed', 'Not enough cash')
    
    total = 0

def cancelOrder(event=None):
    global  getTotal, total
    getCash.set(0)
    getChange.set(0)
    getTotal.set(0)
    total = 0

#MAIN WINDOW
mainFrame = tk.Frame(root, width=800, height=600, bg="skyblue")
root.title("FCPC CASH REGISTER")
mainFrame.pack()
title = tk.Label(root, text="FIRST CITY PROVIDENTIAL COLLEGE", bg="blue")
font = Font(family="Helvetica", size=29)
title.configure(font=font)
title.place(x=50, y=50)
        
#BUTTONS
snacksButton = tk.Button(root, text="SNACKS", command=snackList, width=10, bg="blue")
font = Font(family="Helvetica", size=20)
snacksButton.configure(font=font)
snacksButton.place(x=100,y=150,)

dishButton = tk.Button(root, text="DISH", command=dishList, width=10, bg="blue")
font = Font(family="Helvetica", size=20)
dishButton.configure(font=font)
dishButton.place(x=100,y=230)

drinksButton = tk.Button(root, text="DRINKS", command=drinkList, width=10, bg="blue")
font = Font(family="Helvetica", size=20)
drinksButton.configure(font=font)
drinksButton.place(x=100,y=310)

extraButton = tk.Button(root, text="EXTRAS", command=extraList, width=10, bg="blue")
font = Font(family="Helvetica", size=20)
extraButton.configure(font=font)
extraButton.place(x=100,y=390)

#TOTAL
totalLabel = tk.Label(root,textvariable=getTotal,width=8,bg="skyblue")
title = tk.Label(root,text="TOTAL: ",bg="blue",width=8)
totalLabel.place(x=550,y=160)
title.place(x=370,y=160)
font = Font(family="Helvetica", size=25)
totalLabel.configure(font=font)
title.configure(font=font)

#CHANGE
changeLabel= tk.Label(root,textvariable=getChange,width=8,bg="skyblue")
title1 = tk.Label(root,text="CHANGE:",bg="blue")
changeLabel.place(x=550,y=240)
title1.place(x=370,y=240)
font = Font(family="Helvetica", size=25)
changeLabel.configure(font=font)
title1.configure(font=font)
        
        
#CASH
cashLabel = tk.Label(root,text="CASH:", bg="blue",width=8)
cashLabel.place(x=370,y=320)
font = Font(family="Helvetica", size=25)
cashLabel.configure(font=font)
entry1 = tk.Entry(mainFrame,textvariable=getCash ,width=10)
entry1.place(x=550,y=323)
font = Font(family="Helvetica", size=20)
entry1.configure(font=font)

#SUBMIT
submitButton = tk.Button(root, text="SUBMIT", command=calculate, width=14, bg="blue")
font = Font(family="Helvetica", size=15)
submitButton.configure(font=font)
submitButton.place(x=370,y=390)

#CANCEL
cancelButton = tk.Button(root, text="CANCEL", command=cancelOrder, width=12, bg="blue")
font = Font(family="Helvetica", size=15)
cancelButton .configure(font=font)
cancelButton .place(x=561,y=390)

root.mainloop()