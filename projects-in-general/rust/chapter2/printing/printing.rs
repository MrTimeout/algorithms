pub fn prtng() {
    format!("Hello");
    format!("Hello {}!", "World");
    format!("The number is {}", 1);
    format!("{:?}", (3, 4));
    format!("{value}", value="this is a value");
    format!("{} is from {}", "Brad", "Spain"); 
    println!("{}", format!("{:04}", 42));

    //To convert a single value to a string use the to_string method. This will use the Display
    //formatting trait;
    let _formatted_number = format!("{:.*}", 2, 1.234567); //usize is the number of characters that must have the type.
    let integer: i32 = 10;

    println!(
        "Binary: {:b}\nOctal: {:o}\nHexacedimal: {:x}\nUpperHexadecimal: {:X}", 
        integer, integer, integer, integer
    );

}
