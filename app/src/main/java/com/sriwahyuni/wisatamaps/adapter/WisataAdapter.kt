package com.sriwahyuni.wisatamaps.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.sriwahyuni.wisatamaps.DetailWisata
import com.sriwahyuni.wisatamaps.R
import com.sriwahyuni.wisatamaps.model.ModelWisata
import com.sriwahyuni.wisatamaps.model.WisataActivity

class WisataAdapter (
    val getDetailWisata: WisataActivity,
    val itemWisataList: List<ModelWisata>
) :
    RecyclerView.Adapter<WisataAdapter.MyViewHolder>(){
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgItemWisata: ImageView = itemView.findViewById(R.id.imgWisata)
        var txtNamaWisata: TextView = itemView.findViewById(R.id.txtNamaListWisata)
        var txtLokasiWisata: TextView = itemView.findViewById(R.id.txtLokasiListWisata)
        val cardWisata : CardView = itemView.findViewById(R.id.cardWisata)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_wisata, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return  itemWisataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemWisataList[position]
        holder.imgItemWisata.setImageResource(currentItem.ImageWisata)
        holder.txtNamaWisata.text = currentItem.NamaWisata
        holder.txtLokasiWisata.text = currentItem.LokasiWisata

        holder.cardWisata.setOnClickListener(){

            //deklarasi intent
            val intent = Intent(getDetailWisata, DetailWisata::class.java)
            //put extra
            intent.putExtra("Image Wisata", itemWisataList[position].ImageWisata)
            intent.putExtra("Nama Wisata", itemWisataList[position].NamaWisata)
            intent.putExtra("Lokasi Wisata", itemWisataList[position].LokasiWisata)
            intent.putExtra("Deskripsi Wisata", itemWisataList[position].DeskripsiDetailWisata)

            //put extra latitude longitude
            intent.putExtra("Latitude Wisata", itemWisataList[position].latitude)
            intent.putExtra("Longitude Wisata", itemWisataList[position].longitude)

            // start pindah ke detail
            getDetailWisata.startActivity(intent)
            Toast.makeText(getDetailWisata,itemWisataList[position].NamaWisata, Toast.LENGTH_SHORT).show()
        }

    }
}