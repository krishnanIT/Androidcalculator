package com.example.calculator
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var firstvalue: Int = 0
    var secondvalue:Int = 0
    //var opclicked:Boolean = false
    var operation:String = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets }

        //write the application code hear




    }
    // Button onclick function writing area
    fun oneclicked(view: View)
    {
        val textview:TextView = findViewById(R.id.textView_main);
        val output:String = textview.text as String;
        textview.setText(output + "1")

    }
    fun two_clicked(view:View)
    {
        val textview:TextView = findViewById(R.id.textView_main);
        val output:String = textview.text as String;
        textview.setText(output + "2")

    }

    fun three_clicked(view: View) {
        val textview:TextView = findViewById(R.id.textView_main);
        val output:String = textview.text as String;
        textview.setText(output + "3")
    }
    fun double_zero_clicked(view: View) {
        val textview:TextView = findViewById(R.id.textView_main);
        val output:String = textview.text as String;
        textview.setText(output + "00")
    }
    fun dot_clicked(view: View) {
        val textview:TextView = findViewById(R.id.textView_main);
        val output:String = textview.text as String;
        textview.setText(output + ".")
    }
    fun zero_clicked(view: View) {
        val textview:TextView = findViewById(R.id.textView_main);
        val output:String = textview.text as String;
        textview.setText(output + "0")
    }
    fun four_clicked(view: View) {
        val textview:TextView = findViewById(R.id.textView_main);
        val output:String = textview.text as String;
        textview.setText(output + "4")
    }
    fun five_clicked(view: View) {
        val textview:TextView = findViewById(R.id.textView_main);
        val output:String = textview.text as String;
        textview.setText(output + "5")
    }
    fun six_clicked(view: View) {
        val textview:TextView = findViewById(R.id.textView_main);
        val output:String = textview.text as String;
        textview.setText(output + "6")
    }
    fun seven_clicked(view: View) {
        val textview:TextView = findViewById(R.id.textView_main);
        val output:String = textview.text as String;
        textview.setText(output + "7")
    }
    fun eight_clicked(view: View) {
        val textview:TextView = findViewById(R.id.textView_main);
        val output:String = textview.text as String;
        textview.setText(output + "8")
    }
    fun nine_clicked(view: View) {
        val textview:TextView = findViewById(R.id.textView_main);
        val output:String = textview.text as String;
        textview.setText(output + "9")
    }
    fun allclear_clicked(view: View) {
        val t_v:TextView = findViewById(R.id.textView_main);
        t_v.setText("")

    }

    fun add_clicked(view: View) {
        val textview:TextView = findViewById(R.id.textView_main);
        val output:String = textview.text as String;
        firstvalue = output.toInt();
        operation = "+"
        textview.setText("")
    }
    fun subract_clicked(view: View) {
        val textview:TextView = findViewById(R.id.textView_main);
        val output:String = textview.text as String;
        firstvalue = output.toInt();
        operation = "-"
        textview.setText("")
    }
    fun multiple_clicked(view: View) {
        val textview:TextView = findViewById(R.id.textView_main);
        val output:String = textview.text as String;
        firstvalue = output.toInt();
        operation = "*"
        textview.setText("")
    }
    fun division_clicked(view: View) {
        val textview:TextView = findViewById(R.id.textView_main);
        val output:String = textview.text as String;
        firstvalue = output.toInt();
        operation = "/"
        textview.setText("")
    }

    fun equal_clicked(view: View) {
        val textview: TextView = findViewById(R.id.textView_main);
        val output: String = textview.text as String;
        secondvalue = output.toInt();

        if (operation.equals("+")) {
            var finalvalue: Int = firstvalue + secondvalue
            textview.setText("" + finalvalue)
        } else if (operation.equals("-")) {
            var finalvalue: Int = firstvalue - secondvalue
            textview.setText("" + finalvalue)
        } else if (operation.equals("*")) {
            var f_v: Int = firstvalue * secondvalue
            textview.setText("" + f_v)
        } else if (operation.equals("/")) {
            var f_v: Int = firstvalue / secondvalue
            textview.setText("" + f_v)

        }

    }
}





