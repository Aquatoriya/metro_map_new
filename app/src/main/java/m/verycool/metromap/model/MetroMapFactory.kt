package m.verycool.metromap.model

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

class MetroMapFactory {

    private val metroStationList = listOf(
        MetroStationPoint(225, 175, MetroBranch.GREEN, MetroTitle.Begovaya),
        MetroStationPoint(225, 200, MetroBranch.GREEN, MetroTitle.Novokrestovskaya),
        MetroStationPoint(253, 250, MetroBranch.GREEN, MetroTitle.Primorskaya),
        MetroStationPoint(275, 275, MetroBranch.GREEN, MetroTitle.Vasileostrovskaya),
        MetroStationPoint(375, 300, MetroBranch.GREEN, MetroTitle.Dvor),
        MetroStationPoint(450, 300, MetroBranch.GREEN, MetroTitle.Mayakovskaya),
        MetroStationPoint(550, 325, MetroBranch.GREEN, MetroTitle.AlexandraNevskogo_1),
        MetroStationPoint(575, 350, MetroBranch.GREEN, MetroTitle.Elizarovskaya),
        MetroStationPoint(600, 375, MetroBranch.GREEN, MetroTitle.Lomonosovskaya),
        MetroStationPoint(625, 400, MetroBranch.GREEN, MetroTitle.Proletarskaya),
        MetroStationPoint(650, 425, MetroBranch.GREEN, MetroTitle.Obuhovo),
        MetroStationPoint(675, 450, MetroBranch.GREEN, MetroTitle.Rybatskoe),

        MetroStationPoint(375, 325, MetroBranch.ORANGE, MetroTitle.Spasskaya),
        MetroStationPoint(450, 325, MetroBranch.ORANGE, MetroTitle.Dostoevskaya),
        MetroStationPoint(500, 325, MetroBranch.ORANGE, MetroTitle.Ligovskiy),
        MetroStationPoint(550, 325, MetroBranch.ORANGE, MetroTitle.AlexandraNevskogo_2),
        MetroStationPoint(600, 325, MetroBranch.ORANGE, MetroTitle.Novocherkasskaya),
        MetroStationPoint(625, 350, MetroBranch.ORANGE, MetroTitle.Ladozhskaya),
        MetroStationPoint(650, 375, MetroBranch.ORANGE, MetroTitle.Bolshevikov),
        MetroStationPoint(675, 400, MetroBranch.ORANGE, MetroTitle.Dybenko),

        MetroStationPoint(375, 75, MetroBranch.BLUE, MetroTitle.Parnas),
        MetroStationPoint(375, 100, MetroBranch.BLUE, MetroTitle.Prosvechenia),
        MetroStationPoint(375, 125, MetroBranch.BLUE, MetroTitle.Ozerki),
        MetroStationPoint(375, 150, MetroBranch.BLUE, MetroTitle.Udelnaya),
        MetroStationPoint(375, 175, MetroBranch.BLUE, MetroTitle.Pionerskaya),
        MetroStationPoint(375, 200, MetroBranch.BLUE, MetroTitle.Rechka),
        MetroStationPoint(375, 225, MetroBranch.BLUE, MetroTitle.Petrogradskaya),
        MetroStationPoint(375, 300, MetroBranch.BLUE, MetroTitle.Gorkovskaya),
        MetroStationPoint(375, 325, MetroBranch.BLUE, MetroTitle.Nevskiy),
        MetroStationPoint(375, 375, MetroBranch.BLUE,MetroTitle.Sennaya),
        MetroStationPoint(375, 400, MetroBranch.BLUE, MetroTitle.Institut),
        MetroStationPoint(375, 425, MetroBranch.BLUE, MetroTitle.Frunzenskaya),
        MetroStationPoint(375, 450, MetroBranch.BLUE, MetroTitle.MoskovskieVorota),
        MetroStationPoint(375, 475, MetroBranch.BLUE, MetroTitle.Electrosila),
        MetroStationPoint(375, 500, MetroBranch.BLUE, MetroTitle.ParkPobedy),
        MetroStationPoint(375, 525, MetroBranch.BLUE, MetroTitle.Moskovskaya),
        MetroStationPoint(375, 550, MetroBranch.BLUE, MetroTitle.Zvezdnaya),
        MetroStationPoint(375, 575, MetroBranch.BLUE, MetroTitle.Kupchino),

        MetroStationPoint(450, 75, MetroBranch.RED, MetroTitle.Devyatkino),
        MetroStationPoint(450, 100, MetroBranch.RED,MetroTitle.GrazhdanskyProspect),
        MetroStationPoint(450, 125, MetroBranch.RED,MetroTitle.Academicheskaya),
        MetroStationPoint(450, 150, MetroBranch.RED,MetroTitle.Politech),
        MetroStationPoint(450, 175, MetroBranch.RED,MetroTitle.Muzhestva),
        MetroStationPoint(450, 200, MetroBranch.RED,MetroTitle.Lesnaya),
        MetroStationPoint(450, 225, MetroBranch.RED,MetroTitle.Vyborgskaya),
        MetroStationPoint(450, 250, MetroBranch.RED,MetroTitle.PloshadLenina),
        MetroStationPoint(450, 275, MetroBranch.RED,MetroTitle.Chernishevskaya),
        MetroStationPoint(450, 300, MetroBranch.RED,MetroTitle.Vosstaniya),
        MetroStationPoint(450, 325, MetroBranch.RED,MetroTitle.Vladimirskaya),
        MetroStationPoint(450, 375, MetroBranch.RED,MetroTitle.Pushkinskaya),
        MetroStationPoint(450, 425, MetroBranch.RED,MetroTitle.Institut),
        MetroStationPoint(450, 450, MetroBranch.RED,MetroTitle.Baltiyskaya),
        MetroStationPoint(450, 475, MetroBranch.RED,MetroTitle.Narvskaya),
        MetroStationPoint(450, 500, MetroBranch.RED,MetroTitle.Kirovskiy),
        MetroStationPoint(450, 525, MetroBranch.RED,MetroTitle.Avtovo),
        MetroStationPoint(450, 550, MetroBranch.RED,MetroTitle.Leninskiy),
        MetroStationPoint(450, 575, MetroBranch.RED,MetroTitle.Veteranov),

        MetroStationPoint(275, 125, MetroBranch.PURPLE, MetroTitle.Komendantskiy),
        MetroStationPoint(275, 150, MetroBranch.PURPLE, MetroTitle.StarayaDerevnya),
        MetroStationPoint(275, 175, MetroBranch.PURPLE, MetroTitle.Krestovskiy),
        MetroStationPoint(275, 200, MetroBranch.PURPLE, MetroTitle.Chkalovskaya),
        MetroStationPoint(275, 225, MetroBranch.PURPLE, MetroTitle.Sportivnaya),
        MetroStationPoint(325, 260, MetroBranch.PURPLE, MetroTitle.Admiralteyskaya),
        MetroStationPoint(375, 325, MetroBranch.PURPLE, MetroTitle.Sadovaya),
        MetroStationPoint(400, 375, MetroBranch.PURPLE, MetroTitle.Zvenigorodskaya),
        MetroStationPoint(450, 450, MetroBranch.PURPLE, MetroTitle.Obvodniy),
        MetroStationPoint(450, 475, MetroBranch.PURPLE, MetroTitle.Volkovskaya),
        MetroStationPoint(450, 500, MetroBranch.PURPLE, MetroTitle.Buharestskaya),
        MetroStationPoint(450, 525, MetroBranch.PURPLE, MetroTitle.Mezhdunarodnaya),
        MetroStationPoint(450, 550, MetroBranch.PURPLE, MetroTitle.ProspectSlavi),
        MetroStationPoint(450, 575, MetroBranch.PURPLE, MetroTitle.Dunayskaya),
        MetroStationPoint(450, 600, MetroBranch.PURPLE, MetroTitle.Shushari)
    )

