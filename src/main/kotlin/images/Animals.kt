package images

data class AnimalsInfo(
    val animalName: String,
    val fileName: String
)

data class Animals(
    val animal: MutableMap<Int, AnimalsInfo>
) {
    companion object {
        val animals = mutableMapOf(
            1 to AnimalsInfo(
                "whale",
                "balena.png"
            ),
            2 to AnimalsInfo(
                "dog",
                "cane.png"
            ),
            3 to AnimalsInfo(
                "kangaroo",
                "canguro.png"
            ),
            4 to AnimalsInfo(
                "rabbit",
                "coniglio.png"
            ),
            5 to AnimalsInfo(
                "dolphin",
                "delfino.png",
            ),
            6 to AnimalsInfo(
                "elephant",
                "elefante.png",
            ),
            7 to AnimalsInfo(
                "cat",
                "gatto.png",
            ),
            8 to AnimalsInfo(
                "giraffe",
                "giraffa.png",
            ),
            9 to AnimalsInfo(
                "gorilla",
                "gorilla.png",
            ),
            10 to AnimalsInfo(
                "crab",
                "granchio.png",
            ),
            11 to AnimalsInfo(
                "koala",
                "koala.png",
            ),
            12 to AnimalsInfo(
                "lion",
                "leone.png",
            ),
            13 to AnimalsInfo(
                "cow",
                "mucca.png",
            ),
            14 to AnimalsInfo(
                "bear",
                "orso.png",
            ),
            15 to AnimalsInfo(
                "fish",
                "pesce.png",
            ),
            16 to AnimalsInfo(
                "frog",
                "rana.png",
            ),
            17 to AnimalsInfo(
                "snake",
                "serpente.png",
            ),
            18 to AnimalsInfo(
                "turtle",
                "tartaruga.png",
            ),
            19 to AnimalsInfo(
                "tiger",
                "tigre.png",
            ),
            20 to AnimalsInfo(
                "zebra",
                "zebra.png",
            ),
        )
    }
}




