use std::collections::HashMap;

fn fizzbuzzer(num: i32, replacements: &HashMap<i32, String>) -> String {
    let mut out = String::new();

    for (multiple, replacement) in replacements.into_iter() {
        if num % multiple == 0 {
            out.push_str(replacement);
        }
    }

    if out.is_empty() {
        return num.to_string();
    }

    return out;
}

fn main() {
    let replacements: HashMap<i32, String> = 
        [(3, "Fizz".to_string()),
         (5, "Buzz".to_string())]
        .iter().cloned().collect();

    for num in 1..=100 {
        println!("{}", fizzbuzzer(num, &replacements));
    }
}
