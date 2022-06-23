package com.example.ksu_app

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import com.example.ksu_app.databinding.ActivityProfileBinding
import java.io.FileNotFoundException
import java.io.InputStream


class ProfileActivity : AppCompatActivity() {

    private lateinit var pBinding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pBinding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(pBinding.root)

        val myVect1 = AnimatedVectorDrawableCompat.create(this, R.drawable.anim)
        val myVect2 = AnimatedVectorDrawableCompat.create(this, R.drawable.anim2)
        pBinding.imageView6.setImageDrawable(myVect1)
        pBinding.imageView7.setImageDrawable(myVect2)
        pBinding.imageView8.setImageDrawable(myVect1)
        pBinding.imageView9.setImageDrawable(myVect2)
        myVect1?.start()
        myVect2?.start()

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

        pBinding.SettingsButton.setOnClickListener(){
            val intent = Intent( this, SettingsActivity::class.java)
            startActivity(intent)
            finish()
        }

        pBinding.button7.setOnClickListener(){
            pBinding.Drawer.openDrawer(GravityCompat.START)
        }

        pBinding.imageView.setImageResource(R.drawable.ic_men2)
    }


    override fun onStart() {
        super.onStart()

    }

}