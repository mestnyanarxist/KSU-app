package com.example.ksu_app



import android.content.Intent
import android.graphics.drawable.AnimatedImageDrawable
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import com.example.ksu_app.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var logBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(logBinding.root)

        val myVect1 = AnimatedVectorDrawableCompat.create(this, R.drawable.anim)
        val myVect2 = AnimatedVectorDrawableCompat.create(this, R.drawable.anim2)
        logBinding.imageView11.setImageDrawable(myVect1)
        logBinding.imageView12.setImageDrawable(myVect2)
        logBinding.imageView13.setImageDrawable(myVect1)
        logBinding.imageView14.setImageDrawable(myVect2)
        myVect1?.start()
        myVect2?.start()
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



