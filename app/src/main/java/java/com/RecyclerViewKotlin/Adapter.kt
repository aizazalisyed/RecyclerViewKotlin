package java.com.RecyclerViewKotlin

import android.content.Context
import android.view.Display.Mode
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.com.myapplication.R

class Adapter (val context: Context, val arrModel: ArrayList<Model>) : RecyclerView.Adapter<Adapter.ViewHolder>() {


    //super waly constructor ki ab zarorat nahi ha
    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

        val name = itemView.findViewById<TextView>(R.id.name)
        val number = itemView.findViewById<TextView>(R.id.number)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.recyclerview_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val model : Model  = arrModel[position]
        holder.name.text = model.name
        holder.number.text = model.number

    }

    override fun getItemCount(): Int {
        return arrModel.size
    }
}