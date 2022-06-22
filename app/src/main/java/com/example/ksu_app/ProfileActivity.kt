package com.example.ksu_app

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ksu_app.databinding.ActivityProfileBinding
import java.io.FileNotFoundException
import java.io.InputStream


class ProfileActivity : AppCompatActivity() {

    private lateinit var pBinding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pBinding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(pBinding.root)

        pBinding.AccountButton.setOnClickListener(){
            val intent = Intent( this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        pBinding.MapButton.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        pBinding.HomeworkButton.setOnClickListener(){
            val intent = Intent( this, HomeWorkActivity::class.java)
            startActivity(intent)
            finish()
        }

        pBinding.TimetableButton.setOnClickListener(){
            val intent = Intent( this, TaskActivity::class.java)
            startActivity(intent)
            finish()
        }

        pBinding.GroupButton.setOnClickListener(){
            val intent = Intent( this, GroupActivity::class.java)
            startActivity(intent)
            finish()
        }

        pBinding.TeachersButton.setOnClickListener(){
            val intent = Intent( this, TeachersActivity::class.java)
            startActivity(intent)
            finish()
        }

        val toast = Toast.makeText(applicationContext, "Аккаунт", Toast.LENGTH_SHORT)
        toast.show()


        pBinding.ExitButton.setOnClickListener() {

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        pBinding.imageView.setImageResource(R.drawable.ic_men2)
    }


    override fun onStart() {
        super.onStart()

    }

}