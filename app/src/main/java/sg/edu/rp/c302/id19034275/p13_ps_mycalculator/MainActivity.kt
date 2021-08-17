package sg.edu.rp.c302.id19034275.p13_ps_mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var msg = ""
    var plusNum = 0.0
    var plusBoolean = false
    var subNum = 0.0
    var subBoolean = false
    var multiplyNum = 0.0
    var multiplyBoolean = false
    var divideNum = 0.0
    var divideBoolean = false
    var dotBoolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAC.setOnClickListener {
            tv.text = 0.toString()
            msg = ""
        }
        btnPlus.setOnClickListener {
            plusNum = tv.text.toString().toDouble()
            plusBoolean = true
            msg = ""
            tv.text = addToInputText("+")
        }
        btnMinus.setOnClickListener {
            subNum = tv.text.toString().toDouble()
            subBoolean = true
            msg = ""
            tv.text = addToInputText("-")
        }

        btnMultiply.setOnClickListener {
            multiplyNum = tv.text.toString().toDouble()
            multiplyBoolean = true
            msg = ""
            tv.text = addToInputText("x")
        }

        btnDivide.setOnClickListener {
            divideNum = tv.text.toString().toDouble()
            divideBoolean = true
            msg = ""
            tv.text = addToInputText("÷")
        }
//        btn0.setOnClickListener{
//            tv.text =addToInputText("0")
//        }
//        btn1.setOnClickListener{
//            tv.text =addToInputText("1")
//        }
//        btn2.setOnClickListener{
//            tv.text =addToInputText("2")
//        }
//        btn3.setOnClickListener{
//            tv.text =addToInputText("3")
//        }
//        btn4.setOnClickListener{
//            tv.text =addToInputText("4")
//        }
//        btn5.setOnClickListener{
//            tv.text =addToInputText("5")
//        }
//        btn6.setOnClickListener{
//            tv.text =addToInputText("6")
//        }
//        btn7.setOnClickListener{
//            tv.text =addToInputText("7")
//        }
//        btn8.setOnClickListener{
//            tv.text =addToInputText("8")
//        }
//        btn9.setOnClickListener{
//            tv.text =addToInputText("9")
//        }
        btnEqual.setOnClickListener {
            if (plusBoolean){
                var plusResult = plusNum + tv.text.toString().toDouble()
                tv.text = plusResult.toString()
                plusBoolean = false
            }
            else if (subBoolean){
                var minusResult = subNum - tv.text.toString().toDouble()
                tv.text = minusResult.toString()
                subBoolean = false
            }
            else if (multiplyBoolean) {
                var multiplyResult = multiplyNum * tv.text.toString().toDouble()
                tv.text = multiplyResult.toString()
                multiplyBoolean = false
            }
            else if (divideBoolean) {
                var divideResult = divideNum / tv.text.toString().toDouble()
                tv.text = divideResult.toString()
                divideBoolean = false
            }
        }
    }
    fun addToInputText(buttonValue: String): String {
        return "${tv.text}$buttonValue"
    }
    fun btnPercent(view: View){
         val num = tv.text.toString().toDouble()/100
        tv.text = num.toString()

    }
    fun btnOnClick(view: View){
        val btnSelected = view as Button

        when(btnSelected.id){
            btn0.id -> msg += "0"
            btn1.id -> msg += "1"
            btn2.id -> msg += "2"
            btn3.id -> msg += "3"
            btn4.id -> msg += "4"
            btn5.id -> msg += "5"
            btn6.id -> msg += "6"
            btn7.id -> msg += "7"
            btn8.id -> msg += "8"
            btn9.id -> msg += "9"
            btnDot.id -> {
                if(dotBoolean){
                    msg += "."
                }
                dotBoolean = true
            }
            btnPlusMinus.id ->{
                msg = "-"+ msg
            }
        }
        tv.text = msg
    }
}