    private fun getPaint(color: Int): Paint {
        val paint = Paint()
        paint.color = color
        paint.strokeWidth = 10f
        return paint
    }

    private fun getMetroStation(title: MetroTitle) = metroStationList.find { it.title == title }!!

    private fun MetroStationPoint.drawPoint(canvas: Canvas, paint: Paint) {
        canvas.drawCircle(x.toFloat(), y.toFloat(), 8f, paint)
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

        getMetroStation(MetroTitle.Begovaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Novokrestovskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Primorskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Vasileostrovskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Dvor).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Mayakovskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.AlexandraNevskogo_1).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Elizarovskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Lomonosovskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Proletarskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Obuhovo).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Rybatskoe).drawPoint(canvas, paint)
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

        getMetroStation(MetroTitle.Komendantskiy).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.StarayaDerevnya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Krestovskiy).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Chkalovskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Sportivnaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Admiralteyskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Sadovaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Zvenigorodskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Obvodniy).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Volkovskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Buharestskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Mezhdunarodnaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.ProspectSlavi).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Dunayskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Shushari).drawPoint(canvas, paint)
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

        getMetroStation(MetroTitle.Parnas).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Prosvechenia).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Ozerki).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Udelnaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Pionerskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Rechka).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Petrogradskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Gorkovskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Nevskiy).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Sennaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Institut).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Frunzenskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.MoskovskieVorota).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Electrosila).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.ParkPobedy).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Moskovskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Zvezdnaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Kupchino).drawPoint(canvas, paint)

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

        getMetroStation(MetroTitle.Devyatkino).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.GrazhdanskyProspect).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Academicheskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Politech).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Muzhestva).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Lesnaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Vyborgskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.PloshadLenina).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Chernishevskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Vosstaniya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Vladimirskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Pushkinskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Institut).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Baltiyskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Narvskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Kirovskiy).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Avtovo).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Leninskiy).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Veteranov).drawPoint(canvas, paint)
    }

    private fun buildOrangeBranch(canvas: Canvas) {
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

        getMetroStation(MetroTitle.Spasskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Dostoevskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Ligovskiy).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.AlexandraNevskogo_2).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Novocherkasskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Ladozhskaya).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Bolshevikov).drawPoint(canvas, paint)
        getMetroStation(MetroTitle.Dybenko).drawPoint(canvas, paint)

    }

    fun build(context: Context): MetroMap {
        val bitmap = buildMetroMapBitmap()
        return MetroMap(bitmap, metroStationList)
    }

    private fun buildMetroMapBitmap(): Bitmap {
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