package com.example.ksu_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.GravityCompat
import com.davemorrissey.labs.subscaleview.ImageSource
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView
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

        mBinding.imageView.setImage(ImageSource.resource(R.drawable.mapimg))

        mBinding.button11.setOnClickListener(){
            mBinding.Drawer.openDrawer(GravityCompat.END)
        }

        mBinding.button10.setOnClickListener(){
            activity?.supportFragmentManager?.beginTransaction()?.remove(this)?.commit()
        }

        mBinding.button8.setOnClickListener(){
            
            if(mBinding.imageView.scaleX == 2F && mBinding.imageView.scaleY == 2F ){
                mBinding.imageView.scaleX = 4F
                mBinding.imageView.scaleY = 4F

            }
            if(mBinding.imageView.scaleX == 4F && mBinding.imageView.scaleY == 4F ){
            mBinding.imageView.scaleX = 6F
            mBinding.imageView.scaleY = 6F
            }
            else{
                mBinding.imageView.scaleX = 2F
                mBinding.imageView.scaleY = 2F
            }

        }

        mBinding.button9.setOnClickListener(){
            mBinding.imageView.scaleX = 1F
            mBinding.imageView.scaleY = 1F
        }

    }


    companion object{

        fun newInstance() = map1Fragment()
    }
}