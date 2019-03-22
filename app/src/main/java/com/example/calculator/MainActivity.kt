package com.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buNumberEvent(view:View)
    {
        if(isnewop==true)
        {
            editshownumber.setText("")
        }
        isnewop=false
        val buselect=view as Button
        var buclickvalue:String=editshownumber.text.toString()
        when(buselect.id)
        {
            bu0.id->
            {
                buclickvalue+="0"
            }

            bu1.id->
            {
                buclickvalue+="1"
            }

            bu2.id->
            {
                buclickvalue+="2"
            }

            bu3.id->
            {
                buclickvalue+="3"
            }

            bu4.id->
            {
                buclickvalue+="4"
            }

            bu5.id->
            {
                buclickvalue+="5"
            }

            bu6.id->
            {
                buclickvalue+="6"
            }

            bu7.id->
            {
                buclickvalue+="7"
            }

            bu8.id->
            {
                buclickvalue+="8"
            }

            bu9.id->
            {
                buclickvalue+="9"
            }

            buplusminus.id->
            {
                buclickvalue="-"+buclickvalue
            }

            buDot.id->
            {
                //TODO: prevent adding more than 1 dot
                buclickvalue+="."
            }

        }

        editshownumber.setText(buclickvalue)
    }

    var op:String? = null
    var oldnumber=""
    var isnewop=true
    fun buopevent(view:View)
    {
        val buselect=view as Button
        when(buselect.id)
        {
            bumul.id ->
            {
                op="*"
            }

            budivide.id ->
            {
                op="/u00F7"
            }

            buplus.id ->
            {
                op="+"
            }

            buminus.id ->
            {
                op="-"
            }

        }
        oldnumber=editshownumber.text.toString()
        isnewop=true
    }

    fun buequalevent(view: View)
    {
        var newnumber=editshownumber.text.toString()
        var finalnumber:Double?=null
        when(op)
        {
            "*"->
            {
                finalnumber=oldnumber.toDouble()*newnumber.toDouble()
            }
            "-"->
            {
                finalnumber=oldnumber.toDouble()-newnumber.toDouble()
            }
            "+"->
            {
                finalnumber=oldnumber.toDouble()+newnumber.toDouble()
            }
            "/u00F7"->
            {
                finalnumber=oldnumber.toDouble()/newnumber.toDouble()
            }
        }
        editshownumber.setText(finalnumber.toString())
        isnewop=true
    }

    fun bupercent(view: View)
    {
        var number:Double=editshownumber.text.toString().toDouble()/100
        editshownumber.setText(number.toString())
    }

    fun buclearevent(view: View)
    {
        editshownumber.setText("")
        isnewop=true
    }
}
