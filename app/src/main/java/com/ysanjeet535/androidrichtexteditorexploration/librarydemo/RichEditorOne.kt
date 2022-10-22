package com.ysanjeet535.androidrichtexteditorexploration.librarydemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ysanjeet535.androidrichtexteditorexploration.databinding.RichEditorOneBinding

class RichEditorOne : AppCompatActivity() {

    private lateinit var binding: RichEditorOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RichEditorOneBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }


}