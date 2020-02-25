package m.verycool.metromap

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.os.Build
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.annotation.RequiresApi


class MainActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val button = findViewById<View>(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this, Info::class.java)
            startActivity(intent);
        }
    }






    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    class DrawView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0,
        defStyleRes: Int = 0
    ) : View(context, attrs, defStyle, defStyleRes) {

        var p = Paint()
        var rect = Rect()


        override fun onDraw(canvas: Canvas) {

            // заливка канвы белым цветом
            canvas.drawARGB(0, 0, 0, 0)


            // толщина линии = 15
            p.strokeWidth = 10f

            //зеленаяая ветка

            p.color = Color.GREEN

            canvas.drawCircle(225f, 175f, 10f, p)

            canvas.drawLine(225f, 175f, 225f, 200f, p)

            canvas.drawCircle(225f, 200f, 10f, p)

            canvas.drawLine(225f, 200f, 253f, 250f, p)

            canvas.drawCircle(253f, 250f, 10f, p)

            canvas.drawLine(253f, 250f, 275f, 275f, p)

            canvas.drawCircle(275f, 275f, 10f, p)

            canvas.drawLine(275f, 275f, 375f, 300f, p)

            canvas.drawCircle(375f, 300f, 10f, p)

            canvas.drawLine(375f, 300f, 450f, 300f, p)

            canvas.drawCircle(450f, 300f, 10f, p)

            canvas.drawLine(450f, 300f, 550f, 325f, p)

            canvas.drawCircle(550f, 325f, 10f, p)

            canvas.drawLine(550f, 325f, 575f, 350f, p)

            canvas.drawCircle(575f, 350f, 10f, p)

            canvas.drawLine(575f, 350f, 600f, 375f, p)

            canvas.drawCircle(600f, 375f, 10f, p)

            canvas.drawLine(600f, 375f, 625f, 400f, p)

            canvas.drawCircle(625f, 400f, 10f, p)

            canvas.drawLine(625f, 400f, 650f, 425f, p)

            canvas.drawCircle(650f, 425f, 10f, p)

            canvas.drawLine(650f, 425f, 675f, 450f, p)

            canvas.drawCircle(675f, 450f, 10f, p)

            //фиолетовая ветка

            p.color = Color.BLACK

            canvas.drawCircle(275f, 125f, 10f, p)

            canvas.drawLine(275f, 125f, 275f, 150f, p)

            canvas.drawCircle(275f, 150f, 10f, p)

            canvas.drawLine(275f, 150f, 275f, 175f, p)

            canvas.drawCircle(275f, 175f, 10f, p)

            canvas.drawLine(275f, 175f, 275f, 200f, p)

            canvas.drawCircle(275f, 200f, 10f, p)

            canvas.drawLine(275f, 200f, 275f, 225f, p)

            canvas.drawCircle(275f, 225f, 10f, p)

            canvas.drawLine(275f, 225f, 325f, 260f, p)

            canvas.drawCircle(325f, 260f, 10f, p)

            canvas.drawLine(325f, 260f, 375f, 325f, p)

            canvas.drawCircle(375f, 325f, 10f, p)

            canvas.drawLine(375f, 325f, 400f, 375f, p)

            canvas.drawCircle(400f, 375f, 10f, p)

            canvas.drawLine(400f, 375f, 450f, 450f, p)

            canvas.drawCircle(450f, 450f, 10f, p)

            canvas.drawLine(450f, 450f, 450f, 475f, p)

            canvas.drawCircle(450f, 475f, 10f, p)

            canvas.drawLine(450f, 475f, 450f, 500f, p)

            canvas.drawCircle(450f, 500f, 10f, p)

            canvas.drawLine(450f, 500f, 450f, 525f, p)

            canvas.drawCircle(450f, 525f, 10f, p)

            canvas.drawLine(450f, 525f, 450f, 550f, p)

            canvas.drawCircle(450f, 550f, 10f, p)

            canvas.drawLine(450f, 550f, 450f, 575f, p)

            canvas.drawCircle(450f, 575f, 10f, p)

            canvas.drawLine(450f, 575f, 450f, 600f, p)

            canvas.drawCircle(450f, 600f, 10f, p)

            //синия ветка

            p.color = Color.BLUE

            canvas.drawCircle(375f, 75f, 10f, p)

            canvas.drawLine(375f, 75f, 375f, 100f, p)

            canvas.drawCircle(375f, 100f, 10f, p)

            canvas.drawLine(375f, 100f, 375f, 125f, p)

            canvas.drawCircle(375f, 125f, 10f, p)

            canvas.drawLine(375f, 125f, 375f, 150f, p)

            canvas.drawCircle(375f, 150f, 10f, p)

            canvas.drawLine(375f, 150f, 375f, 175f, p)

            canvas.drawCircle(375f, 175f, 10f, p)

            canvas.drawLine(375f, 175f, 375f, 200f, p)

            canvas.drawCircle(375f, 200f, 10f, p)

            canvas.drawLine(375f, 200f, 375f, 225f, p)

            canvas.drawCircle(375f, 225f, 10f, p)

            canvas.drawLine(375f, 225f, 375f, 300f, p)

            canvas.drawCircle(375f, 300f, 10f, p)

            canvas.drawLine(375f, 300f, 375f, 325f, p)

            canvas.drawCircle(375f, 325f, 10f, p)

            canvas.drawLine(375f, 325f, 375f, 375f, p)

            canvas.drawCircle(375f, 375f, 10f, p)

            canvas.drawLine(375f, 375f, 375f, 400f, p)

            canvas.drawCircle(375f, 400f, 10f, p)

            canvas.drawLine(375f, 400f, 375f, 425f, p)

            canvas.drawCircle(375f, 425f, 10f, p)

            canvas.drawLine(375f, 425f, 375f, 450f, p)

            canvas.drawCircle(375f, 450f, 10f, p)

            canvas.drawLine(375f, 450f, 375f, 475f, p)

            canvas.drawCircle(375f, 475f, 10f, p)

            canvas.drawLine(375f, 475f, 375f, 500f, p)

            canvas.drawCircle(375f, 500f, 10f, p)

            canvas.drawLine(375f, 500f, 375f, 525f, p)

            canvas.drawCircle(375f, 525f, 10f, p)

            canvas.drawLine(375f, 525f, 375f, 550f, p)

            canvas.drawCircle(375f, 550f, 10f, p)

            canvas.drawLine(375f, 550f, 375f, 575f, p)

            canvas.drawCircle(375f, 575f, 10f, p)

            //красная ветка

            p.color = Color.RED

            canvas.drawCircle(450f, 75f, 10f, p)

            canvas.drawLine(450f, 75f, 450f, 100f, p)

            canvas.drawCircle(450f, 100f, 10f, p)

            canvas.drawLine(450f, 100f, 450f, 125f, p)

            canvas.drawCircle(450f, 125f, 10f, p)

            canvas.drawLine(450f, 125f, 450f, 150f, p)

            canvas.drawCircle(450f, 150f, 10f, p)

            canvas.drawLine(450f, 150f, 450f, 175f, p)

            canvas.drawCircle(450f, 175f, 10f, p)

            canvas.drawLine(450f, 175f, 450f, 200f, p)

            canvas.drawCircle(450f, 200f, 10f, p)

            canvas.drawLine(450f, 200f, 450f, 225f, p)

            canvas.drawCircle(450f, 225f, 10f, p)

            canvas.drawLine(450f, 225f, 450f, 250f, p)

            canvas.drawCircle(450f, 250f, 10f, p)

            canvas.drawLine(450f, 250f, 450f, 275f, p)

            canvas.drawCircle(450f, 275f, 10f, p)

            canvas.drawLine(450f, 275f, 450f, 300f, p)

            canvas.drawCircle(450f, 300f, 10f, p)

            canvas.drawLine(450f, 300f, 450f, 325f, p)

            canvas.drawCircle(450f, 325f, 10f, p)

            canvas.drawLine(450f, 325f, 400f, 375f, p)

            canvas.drawCircle(400f, 375f, 10f, p)

            canvas.drawLine(400f, 375f, 375f, 375f, p)

            canvas.drawCircle(375f, 375f, 10f, p)

            canvas.drawLine(375f, 375f, 300f, 450f, p)

            canvas.drawCircle(300f, 450f, 10f, p)

            canvas.drawLine(300f, 450f, 300f, 475f, p)

            canvas.drawCircle(300f, 475f, 10f, p)

            canvas.drawLine(300f, 475f, 300f, 500f, p)

            canvas.drawCircle(300f, 500f, 10f, p)

            canvas.drawLine(300f, 500f, 300f, 525f, p)

            canvas.drawCircle(300f, 525f, 10f, p)

            canvas.drawLine(300f, 525f, 300f, 550f, p)

            canvas.drawCircle(300f, 550f, 10f, p)

            canvas.drawLine(300f, 550f, 300f, 575f, p)

            canvas.drawCircle(300f, 575f, 10f, p)

            //желтая ветка

            p.color = Color.YELLOW

            canvas.drawCircle(375f, 325f, 10f, p)

            canvas.drawLine(375f, 325f, 450f, 325f, p)

            canvas.drawCircle(450f, 325f, 10f, p)

            canvas.drawLine(450f, 325f, 500f, 325f, p)

            canvas.drawCircle(500f, 325f, 10f, p)

            canvas.drawLine(500f, 325f, 550f, 325f, p)

            canvas.drawCircle(550f, 325f, 10f, p)

            canvas.drawLine(550f, 325f, 600f, 325f, p)

            canvas.drawCircle(600f, 325f, 10f, p)

            canvas.drawLine(600f, 325f, 625f, 350f, p)

            canvas.drawCircle(625f, 350f, 10f, p)

            canvas.drawLine(625f, 350f, 650f, 375f, p)

            canvas.drawCircle(650f, 375f, 10f, p)

            canvas.drawLine(650f, 375f, 675f, 400f, p)

            canvas.drawCircle(675f, 400f, 10f, p)



            //кружочки белого цвета на каждой станции

            p.color = Color.WHITE

            //красная линия

            canvas.drawCircle(450f, 75f, 8f, p) //Девяткино

            canvas.drawCircle(450f, 100f, 8f, p) //Гражданский проспект

            canvas.drawCircle(450f, 125f, 8f, p) //Академическая

            canvas.drawCircle(450f, 150f, 8f, p) //Политехническая

            canvas.drawCircle(450f, 175f, 8f, p) //Площадь Мужества

            canvas.drawCircle(450f, 200f, 8f, p) //Лесная

            canvas.drawCircle(450f, 225f, 8f, p) //Выборгская

            canvas.drawCircle(450f, 250f, 8f, p) //Площадь Ленина

            canvas.drawCircle(450f, 275f, 8f, p) //Чернышевская

            canvas.drawCircle(450f, 300f, 8f, p) //Площадь Восстания

            canvas.drawCircle(450f, 325f, 8f, p) //Владимирская

            canvas.drawCircle(400f, 375f, 8f, p) //Пушкинская

            canvas.drawCircle(375f, 425f, 8f, p) //Технологический институт 1

            canvas.drawCircle(300f, 450f, 8f, p) //Балтийская

            canvas.drawCircle(300f, 475f, 8f, p) //Нарвская

            canvas.drawCircle(300f, 500f, 8f, p) //Кировский завод

            canvas.drawCircle(300f, 525f, 8f, p) //Автово

            canvas.drawCircle(300f, 550f, 8f, p) //Ленинский проспект

            canvas.drawCircle(300f, 575f, 8f, p) //Проспект Ветеранов

            //зеленая линия

            canvas.drawCircle(225f, 175f, 8f, p) //Беговая

            canvas.drawCircle(225f, 200f, 8f, p) //Новокрестовская

            canvas.drawCircle(253f, 250f, 8f, p) //Приморская

            canvas.drawCircle(275f, 275f, 8f, p) //Василеостровская

            canvas.drawCircle(375f, 300f, 8f, p) //Гостинный двор

            canvas.drawCircle(450f, 300f, 8f, p) //Маяковская

            canvas.drawCircle(550f, 325f, 8f, p) //Площадь Александра Невского 1

            canvas.drawCircle(575f, 350f, 8f, p) //Елизаровская

            canvas.drawCircle(600f, 375f, 8f, p) //Ломоносовская

            canvas.drawCircle(625f, 400f, 8f, p) //Пролетарская

            canvas.drawCircle(650f, 425f, 8f, p) //Обухово

            canvas.drawCircle(675f, 450f, 8f, p) //Рыбацкое

            //синия ветка

            canvas.drawCircle(375f, 75f, 8f, p)  //Парнас

            canvas.drawCircle(375f, 100f, 8f, p) //Проспект ПРосвещения

            canvas.drawCircle(375f, 125f, 8f, p) //Озерки

            canvas.drawCircle(375f, 150f, 8f, p) //Удельная

            canvas.drawCircle(375f, 175f, 8f, p) //Пионерская

            canvas.drawCircle(375f, 200f, 8f, p) //Черная речка

            canvas.drawCircle(375f, 225f, 8f, p) //Петроградская

            canvas.drawCircle(375f, 300f, 8f, p) //Горьковская

            canvas.drawCircle(375f, 325f, 8f, p) //Невский проспект

            canvas.drawCircle(375f, 375f, 8f, p) //Сенная площадь

            canvas.drawCircle(375f, 400f, 8f, p) //Технологический институт

            canvas.drawCircle(375f, 425f, 8f, p) //Фрунзенская

            canvas.drawCircle(375f, 450f, 8f, p) //Московские ворота

            canvas.drawCircle(375f, 475f, 8f, p) //Электросила

            canvas.drawCircle(375f, 500f, 8f, p) //Парк Победы

            canvas.drawCircle(375f, 525f, 8f, p) //Московская

            canvas.drawCircle(375f, 550f, 8f, p) //Звездная

            canvas.drawCircle(375f, 575f, 8f, p) //Купчино


            //желтая ветка

            canvas.drawCircle(375f, 325f, 8f, p) //Спасская

            canvas.drawCircle(450f, 325f, 8f, p) //Достоевская

            canvas.drawCircle(500f, 325f, 8f, p) //Лиговский проспект

            canvas.drawCircle(550f, 325f, 8f, p) //Площадь Александра Невского 2

            canvas.drawCircle(600f, 325f, 8f, p) //Новочеркасская

            canvas.drawCircle(625f, 350f, 8f, p) //Ладожская

            canvas.drawCircle(650f, 375f, 8f, p) //ПРоспект Большевиков

            canvas.drawCircle(675f, 400f, 8f, p) //Улица Дыбенко


            //фиолетовая ветка

            canvas.drawCircle(275f, 125f, 8f, p) //Комендантский проспект

            canvas.drawCircle(275f, 150f, 8f, p) //Старая Деревня

            canvas.drawCircle(275f, 175f, 8f, p) //Крестовский остров

            canvas.drawCircle(275f, 200f, 8f, p) //Чкаловская

            canvas.drawCircle(275f, 225f, 8f, p) //Спортивная

            canvas.drawCircle(325f, 260f, 8f, p) //Адмиралтейская

            canvas.drawCircle(375f, 325f, 8f, p) //Садовая

            canvas.drawCircle(400f, 375f, 8f, p) //Звенигородская

            canvas.drawCircle(450f, 450f, 8f, p) //Обводный канал

            canvas.drawCircle(450f, 475f, 8f, p) //Волковская

            canvas.drawCircle(450f, 500f, 8f, p) //Бухарестская

            canvas.drawCircle(450f, 525f, 8f, p) //Международная

            canvas.drawCircle(450f, 550f, 8f, p) //Проспект Славы

            canvas.drawCircle(450f, 575f, 8f, p) //Дунайская

            canvas.drawCircle(450f, 600f, 8f, p) //Шушары

        }


    }

}