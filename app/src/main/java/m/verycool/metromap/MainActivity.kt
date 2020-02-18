package m.verycool.metromap

import android.app.Activity
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.os.Bundle
import android.view.View


class MainActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(DrawView(this))
    }



    internal inner class DrawView(context: Context) : View(context) {

        var p: Paint
        var rect: Rect

        init {
            p = Paint()
            rect = Rect()
        }


        override fun onDraw(canvas: Canvas) {

            // заливка канвы белым цветом
            canvas.drawARGB(0, 0, 0, 0)


            // толщина линии = 15
            p.strokeWidth = 10f

            //зеленаяая ветка

            p.color = Color.GREEN

            canvas.drawCircle(25f, 125f, 10f, p)

            canvas.drawLine(25f, 125f, 25f, 150f, p)

            canvas.drawCircle(25f, 150f, 10f, p)

            canvas.drawLine(25f, 150f, 53f, 200f, p)

            canvas.drawCircle(53f, 200f, 10f, p)

            canvas.drawLine(53f, 200f, 75f, 225f, p)

            canvas.drawCircle(75f, 225f, 10f, p)

            canvas.drawLine(75f, 225f, 175f, 250f, p)

            canvas.drawCircle(175f, 250f, 10f, p)

            canvas.drawLine(175f, 250f, 250f, 250f, p)

            canvas.drawCircle(250f, 250f, 10f, p)

            canvas.drawLine(250f, 250f, 350f, 275f, p)

            canvas.drawCircle(350f, 275f, 10f, p)

            canvas.drawLine(350f, 275f, 375f, 300f, p)

            canvas.drawCircle(375f, 300f, 10f, p)

            canvas.drawLine(375f, 300f, 400f, 325f, p)

            canvas.drawCircle(400f, 325f, 10f, p)

            canvas.drawLine(400f, 325f, 425f, 350f, p)

            canvas.drawCircle(425f, 350f, 10f, p)

            canvas.drawLine(425f, 350f, 450f, 375f, p)

            canvas.drawCircle(450f, 375f, 10f, p)

            canvas.drawLine(450f, 375f, 475f, 400f, p)

            canvas.drawCircle(475f, 400f, 10f, p)

            //фиолетовая ветка

            p.color = Color.BLACK

            canvas.drawCircle(75f, 100f, 10f, p)

            canvas.drawLine(75f, 100f, 75f, 125f, p)

            canvas.drawCircle(75f, 125f, 10f, p)

            canvas.drawLine(75f, 125f, 75f, 150f, p)

            canvas.drawCircle(75f, 150f, 10f, p)

            canvas.drawLine(75f, 150f, 75f, 175f, p)

            canvas.drawCircle(75f, 175f, 10f, p)

            canvas.drawLine(75f, 175f, 75f, 200f, p)

            canvas.drawCircle(75f, 200f, 10f, p)

            canvas.drawLine(75f, 200f, 125f, 238f, p)

            canvas.drawCircle(125f, 238f, 10f, p)

            canvas.drawLine(125f, 238f, 175f, 275f, p)

            canvas.drawCircle(175f, 275f, 10f, p)

            canvas.drawLine(175f, 275f, 200f, 325f, p)

            canvas.drawCircle(200f, 325f, 10f, p)

            canvas.drawLine(200f, 325f, 250f, 400f, p)

            canvas.drawCircle(250f, 400f, 10f, p)

            canvas.drawLine(250f, 400f, 250f, 425f, p)

            canvas.drawCircle(250f, 425f, 10f, p)

            canvas.drawLine(250f, 425f, 250f, 450f, p)

            canvas.drawCircle(250f, 450f, 10f, p)

            canvas.drawLine(250f, 450f, 250f, 475f, p)

            canvas.drawCircle(250f, 475f, 10f, p)

            canvas.drawLine(250f, 475f, 250f, 500f, p)

            canvas.drawCircle(250f, 500f, 10f, p)

            canvas.drawLine(250f, 500f, 250f, 525f, p)

            canvas.drawCircle(250f, 525f, 10f, p)

            canvas.drawLine(250f, 525f, 250f, 525f, p)

            canvas.drawCircle(250f, 525f, 10f, p)

            canvas.drawLine(250f, 525f, 250f, 550f, p)

            canvas.drawCircle(250f, 550f, 10f, p)

            //синия ветка

            p.color = Color.BLUE

            canvas.drawCircle(175f, 25f, 10f, p)

            canvas.drawLine(175f, 25f, 175f, 50f, p)

            canvas.drawCircle(175f, 50f, 10f, p)

            canvas.drawLine(175f, 50f, 175f, 75f, p)

            canvas.drawCircle(175f, 75f, 10f, p)

            canvas.drawLine(175f, 75f, 175f, 100f, p)

            canvas.drawCircle(175f, 100f, 10f, p)

            canvas.drawLine(175f, 100f, 175f, 125f, p)

            canvas.drawCircle(175f, 125f, 10f, p)

            canvas.drawLine(175f, 125f, 175f, 150f, p)

            canvas.drawCircle(175f, 150f, 10f, p)

            canvas.drawLine(175f, 150f, 175f, 175f, p)

            canvas.drawCircle(175f, 175f, 10f, p)

            canvas.drawLine(175f, 175f, 175f, 250f, p)

            canvas.drawCircle(175f, 250f, 10f, p)

            canvas.drawLine(175f, 250f, 175f, 275f, p)

            canvas.drawCircle(175f, 275f, 10f, p)

            canvas.drawLine(175f, 275f, 175f, 325f, p)

            canvas.drawCircle(175f, 325f, 10f, p)

            canvas.drawLine(175f, 325f, 175f, 350f, p)

            canvas.drawCircle(175f, 350f, 10f, p)

            canvas.drawLine(175f, 350f, 175f, 375f, p)

            canvas.drawCircle(175f, 375f, 10f, p)

            canvas.drawLine(175f, 375f, 175f, 400f, p)

            canvas.drawCircle(175f, 400f, 10f, p)

            canvas.drawLine(175f, 400f, 175f, 425f, p)

            canvas.drawCircle(175f, 425f, 10f, p)

            canvas.drawLine(175f, 425f, 175f, 450f, p)

            canvas.drawCircle(175f, 450f, 10f, p)

            canvas.drawLine(175f, 450f, 175f, 475f, p)

            canvas.drawCircle(175f, 475f, 10f, p)

            canvas.drawLine(175f, 475f, 175f, 500f, p)

            canvas.drawCircle(175f, 500f, 10f, p)

            canvas.drawLine(175f, 500f, 175f, 525f, p)

            canvas.drawCircle(175f, 525f, 10f, p)

            //красная ветка

            p.color = Color.RED

            canvas.drawCircle(250f, 25f, 10f, p)

            canvas.drawLine(250f, 25f, 250f, 50f, p)

            canvas.drawCircle(250f, 50f, 10f, p)

            canvas.drawLine(250f, 50f, 250f, 75f, p)

            canvas.drawCircle(250f, 75f, 10f, p)

            canvas.drawLine(250f, 75f, 250f, 100f, p)

            canvas.drawCircle(250f, 100f, 10f, p)

            canvas.drawLine(250f, 100f, 250f, 125f, p)

            canvas.drawCircle(250f, 125f, 10f, p)

            canvas.drawLine(250f, 125f, 250f, 150f, p)

            canvas.drawCircle(250f, 150f, 10f, p)

            canvas.drawLine(250f, 150f, 250f, 175f, p)

            canvas.drawCircle(250f, 175f, 10f, p)

            canvas.drawLine(250f, 175f, 250f, 200f, p)

            canvas.drawCircle(250f, 200f, 10f, p)

            canvas.drawLine(250f, 200f, 250f, 225f, p)

            canvas.drawCircle(250f, 225f, 10f, p)

            canvas.drawLine(250f, 225f, 250f, 250f, p)

            canvas.drawCircle(250f, 250f, 10f, p)

            canvas.drawLine(250f, 250f, 250f, 275f, p)

            canvas.drawCircle(250f, 275f, 10f, p)

            canvas.drawLine(250f, 275f, 200f, 325f, p)

            canvas.drawCircle(200f, 325f, 10f, p)

            canvas.drawLine(200f, 325f, 175f, 325f, p)

            canvas.drawCircle(175f, 325f, 10f, p)

            canvas.drawLine(175f, 325f, 100f, 400f, p)

            canvas.drawCircle(100f, 400f, 10f, p)

            canvas.drawLine(100f, 400f, 100f, 425f, p)

            canvas.drawCircle(100f, 425f, 10f, p)

            canvas.drawLine(100f, 425f, 100f, 450f, p)

            canvas.drawCircle(100f, 450f, 10f, p)

            canvas.drawLine(100f, 450f, 100f, 475f, p)

            canvas.drawCircle(100f, 475f, 10f, p)

            canvas.drawLine(100f, 475f, 100f, 500f, p)

            canvas.drawCircle(100f, 500f, 10f, p)

            canvas.drawLine(100f, 500f, 100f, 525f, p)

            canvas.drawCircle(100f, 525f, 10f, p)

            //желтая ветка

            p.color = Color.YELLOW

            canvas.drawCircle(175f, 275f, 10f, p)

            canvas.drawLine(175f, 275f, 250f, 275f, p)

            canvas.drawCircle(250f, 275f, 10f, p)

            canvas.drawLine(250f, 275f, 300f, 275f, p)

            canvas.drawCircle(300f, 275f, 10f, p)

            canvas.drawLine(300f, 275f, 350f, 275f, p)

            canvas.drawCircle(350f, 275f, 10f, p)

            canvas.drawLine(350f, 275f, 400f, 275f, p)

            canvas.drawCircle(400f, 275f, 10f, p)

            canvas.drawLine(400f, 275f, 425f, 300f, p)

            canvas.drawCircle(425f, 300f, 10f, p)

            canvas.drawLine(425f, 300f, 450f, 325f, p)

            canvas.drawCircle(450f, 325f, 10f, p)

            canvas.drawLine(450f, 325f, 475f, 350f, p)

            canvas.drawCircle(475f, 350f, 10f, p)



            //кружочки белого цвета на каждой станции

            p.color = Color.WHITE

            //красная линия

            canvas.drawCircle(250f, 25f, 8f, p) //Девяткино

            canvas.drawCircle(250f, 50f, 8f, p) //Гражданский проспект

            canvas.drawCircle(250f, 75f, 8f, p) //Академическая

            canvas.drawCircle(250f, 100f, 8f, p) //Политехническая

            canvas.drawCircle(250f, 125f, 8f, p) //Площадь Мужества

            canvas.drawCircle(250f, 150f, 8f, p) //Лесная

            canvas.drawCircle(250f, 175f, 8f, p) //Выборгская

            canvas.drawCircle(250f, 200f, 8f, p) //Площадь Ленина

            canvas.drawCircle(250f, 225f, 8f, p) //Чернышевская

            canvas.drawCircle(250f, 250f, 8f, p) //Площадь Восстания

            canvas.drawCircle(250f, 275f, 8f, p) //Владимирская

            canvas.drawCircle(200f, 325f, 8f, p) //Пушкинская

            canvas.drawCircle(175f, 375f, 8f, p) //Технологический институт 1

            canvas.drawCircle(100f, 400f, 8f, p) //Балтийская

            canvas.drawCircle(100f, 425f, 8f, p) //Нарвская

            canvas.drawCircle(100f, 450f, 8f, p) //Кировский завод

            canvas.drawCircle(100f, 475f, 8f, p) //Автово

            canvas.drawCircle(100f, 500f, 8f, p) //Ленинский проспект

            canvas.drawCircle(100f, 525f, 8f, p) //Проспект Ветеранов

            //зеленая линия

            canvas.drawCircle(25f, 125f, 8f, p) //Беговая

            canvas.drawCircle(25f, 150f, 8f, p) //Новокрестовская

            canvas.drawCircle(53f, 200f, 8f, p) //Приморская

            canvas.drawCircle(75f, 225f, 8f, p) //Василеостровская

            canvas.drawCircle(175f, 250f, 8f, p) //Гостинный двор

            canvas.drawCircle(250f, 250f, 8f, p) //Маяковская

            canvas.drawCircle(350f, 275f, 8f, p) //Площадь Александра Невского 1

            canvas.drawCircle(375f, 300f, 8f, p) //Елизаровская

            canvas.drawCircle(400f, 325f, 8f, p) //Ломоносовская

            canvas.drawCircle(425f, 350f, 8f, p) //Пролетарская

            canvas.drawCircle(450f, 375f, 8f, p) //Обухово

            canvas.drawCircle(475f, 400f, 8f, p) //Рыбацкое

            //синия ветка

            canvas.drawCircle(175f, 25f, 8f, p)  //Парнас

            canvas.drawCircle(175f, 50f, 8f, p) //Проспект ПРосвещения

            canvas.drawCircle(175f, 75f, 8f, p) //Озерки

            canvas.drawCircle(175f, 100f, 8f, p) //Удельная

            canvas.drawCircle(175f, 125f, 8f, p) //Пионерская

            canvas.drawCircle(175f, 150f, 8f, p) //Черная речка

            canvas.drawCircle(175f, 175f, 8f, p) //Петроградская

            canvas.drawCircle(175f, 250f, 8f, p) //Горьковская

            canvas.drawCircle(175f, 275f, 8f, p) //Невский проспект

            canvas.drawCircle(175f, 325f, 8f, p) //Сенная площадь

            canvas.drawCircle(175f, 350f, 8f, p) //Технологический институт

            canvas.drawCircle(175f, 375f, 8f, p) //Фрунзенская

            canvas.drawCircle(175f, 400f, 8f, p) //Московские ворота

            canvas.drawCircle(175f, 425f, 8f, p) //Электросила

            canvas.drawCircle(175f, 450f, 8f, p) //Парк Победы

            canvas.drawCircle(175f, 475f, 8f, p) //Московская

            canvas.drawCircle(175f, 500f, 8f, p) //Звездная

            canvas.drawCircle(175f, 525f, 8f, p) //Купчино


            //желтая ветка

            canvas.drawCircle(175f, 275f, 8f, p) //Спасская

            canvas.drawCircle(250f, 275f, 8f, p) //Достоевская

            canvas.drawCircle(300f, 275f, 8f, p) //Лиговский проспект

            canvas.drawCircle(350f, 275f, 8f, p) //Площадь Александра Невского 2

            canvas.drawCircle(400f, 275f, 8f, p) //Новочеркасская

            canvas.drawCircle(425f, 300f, 8f, p) //Ладожская

            canvas.drawCircle(450f, 325f, 8f, p) //ПРоспект Большевиков

            canvas.drawCircle(475f, 350f, 8f, p) //Улица Дыбенко


            //фиолетовая ветка

            canvas.drawCircle(75f, 100f, 8f, p) //Комендантский проспект

            canvas.drawCircle(75f, 125f, 8f, p) //Старая Деревня

            canvas.drawCircle(75f, 150f, 8f, p) //Крестовский остров

            canvas.drawCircle(75f, 175f, 8f, p) //Чкаловская

            canvas.drawCircle(75f, 200f, 8f, p) //Спортивная

            canvas.drawCircle(125f, 238f, 8f, p) //Адмиралтейская

            canvas.drawCircle(175f, 275f, 8f, p) //Садовая

            canvas.drawCircle(200f, 325f, 8f, p) //Звенигородская

            canvas.drawCircle(250f, 400f, 8f, p) //Обводный канал

            canvas.drawCircle(250f, 425f, 8f, p) //Волковская

            canvas.drawCircle(250f, 450f, 8f, p) //Бухарестская

            canvas.drawCircle(250f, 475f, 8f, p) //Международная

            canvas.drawCircle(250f, 500f, 8f, p) //Проспект Славы

            canvas.drawCircle(250f, 525f, 8f, p) //Дунайская

            canvas.drawCircle(250f, 550f, 8f, p) //Шушары



        }

    }

}