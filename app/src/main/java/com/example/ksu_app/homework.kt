package com.example.ksu_app

import android.app.DatePickerDialog
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.ksu_app.databinding.FragmentHomeworkBinding
import java.text.SimpleDateFormat
import java.util.*


class homework : Fragment() {

    private lateinit var mBinding: FragmentHomeworkBinding
    private val datamodel: DataModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentHomeworkBinding.inflate(inflater)
        return mBinding.root
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onResume() {
        super.onResume()

        mBinding.button22.visibility = View.GONE
        mBinding.calendarView.visibility = View.GONE

        mBinding.button21.setOnClickListener(){
            activity?.supportFragmentManager?.beginTransaction()?.remove(this)?.commit()
        }

        mBinding.textView8.setOnClickListener(){
            mBinding.button22.visibility = View.VISIBLE
            mBinding.calendarView.visibility = View.VISIBLE
        }

        mBinding.button22.setOnClickListener(){
            mBinding.button22.visibility = View.GONE
            mBinding.calendarView.visibility = View.GONE
            mBinding.textView8.text = getCurrentDay()
        }
    }

    companion object{

        fun newInstance() = homework()

    }

    fun getCurrentDay(): String? {
        var calendar = Calendar.getInstance()
        val tomorrow: Date = calendar.getTime()
        val dateFormat = SimpleDateFormat("dd.mm.yyyy", Locale.getDefault())
        return dateFormat.format(tomorrow)
    }
}
