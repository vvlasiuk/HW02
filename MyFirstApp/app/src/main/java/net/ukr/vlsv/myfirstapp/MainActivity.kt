package net.ukr.vlsv.myfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast_button.setOnClickListener() {
            val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
            myToast.show()
        }

        count_button.setOnClickListener() {
            var count: Int = Integer.parseInt(textView.text.toString())
            count ++
            textView.setText(count.toString())
        }

        random_button.setOnClickListener () {
            val randomIntent = Intent(this, SecondActivity::class.java)
            val countString = textView.text.toString()
            val count = Integer.parseInt(countString)
            randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
            startActivity(randomIntent)
        }
    }
}
