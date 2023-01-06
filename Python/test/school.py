def isempty(stack):
	return stack ==[]
def push(stack,data):
	stack.append(data)
	print('Added')
def pop(stack):
	if isempty(stack):
		print('underflow')
	else:
		data = stack.pop()
		print('Data',data,'deleted')
stack=[]
while True:
        option=input('enter from the given options:\n 1> Add employee \n 2>Remove data \n 3>Exit \n')
        if option =='1':
            ename= input('Enter employee name: ')
            enumb= int(input('Enter employee number: '))
            data=[ename,enumb]
        elif option=='2':
            pop(stack)
        elif option=='3':
            break
        else:
            print('Invalid! Enter again')