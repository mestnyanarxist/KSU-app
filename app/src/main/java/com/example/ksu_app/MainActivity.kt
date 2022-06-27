package com.example.ksu_app

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import com.example.ksu_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private val datamodel: DataModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        //Работа с фрагментом
        mBinding.button2.setOnClickListener(){

            datamodel.massage.value = 1
            openfragment()
        }

        mBinding.button3.setOnClickListener(){
            datamodel.massage.value = 2
            openfragment()
        }

        mBinding.button4.setOnClickListener(){
            datamodel.massage.value = 3
            openfragment()
        }

        mBinding.button5.setOnClickListener(){
            datamodel.massage.value = 4
            openfragment()
        }

        //Работа с анимацией
        val myVect1 = AnimatedVectorDrawableCompat.create(this, R.drawable.anim)
        val myVect2 = AnimatedVectorDrawableCompat.create(this, R.drawable.anim2)
        mBinding.imageView2.setImageDrawable(myVect1)
        mBinding.imageView3.setImageDrawable(myVect2)
        mBinding.imageView4.setImageDrawable(myVect1)
        mBinding.imageView5.setImageDrawable(myVect2)
        myVect1?.start()
        myVect2?.start()

        mBinding.AccountButton.setOnClickListener(){
            val intent = Intent( this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        mBinding.HomeworkButton.setOnClickListener(){
            val intent = Intent( this, HomeWorkActivity::class.java)
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

        mBinding.SettingsButton.setOnClickListener(){
            val intent = Intent( this, SettingsActivity::class.java)
            startActivity(intent)
            finish()
        }

        mBinding.button6.setOnClickListener(){
            mBinding.Drawer.openDrawer(GravityCompat.START)
        }

        val toast = Toast.makeText(applicationContext, "Карта" , Toast.LENGTH_SHORT)
        toast.show()
    }

    //Открыть фрагмент
    private fun openfragment() {
        supportFragmentManager.beginTransaction().replace(R.id.frame1, map1Fragment.newInstance())
            .commit()
    }

}

//Класс для обмена данными между активити и/или фрагментами
class DataModel : ViewModel() {
    val massage: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
}

