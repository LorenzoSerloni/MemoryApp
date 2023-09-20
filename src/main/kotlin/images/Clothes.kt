package images

data class ClothesInfo(
    val clothName: String,
    val url: String
)

data class Clothes(
    val cloth: MutableMap<Int, ClothesInfo>
) {
    companion object {
        val clothes = mutableMapOf(
            1 to ClothesInfo(
                "whale",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/balena.webp"
            ),
            2 to ClothesInfo(
                "dog",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/cane.webp?t=2023-09-16T12%3A20%3A41.888Z"
            ),
            3 to ClothesInfo(
                "kangaroo",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/canguro.webp?t=2023-09-16T12%3A27%3A19.763Z"
            ),
            4 to ClothesInfo(
                "rabbit",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/canguro.webp?t=2023-09-16T12%3A27%3A19.763Z"
            ),
            5 to ClothesInfo(
                "dolphin",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/delfino.webp?t=2023-09-16T12%3A39%3A14.089Z",
            ),
            6 to ClothesInfo(
                "elephant",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/elefante.webp",
            ),
            7 to ClothesInfo(
                "cat",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/gatto.webp",
            ),
            8 to ClothesInfo(
                "giraffe",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/giraffa.webp",
            ),
            9 to ClothesInfo(
                "gorilla",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/gorilla.webp",
            ),
            10 to ClothesInfo(
                "crab",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/granchio.webp",
            ),
            11 to ClothesInfo(
                "koala",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/koala.webp",
            ),
            12 to ClothesInfo(
                "lion",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/leone.webp",
            ),
            13 to ClothesInfo(
                "cow",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/mucca.webp",
            ),
            14 to ClothesInfo(
                "bear",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/orso.webp?t=2023-09-16T12%3A50%3A45.988Z",
            ),
            15 to ClothesInfo(
                "fish",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/pesce.webp",
            ),
            16 to ClothesInfo(
                "frog",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/rana.webp",
            ),
            17 to ClothesInfo(
                "snake",
                "ttps://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/serpente.webp",
            ),
            18 to ClothesInfo(
                "turtle",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/tartaruga.webp",
            ),
            19 to ClothesInfo(
                "tiger",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/tigre.webp",
            ),
            20 to ClothesInfo(
                "zebra",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/zebra.webp",
            ),
        )
    }
}