package com.example.ksu_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ksu_app.databinding.ActivityLoginBinding
import com.google.android.gms.auth.api.identity.BeginSignInRequest
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient

class LoginActivity : AppCompatActivity() {
    private lateinit var logBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(logBinding.root)

        logBinding.buttonlog.setOnClickListener(){
            val intent = Intent( this, MainActivity::class.java)
            startActivity(intent)
            finish()
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