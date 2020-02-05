package com.example.mylab03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.mylab03.databinding.*
import kotlinx.android.synthetic.main.activity_city_button.*


class activitySemucBotton : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_semuc_botton)

        //Data binding
        val binding: ActivitySemucBottonBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_semuc_botton)
        //Declaring
        val model = ActivityModelTourism("Semuc Champey","Where the river hides under the stones"," is a natural monument in the department of Alta Verapaz, Guatemala, near the Q'eqchi' Maya town of Lanquín. It consists of a natural 300 m limestone bridge, under which passes the Cahabón River. Atop the bridge is a series of stepped, turquoise pools, a popular swimming attraction. Although it can be difficult to get to, Semuc is becoming more and more popular with travelers.")
        binding.setVariable(BR.model, model)
        binding.executePendingBindings()

    }

    fun exitCommentButton(view: View){
        val commentary = editText2.text.toString()
        Toast.makeText(this,commentary,Toast.LENGTH_SHORT).show()
        finish()
    }
}