fun main(args: Array<String>) {

    var answer:String
    do { //do-while loop გამოვიყენე რადგან კოდი ერთხელ მაინც უნდა შესრულებილიყო სანამ ლუპი დამთავრდებოდა
        println("შეიყვანეთ მნიშვნელობა X ცვლადისთვის")
        val inputX = readln()
        val X = inputX.toInt() //toInt ფუნქციის გამოყენება საჭიროა რადგან readline() ინპუტად სტრინგს იღებს

        println("შეიყვანეთ მნიშვნელობა Y ცვლადისთვის")
        val inputY = readln()
        val Y = inputY.toInt()

        val Z: Int = X + Y
        println("X და Y ჯამი არის: ${Z}")

        println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>")
        answer = readln()

    } while (answer == "Y")//ამეორებს ლუპს სანამ პასუხი "Y" იქნება, "N"-ს შემთხვევაში ლუპიდან გამოვა და პროგრამა დასრულდება
}