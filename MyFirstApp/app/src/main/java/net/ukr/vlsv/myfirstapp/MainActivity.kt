package net.ukr.vlsv.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast_button.setOnClickListener(
            toast_button.setText("Hello Toast!")
        )

        count_button.setOnClickListener(
            val count: Int = Integer.parseInt(textView.text.toString())
            count++
            textView.setText(count.toString())
        )
    }
}
