package com.example.mylab03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.mylab03.databinding.*
import kotlinx.android.synthetic.main.activity_city_button.*


class activityFloresButton : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flores_buttom)

        //Data binding
        val binding: ActivityFloresButtomBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_flores_buttom)
        //Declaring
        val model = ActivityModelTourism("Flores Island","The most beautiful island in Peten"," Flores is the capital of the Petén Department, Guatemala's landlocked, northernmost department. The population is 13,700 (2003).\n" +
                "\n" +
                "Flores is the seat of the municipality of Flores (population 22,600).\n" +
                "\n" +
                "Its Catedral Nuestra Señora de Los Remedios y San Pablo Itzá is the cathedral episcopal see of the Apostolic Vicariate of El Petén (formerly a territorial prelature).\n" +
                "Catedral Nuestra Señora de Los Remedios y San Pablo Itzá\n" +
                "\n" +
                "The old part of the city is located on an island on Lake Peten Itza, connected to the mainland by a short causeway. On the mainland is the suburb Santa Elena and, to the West, the contiguous municipality of San Benito. ")
        binding.setVariable(BR.model, model)
        binding.executePendingBindings()

    }

    fun exitCommentButton(view: View){
        val commentary = editText2.text.toString()
        Toast.makeText(this,commentary,Toast.LENGTH_SHORT).show()
        finish()
    }
}
