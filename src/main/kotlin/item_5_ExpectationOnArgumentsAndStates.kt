
//Expectation on arguments
fun factorial(num:Int):Int{
    /**
     * here check if num is positive using require
     * if the num (argument) did not met the expectation
     * @fun require will throw an IllegalArgumentException
     * you can customize this message in curly braces
     * It is good to add this (require) at the beginning of the fun
     *
     */
    require(num>=0){
        "Can not use this num as a parameter in factorial fun"
    }
    return if (num<=1) 1 else factorial(num-1)*num
}
//expectation on states
class User{
    val email:String=""
    val password:String=""
    var isLoggedIn:Boolean=false
    fun login(email:String,password:String){
        //------some code here

        /**
         * As (check) put expectation about local states
         * It may be at last of the fun
         */
        check(isLoggedIn){
            "Can not continue as you are not logged in"
        }
    }
}

fun main() {
    val num = 5
    print(factorial(-1))
}