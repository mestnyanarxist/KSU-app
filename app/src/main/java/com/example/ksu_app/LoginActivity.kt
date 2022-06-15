package com.example.ksu_app

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ksu_app.databinding.ActivityLoginBinding
import com.google.android.gms.auth.api.identity.BeginSignInRequest
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient

class LoginActivity : AppCompatActivity() {
    private lateinit var logBinding: ActivityLoginBinding
    private lateinit var LoginS: SharedPreferences
    private lateinit var PassS: SharedPreferences
    public var login = "Login"
    public var password = "Password"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(logBinding.root)



        LoginS = getSharedPreferences(login, Context.MODE_PRIVATE)
        PassS = getSharedPreferences(password, Context.MODE_PRIVATE)

        logBinding.buttonlog.setOnClickListener(){
           //затычка
            if(logBinding.loginInput.text.toString() == "Novikov" && logBinding.passwordInput.text.toString() == "123")
            {
                val intent = Intent( this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            else {
                val toast = Toast.makeText(applicationContext, "Ошибка в пароле или логине" , Toast.LENGTH_SHORT)
                toast.show()
            }
        }

    }

    override fun onPause() {
        super.onPause()

        if(logBinding.checkBox.isChecked)
        {//Запоминание данных
        val editorLoginS = LoginS.edit()
        val editorPassS = PassS.edit()
        editorLoginS.putString(login, logBinding.loginInput.text.toString()).apply()
        editorPassS.putString(password, logBinding.passwordInput.text.toString()).apply()
        }
    }

    override fun onResume() {
        super.onResume()

        if(LoginS.contains(login)&&PassS.contains(password)){
            logBinding.loginInput.setText(LoginS.getString(login, " "))
            logBinding.passwordInput.setText(PassS.getString(password, " "))

            /*if(logBinding.loginInput.text.toString() == "Novikov" && logBinding.passwordInput.text.toString() == "123")
            {
                val intent = Intent( this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            else {
                val toast = Toast.makeText(applicationContext, "Ошибка в пароле или логине" , Toast.LENGTH_SHORT)
                toast.show()
            }*/

        }
    }

    /*private fun getClient() {
        var signInRequest = BeginSignInRequest.builder()
            .setGoogleIdTokenRequestOptions(
                BeginSignInRequest.GoogleIdTokenRequestOptions.builder()
                    .setSupported(true)
                    // Your server's client ID, not your Android client ID.
                    .setServerClientId(getString(R.string.your_web_client_id))
                    // Only show accounts previously used to sign in.
                    .setFilterByAuthorizedAccounts(true)
                    .build()
            )
            .build()
    }*/


}