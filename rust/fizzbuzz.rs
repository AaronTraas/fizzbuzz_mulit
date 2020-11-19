struct ReplacementMapEntry {
    multiple: i32,
    replacement: &'static str
}

fn fizzbuzzer(num: i32, replacements: &[ReplacementMapEntry]) -> String {
    let mut out = String::new();

    for i in 0..replacements.len() {
        if num % replacements[i].multiple == 0 {
            out.push_str(replacements[i].replacement);
        }
    }

    if out.is_empty() {
        return format!("{}", num);
    }

    return out;
}

pub fn main() {
    let replacements: [ReplacementMapEntry; 2] = [
        ReplacementMapEntry {multiple: 3, replacement: "Fizz"}, 
        ReplacementMapEntry {multiple: 5, replacement: "Buzz"}
    ];
        
    for num in 1..=100 {
        println!("{}", fizzbuzzer(num, &replacements));
    }
}
