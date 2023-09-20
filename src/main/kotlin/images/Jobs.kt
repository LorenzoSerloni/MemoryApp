package images

data class JobsInfo(
    val jobName: String,
    val url: String
)

data class Jobs(
    val job: MutableMap<Int, JobsInfo>
) {
    companion object {
        val jobs = mutableMapOf(
            1 to JobsInfo(
                "whale",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/balena.webp"
            ),
            2 to JobsInfo(
                "dog",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/cane.webp?t=2023-09-16T12%3A20%3A41.888Z"
            ),
            3 to JobsInfo(
                "kangaroo",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/canguro.webp?t=2023-09-16T12%3A27%3A19.763Z"
            ),
            4 to JobsInfo(
                "rabbit",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/canguro.webp?t=2023-09-16T12%3A27%3A19.763Z"
            ),
            5 to JobsInfo(
                "dolphin",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/delfino.webp?t=2023-09-16T12%3A39%3A14.089Z",
            ),
            6 to JobsInfo(
                "elephant",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/elefante.webp",
            ),
            7 to JobsInfo(
                "cat",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/gatto.webp",
            ),
            8 to JobsInfo(
                "giraffe",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/giraffa.webp",
            ),
            9 to JobsInfo(
                "gorilla",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/gorilla.webp",
            ),
            10 to JobsInfo(
                "crab",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/granchio.webp",
            ),
            11 to JobsInfo(
                "koala",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/koala.webp",
            ),
            12 to JobsInfo(
                "lion",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/leone.webp",
            ),
            13 to JobsInfo(
                "cow",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/mucca.webp",
            ),
            14 to JobsInfo(
                "bear",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/orso.webp?t=2023-09-16T12%3A50%3A45.988Z",
            ),
            15 to JobsInfo(
                "fish",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/pesce.webp",
            ),
            16 to JobsInfo(
                "frog",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/rana.webp",
            ),
            17 to JobsInfo(
                "snake",
                "ttps://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/serpente.webp",
            ),
            18 to JobsInfo(
                "turtle",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/tartaruga.webp",
            ),
            19 to JobsInfo(
                "tiger",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/tigre.webp",
            ),
            20 to JobsInfo(
                "zebra",
                "https://hqxnhnvyszcurgvssbai.supabase.co/storage/v1/object/public/Card%20Images/Animals/zebra.webp",
            ),
        )
    }
}
