package screens

import gamecards.CurrentGameCards
import gamecards.GamingCard
import images.*
fun playingCard(cardNumber: Int) {
    var counter = cardNumber
    var randomId: Int = 0
    for (i in 1..counter) {
        randomId = numberGenerator()
        val cardCopy = GamingCard(0, "", "")
        when (ChoiceInfo.info.category.lowercase()) {
            "animals" -> {
                cardCopy.id = randomId
                cardCopy.id = randomId
                val aux = Animals.animals[randomId]
                cardCopy.name = aux?.animalName ?: ""
                cardCopy.fileName = aux?.fileName ?: ""
                if (!CurrentGameCards.gameSession.add(cardCopy)) {
                    counter++
                }
            }
            "fruits and vegetables" -> {
                cardCopy.id = randomId
                val aux = Fruits.fruits[randomId]
                cardCopy.name = aux?.fruitsName ?: ""
                cardCopy.fileName = aux?.url ?: ""
                if (!CurrentGameCards.gameSession.add(cardCopy)) {
                    counter++
                }
            }
            "school objects" -> {
                cardCopy.id = randomId
                val aux = SchoolObjects.schoolObjects[randomId]
                cardCopy.name = aux?.schoolObjectName ?: ""
                cardCopy.fileName = aux?.url ?: ""
                if (!CurrentGameCards.gameSession.add(cardCopy)) {
                    counter++
                }
            }
            "clothes" -> {
                cardCopy.id = randomId
                val aux = Clothes.clothes[randomId]
                cardCopy.name = aux?.clothName ?: ""
                cardCopy.fileName = aux?.url ?: ""
                if (!CurrentGameCards.gameSession.add(cardCopy)) {
                    counter++
                }
            }
            "jobs" -> {
                cardCopy.id = randomId
                val aux = Jobs.jobs[randomId]
                cardCopy.name = aux?.jobName ?: ""
                cardCopy.fileName = aux?.url ?: ""
                if (!CurrentGameCards.gameSession.add(cardCopy)) {
                    counter++
                }
            }
            "toys" -> {
                cardCopy.id = randomId
                val aux = Toys.toys[randomId]
                cardCopy.name = aux?.toyName ?: ""
                cardCopy.fileName = aux?.url ?: ""
                if (!CurrentGameCards.gameSession.add(cardCopy)) {
                    counter++
                }
            }
            "foods" -> {
                cardCopy.id = randomId
                val aux = Foods.foods[randomId]
                cardCopy.name = aux?.foodName ?: ""
                cardCopy.fileName = aux?.url ?: ""
                if (!CurrentGameCards.gameSession.add(cardCopy)) {
                    counter++
                }
            }
            "actions" -> {
                cardCopy.id = randomId
                val aux = Actions.actions[randomId]
                cardCopy.name = aux?.actionName ?: ""
                cardCopy.fileName = aux?.url ?: ""
                if (!CurrentGameCards.gameSession.add(cardCopy)) {
                    counter++
                }
            }
            "letters and numbers" -> {
                cardCopy.id = randomId
                val aux = LettersAndNumbers.lettersAndNumbers[randomId]
                cardCopy.name = aux?.lettersAndNumbersName ?: ""
                cardCopy.fileName = aux?.url ?: ""
                if (!CurrentGameCards.gameSession.add(cardCopy)) {
                    counter++
                }
            }
        }
    }
}

fun numberGenerator(): Int {
    return (0..20).random()
}