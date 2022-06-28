package com.androxus.section3viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.androxus.section3viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var vm: MainViewModel
    private lateinit var binding: ActivityMainBinding
    private var count=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
        }

        vm=ViewModelProvider(this).get(MainViewModel::class.java)
        vm.total.observe(this, Observer {
            binding.textview.text=it.toString()
        })


         binding.Count.setOnClickListener {
            vm.settotal()
        }




    }
}