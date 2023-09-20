package images

data class ToysInfo(
    val toyName: String,
    val url: String
)

data class Toys(
    val toy: MutableMap<Int, ToysInfo>
) {
    companion object {
        val toys = mutableMapOf(
            1 to ToysInfo(
                "whale",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/balena.webp"
            ),
            2 to ToysInfo(
                "dog",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/cane.webp?t=2023-09-16T12%3A20%3A41.888Z"
            ),
            3 to ToysInfo(
                "kangaroo",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/canguro.webp?t=2023-09-16T12%3A27%3A19.763Z"
            ),
            4 to ToysInfo(
                "rabbit",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/canguro.webp?t=2023-09-16T12%3A27%3A19.763Z"
            ),
            5 to ToysInfo(
                "dolphin",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/delfino.webp?t=2023-09-16T12%3A39%3A14.089Z",
            ),
            6 to ToysInfo(
                "elephant",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/elefante.webp",
            ),
            7 to ToysInfo(
                "cat",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/gatto.webp",
            ),
            8 to ToysInfo(
                "giraffe",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/giraffa.webp",
            ),
            9 to ToysInfo(
                "gorilla",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/gorilla.webp",
            ),
            10 to ToysInfo(
                "crab",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/granchio.webp",
            ),
            11 to ToysInfo(
                "koala",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/koala.webp",
            ),
            12 to ToysInfo(
                "lion",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/leone.webp",
            ),
            13 to ToysInfo(
                "cow",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/mucca.webp",
            ),
            14 to ToysInfo(
                "bear",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/orso.webp?t=2023-09-16T12%3A50%3A45.988Z",
            ),
            15 to ToysInfo(
                "fish",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/pesce.webp",
            ),
            16 to ToysInfo(
                "frog",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/rana.webp",
            ),
            17 to ToysInfo(
                "snake",
                "ttps://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/serpente.webp",
            ),
            18 to ToysInfo(
                "turtle",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/tartaruga.webp",
            ),
            19 to ToysInfo(
                "tiger",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/tigre.webp",
            ),
            20 to ToysInfo(
                "zebra",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/zebra.webp",
            ),
        )
    }
}
