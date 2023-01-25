package com.sg.textviewrv30

class Post4Lines() {

    fun createPosts(): ArrayList<Post> {
        val posts = ArrayList<Post>()
        for (i in 400..405) {
            val postMethod = "loadPost$i"
            val method = this::class.java.getMethod(postMethod)
            val post = method.invoke(this) as Post
            posts.add(post)
        }
        return posts
    }

    fun loadPost400(): Post {
        val post = Post()
        with(post) {
            postNum = 400
            postId = 68
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/01/21/11/39/running-4782722_1280.jpg"
            postText = arrayListOf(
                "על תהיה הכי טוב",
                "זה לא יצליח לך לאורך זמן,",
                " לך על משהו יותר ממשי",
                "תהיה הכי אתה."
            )
            postBackground = "a9dce3"
            postTransparency = 0
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily = 103
            postRadiuas = 15
        }
        return post
    }

    fun loadPost401(): Post {
        val post = Post()
        with(post) {
            postNum = 401
            postId = 82
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2017/01/09/22/24/guy-playing-billiard-1967834_1280.jpg"
            postText = arrayListOf(
                " הבלים הם דברים אמיתיים, ",
                " מה שהופך אותם להבלים לגביך ",
                " זו היכולת שלהם ",
                " למנוע ממך להתפתח. "
            )
            postBackground = "210070"
            postTransparency = 9
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily = 103
            postRadiuas = 15
        }
        return post
    }

    fun loadPost402(): Post { //N
        val post = Post()
        with(post) {
            postNum = 402
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/01/25/09/28/woman-4792042_1280.jpg"
            postText = arrayListOf(
                " פסימיות ",
                " זה לחשוב שיש מישהו מאושר ממך, ",
                " אופטימיות ",
                " זה להבין שאין אחד כזה. "
            )
            postBackground = "a3842c"
            postTransparency = 9
            postId = 80
            textLocation = arrayListOf(10, -1, 28, 140, 0, 0, 0, 0)
            val size1 = 14
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 103
            postRadiuas = 15
        }
        return post
    }

    fun loadPost403(): Post {
        val post = Post()
        with(post) {
            postNum = 403
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/06/01/09/15/art-1428646_1280.jpg"
            postText = arrayListOf(
                " האויב של הטוב ",
                " הוא הטוב יותר, ",
                " האויב של הרגע ",
                " הוא הרגע הבא. "
            )
            postBackground = "a3842c"
            postTransparency = 10
            postId = 78
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            val size1 = 24
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 130
            postRadiuas = 15
        }
        return post
    }

    fun loadPost404(): Post {
        val post = Post()
        with(post) {
            postNum = 404
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/01/10/09/28/castle-3925038_1280.jpg"
            postText = arrayListOf(
                "האנשים",
                "חיים כדרכם",
                "מתוך תא הכלא",
                "של מה שהם חושבים שהם."
            )
            postBackground = "a3842c"
            postTransparency = 4
            postId = 80
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            val size1 = 24
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(10, 0, 10, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 130
            postRadiuas = 15
        }
        return post
    }

    fun loadPost405(): Post {
        val post = Post()
        with(post) {
            postNum = 405
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/12/16/21/58/tv-5837826_1280.jpg"
            postText = arrayListOf(
                "וגם באם תגיע לאור,",
                "הרי אחרי חצי שעה תקום לראות טלוויזיה,",
                "כי מתחיל האח הגדול",
                "ויש הדחה כפולה."
            )
            postId = 79
            textLocation = arrayListOf(10, -1, 30, 10, 0, 30, 0, 0)
            postTextSize = arrayListOf(0, 14)
            postBackground = "a3842c"
            postTransparency = 6
            val textColor = "ffffff"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(5, 0, 5, 5)
        }
        return post
    }

    fun loadPost406() {
        val post = Post()
        with(post) {
            postNum = 406
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/06/29/20/48/cemetery-2456173_1280.jpg"
            postText = arrayListOf(
                "ישנם אנשים קרובים",
                "שבהלוויה שלהם,",
                "אתה פחות סופד להם",
                "ויותר לעצמך."
            )
            postId = 79
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postBackground = "FCE77D"
            postTransparency = 9
            val textColor = "1820FF"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }

    }

    fun loadPost407() {
        val post = Post()
        with(post) {
            postNum = 407
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/11/24/17/36/magic-5773359_1280.png"
            val s1 = "\""
            val s2 = "\""
            val s12 = " פוליטיקלי קורקט "
            postText = arrayListOf(
                "$s1$s12$s2",
                "זה היכולת של האדם",
                "לקרוא ליום לילה וללילה יום",
                "בשם האמונות שלו."
            )
            postId = 65
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postBackground = "FCE77D"
            postTransparency = 9
            val textColor = "1820FF"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }


    }

    fun loadPost408() {
        val post = Post()
        with(post) {
            postNum = 408
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/10/10/07/48/beach-2836300_1280.jpg"
            postText = arrayListOf(
                "שיחות עם הים",
                "כמו רוב השיחות עם בני האדם,",
                "לא יצאת חכם יותר",
                "אבל לפחות אמרת את מה שאתה חושב."
            )
            postId = 79
            textLocation = arrayListOf(10, -1, 35, 10, 2, 25, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postBackground = "FCE77D"
            postTransparency = 7
            val textColor = "1820FF"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
            lineSpacing = 1.1f
        }

    }

    fun loadPost409() {
        val post = Post()
        with(post) {
            postNum = 409
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2021/11/20/05/15/car-6810885_1280.jpg"
            postText = arrayListOf(
                "השאלה היא פחות:",
                "מה קורה כאן,",
                "ויותר, איפה אני בכל",
                " מה שקורה כאן."
            )
            postId = 76
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 22)
            postBackground = "F0A07C"
            postTransparency = 8
            val textColor = "4A274F"
            postFontFamily = 110

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }

    }

    fun loadPost410() {
        val post = Post()
        with(post) {
            postNum = 410
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/12/11/12/42/river-1899328_1280.jpg"
            postText = arrayListOf(
                "את האיזורים הרדודים בעולם",
                "אתה לא יכול להאשים ברדידות,",
                "אתה יכול להאשים רק את עצמך",
                " שאתה נמצא יותר מידי זמן באיזורים האלה."
            )
            postId = 81
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 14)
            postBackground = "00e1d9"
            postTransparency = 0
            val textColor = "5e001f"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }

    }
}


