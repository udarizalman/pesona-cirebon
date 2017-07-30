package khilman.example.pesonacirebon;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.zip.Inflater;

import static android.R.attr.name;
import static android.R.attr.thumb;
import static android.R.attr.title;

/**
 * Created by root on 26/07/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    // deklarasi variable context
    private final Context context;
    // menyimpan judul dalam bentuk array
    String [] title = {"Gua Sunyaragi", "Keraton Kanoman", "Masjid Agung Raya", "Keraton Kasepuhan", "Setu Patok", "Ade Irma Suryani Waterpark"};
    int[] thumb = {R.drawable.gua_sunyagi, R.drawable.keraton_kanoman, R.drawable.masjid_agung, R.drawable.keraton_kasepuhan, R.drawable.setu_patok, R.drawable.water_park};
    int[] thumbId = {0,1,2,3,4,5};
    String [] desc = {"Gua Sunyaragi adalah sebuah gua yang berlokasi di kelurahan Sunyaragi, Kesambi, Kota Cirebon di mana terdapat bangunan mirip candi yang disebut Gua Sunyaragi, atau Taman Air Sunyaragi, atau sering disebut sebgaai Tamansari Sunyaragi. Nama \"Sunyaragi\" berasal dari kata \"sunya\" yang artinya adalah sepi dan \"ragi\" yang berarti raga, keduanya adalah bahasa Sanskerta. Tujuan utama didirikannya gua tersebut adalah sebagai tempat beristirahat dan meditasi para Sultan Cirebon dan keluarganya. ",

            "Seputar-Cirebon.com – Jika Anda berniat melakukan perjalanan wisata sejarah di Cirebon, kami merekomendasikan Anda untuk mengunjungi Keraton Kanoman Cirebon.\n" +
                    "\n" +
                    "Lokasi Keraton Kanoman berada di Jl. Winaon, Kampung Kanoman, Kelurahan Lemah Wungkuk, Kecamatan Lemah Wungkuk, tepatnya berada dibelakang pasar Kanoman. Lokasinya tidak terlalu jauh dari Stasiun Kejaksan Cirebon, dapat ditempuh sekitar 10-15 menit dengan menggunakan mobil pribadi, angkot atau menggunakan jasa ojek, Anda juga bisa menggunakan becak dengan waktu tempuh sekitar 20-25 menit.\n" +
                    "\n" +
                    "Dilihat dari sisi popularitas, Keraton Kanoman memang tidak sepopuler Keraton Kasepuhan, hal ini tebukti dengan lebih banyaknya orang yang mengetahui keberadaan Keraton Kasepuhan dari pada Keraton Kanoman. Namun hal ini tidak mengurangi sedikitpun daya magnetis sejarah yang ada di Keraton Kanoman Cirebon.\n" +
                    "\n" +
                    "Keraton Kanoman merupakan salah satu tonggak sejarah kota Cirebon dan berkembangnya agama islam di Cirebon, di keraton ini Anda akan banyak menemui peninggalan-peninggalan sejarah dan kisah-kisah sejarah yang sangat mendalam yang akan disampaikan oleh pemandu, penjaga atau abdi dalem Keraton Kanoman.\n" +
                    "\n" +
                    "Pada awalnya Keraton Kanoman merupakan pusat peradaban Kesultanan Cirebon, yang kemudian karena ada masalah internal terpecah menjadi Keraton Kanoman, Keraton Kasepuhan, Keraton Kacirebonan, dan Keraton Keprabon.\n" +
                    "\n" +
                    "Keraton Kanoman didirikan oleh Pangeran Mohamad Badridin atau Pangeran Kertawijaya, yang bergelar Sultan Anom I, pada sekitar tahun 1510 Šaka atau 1588 M. Keraton Kanoman juga tidak terlepas dari awal berkembangnya agama Islam di Jawa Barat, karena Islam di Jawa Barat tidak lepas dari Cirebon",

            "Bersyukur dapat meluangkan waktu untuk beribadah di sini ketika berkunjung ke Kota Cirebon. Lokasinya berseberangan dengan Rumah dinas/kantor walikota Cirebon (?) dan dilengkapi oleh lapangan luas (biasanya disebut alun-alun), ya disini desebut alun-alun Kejaksan. Lokasi kebetulan tidak telalu jauh dari hotel dan secara tidak sengaja terlewati oleh kendaraan kami ketika datang dari Stasiun kereta Cirebon. Mesjid agung/Raya yang cukup luas dibangun dengan baik dan terlihat modern. Terawat bersih dan rapi, sehingga cukup nyaman beribadah di dalamnya dan beristirahat sejenak di udara Kota Cirebon yang panas dan gerah. ",

            "Keraton Kasepuhan adalah keraton termegah dan paling terawat di Cirebon. Makna di setiap sudut arsitektur keraton ini pun terkenal paling bersejarah. Halaman depan keraton ini dikelilingi tembok bata merah dan terdapat pendopo di dalamnya.[1]\n" +
                    "\n" +
                    "Keraton Kasepuhan adalah kerajaan islam tempat para pendiri cirebon bertahta, disinilah pusat pemerintahan Kasultanan Cirebon berdiri.\n" +
                    "\n" +
                    "Keraton ini memiliki museum yang cukup lengkap dan berisi benda pusaka dan lukisan koleksi kerajaan. Salah satu koleksi yaitu kereta Singa Barong yang merupakan kereta kencana Sunan Gunung Jati. Kereta tersebut saat ini tidak lagi dipergunakan dan hanya dikeluarkan pada tiap 1 Syawal untuk dimandikan.\n" +
                    "\n" +
                    "Bagian dalam keraton ini terdiri dari bangunan utama yang berwarna putih. Di dalamnya terdapat ruang tamu, ruang tidur dan singgasana raja.",

            "Lokasi Setu Patok cukup jauh dari Stasiun ataupun terminal bus, karena jauh berada di sisi luar kabupaten Cirebon, waktu tempuh dengan motor bisa 25 menitan dari terminal bus Harjamukti Cirebon.\n" +
                    "\n" +
                    "Penanda dari jalan raya Cirebon- tegal adalah gapura batas kota yang berada sekitar 10 meter dari jembatan Mundu, dari situ ada jalan kecil yang menembus perkampungan sebelum akhirnya sampai di setu Patok.\n" +
                    "\n" +
                    "Mungkin petunjuk arah ke Setu Patok akan bertuliskan “ CIWALK SETU PATOK”",

            "Cirebon, Banyak orang yang menyebut Kota ini sebagai Kota Udang. yups, karena memang kota ini sebagai kota penghasil udang dengan berbagai makanan olahan yang berbahan dasar udang. ternyata Di Kota Cirebon ini juga sangat unik karena kota ini menggambarkan dua budaya yang berbeda, yaitu Jawa Barat dan Jawa Tengah. masyarakat Cirebon menggunakan dan memiliki kultur budaya jawa dan sunda. terlepas dari keunikannya, Banyak sekali obyek – obyek wisata di Cirebon yang bisa kalian kunjungi, seperti keraton kasepuhan, Taman wisata siwalk, wanawisata ciwaringin, desa wisata cikalahang dan masih banyak obyek wisata lainnya yang menarik. ada juga Ade Irma Suryani Waterpark atau yang sering disebut dengan Cirebon Water Land. belum banyak orang yang tau tempat ini, sehingga masih belum banyak yang berkunjung karena memang obyek wisata ini masih terbilang baru. Wisata Ade Irma ini awalnya adalah merupakan tempat rekreasi dan wahana kebun binatang, namun berubah menjadi wahana kuliner, kolam renang, dan penginapan. Dulunya tempat ini bernama Taman Ade Irma Suryani Nasution. Taman ini juga merupakan satu-satunya wahana rekreasi dan taman bermain di Kota Cirebon yang berada di dekat pantai di teluk Cirebon. sekedar informasi, Taman Ade Irma Suryani dulu pernah menjadi ikon kebanggaan masyarakat Cirebon lho.\n" +
                    "\n" +
                    "Dengan wajah baru ini, Ade Irma Suryani Waterpark diharapkan dapat mengembalikan kejayaan yang dulu pernah dicapai. Ade Irma Waterpark di resmikan pada 1 Juli 2015 oleh Walikota Cirebon Nasrudin Aziz. Cirebon Waterland berdiri di atas lahan seluas 3 Ha dengan penambahan dari Taman Ade Irma Suryani yang merupkan aset milik Pemkot Kota Cirebon. WaterLand Ade Irma Cirebon ini terletak di Jalan Dipenogoro Kota Cirebon, lokasinya berdekatan dengan Kantor Bank Indonesia cabang Cirebon. Dikabarkan tempat ini akan di adakan Grand Opening yang akan dilaksanakan pada awal Desember 2015. Untuk harga tiket masuk dikenakan biaya sekitar Rp 50.000 per orangnya. kehadiran tempat ini diharapkan juga dapat menarik wisatawan dari luar daerah Cirebon dan  tidak menutup kemungkinan untuk wisatawan mancanegara singgah di tempat ini."
    };

    LayoutInflater inflater;
    public RecyclerAdapter(Context context){
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int position) {
        View v =  inflater.inflate(R.layout.item_list, parent, false);
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.tv1.setText(title[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.imageView.setImageResource(thumb[position]);
        holder.imageView.setOnClickListener(clickListener);
        //holder.tv2.setOnClickListener(clickListener);
        holder.tv1.setTag(holder);
        holder.imageView.setTag(holder);
    }


    View.OnClickListener clickListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            // memberi aksi saat cardview di click berdasarkan posisi tertentu
            RecyclerViewHolder vholder = (RecyclerViewHolder) view.getTag();
            int position = vholder.getPosition();
            Intent intent = new Intent(context, PlaceDetail.class);
            intent.putExtra("postDesc", desc[position]);
            intent.putExtra("postTitle", desc[position]);
            intent.putExtra("postImage", "" + thumbId[position]);
            context.startActivity(intent);
            //Toast.makeText(context, "Menu ini berada di posisi " + position, Toast.LENGTH_LONG).show();
        }
    };

    @Override
    public int getItemCount() {
        return title.length;
    }
}
