package com.sriwahyuni.wisatamaps.model

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sriwahyuni.wisatamaps.R
import com.sriwahyuni.wisatamaps.adapter.WisataAdapter

class WisataActivity : AppCompatActivity() {

    private var recycleView: RecyclerView? = null
    private var wisataAdapter: WisataAdapter? = null

    //array data wisata
    private var wisataList = mutableListOf<ModelWisata>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_wisata)

        wisataList = ArrayList()
        recycleView = findViewById(R.id.rv_list_wisata)
        wisataAdapter = WisataAdapter(this, wisataList);

        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 1)

        recycleView!!.layoutManager = layoutManager
        recycleView!!.adapter = wisataAdapter

        //create dummy data
        prepareDataWisata()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun prepareDataWisata() {
        var itemWisata = ModelWisata(
            R.drawable.jam_gadang,
            "Jam Gadang",
            "Bukittinggi, Sumatera Barat",
            "Destinasi yang tidak boleh dilewatkan kalau kamu berkunjung ke Bukittinggi pastilah Jam Gadang. Jam di menara berukuran 13×4 meter ini berada di kawasan Taman Sabai Nan Aluih. Berlokasi di taman, Jam Gadang memiliki suasana yang rindang dengan adanya sejumlah pepohonan hijau. Ikon Bukittinggi ini tak pernah sepi dari pengunjung. Mulai dari pagi, siang, sore, hingga malam, kawasan ini sangat digemari oleh wisatawan.",
            -0.3051816,
            100.3694972
        )
        wisataList.add(itemWisata)
        itemWisata = ModelWisata(
            R.drawable.gambar3,
            "Desa Terindah Pariangan",
            "Pariangan Tanah Datar Batusangkar, Sumatera Barat",
            "Desa wisata Nagari Tuo Pariangan adalah sebuah desa indah yang terletak di lereng Gunung Marapi, sebuah gunung api aktif yang berada di dataran tinggi Provinsi Sumatera Barat. Berada di ketinggian 800 - 1000 mdpl, Pariangan memiliki topografi daerah perbukitan dan pegunungan dengan udara yang sejuk. Posisi geografis ini juga memberikan anugerah alam yang elok dan subur bagi desa wisata Pariangangan dimana sawah berjenjang memanjakan mata dari lereng Gunung Marapi hingga lembah-lembah yang ada dibawahnya bahkan hingga ke Danau Singkarak.",
            -0.4454374,
            100.4204917
        )
        wisataList.add(itemWisata)
        itemWisata = ModelWisata(
            R.drawable.bali,
            "Ulun Danu Beratan",
            "Bali, Denpasar",
            "Pura Ulun Danu Bratan, Pura Ulun Danu Beratan atau Bratan Pura merupakan sebuah pura dan candi air besar di Bali, Indonesia - candi utama air lainnya menjadi Pura Ulun Danu Batur. Kompleks candi ini terletak di tepi barat laut Danau Bratan di pegunungan dekat Bedugul, Kabupaten Tabanan.",
            -8.2751684,
            115.1666678
        )
        wisataList.add(itemWisata)
        itemWisata = ModelWisata(
            R.drawable.gambar1,
            "Masjid Raya Syekh Ahmad Khatib Al-Minangkabawi",
            "Padang, Sumatera Barat",
            "Masjid Raya Sumbar berdiri di lahan sekitar 4 hektar di pinggir Jalan Khatib Sulaiman, Kelurahan Alai Parak Kopi, Kecamatan Padang Utara, Kota Padang. Pembangunan masjid ini ditandai dengan peletakan batu pertama pada 21 Desember 2007 dan selesai pada 4 Januari 2019",
            -0.9242903,
            100.3598587
        )
        wisataList.add(itemWisata)
        itemWisata = ModelWisata(
            R.drawable.candiborobudur,
            "Candi Borobudur",
            "Magelang, Jawa Tengah",
            "Candi Borobudur merupakan sebuah candi Buddha yang megah dan menjadi salah satu situs bersejarah terpenting di Indonesia, terletak di Magelang, Jawa Tengah. Dibangun sekitar abad ke-9 Masehi, candi ini merupakan salah satu keajaiban arsitektur dan kepercayaan agama Buddha di Asia Tenggara.",
            -7.6067821,
            110.2054869
        )
        wisataList.add(itemWisata)
        itemWisata = ModelWisata(
            R.drawable.gambar2,
            "Lembah Harau",
            " Kabupaten Limapuluh Koto, Sumatera Barat.",
            "Lembah Harau adalah sebuah ngarai dekat Kota Payakumbuh di Kabupaten Limapuluh Koto, provinsi Sumatera Barat. Lembah Harau diapit dua bukit cadas terjal dengan ketinggian mencapai 150 meter berupa batu pasir yang terjal berwarna-warni, dengan ketinggian 100 sampai 500 meter. Topografi Cagar Alam Harau adalah berbukit-bukit dan bergelombang. Tinggi dari permukaan laut adalah 500 sampai 850 meter, bukit tersebut antara lain adalah Bukit Air Putih, Bukit Jambu, Bukit Singkarak, dan Bukit Tarantang",
            -0.1137836,
            100.667257
        )
        wisataList.add(itemWisata)
        wisataAdapter!!.notifyDataSetChanged()
    }
}