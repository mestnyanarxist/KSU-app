package com.example.ksu_app

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.FileUtils
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ksu_app.databinding.ActivityProfileBinding
import java.io.File
import java.io.IOException


class ProfileActivity : AppCompatActivity() {

    private lateinit var pBinding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pBinding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(pBinding.root)

        pBinding.MapButton.setOnClickListener(){
            val intent = Intent( this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        val toast = Toast.makeText(applicationContext, "Аккаунт" , Toast.LENGTH_SHORT)
        toast.show()

        pBinding.ExitButton.setOnClickListener(){

            val intent = Intent( this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onStart() {
        super.onStart()

    }

}