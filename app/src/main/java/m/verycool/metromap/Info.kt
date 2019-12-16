package m.verycool.metromap

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import m.verycool.metromap.ui.info.InfoFragment

class Info : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, InfoFragment.newInstance())
                .commitNow()
        }

        val imageView = findViewById<ImageView>(R.id.avtovo)
        val imgResId = R.drawable.avtovo_1
        var resId = imgResId
        imageView.setImageResource(imgResId)
    }

}
