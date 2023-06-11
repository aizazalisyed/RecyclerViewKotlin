package java.com.RecyclerViewKotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.com.myapplication.R

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayContact = ArrayList<Model>()
        var recyclerView : RecyclerView = findViewById(R.id.recyclerView)


        arrayContact.add(Model(name = "Aizaz", number = "03335540877"))
        arrayContact.add(Model(name = "golu", number = "03335540877"))
        arrayContact.add(Model(name = "Ani", number = "03335540877"))
        arrayContact.add(Model(name = "zazai", number = "03335540877"))
        arrayContact.add(Model(name = "yolo", number = "03335540877"))
        arrayContact.add(Model(name = "Aizaz", number = "03335540877"))
        arrayContact.add(Model(name = "Aizaz", number = "03335540877"))
        arrayContact.add(Model(name = "Aizaz", number = "03335540877"))
        arrayContact.add(Model(name = "Aizaz", number = "03335540877"))
        arrayContact.add(Model(name = "Aizaz", number = "03335540877"))
        arrayContact.add(Model(name = "Aizaz", number = "03335540877"))

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter : Adapter = Adapter(this,arrayContact)
        recyclerView.adapter = adapter

    }
}