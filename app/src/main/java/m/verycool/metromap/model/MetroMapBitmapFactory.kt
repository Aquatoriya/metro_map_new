package m.verycool.metromap.model

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

class MetroMapBitmapFactory {

    private fun getPaint(color: Int): Paint {
        val paint = Paint()
        paint.color = color
        paint.strokeWidth = 10f
        return paint
    }

    private fun buildGreenBranch(canvas: Canvas) {
        val paint = getPaint(Color.GREEN)

        canvas.drawCircle(225f, 175f, 10f, paint)

        canvas.drawLine(225f, 175f, 225f, 200f, paint)

        canvas.drawCircle(225f, 200f, 10f, paint)

        canvas.drawLine(225f, 200f, 253f, 250f, paint)

        canvas.drawCircle(253f, 250f, 10f, paint)

        canvas.drawLine(253f, 250f, 275f, 275f, paint)

        canvas.drawCircle(275f, 275f, 10f, paint)

        canvas.drawLine(275f, 275f, 375f, 300f, paint)

        canvas.drawCircle(375f, 300f, 10f, paint)

        canvas.drawLine(375f, 300f, 450f, 300f, paint)

        canvas.drawCircle(450f, 300f, 10f, paint)

        canvas.drawLine(450f, 300f, 550f, 325f, paint)

        canvas.drawCircle(550f, 325f, 10f, paint)

        canvas.drawLine(550f, 325f, 575f, 350f, paint)

        canvas.drawCircle(575f, 350f, 10f, paint)

        canvas.drawLine(575f, 350f, 600f, 375f, paint)

        canvas.drawCircle(600f, 375f, 10f, paint)

        canvas.drawLine(600f, 375f, 625f, 400f, paint)

        canvas.drawCircle(625f, 400f, 10f, paint)

        canvas.drawLine(625f, 400f, 650f, 425f, paint)

        canvas.drawCircle(650f, 425f, 10f, paint)

        canvas.drawLine(650f, 425f, 675f, 450f, paint)

        canvas.drawCircle(675f, 450f, 10f, paint)

        paint.color = Color.WHITE

        canvas.drawCircle(225f, 175f, 8f, paint) //Беговая

        canvas.drawCircle(225f, 200f, 8f, paint) //Новокрестовская

        canvas.drawCircle(253f, 250f, 8f, paint) //Приморская

        canvas.drawCircle(275f, 275f, 8f, paint) //Василеостровская

        canvas.drawCircle(375f, 300f, 8f, paint) //Гостинный двор

        canvas.drawCircle(450f, 300f, 8f, paint) //Маяковская

        canvas.drawCircle(550f, 325f, 8f, paint) //Площадь Александра Невского 1

        canvas.drawCircle(575f, 350f, 8f, paint) //Елизаровская

        canvas.drawCircle(600f, 375f, 8f, paint) //Ломоносовская

        canvas.drawCircle(625f, 400f, 8f, paint) //Пролетарская

        canvas.drawCircle(650f, 425f, 8f, paint) //Обухово

        canvas.drawCircle(675f, 450f, 8f, paint) //Рыбацкое
    }

