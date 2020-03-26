package m.verycool.metromap

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.PointF
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import com.davemorrissey.labs.subscaleview.ImageSource
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView
import m.verycool.metromap.model.MetroMap
import m.verycool.metromap.model.MetroMapFactory
import m.verycool.metromap.model.MetroStationPoint
import m.verycool.metromap.model.MetroTitle
import kotlin.math.abs

class MainActivity : Activity() {

    private val navigator = Navigator(this)

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val metroMap = MetroMapFactory().build(this)
        val imageView = findViewById<SubsamplingScaleImageView>(R.id.activity_main_image_view)
        imageView.maxScale = 10f
        imageView.setImage(ImageSource.bitmap(metroMap.bitmap))

        MetroMapClickListener.Installer(metroMap, navigator).installTo(imageView)
    }

    private class MetroMapClickListener(
        private val imageView: SubsamplingScaleImageView,
        private val metroMap: MetroMap,
        private val navigator: Navigator
    ) : GestureDetector.SimpleOnGestureListener() {
        override fun onSingleTapConfirmed(event: MotionEvent): Boolean {
            val point = imageView.viewToSourceCoord(event.rawX, event.rawY)!!.also(::println)
            val station = getStation(point)
            if (station != null) {
                navigator.navigateToInfoScreen(station)
            }
            return true
        }

        class Installer(private val metroMap: MetroMap, private val navigator: Navigator) {

            @SuppressLint("ClickableViewAccessibility")
            fun installTo(imageView: SubsamplingScaleImageView) {
                val listener = MetroMapClickListener(imageView, metroMap, navigator)
                val detector = GestureDetector(imageView.context, listener)
                imageView.setOnTouchListener { _, event ->
                    detector.onTouchEvent(event)
                }
            }
        }

        private fun getStation(point: PointF) = metroMap.stations.find { station ->
            val onX = abs(station.x - point.x) <= 16
            val onY = abs(station.y - point.y) <= 16
            return@find onX && onY
        }
    }

}

class Navigator(private val context: Context) {

    fun navigateToInfoScreen(metroStationPoint: MetroStationPoint) {
        println(metroStationPoint.title)
        val intent = Intent(context, InfoActivity::class.java)
        intent.putExtra(MetroTitle::class.java.simpleName, metroStationPoint.title)
        context.startActivity(intent)
    }
}



