import math

print("Enter number to be checked:")
n=int(input())
factcount=0
for i in range(2,(int(math.sqrt(n))+1)):
    if n%i==0:
        factcount=1
        break
if factcount==1:
     print('the number is not prime') 
else:
        print('the number is prime')


