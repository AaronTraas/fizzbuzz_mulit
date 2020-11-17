# this is an "improvement" upon fizzbuzz_dict, where we don't need
# the transient mutable output buffer variable. Instead, we use a map 
# pattern. Also, no use of global scope sharing here.

def fizzbuzzer(num, replacements):
	return "".join(map(lambda key: replacements[key] if num % key == 0 else "", replacements.keys())) or num

for num in range(1, 101):
	print(fizzbuzzer(num, {
            3: "Fizz",
            5: "Buzz"
        }))