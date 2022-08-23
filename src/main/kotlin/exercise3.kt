open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }

}
fun main(){
    val students = ArrayList<Student>()

    students.add(Student("Mihir","Parmar",20,20012021018,"CE","C","AB7"))
    students.add(Student("Jay","Thakkar",20,20012021019,"CE","C","AB7"))
    students.add(Student("Sumit","Chauhan",15,20012011044,"CE","C","AB7"))
    students.add(Student("Vijay","Dabhi",10,20012011054,"CE","C","AB7"))
    students.add(Student("Niraj","Gor",20,20012011042,"CE","C","AB7"))

}