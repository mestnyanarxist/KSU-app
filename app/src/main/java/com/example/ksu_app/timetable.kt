package com.example.ksu_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.ksu_app.databinding.FragmentMap1Binding
import com.example.ksu_app.databinding.FragmentTimetableBinding


class timetable : Fragment() {

    private lateinit var mBinding: FragmentTimetableBinding
    private val datamodel: DataModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentTimetableBinding.inflate(inflater)
        return mBinding.root
    }

    override fun onResume() {
        super.onResume()

        mBinding.button23.setOnClickListener(){
            activity?.supportFragmentManager?.beginTransaction()?.remove(this)?.commit()
        }

    }

    companion object{

        fun newInstance() = timetable()

    }
}
