fun main() {

    var answer:String

    //do-while loop გამოვიყენე რადგან კოდი ერთხელ მაინც უნდა შესრულებილიყო სანამ ლუპი დამთავრდებოდა
    do {
        var x:Int
        var y:Int

        //X ინპუტის ვალიდაცია
        while (true){
            println("შეიყვანეთ მნიშვნელობა X ცვლადისთვის:")
            val inputX = readln()
            try {
                x = inputX.toInt() //inputX-ს ინტეჯერად გარდაქმნა, რადგან readln() სტრინგს აბრუნებს
                break
            }catch (e: NumberFormatException){ //ექსეფშენ ჰენდლინგი. თუ ვერ მოხერხდება სტრინგის ინტეჯერად გარდაქმნა ამოაგდებს მესიჯს
                println("შეყვანილი მნიშვნელობის დამუშავება ვერ ხერხდება, ხელახლა სცადეთ")
            }
        }
        //Y ინპუტის ვალიდაცია
        while (true){
            println("შეიყვანეთ მნიშვნელობა Y ცვლადისთვის:")
            val inputY = readln()
            try {
                y = inputY.toInt()
                break
            }catch (e: NumberFormatException){
                println("შეყვანილი მნიშვნელობის დამუშავება ვერ ხერხდება, ხელახლა სცადეთ")
            }
        }
        val z: Int = x + y
        println("X და Y ჯამი არის: $z")

        println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>:")
        answer = readln().uppercase()//.uppercase() დავამატე რადგან lowercase y-ზეც ამთავრებდა პროგრამას

    } while (answer == "Y")//ამეორებს ლუპს სანამ პასუხი "Y" იქნება
}