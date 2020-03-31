package m.verycool.metromap

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import m.verycool.metromap.model.MetroTitle
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import org.w3c.dom.Document
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory




class InfoActivity : AppCompatActivity() {

    var empDataHashMap = HashMap<String, String>()
    var empList: ArrayList<HashMap<String, String>> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info_activity)

        val stationTitle = intent.getSerializableExtra(MetroTitle::class.java.simpleName)
        Toast.makeText(this, stationTitle.toString(), Toast.LENGTH_LONG).show()

        fun main(args: Array<String>) {
            val xlmFile: File =
                File("db_handler.xml")
            val xmlDoc: Document =
                DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xlmFile)

            xmlDoc.documentElement.normalize()

            val stationList: NodeList = xmlDoc.getElementsByTagName("station")

            for (i in 0..stationList.length - 1) {
                var stationNode: Node = stationList.item(i)

                if (stationNode.getNodeType() === Node.ELEMENT_NODE) {

                    val elem = stationNode as Element


                    val mMap = mutableMapOf<String, String>()


                    for (j in 0..elem.attributes.length - 1) {
                        mMap.putIfAbsent(
                            elem.attributes.item(j).nodeName,
                            elem.attributes.item(j).nodeValue
                        )
                    }
                    println("Current station : ${stationNode.nodeName}")

                    println("Имя: ${elem.getElementsByTagName("name").item(0).textContent}")
                    println("Дата: ${elem.getElementsByTagName("date").item(0).textContent}")
                    println("Глубина: ${elem.getElementsByTagName("depth").item(0).textContent}")
                    println("Архитекторы: ${elem.getElementsByTagName("architects").item(0).textContent}")
                    println("История: ${elem.getElementsByTagName("history").item(0).textContent}")
                }
            }
        }
        }
}