package images

data class LettersAndNumbersInfo(
    val lettersAndNumbersName: String,
    val url: String
)

data class LettersAndNumbers(
    val lettersAndNumber: MutableMap<Int, LettersAndNumbersInfo>
) {
    companion object {
        val lettersAndNumbers = mutableMapOf(
            1 to LettersAndNumbersInfo(
                "whale",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/balena.webp"
            ),
            2 to LettersAndNumbersInfo(
                "dog",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/cane.webp?t=2023-09-16T12%3A20%3A41.888Z"
            ),
            3 to LettersAndNumbersInfo(
                "kangaroo",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/canguro.webp?t=2023-09-16T12%3A27%3A19.763Z"
            ),
            4 to LettersAndNumbersInfo(
                "rabbit",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/canguro.webp?t=2023-09-16T12%3A27%3A19.763Z"
            ),
            5 to LettersAndNumbersInfo(
                "dolphin",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/delfino.webp?t=2023-09-16T12%3A39%3A14.089Z",
            ),
            6 to LettersAndNumbersInfo(
                "elephant",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/elefante.webp",
            ),
            7 to LettersAndNumbersInfo(
                "cat",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/gatto.webp",
            ),
            8 to LettersAndNumbersInfo(
                "giraffe",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/giraffa.webp",
            ),
            9 to LettersAndNumbersInfo(
                "gorilla",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/gorilla.webp",
            ),
            10 to LettersAndNumbersInfo(
                "crab",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/granchio.webp",
            ),
            11 to LettersAndNumbersInfo(
                "koala",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/koala.webp",
            ),
            12 to LettersAndNumbersInfo(
                "lion",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/leone.webp",
            ),
            13 to LettersAndNumbersInfo(
                "cow",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/mucca.webp",
            ),
            14 to LettersAndNumbersInfo(
                "bear",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/orso.webp?t=2023-09-16T12%3A50%3A45.988Z",
            ),
            15 to LettersAndNumbersInfo(
                "fish",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/pesce.webp",
            ),
            16 to LettersAndNumbersInfo(
                "frog",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/rana.webp",
            ),
            17 to LettersAndNumbersInfo(
                "snake",
                "ttps://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/serpente.webp",
            ),
            18 to LettersAndNumbersInfo(
                "turtle",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/tartaruga.webp",
            ),
            19 to LettersAndNumbersInfo(
                "tiger",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/tigre.webp",
            ),
            20 to LettersAndNumbersInfo(
                "zebra",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/zebra.webp",
            ),
        )
    }
}