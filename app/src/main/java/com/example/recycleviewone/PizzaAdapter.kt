package com.example.recycleviewone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PizzaAdapter(private val pizzaList: ArrayList<Pizza>): RecyclerView.Adapter<PizzaAdapter.MyViewHolder>() {



    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        val imgTitle: ImageView = itemView.findViewById(R.id.img_id)
        val tvName: TextView = itemView.findViewById(R.id.title)
        val tvIng: TextView = itemView.findViewById(R.id.ingredient)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_items,parent,false)

        return  MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
       return pizzaList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = pizzaList[position]
        holder.imgTitle.setImageResource(currentItem.imageid)
        holder.tvName.text = currentItem.title
        holder.tvIng.text = currentItem.ingredient
    }


}