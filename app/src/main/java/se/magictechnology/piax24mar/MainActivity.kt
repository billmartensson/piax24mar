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
    private var number = 0

    fun getTheNumber() : Int
    {
        return number
    }

    fun addNumber()
    {
        number = number + 1

        if(number > 5)
        {
            number = 5
        }
    }

    fun minusNumber()
    {
        number = number - 1
        if(number < 0)
        {
            number = 0
        }
    }

    fun resetNumber()
    {
        number = 0
    }
}

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("PIAXDEBUG", "onCreate")

        val model : StartViewmodel by viewModels()

        findViewById<TextView>(R.id.headerTextview).text = model.getTheNumber().toString()

        findViewById<Button>(R.id.nameButton).setOnClickListener {
            var thename = findViewById<EditText>(R.id.nameEdittext).text.toString()

            //findViewById<TextView>(R.id.headerTextview).text = thename

            model.addNumber()
            findViewById<TextView>(R.id.headerTextview).text = model.getTheNumber().toString()
        }

        findViewById<Button>(R.id.resetButton)?.let {
            it.setOnClickListener {
                model.resetNumber()
                findViewById<TextView>(R.id.headerTextview).text = model.getTheNumber().toString()
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