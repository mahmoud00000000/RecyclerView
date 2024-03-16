package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layoutInflater

        val animals = arrayListOf<Animal>()
        animals.add(Animal(R.string.elephant , R.drawable.elephant ))
        animals.add(Animal(R.string.monkey , R.drawable.monkey ))
        animals.add(Animal(R.string.fish , R.drawable.fish ))
        animals.add(Animal(R.string.dog , R.drawable.dog ))
        animals.add(Animal(R.string.bird , R.drawable.bird ))
        animals.add(Animal(R.string.bear , R.drawable.bear ))
        animals.add(Animal(R.string.lion , R.drawable.lion ))
        animals.add(Animal(R.string.cat , R.drawable.cat ))
        animals.add(Animal(R.string.camel , R.drawable.camel ))
        animals.add(Animal(R.string.turtle , R.drawable.turtle ))
        animals.add(Animal(R.string.elephant , R.drawable.elephant ))
        animals.add(Animal(R.string.monkey , R.drawable.monkey ))
        animals.add(Animal(R.string.fish , R.drawable.fish ))
        animals.add(Animal(R.string.dog , R.drawable.dog ))
        animals.add(Animal(R.string.bird , R.drawable.bird ))
        animals.add(Animal(R.string.bear , R.drawable.bear ))
        animals.add(Animal(R.string.lion , R.drawable.lion ))
        animals.add(Animal(R.string.cat , R.drawable.cat ))
        animals.add(Animal(R.string.camel , R.drawable.camel ))
        animals.add(Animal(R.string.turtle , R.drawable.turtle ))
        animals.add(Animal(R.string.elephant , R.drawable.elephant ))
        animals.add(Animal(R.string.monkey , R.drawable.monkey ))
        animals.add(Animal(R.string.fish , R.drawable.fish ))
        animals.add(Animal(R.string.dog , R.drawable.dog ))
        animals.add(Animal(R.string.bird , R.drawable.bird ))
        animals.add(Animal(R.string.bear , R.drawable.bear ))
        animals.add(Animal(R.string.lion , R.drawable.lion ))
        animals.add(Animal(R.string.cat , R.drawable.cat ))
        animals.add(Animal(R.string.camel , R.drawable.camel ))
        animals.add(Animal(R.string.turtle , R.drawable.turtle ))
        animals.add(Animal(R.string.elephant , R.drawable.elephant ))
        animals.add(Animal(R.string.monkey , R.drawable.monkey ))
        animals.add(Animal(R.string.fish , R.drawable.fish ))
        animals.add(Animal(R.string.dog , R.drawable.dog ))
        animals.add(Animal(R.string.bird , R.drawable.bird ))
        animals.add(Animal(R.string.bear , R.drawable.bear ))
        animals.add(Animal(R.string.lion , R.drawable.lion ))
        animals.add(Animal(R.string.cat , R.drawable.cat ))
        animals.add(Animal(R.string.camel , R.drawable.camel ))
        animals.add(Animal(R.string.turtle , R.drawable.turtle ))

        val adapter = CustomAdapter(this, animals)
        val rv: RecyclerView = findViewById(R.id.animals_rv)
        rv.adapter = adapter

    }
}