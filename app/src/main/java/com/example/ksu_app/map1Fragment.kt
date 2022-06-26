package com.example.ksu_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.GravityCompat
import com.example.ksu_app.databinding.FragmentMap1Binding

class map1Fragment : Fragment() {

    private lateinit var mBinding: FragmentMap1Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentMap1Binding.inflate(inflater)
        return mBinding.root


    }

    override fun onResume() {
        super.onResume()

        mBinding.button11.setOnClickListener(){
            mBinding.Drawer.openDrawer(GravityCompat.START)
        }

        mBinding.button10.setOnClickListener(){
            activity?.supportFragmentManager?.beginTransaction()?.remove(this)?.commit()

        }
    }


    companion object{

        fun newInstance() = map1Fragment()
    }
}