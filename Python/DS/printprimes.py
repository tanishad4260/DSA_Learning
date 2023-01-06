import math

print("low:")
l=int(input())
print("high")
h=int(input())
for n in range(l,h):
    factcount=0
    for i in range(2,(int(math.sqrt(n))+1)):
        if n%i==0:
            factcount=1
            break
    if factcount==0:
        print(n)