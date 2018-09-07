package io.github.sshnakamoto.startkotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    /*
    * Get view value and add plus one
    * */
    fun count(view: View){
        val showCount = findViewById<TextView>(R.id.count_view)
        val countString = showCount.text.toString()

        var count: Int = Integer.parseInt(countString)
        count++

        showCount.setText(count.toString())
    }

    fun toast(view: View){
        val toast = Toast.makeText(applicationContext, "Here I am", Toast.LENGTH_SHORT)
        toast.show()
    }

    fun random(view: View){
        val randomIntent = Intent(this, SecondActivity::class.java)
        val showCount = findViewById<TextView>(R.id.count_view)
        val countString = showCount.text.toString()
        val count = Integer.parseInt(countString)

        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
        startActivity(randomIntent)
    }

}