    private fun buildPurpleBranch(canvas: Canvas) {
        val paint = getPaint(Color.BLACK)

        canvas.drawCircle(275f, 125f, 10f, paint)

        canvas.drawLine(275f, 125f, 275f, 150f, paint)

        canvas.drawCircle(275f, 150f, 10f, paint)

        canvas.drawLine(275f, 150f, 275f, 175f, paint)

        canvas.drawCircle(275f, 175f, 10f, paint)

        canvas.drawLine(275f, 175f, 275f, 200f, paint)

        canvas.drawCircle(275f, 200f, 10f, paint)

        canvas.drawLine(275f, 200f, 275f, 225f, paint)

        canvas.drawCircle(275f, 225f, 10f, paint)

        canvas.drawLine(275f, 225f, 325f, 260f, paint)

        canvas.drawCircle(325f, 260f, 10f, paint)

        canvas.drawLine(325f, 260f, 375f, 325f, paint)

        canvas.drawCircle(375f, 325f, 10f, paint)

        canvas.drawLine(375f, 325f, 400f, 375f, paint)

        canvas.drawCircle(400f, 375f, 10f, paint)

        canvas.drawLine(400f, 375f, 450f, 450f, paint)

        canvas.drawCircle(450f, 450f, 10f, paint)

        canvas.drawLine(450f, 450f, 450f, 475f, paint)

        canvas.drawCircle(450f, 475f, 10f, paint)

        canvas.drawLine(450f, 475f, 450f, 500f, paint)

        canvas.drawCircle(450f, 500f, 10f, paint)

        canvas.drawLine(450f, 500f, 450f, 525f, paint)

        canvas.drawCircle(450f, 525f, 10f, paint)

        canvas.drawLine(450f, 525f, 450f, 550f, paint)

        canvas.drawCircle(450f, 550f, 10f, paint)

        canvas.drawLine(450f, 550f, 450f, 575f, paint)

        canvas.drawCircle(450f, 575f, 10f, paint)

        canvas.drawLine(450f, 575f, 450f, 600f, paint)

        canvas.drawCircle(450f, 600f, 10f, paint)

        paint.color = Color.WHITE

        canvas.drawCircle(275f, 125f, 8f, paint) //Комендантский проспект

        canvas.drawCircle(275f, 150f, 8f, paint) //Старая Деревня

        canvas.drawCircle(275f, 175f, 8f, paint) //Крестовский остров

        canvas.drawCircle(275f, 200f, 8f, paint) //Чкаловская

        canvas.drawCircle(275f, 225f, 8f, paint) //Спортивная

        canvas.drawCircle(325f, 260f, 8f, paint) //Адмиралтейская

        canvas.drawCircle(375f, 325f, 8f, paint) //Садовая

        canvas.drawCircle(400f, 375f, 8f, paint) //Звенигородская

        canvas.drawCircle(450f, 450f, 8f, paint) //Обводный канал

        canvas.drawCircle(450f, 475f, 8f, paint) //Волковская

        canvas.drawCircle(450f, 500f, 8f, paint) //Бухарестская

        canvas.drawCircle(450f, 525f, 8f, paint) //Международная

        canvas.drawCircle(450f, 550f, 8f, paint) //Проспект Славы

        canvas.drawCircle(450f, 575f, 8f, paint) //Дунайская

        canvas.drawCircle(450f, 600f, 8f, paint) //Шушары
    }

    private fun buildBlueBranch(canvas: Canvas) {
        val paint = getPaint(Color.BLUE)

        canvas.drawCircle(375f, 75f, 10f, paint)

        canvas.drawLine(375f, 75f, 375f, 100f, paint)

        canvas.drawCircle(375f, 100f, 10f, paint)

        canvas.drawLine(375f, 100f, 375f, 125f, paint)

        canvas.drawCircle(375f, 125f, 10f, paint)

        canvas.drawLine(375f, 125f, 375f, 150f, paint)

        canvas.drawCircle(375f, 150f, 10f, paint)

        canvas.drawLine(375f, 150f, 375f, 175f, paint)

        canvas.drawCircle(375f, 175f, 10f, paint)

        canvas.drawLine(375f, 175f, 375f, 200f, paint)

        canvas.drawCircle(375f, 200f, 10f, paint)

        canvas.drawLine(375f, 200f, 375f, 225f, paint)

        canvas.drawCircle(375f, 225f, 10f, paint)

        canvas.drawLine(375f, 225f, 375f, 300f, paint)

        canvas.drawCircle(375f, 300f, 10f, paint)

        canvas.drawLine(375f, 300f, 375f, 325f, paint)

        canvas.drawCircle(375f, 325f, 10f, paint)

        canvas.drawLine(375f, 325f, 375f, 375f, paint)

        canvas.drawCircle(375f, 375f, 10f, paint)

        canvas.drawLine(375f, 375f, 375f, 400f, paint)

        canvas.drawCircle(375f, 400f, 10f, paint)

        canvas.drawLine(375f, 400f, 375f, 425f, paint)

        canvas.drawCircle(375f, 425f, 10f, paint)

        canvas.drawLine(375f, 425f, 375f, 450f, paint)

        canvas.drawCircle(375f, 450f, 10f, paint)

        canvas.drawLine(375f, 450f, 375f, 475f, paint)

        canvas.drawCircle(375f, 475f, 10f, paint)

        canvas.drawLine(375f, 475f, 375f, 500f, paint)

        canvas.drawCircle(375f, 500f, 10f, paint)

        canvas.drawLine(375f, 500f, 375f, 525f, paint)

        canvas.drawCircle(375f, 525f, 10f, paint)

        canvas.drawLine(375f, 525f, 375f, 550f, paint)

        canvas.drawCircle(375f, 550f, 10f, paint)

        canvas.drawLine(375f, 550f, 375f, 575f, paint)

        canvas.drawCircle(375f, 575f, 10f, paint)

        paint.color = Color.WHITE

        canvas.drawCircle(375f, 75f, 8f, paint)  //Парнас; (375; 75)

        canvas.drawCircle(375f, 100f, 8f, paint) //Проспект ПРосвещения

        canvas.drawCircle(375f, 125f, 8f, paint) //Озерки

        canvas.drawCircle(375f, 150f, 8f, paint) //Удельная

        canvas.drawCircle(375f, 175f, 8f, paint) //Пионерская

        canvas.drawCircle(375f, 200f, 8f, paint) //Черная речка

        canvas.drawCircle(375f, 225f, 8f, paint) //Петроградская

        canvas.drawCircle(375f, 300f, 8f, paint) //Горьковская

        canvas.drawCircle(375f, 325f, 8f, paint) //Невский проспект

        canvas.drawCircle(375f, 375f, 8f, paint) //Сенная площадь

        canvas.drawCircle(375f, 400f, 8f, paint) //Технологический институт

        canvas.drawCircle(375f, 425f, 8f, paint) //Фрунзенская

        canvas.drawCircle(375f, 450f, 8f, paint) //Московские ворота

        canvas.drawCircle(375f, 475f, 8f, paint) //Электросила

        canvas.drawCircle(375f, 500f, 8f, paint) //Парк Победы

        canvas.drawCircle(375f, 525f, 8f, paint) //Московская

        canvas.drawCircle(375f, 550f, 8f, paint) //Звездная

        canvas.drawCircle(375f, 575f, 8f, paint) //Купчино

    }

