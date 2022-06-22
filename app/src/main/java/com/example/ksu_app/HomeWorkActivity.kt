package com.example.ksu_app

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ksu_app.databinding.ActivityMainBinding
import androidx.appcompat.widget.Toolbar
import com.example.ksu_app.databinding.ActivityHomeworkBinding
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.AccountHeaderBuilder
import com.mikepenz.materialdrawer.Drawer

import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.holder.BadgeStyle
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem

class HomeWorkActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityHomeworkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityHomeworkBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.AccountButton.setOnClickListener(){
            val intent = Intent( this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        mBinding.MapButton.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        mBinding.SettingsButton.setOnClickListener(){
            val intent = Intent( this, SettingsActivity::class.java)
            startActivity(intent)
            finish()
        }

        mBinding.TimetableButton.setOnClickListener(){
            val intent = Intent( this, TaskActivity::class.java)
            startActivity(intent)
            finish()
        }

        mBinding.GroupButton.setOnClickListener(){
            val intent = Intent( this, GroupActivity::class.java)
            startActivity(intent)
            finish()
        }

        mBinding.TeachersButton.setOnClickListener(){
            val intent = Intent( this, TeachersActivity::class.java)
            startActivity(intent)
            finish()
        }
        val toast = Toast.makeText(applicationContext, "Домашнее задание" , Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onStart() {
        super.onStart()

    }

}