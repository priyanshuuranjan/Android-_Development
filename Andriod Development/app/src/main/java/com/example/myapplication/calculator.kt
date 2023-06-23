package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlin.properties.Delegates

class calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        var txt = findViewById<TextView>(R.id.textView4)
        var clr = findViewById<Button>(R.id.clrBtn)
        var prcnt = findViewById<Button>(R.id.prcntBtn)
        var back = findViewById<Button>(R.id.backBtn)
        var divd =findViewById<Button>(R.id.divdBtn)
        var seven = findViewById<Button>(R.id.sevenBtn)
        var eight = findViewById<Button>(R.id.eightBtn)
        var nine = findViewById<Button>(R.id.nineBtn)
        var into = findViewById<Button>(R.id.intoBtn)
        var four = findViewById<Button>(R.id.fourBtn)
        var five = findViewById<Button>(R.id.fiveBtn)
        var six = findViewById<Button>(R.id.sixBtn)
        var minus = findViewById<Button>(R.id.minusBtn)
        var one = findViewById<Button>(R.id.oneBtn)
        var two =findViewById<Button>(R.id.twoBtn)
        var three = findViewById<Button>(R.id.threeBtn)
        var plus = findViewById<Button>(R.id.plusBtn)
        var power = findViewById<Button>(R.id.powerBtn)
        var zero = findViewById<Button>(R.id.zeroBtn)
        var dot = findViewById<Button>(R.id.dotBtn)
        var equal = findViewById<Button>(R.id.equalBtn)

        var oprnt1 by Delegates.notNull<Int>()
        var oprnt2 by Delegates.notNull<Int>()
        var oprt by Delegates.notNull<Char>()

        clr.setOnClickListener{
            txt.text = ""
            Toast.makeText(applicationContext,"TextView was cleared",Toast.LENGTH_LONG).show()
        }

        one.setOnClickListener{
            if (txt.text.isEmpty()){
                oprnt1 = 1
                txt.text = "${txt.text} $oprnt1"
            }else{
                oprnt2 = 1
                txt.text = "${txt.text} $oprnt2"
            }
        }

        two.setOnClickListener{
            if (txt.text.isEmpty()){
                oprnt1 = 2
                txt.text = "${txt.text} $oprnt1"
            }else{
                oprnt2 = 2
                txt.text = "${txt.text} $oprnt2"
            }
        }

        three.setOnClickListener{
            if (txt.text.isEmpty()){
                oprnt1 = 3
                txt.text = "${txt.text} $oprnt1"
            }else{
                oprnt2 = 3
                txt.text = "${txt.text} $oprnt2"
            }
        }

        four.setOnClickListener{
            if (txt.text.isEmpty()){
                oprnt1 = 4
                txt.text = "${txt.text} $oprnt1"
            }else{
                oprnt2 = 4
                txt.text = "${txt.text} $oprnt2"
            }
        }

        five.setOnClickListener{
            if (txt.text.isEmpty()){
                oprnt1 = 5
                txt.text = "${txt.text} $oprnt1"
            }else{
                oprnt2 = 5
                txt.text = "${txt.text} $oprnt2"
            }
        }

        six.setOnClickListener{
            if (txt.text.isEmpty()){
                oprnt1 = 6
                txt.text = "${txt.text} $oprnt1"
            }else{
                oprnt2 = 6
                txt.text = "${txt.text} $oprnt2"
            }
        }

        seven.setOnClickListener{
            if (txt.text.isEmpty()){
                oprnt1 = 7
                txt.text = "${txt.text} $oprnt1"
            }else{
                oprnt2 = 7
                txt.text = "${txt.text} $oprnt2"
            }
        }

        eight.setOnClickListener{
            if (txt.text.isEmpty()){
                oprnt1 = 8
                txt.text = "${txt.text} $oprnt1"
            }else{
                oprnt2 = 8
                txt.text = "${txt.text} $oprnt2"
            }
        }

        nine.setOnClickListener{
            if (txt.text.isEmpty()){
                oprnt1 = 9
                txt.text = "${txt.text} $oprnt1"
            }else{
                oprnt2 = 9
                txt.text = "${txt.text} $oprnt2"
            }
        }

        zero.setOnClickListener{
            if (txt.text.isEmpty()){
                oprnt1 = 0
                txt.text = "${txt.text} $oprnt1"
            }else{
                oprnt2 = 0
                txt.text = "${txt.text} $oprnt2"
            }
        }

        plus.setOnClickListener{
            if(txt.text.isEmpty()){
            }else{
                oprt = '+'
                txt.text = "${txt.text} +"
            }
        }

        into.setOnClickListener{
            if(txt.text.isEmpty()){
            }else{
                oprt = '*'
                txt.text = "${txt.text} *"
            }
        }

        minus.setOnClickListener{
            if(txt.text.isEmpty()){
            }else{
                oprt = '-'
                txt.text = "${txt.text} -"
            }
        }

        divd.setOnClickListener{
            if(txt.text.isEmpty()){
            }else{
                oprt = '/'
                txt.text = "${txt.text} /"
            }
        }

        prcnt.setOnClickListener{
            if(txt.text.isEmpty()){
            }else{
                oprt = '%'
                txt.text = "${txt.text} %"
            }
        }

        power.setOnClickListener{
            if(txt.text.isEmpty()){
            }else{
                oprt = '^'
                txt.text = "${txt.text} ^"
            }
        }

        equal.setOnClickListener{
            when(oprt){
                '%' -> {
                    var res = oprnt1 * oprnt2/100
                    txt.text = res.toString()
                    oprnt1 = res
                }
                '+' -> {
                    var res = oprnt1 + oprnt2
                    txt.text = res.toString()
                    oprnt1 = res
                }
                '-' -> {
                    var res = oprnt1 - oprnt2
                    txt.text = res.toString()
                    oprnt1 = res
                }
                '*' -> {
                    var res = oprnt1 * oprnt2
                    txt.text = res.toString()
                    oprnt1 = res
                }
                '/' -> {
                    var res = oprnt1 / oprnt2
                    txt.text = res.toString()
                    oprnt1 = res
                }
                '^' -> {
                    var res:Long = 1
                    while (oprnt2 != 0) {
                        res *= oprnt1.toLong()
                        --oprnt2
                    }
                    txt.text = res.toString()
                    oprnt1 = res.toInt()
                }
            }
        }
    }
}