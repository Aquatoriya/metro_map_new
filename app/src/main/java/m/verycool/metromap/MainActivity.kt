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
            p.strokeWidth = 15f

            // рисуем точку (50,50)
            //canvas.drawPoint(50f, 50f, p)

            // рисуем линию от (100,100) до (500,50)



            //зеленаяая ветка

            p.color = Color.GREEN

            canvas.drawCircle(50f, 250f, 10f, p)

            canvas.drawLine(50f, 250f, 50f, 300f, p)

            canvas.drawCircle(50f, 300f, 10f, p)

            canvas.drawLine(50f, 300f, 100f, 400f, p)

            canvas.drawCircle(100f, 400f, 10f, p)

            canvas.drawLine(100f, 400f, 150f, 450f, p)

            canvas.drawCircle(150f, 450f, 10f, p)

            canvas.drawLine(150f, 450f, 350f, 450f, p)

            canvas.drawCircle(350f, 450f, 10f, p)

            canvas.drawLine(350f, 450f, 500f, 450f, p)

            canvas.drawCircle(500f, 450f, 10f, p)

            canvas.drawLine(500f, 450f, 600f, 550f, p)

            canvas.drawCircle(600f, 550f, 10f, p)

            canvas.drawLine(600f, 550f, 650f, 600f, p)

            canvas.drawCircle(650f, 600f, 10f, p)

            canvas.drawLine(650f, 600f, 700f, 650f, p)

            canvas.drawCircle(700f, 650f, 10f, p)

            canvas.drawLine(700f, 650f, 750f, 700f, p)

            canvas.drawCircle(750f, 700f, 10f, p)

            canvas.drawLine(750f, 700f, 800f, 750f, p)

            canvas.drawCircle(800f, 750f, 10f, p)

            canvas.drawLine(800f, 750f, 850f, 800f, p)

            canvas.drawCircle(850f, 800f, 10f, p)

            canvas.drawLine(850f, 800f, 900f, 850f, p)

            canvas.drawCircle(900f, 850f, 10f, p)

            //фиолетовая ветка

            p.color = Color.BLACK

            canvas.drawCircle(150f, 200f, 10f, p)

            canvas.drawLine(150f, 200f, 150f, 250f, p)

            canvas.drawCircle(150f, 250f, 10f, p)

            canvas.drawLine(150f, 250f, 150f, 300f, p)

            canvas.drawCircle(150f, 300f, 10f, p)

            canvas.drawLine(150f, 300f, 200f, 350f, p)

            canvas.drawCircle(200f, 350f, 10f, p)

            canvas.drawLine(200f, 350f, 250f, 400f, p)

            canvas.drawCircle(250f, 400f, 10f, p)

            canvas.drawLine(250f, 400f, 200f, 450f, p)

            canvas.drawCircle(200f, 450f, 10f, p)

            canvas.drawLine(200f, 450f, 300f, 500f, p)

            canvas.drawCircle(300f, 500f, 10f, p)

            canvas.drawLine(300f, 500f, 350f, 550f, p)

            canvas.drawCircle(350f, 550f, 10f, p)

            canvas.drawLine(350f, 550f, 400f, 700f, p)

            canvas.drawCircle(400f, 700f, 10f, p)

            canvas.drawLine(400f, 700f, 500f, 800f, p)

            canvas.drawCircle(500f, 800f, 10f, p)

            canvas.drawLine(500f, 800f, 500f, 850f, p)

            canvas.drawCircle(500f, 850f, 10f, p)

            canvas.drawLine(500f, 850f, 500f, 900f, p)

            canvas.drawCircle(500f, 900f, 10f, p)

            canvas.drawLine(500f, 900f, 500f, 950f, p)

            canvas.drawCircle(500f, 950f, 10f, p)

            canvas.drawLine(500f, 950f, 500f, 1000f, p)

            canvas.drawCircle(500f, 1000f, 10f, p)

            canvas.drawLine(500f, 1000f, 500f, 1050f, p)

            canvas.drawCircle(500f, 1050f, 10f, p)

            canvas.drawLine(500f, 1050f, 500f, 1100f, p)

            canvas.drawCircle(500f, 1100f, 10f, p)

            //синия ветка

            p.color = Color.BLUE

            canvas.drawCircle(350f, 50f, 10f, p)

            canvas.drawLine(350f, 50f, 350f, 100f, p)

            canvas.drawCircle(350f, 100f, 10f, p)

            canvas.drawLine(350f, 100f, 350f, 150f, p)

            canvas.drawCircle(350f, 150f, 10f, p)

            canvas.drawLine(350f, 150f, 350f, 200f, p)

            canvas.drawCircle(350f, 200f, 10f, p)

            canvas.drawLine(350f, 200f, 350f, 250f, p)

            canvas.drawCircle(350f, 250f, 10f, p)

            canvas.drawLine(350f, 250f, 350f, 300f, p)

            canvas.drawCircle(350f, 300f, 10f, p)

            canvas.drawLine(350f, 300f, 350f, 400f, p)

            canvas.drawCircle(350f, 400f, 10f, p)

            canvas.drawLine(350f, 400f, 350f, 450f, p)

            canvas.drawCircle(350f, 450f, 10f, p)

            canvas.drawLine(350f, 450f, 350f, 500f, p)

            canvas.drawCircle(350f, 500f, 10f, p)

            canvas.drawLine(350f, 500f, 350f, 650f, p)

            canvas.drawCircle(350f, 650f, 10f, p)

            canvas.drawLine(350f, 650f, 350f, 700f, p)

            canvas.drawCircle(350f, 700f, 10f, p)

            canvas.drawLine(350f, 700f, 350f, 750f, p)

            canvas.drawCircle(350f, 750f, 10f, p)

            canvas.drawLine(350f, 750f, 350f, 800f, p)

            canvas.drawCircle(350f, 800f, 10f, p)

            canvas.drawLine(350f, 800f, 350f, 850f, p)

            canvas.drawCircle(350f, 850f, 10f, p)

            canvas.drawLine(350f, 850f, 350f, 900f, p)

            canvas.drawCircle(350f, 900f, 10f, p)

            canvas.drawLine(350f, 900f, 350f, 950f, p)

            canvas.drawCircle(350f, 950f, 10f, p)

            canvas.drawLine(350f, 950f, 350f, 1000f, p)

            canvas.drawCircle(350f, 1000f, 10f, p)

            canvas.drawLine(350f, 1000f, 350f, 1050f, p)

            canvas.drawCircle(350f, 1050f, 10f, p)

            //красная ветка

            p.color = Color.RED

            canvas.drawCircle(500f, 50f, 10f, p)

            canvas.drawLine(500f, 50f, 500f, 100f, p)

            canvas.drawCircle(500f, 100f, 10f, p)

            canvas.drawLine(500f, 100f, 500f, 150f, p)

            canvas.drawCircle(500f, 150f, 10f, p)

            canvas.drawLine(500f, 150f, 500f, 200f, p)

            canvas.drawCircle(500f, 200f, 10f, p)

            canvas.drawLine(500f, 200f, 500f, 250f, p)

            canvas.drawCircle(500f, 250f, 10f, p)

            canvas.drawLine(500f, 250f, 500f, 300f, p)

            canvas.drawCircle(500f, 300f, 10f, p)

            canvas.drawLine(500f, 300f, 500f, 350f, p)

            canvas.drawCircle(500f, 350f, 10f, p)

            canvas.drawLine(500f, 350f, 500f, 400f, p)

            canvas.drawCircle(500f, 400f, 10f, p)

            canvas.drawLine(500f, 400f, 500f, 450f, p)

            canvas.drawCircle(500f, 450f, 10f, p)

            canvas.drawLine(500f, 450f, 500f, 500f, p)

            canvas.drawCircle(500f, 500f, 10f, p)

            canvas.drawLine(500f, 500f, 500f, 650f, p)

            canvas.drawCircle(500f, 650f, 10f, p)

            canvas.drawLine(500f, 650f, 400f, 750f, p)

            canvas.drawCircle(400f, 750f, 10f, p)

            canvas.drawLine(400f, 750f, 350f, 750f, p)

            canvas.drawCircle(350f, 750f, 10f, p)

            canvas.drawLine(350f, 750f, 200f, 800f, p)

            canvas.drawCircle(200f, 800f, 10f, p)

            canvas.drawLine(200f, 800f, 200f, 850f, p)

            canvas.drawCircle(200f, 850f, 10f, p)

            canvas.drawLine(200f, 850f, 200f, 900f, p)

            canvas.drawCircle(200f, 900f, 10f, p)

            canvas.drawLine(200f, 900f, 200f, 950f, p)

            canvas.drawCircle(200f, 950f, 10f, p)

            canvas.drawLine(200f, 950f, 200f, 1000f, p)

            canvas.drawCircle(200f, 1000f, 10f, p)

            canvas.drawLine(200f, 1000f, 200f, 1050f, p)

            canvas.drawCircle(200f, 1050f, 10f, p)

            //желтая ветка

            p.color = Color.YELLOW

            canvas.drawCircle(350f, 500f, 10f, p)

            canvas.drawLine(350f, 500f, 500f, 500f, p)

            canvas.drawCircle(500f, 500f, 10f, p)

            canvas.drawLine(500f, 500f, 600f, 500f, p)

            canvas.drawCircle(600f, 500f, 10f, p)

            canvas.drawLine(600f, 500f, 550f, 450f, p)

            canvas.drawCircle(550f, 450f, 10f, p)

            canvas.drawLine(550f, 450f, 600f, 500f, p)

            canvas.drawCircle(600f, 500f, 10f, p)

            canvas.drawLine(600f, 500f, 650f, 550f, p)

            canvas.drawCircle(650f, 550f, 10f, p)

            canvas.drawLine(650f, 550f, 700f, 600f, p)

            canvas.drawCircle(700f, 600f, 10f, p)

            canvas.drawLine(700f, 600f, 750f, 650f, p)

            canvas.drawCircle(750f, 650f, 10f, p)

            canvas.drawLine(750f, 650f, 800f, 700f, p)

            canvas.drawCircle(800f, 700f, 10f, p)
            // рисуем прямоугольник
            // левая верхняя точка (200,150), нижняя правая (400,200)
            //canvas.drawRect(200f, 150f, 400f, 200f, p)

            // настройка объекта Rect
            // левая верхняя точка (250,300), нижняя правая (350,500)
            //rect.set(250, 300, 350, 500)
            // рисуем прямоугольник из объекта rect
            //canvas.drawRect(rect, p)
        }

    }

}