package com.example.a220314_navigation_1

import android.app.Activity
import android.view.View


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.a220314_navigation_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        binding.navHostFragment.setOnClickListener(this)
//        binding.bnvMain.setOnClickListener(this)
    }

    //버튼클릭 리스너 등록

    //버튼 클릭 리스너 메서드
    override fun onClick(v: View?) {
        when (v?.id) {
            //1) Host 프래그먼트
            binding.navHostFragment.id -> {
                /*      val navHostFragment =
                          supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
                      val navController = navHostFragment.navController

                      val action =
                          BlankFragmentDirections.actionBlankFragmentToBlankFragment3()
                      navController.navigate(action)*/
            }
            //2) 바텀 내비게이션

            else -> {
            }
        }
    }


}