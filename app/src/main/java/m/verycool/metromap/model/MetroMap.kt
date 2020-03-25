package m.verycool.metromap.model

import android.graphics.Bitmap

data class MetroMap(val bitmap: Bitmap, val stations: List<MetroStationPoint>)