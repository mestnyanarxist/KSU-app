package com.example.ksu_app



import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ksu_app.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var logBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(logBinding.root)
    }


    override fun onPause() {
        super.onPause()

        if (logBinding.checkBox.isChecked) {//Запоминание данных

        }
    }

    override fun onResume() {
        super.onResume()

        logBinding.buttonlog.setOnClickListener() {
            //затычка
            if (logBinding.loginInput.text.toString() == "1" &&
                logBinding.passwordInput.text.toString() == "1") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                val toast = Toast.makeText(
                    applicationContext,
                    "Ошибка в пароле или логине",
                    Toast.LENGTH_SHORT
                )
                toast.show()
            }
        }
    }

}



