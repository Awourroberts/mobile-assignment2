fun main() {
    name()
    modulus()
    var add=addition(4,8,10,16)
    println(add)
    interestingFact()

}
fun name(){
    var name="hello Sophie"
    println(name)
}
fun modulus(){
    var a=20
    var b=12
    var result=(a%b)
    println (result)
}
fun addition(num1:Int,num2:Int,num3:Int,num4:Int): Int {
    var addition=num1+num2+num3+num3+num4
    return addition


}
fun interestingFact(){
    var interestingFact=" am curious"
    println (interestingFact)
}