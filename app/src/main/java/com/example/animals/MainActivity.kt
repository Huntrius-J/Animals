package com.example.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AddClasses()
    }

    fun AddClasses()
    {
        var meatingText = findViewById<TextView>(R.id.meatingText)
        var gfeedingText = findViewById<TextView>(R.id.gfeedingText)

        var cat= MeatEating(name = "Кошка",species = "Сибирская",age=4)
        var tiger = MeatEating("Тигр","Амурский",8)

        var mEAnimals = listOf(cat,tiger)

        var gFAnimals = listOf(GrassFeeding("Курица","Бойцовская",1), GrassFeeding("Овца","Дорпер",3))

        println("Список плотоядных животных:")
        var output = ""
        mEAnimals.forEach{
            println("${it.name}, порода: ${it.species}, возраст:${it.age}")

            output += "${it.name}, порода: ${it.species}, возраст:${it.age} \n"
        }
        meatingText.setText(output)

        println("Список травоядных животных:")
        output = ""
        gFAnimals.forEach{
            println("${it.name}, порода: ${it.species}, возраст:${it.age}")

            output += "${it.name}, порода: ${it.species}, возраст:${it.age} \n"
        }
        gfeedingText.setText(output)
    }
}