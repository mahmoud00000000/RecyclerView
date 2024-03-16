package com.example.recyclerview

import android.app.Activity
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val activity: Activity, val animals: ArrayList<Animal>)
    : RecyclerView.Adapter<CustomAdapter.AnimalVH>() {


    class AnimalVH(v: View): RecyclerView.ViewHolder(v) {
        val name: TextView = v.findViewById(R.id.name)
        val card: CardView = v.findViewById(R.id.card)
        val image: ImageView = v.findViewById(R.id.image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalVH {
        val v = activity.layoutInflater.inflate(R.layout.list_item,parent, false)
        return AnimalVH(v)
    }

    override fun getItemCount() = animals.size



    override fun onBindViewHolder(holder: AnimalVH, position: Int) {
        holder.name.setText(animals[position].name)
        holder.image.setImageResource(animals[position].pic)

        holder.card.setOnClickListener {
            Toast.makeText(activity, "clicked", Toast.LENGTH_SHORT).show()
        }

        holder.card.setOnClickListener {
            Toast.makeText(activity, animals[position].name, Toast.LENGTH_SHORT).show()
        }
    }


}