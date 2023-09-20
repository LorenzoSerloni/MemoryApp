package images

data class FoodsInfo(
    val foodName: String,
    val url: String
)

data class Foods(
    val food: MutableMap<Int, FoodsInfo>
) {
    companion object {
        val foods = mutableMapOf(
            1 to FoodsInfo(
                "whale",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/balena.webp"
            ),
            2 to FoodsInfo(
                "dog",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/cane.webp?t=2023-09-16T12%3A20%3A41.888Z"
            ),
            3 to FoodsInfo(
                "kangaroo",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/canguro.webp?t=2023-09-16T12%3A27%3A19.763Z"
            ),
            4 to FoodsInfo(
                "rabbit",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/canguro.webp?t=2023-09-16T12%3A27%3A19.763Z"
            ),
            5 to FoodsInfo(
                "dolphin",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/delfino.webp?t=2023-09-16T12%3A39%3A14.089Z",
            ),
            6 to FoodsInfo(
                "elephant",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/elefante.webp",
            ),
            7 to FoodsInfo(
                "cat",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/gatto.webp",
            ),
            8 to FoodsInfo(
                "giraffe",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/giraffa.webp",
            ),
            9 to FoodsInfo(
                "gorilla",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/gorilla.webp",
            ),
            10 to FoodsInfo(
                "crab",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/granchio.webp",
            ),
            11 to FoodsInfo(
                "koala",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/koala.webp",
            ),
            12 to FoodsInfo(
                "lion",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/leone.webp",
            ),
            13 to FoodsInfo(
                "cow",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/mucca.webp",
            ),
            14 to FoodsInfo(
                "bear",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/orso.webp?t=2023-09-16T12%3A50%3A45.988Z",
            ),
            15 to FoodsInfo(
                "fish",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/pesce.webp",
            ),
            16 to FoodsInfo(
                "frog",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/rana.webp",
            ),
            17 to FoodsInfo(
                "snake",
                "ttps://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/serpente.webp",
            ),
            18 to FoodsInfo(
                "turtle",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/tartaruga.webp",
            ),
            19 to FoodsInfo(
                "tiger",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/tigre.webp",
            ),
            20 to FoodsInfo(
                "zebra",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/zebra.webp",
            ),
        )
    }
}
