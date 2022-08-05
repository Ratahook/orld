package com.example.orld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<TextView>(R.id.textView)
        view.text = "Sorry for what?"
        val viet = findViewById<TextView>(R.id.nexttext)
        viet.text = "Oh, shit, im sorry"
        val student = Student("Ivan Ivanov", 3)
        val anotherStudent = Student("Dmitriy", 4)
        val viewstudent = findViewById<TextView>(R.id.student)
        viewstudent.text = student.toString()
        val vietstudent = findViewById<TextView>(R.id.anotherStudent)
        vietstudent.text = anotherStudent.toString()
    }
}
data class Student(
    val fullName: String,
    val course: Int
) {
    override fun toString(): String {
        return fullName
    }

}