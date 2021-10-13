package com.example.rendabrasileira

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun goToNextScreen(v:View) {
        val income_monthly : AppCompatEditText = findViewById(R.id.input_monthly_income)
        val user_name : AppCompatEditText = findViewById(R.id.input_user_name)



        if (income_monthly.text.toString().toDouble() >= 1100.00 && user_name.text.toString().length > 3) {
            val social_class = when (income_monthly.text.toString().toDouble()) {
                in 13560.00..33900.00 -> "rico"
                in 6780.00..13560.00 -> "média"
                in 3390.00..6780.00 -> "pobre"
                else -> "campo obrigatório não foi preenchido"
            }

            val screen_result = Intent(this, MainResultActivity::class.java)
            screen_result.putExtra("user_name", user_name.text.toString())
            screen_result.putExtra("social_class", social_class.toString())

            startActivity(screen_result)

        }
    }
}

private fun Intent.putExtra(s: String, userName: AppCompatEditText) {

}

private fun Intent.putExtraMoney(s:String, socialClass: String){}
