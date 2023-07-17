package com.example.viewbindingwithrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.viewbindingwithrv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding : ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter = MainAdapter(TaskList.taskList)
        binding?.taskRV?.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL ,false)
        binding?.taskRV?.adapter = adapter


    }

    override fun onDestroy() {

        super.onDestroy()
        binding = null
    }
}