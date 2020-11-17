# This is an attempt to make a pure functional version of FizzBuzz.
# The weakness here is the ability to add additional cases, such as 
# "Jazz" for multiples of 7.

def buzz(num):
	return "Buzz" if num % 5 == 0 else ""

def fizz(num):
	return "Fizz" if num % 3 == 0 else ""

for num in range(1, 101):
	print((fizz(num) + buzz(num)) or num)