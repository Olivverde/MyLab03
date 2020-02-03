package com.example.mylab03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.mylab03.databinding.*
import kotlinx.android.synthetic.main.activity_city_button.*


class activityCityButton : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_button)

        //Data binding
        val binding: ActivityCityButtonBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_city_button)
        //Declaring
        val model = ActivityModelTourism("Guatemala City","The cradle of the eternal spring"," locally known as Guatemala or Guate, officially Nueva Guatemala de la Asunción (New Guatemala of the Assumption), is the capital and largest city of Guatemala, and the most populous urban area in Central America. The city is located in the south-central part of the country, nestled in a mountain valley called Valle de la Ermita (English: Hermitage Valley). It is estimated that its population is about 1 million. Guatemala City is also the capital of the Municipality of Guatemala and of the Guatemala Department.")
        binding.setVariable(BR.model, model)
        binding.executePendingBindings()

    }

    fun exitCommentButton(view: View){
        val commentary = editText2.text.toString()
        Toast.makeText(this,commentary,Toast.LENGTH_SHORT).show()
        finish()
    }
}
