package se.magictechnology.piax24mar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel

class StartViewmodel : ViewModel() {
    var number = 0
}

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("PIAXDEBUG", "onCreate")

        val model : StartViewmodel by viewModels()

        findViewById<TextView>(R.id.headerTextview).text = model.number.toString()

        findViewById<Button>(R.id.nameButton).setOnClickListener {
            var thename = findViewById<EditText>(R.id.nameEdittext).text.toString()

            //findViewById<TextView>(R.id.headerTextview).text = thename

            model.number = model.number + 1
            findViewById<TextView>(R.id.headerTextview).text = model.number.toString()
        }

        findViewById<Button>(R.id.resetButton)?.let {
            it.setOnClickListener {
                model.number = 0
                findViewById<TextView>(R.id.headerTextview).text = model.number.toString()
            }
        }


    }

    override fun onStart() {
        super.onStart()
        Log.i("PIAXDEBUG", "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("PIAXDEBUG", "onStop")
    }

}