    private fun buildRedBranch(canvas: Canvas) {
        val paint = getPaint(Color.RED)

        canvas.drawCircle(450f, 75f, 10f, paint)

        canvas.drawLine(450f, 75f, 450f, 100f, paint)

        canvas.drawCircle(450f, 100f, 10f, paint)

        canvas.drawLine(450f, 100f, 450f, 125f, paint)

        canvas.drawCircle(450f, 125f, 10f, paint)

        canvas.drawLine(450f, 125f, 450f, 150f, paint)

        canvas.drawCircle(450f, 150f, 10f, paint)

        canvas.drawLine(450f, 150f, 450f, 175f, paint)

        canvas.drawCircle(450f, 175f, 10f, paint)

        canvas.drawLine(450f, 175f, 450f, 200f, paint)

        canvas.drawCircle(450f, 200f, 10f, paint)

        canvas.drawLine(450f, 200f, 450f, 225f, paint)

        canvas.drawCircle(450f, 225f, 10f, paint)

        canvas.drawLine(450f, 225f, 450f, 250f, paint)

        canvas.drawCircle(450f, 250f, 10f, paint)

        canvas.drawLine(450f, 250f, 450f, 275f, paint)

        canvas.drawCircle(450f, 275f, 10f, paint)

        canvas.drawLine(450f, 275f, 450f, 300f, paint)

        canvas.drawCircle(450f, 300f, 10f, paint)

        canvas.drawLine(450f, 300f, 450f, 325f, paint)

        canvas.drawCircle(450f, 325f, 10f, paint)

        canvas.drawLine(450f, 325f, 400f, 375f, paint)

        canvas.drawCircle(400f, 375f, 10f, paint)

        canvas.drawLine(400f, 375f, 375f, 375f, paint)

        canvas.drawCircle(375f, 375f, 10f, paint)

        canvas.drawLine(375f, 375f, 300f, 450f, paint)

        canvas.drawCircle(300f, 450f, 10f, paint)

        canvas.drawLine(300f, 450f, 300f, 475f, paint)

        canvas.drawCircle(300f, 475f, 10f, paint)

        canvas.drawLine(300f, 475f, 300f, 500f, paint)

        canvas.drawCircle(300f, 500f, 10f, paint)

        canvas.drawLine(300f, 500f, 300f, 525f, paint)

        canvas.drawCircle(300f, 525f, 10f, paint)

        canvas.drawLine(300f, 525f, 300f, 550f, paint)

        canvas.drawCircle(300f, 550f, 10f, paint)

        canvas.drawLine(300f, 550f, 300f, 575f, paint)

        canvas.drawCircle(300f, 575f, 10f, paint)

        paint.color = Color.WHITE

        canvas.drawCircle(450f, 75f, 8f, paint) //Девяткино

        canvas.drawCircle(450f, 100f, 8f, paint) //Гражданский проспект

        canvas.drawCircle(450f, 125f, 8f, paint) //Академическая

        canvas.drawCircle(450f, 150f, 8f, paint) //Политехническая

        canvas.drawCircle(450f, 175f, 8f, paint) //Площадь Мужества

        canvas.drawCircle(450f, 200f, 8f, paint) //Лесная

        canvas.drawCircle(450f, 225f, 8f, paint) //Выборгская

        canvas.drawCircle(450f, 250f, 8f, paint) //Площадь Ленина

        canvas.drawCircle(450f, 275f, 8f, paint) //Чернышевская

        canvas.drawCircle(450f, 300f, 8f, paint) //Площадь Восстания

        canvas.drawCircle(450f, 325f, 8f, paint) //Владимирская

        canvas.drawCircle(400f, 375f, 8f, paint) //Пушкинская

        canvas.drawCircle(375f, 425f, 8f, paint) //Технологический институт 1

        canvas.drawCircle(300f, 450f, 8f, paint) //Балтийская

        canvas.drawCircle(300f, 475f, 8f, paint) //Нарвская

        canvas.drawCircle(300f, 500f, 8f, paint) //Кировский завод

        canvas.drawCircle(300f, 525f, 8f, paint) //Автово

        canvas.drawCircle(300f, 550f, 8f, paint) //Ленинский проспект

        canvas.drawCircle(300f, 575f, 8f, paint) //Проспект Ветеранов
    }

