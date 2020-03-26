package m.verycool.metromap

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import m.verycool.metromap.model.MetroTitle
import org.w3c.dom.Element
import org.w3c.dom.Node


class InfoActivity : AppCompatActivity() {

    var empDataHashMap = HashMap<String, String>()
    var empList: ArrayList<HashMap<String, String>> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info_activity)

        val stationTitle = intent.getSerializableExtra(MetroTitle::class.java.simpleName)
        Toast.makeText(this, stationTitle.toString(), Toast.LENGTH_LONG).show()

//        fun stationList(name: String) : Boolean {
//            val lv = findViewById<ListView>(R.id.listView)
//            val xmlFile = File("db_handler.xml")
//            val doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xmlFile)
//            var list = doc.getElementsByTagName("station")
//            for (i in 0 until list.length) {
//                if (list.item(0).getNodeType().equals(Node.ELEMENT_NODE) ) {
//                    empList.clear()
//                    //creating instance of HashMap to put the data of node value
//                    empDataHashMap = HashMap()
//                    val element = list.item(i) as Element
//                    empDataHashMap.put("name", getNodeValue("name", element))
//                    empDataHashMap.put("date", getNodeValue("date", element))
//                    empDataHashMap.put("depth", getNodeValue("depth", element))
//                    empDataHashMap.put("architects", getNodeValue("architects", element))
//                    //adding the HashMap data to ArrayList
//                    empList.add(empDataHashMap)
//
//
//                    val adapter = SimpleAdapter(this@InfoActivity, empList, R.layout.info_activity, arrayOf("name", "date", "depth", "architects"), intArrayOf(R.id.name, R.id.date, R.id.depth, R.id.architects))
//                    lv.setAdapter(adapter)
//
//                }
//            }
//            return false
//        }
//
    }


    // function to return node value
    protected fun getNodeValue(tag: String, element: Element): String {
        val nodeList = element.getElementsByTagName(tag)
        val node = nodeList.item(0)
        if (node != null) {
            if (node.hasChildNodes()) {
                val child = node.getFirstChild()
                while (child != null) {
                    if (child.getNodeType() === Node.TEXT_NODE) {
                        return child.getNodeValue()
                    }
                }
            }
        }
        return ""


    }
}



