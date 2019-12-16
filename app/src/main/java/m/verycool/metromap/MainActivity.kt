package m.verycool.metromap

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imageView = findViewById<ImageView>(R.id.scheme)
        val imgResId = R.drawable.metro_scheme_image_2
        var resId = imgResId
        imageView.setImageResource(imgResId)
    }

}
