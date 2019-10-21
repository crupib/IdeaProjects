import decimal
import json
from urllib.request import urlopen

def factorial(n):
    if n < 2:
        return 1
    f = 1
    while n >= 2:
        f *= n
        n -= 1
    return f

cliches = [ "At the end of the day" , "Having said that" ,
            "The fact of the matter is" , "Be that as it may" ,
            "The bottom line is" , "If you will" , ]
print ( cliches [ 3 ])

print(factorial(5))
print(factorial(50))
print(decimal.Decimal(19))
print(decimal.Decimal("1.1"))
c = 5.4+0.8j+2.0+3j
print(type(c))
print(c)
quotes = { "Moe" : "A wise guy, huh?" ,
           "Larry" : "Ow!" ,
           "Curly" : "Nyuk nyuk!" , }
stooge = "Curly"
print ( stooge , "says:" , quotes [ stooge ])


