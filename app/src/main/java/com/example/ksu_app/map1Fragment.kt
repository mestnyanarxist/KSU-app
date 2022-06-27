package com.example.ksu_app


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.davemorrissey.labs.subscaleview.ImageSource
import com.example.ksu_app.databinding.FragmentMap1Binding


class map1Fragment : Fragment() {

    private lateinit var mBinding: FragmentMap1Binding
    private val datamodel: DataModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentMap1Binding.inflate(inflater)
        return mBinding.root
    }

    override fun onResume() {
        super.onResume()

        //Выбор изображений в зависимости от корпуса
        when(datamodel.massage.value){
            1 -> ChooseFloor(null, R.drawable.map31 ,null,null,
                null, null, null,null, null, null)
            2 -> ChooseFloor(null, R.drawable.map31 ,R.drawable.map32,null,
                null, null, null,null, null, null)
            3 -> ChooseFloor(null, R.drawable.map31 ,R.drawable.map32,R.drawable.map33,R.drawable.map34,
            null, null, null, null, null )
            4 -> ChooseFloor(null, R.drawable.map31 ,null,null,
                null, null, null,null, null, null)
        }

        //Закрытие фрагмента
        mBinding.button10.setOnClickListener(){
            activity?.supportFragmentManager?.beginTransaction()?.remove(this)?.commit()
        }
        //Зумирование карты
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

    //Функция обработки работы с этажами
     fun ChooseFloor(img : Int?, img1 : Int, img2 : Int?, img3 :
     Int?, img4 : Int?,img5 : Int?,img6 : Int?,img7 : Int?, img8 : Int?,img9 : Int?)
    {
        mBinding.imageView.setImage(ImageSource.resource(img1))

        if(img2 != null)
            mBinding.button11.setOnClickListener(){
                mBinding.Drawer.openDrawer(GravityCompat.END)
            }
        if(img3 == null)
        {
            mBinding.button13.visibility = View.GONE
        }
        if(img4 == null)
            mBinding.button12.visibility = View.GONE
        if(img5 == null)
        {
            mBinding.button16.visibility = View.GONE
        }
        if(img6 == null)
            mBinding.button17.visibility = View.GONE
        if(img7 == null)
            mBinding.button18.visibility = View.GONE
        if(img8 == null)
            mBinding.button19.visibility = View.GONE
        if(img9 == null)
            mBinding.button20.visibility = View.GONE
        if(img == null)
            mBinding.button.visibility = View.GONE

        mBinding.button.setOnClickListener(){
            mBinding.imageView.setImage(ImageSource.resource(img!!))
        }
        mBinding.button15.setOnClickListener(){
            mBinding.imageView.setImage(ImageSource.resource(img1))
        }
        mBinding.button14.setOnClickListener(){
            mBinding.imageView.setImage(ImageSource.resource(img2!!))
        }
        mBinding.button13.setOnClickListener(){
            mBinding.imageView.setImage(ImageSource.resource(img3!!))
        }
        mBinding.button12.setOnClickListener(){
            mBinding.imageView.setImage(ImageSource.resource(img4!!))
        }
        mBinding.button16.setOnClickListener(){
            mBinding.imageView.setImage(ImageSource.resource(img5!!))
        }
        mBinding.button17.setOnClickListener(){
            mBinding.imageView.setImage(ImageSource.resource(img6!!))
        }
        mBinding.button18.setOnClickListener(){
            mBinding.imageView.setImage(ImageSource.resource(img7!!))
        }
        mBinding.button19.setOnClickListener(){
            mBinding.imageView.setImage(ImageSource.resource(img8!!))
        }
        mBinding.button20.setOnClickListener(){
            mBinding.imageView.setImage(ImageSource.resource(img9!!))
        }
    }



    //Функция открытия фрагмента из активити
    companion object{

        fun newInstance() = map1Fragment()

    }

}
