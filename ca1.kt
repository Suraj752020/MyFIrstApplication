package com.example.myfirstapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class CA1 : AppCompatActivity() {

    lateinit var name: EditText
    lateinit var regNo: EditText
    lateinit var bookName: EditText
    lateinit var issueDate: EditText
    lateinit var submitDate: EditText
    lateinit var resultText: TextView
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ca1)

        // Linking XML -> Kotlin
        name = findViewById(R.id.et1)
        regNo = findViewById(R.id.et2)
        bookName = findViewById(R.id.et3)
        issueDate = findViewById(R.id.et4)
        submitDate = findViewById(R.id.et5)
        resultText = findViewById(R.id.tv1)
        btn = findViewById(R.id.bt5)

        name.setText("Suraj Kumar")
        regNo.setText("12306025")
        bookName.setText("God")
        issueDate.setText("12/3/2025")
        submitDate.setText("1/4/2025")

        btn.setOnClickListener {

            val n = name.text.toString()
            val r = regNo.text.toString()
            val b = bookName.text.toString()
            val i = issueDate.text.toString()
            val s = submitDate.text.toString()

            resultText.text = """
                Name: $n
                Registration No: $r
                Book Name: $b
                Issue Date: $i
                Return Date: $s
            """.trimIndent()
        }
    }
}
