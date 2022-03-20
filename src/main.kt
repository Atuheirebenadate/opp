fun main(){
 var person=Human("joan",22,78)
    person.eat(78)
    println(person.weght)
    var speach=("i love kotlin")
    println(speach)

    var document=records("Atuheire","benadate",1111111134,"benadateatuheire@gmail.com",23455)
    println(document.firstname)
    println(document.password)


}
class Human(var name:String,age:Int,var weght:Int){
    fun eat(foodWeight:Int){
        println("iam eating $foodWeight kgs of food")
        weght+=foodWeight

    }
    fun speak(speach:String){
    }
    }


}
data class records(var firstname:String,var secondname:String,var phonenumber:Int,var email:String,var password:Int){

}


