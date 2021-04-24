


fun main() {
numbers()
    println(arrayNames(arrayOf("sara","julie","Sandara","Shadya","John")))
    Robortdrinks(3)
    Robortdrinks(7)
    Robortdrinks(20)
    fizzbuzz()
}
fun numbers(){
    for (number in 1..100) {
        if (number % 2 == 1) {
            println(number)
        }
    }
}
fun arrayNames(arraynames:Array<String>):Int{
    var count=0;
    for (name in arraynames){
        if (name.length>5){
            count++;
        }
    }
    return count

}
fun Robortdrinks(age:Int) {
    if (age < 6) {
        println("glass of milk")
    }
    else if(age>6 && age<15){
        println("fanta orange")
    }
    else{
        println("coca cola")
    }
}
fun fizzbuzz(){
    for (num in 1..100){
        if (num % 3==0 &&num%5==0){
            println("fizz buzz")

        }
        else if(num % 3==0){
            println("fizz")
        }
        else if (num % 5==0){
            println("buzz")
        }
        else{
            println(num)
        }
    }
}