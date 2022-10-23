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
        setupEditor()
    }

    private fun setupEditor() {
        binding.editor.setEditorHeight(200)
        binding.editor.setEditorFontSize(22)

        binding.editor.setPadding(10, 10, 10, 10)
        binding.editor.setPlaceholder("Insert text here...");

        binding.editor.setOnTextChangeListener {
            binding.preview.text = it
        }

        binding.actionUndo.setOnClickListener {
            binding.editor.undo()
        }

        binding.actionRedo.setOnClickListener {
            binding.editor.redo()
        }

        binding.actionBold.setOnClickListener {
            binding.editor.setBold()
        }

        binding.actionItalic.setOnClickListener {
            binding.editor.setItalic()
        }

        binding.actionSubscript.setOnClickListener {
            binding.editor.setSubscript()
        }

        binding.actionSuperscript.setOnClickListener {
            binding.editor.setSuperscript()
        }

        binding.actionStrikethrough.setOnClickListener {
            binding.editor.setStrikeThrough()
        }

        binding.actionItalic.setOnClickListener {
            binding.editor.setItalic()
        }

        binding.actionUnderline.setOnClickListener {
            binding.editor.setUnderline()
        }

        binding.actionHeading1.setOnClickListener {
            binding.editor.setHeading(1)
        }

        binding.actionHeading2.setOnClickListener {
            binding.editor.setHeading(2)
        }

        binding.actionHeading3.setOnClickListener {
            binding.editor.setHeading(3)
        }

        binding.actionHeading4.setOnClickListener {
            binding.editor.setHeading(4)
        }

        binding.actionHeading5.setOnClickListener {
            binding.editor.setHeading(5)
        }

        binding.actionHeading6.setOnClickListener {
            binding.editor.setHeading(6)
        }

        binding.actionInsertCheckbox.setOnClickListener {
            binding.editor.insertTodo()
        }


    }
}