    private fun buildOrangeBranch(canvas: Canvas)  {
        val paint = getPaint(Color.YELLOW)

        canvas.drawCircle(375f, 325f, 10f, paint)

        canvas.drawLine(375f, 325f, 450f, 325f, paint)

        canvas.drawCircle(450f, 325f, 10f, paint)

        canvas.drawLine(450f, 325f, 500f, 325f, paint)

        canvas.drawCircle(500f, 325f, 10f, paint)

        canvas.drawLine(500f, 325f, 550f, 325f, paint)

        canvas.drawCircle(550f, 325f, 10f, paint)

        canvas.drawLine(550f, 325f, 600f, 325f, paint)

        canvas.drawCircle(600f, 325f, 10f, paint)

        canvas.drawLine(600f, 325f, 625f, 350f, paint)

        canvas.drawCircle(625f, 350f, 10f, paint)

        canvas.drawLine(625f, 350f, 650f, 375f, paint)

        canvas.drawCircle(650f, 375f, 10f, paint)

        canvas.drawLine(650f, 375f, 675f, 400f, paint)

        canvas.drawCircle(675f, 400f, 10f, paint)

        paint.color = Color.WHITE

        canvas.drawCircle(375f, 325f, 8f, paint) //Спасская

        canvas.drawCircle(450f, 325f, 8f, paint) //Достоевская

        canvas.drawCircle(500f, 325f, 8f, paint) //Лиговский проспект

        canvas.drawCircle(550f, 325f, 8f, paint) //Площадь Александра Невского 2

        canvas.drawCircle(600f, 325f, 8f, paint) //Новочеркасская

        canvas.drawCircle(625f, 350f, 8f, paint) //Ладожская

        canvas.drawCircle(650f, 375f, 8f, paint) //ПРоспект Большевиков

        canvas.drawCircle(675f, 400f, 8f, paint) //Улица Дыбенко

    }

    fun build(context: Context): Bitmap {
        val bitmap = Bitmap.createBitmap(700, 700, Bitmap.Config.RGB_565)
        val canvas = Canvas()
        canvas.setBitmap(bitmap)
        canvas.drawColor(Color.WHITE)
        buildGreenBranch(canvas)
        buildPurpleBranch(canvas)
        buildBlueBranch(canvas)
        buildRedBranch(canvas)
        buildOrangeBranch(canvas)
        return bitmap
    }
}