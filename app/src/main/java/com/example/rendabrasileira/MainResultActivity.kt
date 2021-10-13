package com.example.rendabrasileira

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.system.exitProcess

class MainResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_result)

        val user = intent.getStringExtra("user_name")
        val socialClass = intent.getStringExtra("social_class")

        val resultado = getString(R.string.text_result, user, socialClass)
        val text_resul:TextView = findViewById(R.id.result)

        text_resul.text = resultado
    }

    fun close(v:View) {
        exitProcess(0)
    }
}