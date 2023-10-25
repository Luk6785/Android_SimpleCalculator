package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var expression: TextView
    private lateinit var result: TextView
    private lateinit var ce: Button
    private lateinit var seven: Button
    private lateinit var four: Button
    private lateinit var one: Button
    private lateinit var none: Button
    private lateinit var c: Button
    private lateinit var eight: Button
    private lateinit var five: Button
    private lateinit var two: Button
    private lateinit var zero: Button
    private lateinit var bs: Button
    private lateinit var nine: Button
    private lateinit var six: Button
    private lateinit var three: Button
    private lateinit var point: Button
    private lateinit var divide: Button
    private lateinit var asterisk: Button
    private lateinit var hyphen: Button
    private lateinit var plus: Button
    private lateinit var equal: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        expression = findViewById(R.id.expression)
        result = findViewById(R.id.result)
        ce = findViewById(R.id.ce)
        seven = findViewById(R.id.seven)
        four = findViewById(R.id.four)
        one = findViewById(R.id.one)
        none = findViewById(R.id.none)
        c = findViewById(R.id.c)
        eight = findViewById(R.id.eight)
        five = findViewById(R.id.five)
        two = findViewById(R.id.two)
        zero = findViewById(R.id.zero)
        bs = findViewById(R.id.bs)
        nine = findViewById(R.id.nine)
        six = findViewById(R.id.six)
        three = findViewById(R.id.three)
        point = findViewById(R.id.point)
        divide = findViewById(R.id.divide)
        asterisk = findViewById(R.id.asterisk)
        hyphen = findViewById(R.id.hyphen)
        plus = findViewById(R.id.plus)
        equal = findViewById(R.id.equal)
        expression.movementMethod = ScrollingMovementMethod()
        expression.isActivated = true
        expression.isPressed = true

        var str:String

        ce.setOnClickListener {
            // Xử lý khi người dùng nhấn nút CE
        }

        seven.setOnClickListener {
            // Xử lý khi người dùng nhấn nút
            expressionText("7")

        }

        four.setOnClickListener {
            expressionText("4")

        }

        one.setOnClickListener {
            // Xử lý khi người dùng nhấn nút One
            expressionText("1")

        }

        none.setOnClickListener {
            // Xử lý khi người dùng nhấn nút None
        }

        c.setOnClickListener {
            expressionText("0")
            expression.textSize = 60F
            result.textSize = 30F
            resultText()
        }

        eight.setOnClickListener {
            // Xử lý khi người dùng nhấn nút Eight
            expressionText("8")

        }

        five.setOnClickListener {
            // Xử lý khi người dùng nhấn nút Five
            expressionText("5")

        }

        two.setOnClickListener {
            // Xử lý khi người dùng nhấn nút Two
            expressionText("2")

        }

        zero.setOnClickListener {
            // Xử lý khi người dùng nhấn nút Zero
            expressionText("0")

        }

        bs.setOnClickListener {
            if (expression.text.toString().isNotEmpty()) {
                val lastIndex = expression.text.toString().lastIndex
                str = expression.text.toString().substring(0,lastIndex)
                expressionText(str)
                resultText()
            }
        }

        nine.setOnClickListener {
            // Xử lý khi người dùng nhấn nút Nine
            expressionText("9")

        }

        six.setOnClickListener {
            // Xử lý khi người dùng nhấn nút Six
            expressionText("6")

        }

        three.setOnClickListener {
            // Xử lý khi người dùng nhấn nút Three
            expressionText("3")

        }

        point.setOnClickListener {
            // Xử lý khi người dùng nhấn nút
//            expressionText(".")

        }

        divide.setOnClickListener {
            // Xử lý khi người dùng nhấn nút Divide
            expressionText("/")

        }

        asterisk.setOnClickListener {
            // Xử lý khi người dùng nhấn nút Asterisk
            expressionText("x")

        }

        hyphen.setOnClickListener {
            // Xử lý khi người dùng nhấn nút
            expressionText("-")

        }

        plus.setOnClickListener {
            // Xử lý khi người dùng nhấn nút
            expressionText("+")
        }

        equal.setOnClickListener {
            // Xử lý khi người dùng nhấn nút Equal
            expressionText("=")
        }

    }

    private fun expressionText(str: String) {
        expression.text = str
    }

    private fun resultText() {

    }
}