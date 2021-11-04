package com.example.testcollection2

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

//private const val TAG = "MainActivity"
private const val MY_OWN_LOG_TAG = "MyOwnLog"
private const val VALUE = "Value"

class MainActivity : AppCompatActivity() {

    private lateinit var helloTextView: TextView
    private lateinit var randomizeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        helloTextView = findViewById(R.id.hello_text_view)
        randomizeButton = findViewById(R.id.randomize_button)

        if (savedInstanceState != null)
            helloTextView.text = savedInstanceState.getString(VALUE)
        else
            randomize()

        randomizeButton.setOnClickListener { randomize() }


        Log.d(MY_OWN_LOG_TAG, "Ты видел деву на скале")
        Log.d(MY_OWN_LOG_TAG, "В одежде белой над волнами")
    }

    private fun randomize() {
        val randomValue = Random.nextInt(100)
        helloTextView.text = randomValue.toString()

    }


    override fun onStart() {
        super.onStart()
        Log.d(MY_OWN_LOG_TAG, "Когда, бушуя в бурной мгле,")
        Log.d(MY_OWN_LOG_TAG, "Играло море с берегами,")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MY_OWN_LOG_TAG, "Когда луч молний озарял")
        Log.d(MY_OWN_LOG_TAG, "Ее всечасно блеском алым")

    }

    override fun onPause() {
        super.onPause()
        Log.d(MY_OWN_LOG_TAG, "И ветер бился и летал")
        Log.d(MY_OWN_LOG_TAG, "С ее летучим покрывалом?")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MY_OWN_LOG_TAG, "Прекрасно море в бурной мгле")
        Log.d(MY_OWN_LOG_TAG, "И небо в блесках без лазури;")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MY_OWN_LOG_TAG, "Но верь мне: дева на скале")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MY_OWN_LOG_TAG, "Прекрасней волн, небес и бури.")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString(VALUE, helloTextView.text.toString())
    }

}
