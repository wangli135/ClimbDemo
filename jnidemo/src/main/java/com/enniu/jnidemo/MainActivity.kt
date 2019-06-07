package com.enniu.jnidemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnJniInvokeJava.setOnClickListener {
            jniInvokeJava()
        }

        btnJavaInvokeCpp.setOnClickListener {
            //创建一个Person类并设置name
            val person1 = createPerson()
            setPersonName(person1, "Hello")

            //再创建一个Person类并设置name
            val person2 = createPerson()
            setPersonName(person2, "World")

            //获取Person类的name字段
            tvResultShow.text = "${getPersonName(person1)},${getPersonName(person2)}"
        }


    }

    external fun jniInvokeJava()

    external fun createPerson(): Long

    external fun setPersonName(ptr: Long, name: String)

    external fun getPersonName(ptr: Long): String


    fun getNum1(): Int {
        return 10
    }

    fun getNum2(): Double {
        return 20.0
    }

    fun showResult(value: Double) {
        tvResultShow.text = value.toString()
    }


    companion object {
        init {
            System.loadLibrary("jniAndJava")
        }
    }

}
