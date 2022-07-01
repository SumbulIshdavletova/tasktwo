fun main() {

    var likes = 68
    var lastDigit = likes%10

    if (lastDigit==1){
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }

}