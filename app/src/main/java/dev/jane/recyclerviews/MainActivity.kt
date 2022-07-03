package dev.jane.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.jane.recyclerviews.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayNames()
    }
    fun displayNames(){
        var nameList= listOf("Misky","Wanjiku","Jane","Mary","Jannie","Joan"
            ,"judy","Amekwi","Laura","Jaddie","Molllen","juliet","Monica","Loise","Sakina","Peris")
        val namesAdapter=NamesRecyclerViewAdapter(nameList)
        binding.rvnames.layoutManager=LinearLayoutManager(this)
        binding.rvnames.adapter=namesAdapter
    }



    }

