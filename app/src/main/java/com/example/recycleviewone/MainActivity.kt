package com.example.recycleviewone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var image_icons: Array<Int>
    lateinit var title: Array<String>
    lateinit var ingredient: Array<String>

    lateinit var recView : RecyclerView
    lateinit var itemArrayList : ArrayList<Pizza>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recView = findViewById(R.id.recyclerView)

        image_icons = arrayOf(
            R.drawable.pizza_1,
            R.drawable.pizza_2,
            R.drawable.pizza_3,
            R.drawable.pizza_4,
            R.drawable.pizza_5,
            R.drawable.pizza_6,
            R.drawable.pizza_7
        )

        title = arrayOf(
            "Lime Pizza",
            "Sandwich Pizza",
            "Fresh Pizza",
            "Mashroom Pizza",
            "Onion Pizza",
            "Tomato Pizza",
            "Fruits Pizza"
        )

        ingredient = arrayOf(
            "Lime, Tomato , Onion, Oregano",
            "Corn, Tomato , Onion, Oregano",
            "Carrot, Tomato , Onion, Oregano",
            "Tomato, Tomato , Onion, Oregano",
            "Onion, Tomato , Onion, Oregano",
            "Garlic, Tomato , Onion, Oregano",
            "Lemon, Tomato , Onion, Oregano"
        )

        recView = findViewById(R.id.recyclerView)
        recView.layoutManager = LinearLayoutManager(this)
        recView.setHasFixedSize(true)


        itemArrayList = arrayListOf()

        getAllData()

        recView.adapter = PizzaAdapter(itemArrayList)

    }

    private fun getAllData(){


        for (i in image_icons.indices){
        val pizza = Pizza(image_icons[i], title[i], ingredient[i])
        itemArrayList.add(pizza)
        }
    }
}