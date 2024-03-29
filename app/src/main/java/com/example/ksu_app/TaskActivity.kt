package com.example.ksu_app

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.ksu_app.databinding.ActivityMainBinding
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import com.example.ksu_app.databinding.ActivityTaskBinding
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.AccountHeaderBuilder
import com.mikepenz.materialdrawer.Drawer

import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.holder.BadgeStyle
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem

class TaskActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityTaskBinding
    private val datamodel: DataModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityTaskBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        //Работа с анимацией
        val myVect1 = AnimatedVectorDrawableCompat.create(this, R.drawable.anim)
        val myVect2 = AnimatedVectorDrawableCompat.create(this, R.drawable.anim2)
        mBinding.imageView2.setImageDrawable(myVect1)
        mBinding.imageView3.setImageDrawable(myVect2)
        mBinding.imageView4.setImageDrawable(myVect1)
        mBinding.imageView5.setImageDrawable(myVect2)
        myVect1?.start()
        myVect2?.start()

        mBinding.button1.setOnClickListener(){
            openfragment2()
        }
        mBinding.button2.setOnClickListener(){
            openfragment2()
        }
        mBinding.button3.setOnClickListener(){
            openfragment2()
        }
        mBinding.button4.setOnClickListener(){
            openfragment2()
        }
        mBinding.button5.setOnClickListener(){
            openfragment2()
        }
        mBinding.button63.setOnClickListener(){
            openfragment2()
        }

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

        mBinding.HomeworkButton.setOnClickListener(){
            val intent = Intent( this, HomeWorkActivity::class.java)
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

        mBinding.SettingsButton.setOnClickListener(){
            val intent = Intent( this, SettingsActivity::class.java)
            startActivity(intent)
            finish()
        }

        val toast = Toast.makeText(applicationContext, "Расписание" , Toast.LENGTH_SHORT)
        toast.show()

        mBinding.button62.setOnClickListener(){
            mBinding.Drawer.openDrawer(GravityCompat.START)
        }
    }

    override fun onStart() {
        super.onStart()

    }

    private fun openfragment2() {
        supportFragmentManager.
        beginTransaction().
        replace(R.id.frame2, timetable.newInstance())
            .commit()
    }

    class DataModel : ViewModel() {
        val massage: MutableLiveData<Int> by lazy {
            MutableLiveData<Int>()
        }
    }
}