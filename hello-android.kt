fun main() {
   println(birthdayGreeting( age = 5))
   println()
   println(birthdayGreeting(age = 2, name = "Rex"))
   println()
   println(newMessage())
   println()
   println(discount())
   println()
   println(partySize())
   println()
   println(bonus())
   println()
   println(nums())
   println()
   val operatingSystem = "ChromeOS"
   val emailId = "sample@gmail.com"
   println(displayAlertMessage(operatingSystem, emailId))
   println()
   val steps: Int = 4000
   val caloriesBurned = pedometerStepsToCalories(steps);
   println()
   println("Walking $steps steps burns $caloriesBurned calories")
   println()
   println(timeSpent(spentToday = 300, spendYesterday = 250))
   println()
   println(timeSpent(spentToday = 300, spendYesterday = 300))
   println()
   println(timeSpent(spentToday = 200, spendYesterday = 220))
   println()
   println(weatherUpdate(city = "Ankara", lowTemp = 27, highTemp = 31, rainChance = 82))
   println()
   println(weatherUpdate(city = "Tokyo", lowTemp = 32, highTemp = 36, rainChance = 10))
   println()
   println(weatherUpdate(city = "Cape Town", lowTemp = 59, highTemp = 61, rainChance = 2))
   println()
   println(weatherUpdate(city = "Guatemala City", lowTemp = 50, highTemp = 55, rainChance = 7))
   println()
}

fun birthdayGreeting(name: String = "Rover", age: Int): String {
   return "Happy Birthday, $name! You are now $age years old!"
}

fun newMessage(): String {
   return "New chat message from a friend"
}

fun discount(): String {
   var discountPercentage: Int = 0
   var offer: String = ""
   val item = "Google Chromecast"
   discountPercentage = 20
   offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

   return offer
}

fun partySize(): String {
   val numberOfAdults: Int = 20
   val numberOfKids: Int = 30
   val total: Int = numberOfAdults + numberOfKids
   return("The total party size is: $total")
}

fun bonus(): String {
   val baseSalary: Int = 5000
   val bonusAmount: Int = 1000
   val totalSalary = baseSalary + bonusAmount
   return("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

fun nums(): Int {
   val firstNumber: Int = 10
   val secondNumber: Int = 5
   val result = add(firstNumber, secondNumber)

   return(result)
}

fun add(numOne: Int, numTwo: Int): Int {
   return numOne + numTwo
}

fun displayAlertMessage(stringOne: String, stringTwo: String): String {
   return "There's a new sign-in request on $stringOne for your Google Account $stringTwo."
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
   val caloriesBurnedForEachStep: Double = 0.04
   return numberOfSteps * caloriesBurnedForEachStep
}

fun timeSpent(spentToday: Int, spendYesterday: Int): Boolean {
   if (spentToday > spendYesterday) {
      return true
   }
   return false
}

fun weatherUpdate(city: String, lowTemp: Int, highTemp: Int, rainChance: Int): String {
   return "City: $city. Low temperature: $lowTemp. High temperature: $highTemp. Chance of rain: $rainChance%."
}

fun trial(): Unit {
   println("1")
}