package xyz.fadhilprawira.dicodingandroidpemula

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnSetValue: Button // Normal
//    private var btnSetValue: Button? = null // Error

    private lateinit var tvText: TextView

    private var names = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvText = findViewById(R.id.tv_text)
        btnSetValue = findViewById(R.id.btn_set_value) // Normal
        btnSetValue.setOnClickListener(this) // Normal
//        btnSetValue!!.setOnClickListener(this) // Normal tapi !! unnecessary

        names.add("Narendra Wicaksono")
        names.add("Kevin")
        names.add("Yoza")
    }

    override fun onClick(view: View) {
        if (view.id == R.id.btn_set_value) {
//            tvText.text = "19"
            Log.d("MainActivity", names.toString())
            val name = StringBuilder()
//            for (i in 0..3) { // Error
//            for (i in 0..2) {// Normal
//            for (i in 0..names.size) {// Normal, better
            for (i in 0 until names.size) {// Normal, better readability
                name.append(names[i]).append("\n")
            }

            tvText.text = name.toString()
        }
    }
}