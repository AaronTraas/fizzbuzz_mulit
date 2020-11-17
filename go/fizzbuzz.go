package main

import "fmt"
import "strconv"

func fizzbuzzer(num int, replacements map[int]string) string {
	out := ""

	for multiple, replacement := range replacements {
		if num%multiple == 0 {
			out += replacement
		}
	}

	// if `out` is empty, there are no replacements; return stringified `num`
	if len(out) == 0 {
		return strconv.Itoa(num)
	}

	return out
}

func main() {
	replacement_map := map[int]string{
		3: "Fizz",
		5: "Buzz",
	}

	for num := 1; num <= 100; num++ {
		fmt.Println(fizzbuzzer(num, replacement_map))
	}
}
