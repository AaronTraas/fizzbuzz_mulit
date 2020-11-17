# This is an attempt to build a clean, extensible version of FizzBuzz
# that can add additional cases by adding to the replacement map

replacement_map = {
	3: "Fizz",
	5: "Buzz"
}

def fizzbuzzer(num):
	out = ""
	for key, value in replacement_map.items():
		out += value if num % key == 0 else ""

    # in Python, empty string is false-y
	return out or num 

for num in range(1, 101):
	print(fizzbuzzer(num))