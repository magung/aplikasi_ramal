package com.magung.ramal_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RamalActivity extends AppCompatActivity {
    public static final String NAME = "name";
    public static final String R_DAY = "day";
    public static final String R_MONTH = "month";

    TextView tName, tBintang, tInfo, tRamal;

    public static String[][] dataBulan = new String[][]{
            {"Januari, Si Ambisius \n" +
                    "\n" +
                    "Mereka yang lahir bulan Januari biasanya memiliki sifat keras kepala dalam hal tindakan maupun keinginan. Individu yang lahir pada bulan Januari juga dinilai memiliki sifat ambisius dalam kehidupan karir. Di lain sisi, orang-orang yang lahir di bulan ini cenderung merupakan people watcher. \n" +
                    "\n" +
                    "Kamu biasanya senang memperhatikan orang-orang sekitarmu untuk mempelajari sesuatu; entah kehidupan mereka atau yang lainnya. Uniknya kamu yang lahir bulan Januari juga belajar mengenali sifat-sifat dirimu dari cara mengobservasi orang lain. Selain itu individu berbulan lahir Januari memiliki keinginan atau hasrat untuk dapat membantu orang dalam hal improvisasi diri. \n" +
                    "\n" +
                    "Kemampuan leadership ini terkadang bisa bermanfaat, namun bisa juga sebaliknya. Kamu harus pintar memposisikan dirimu agar segala karakteristik unik ini dapat memberikan benefit bagi kehidupan personal maupun karir. "},
            {"Februari, Si Pemikir yang Filosofis \n" +
                    "\n" +
                    "Jika kamu lahir bulan Februari, kamu cenderung memiliki bakat artistik dan juga kreatifitas alami. Mereka yang lahir pada bulan Februari juga cenderung memiliki otak yang cerdas, dan senang berpikir bebas atau biasa disebut free thinker namun mereka bisa memberontak sewaktu-waktu. Artinya individu kelahiran bulan Februari terkadang akan menolak untuk mematuhi aturan main ketika argumen mereka dirasa tidak diperhatikan. \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Satu hal yang baik bagi mereka yang lahir bulan Februari adalah kemampuan untuk mengenal lebih dalam kepribadian mereka sendiri. Hal inilah yang membuat mereka selalu yakin dengan apa yang ingin mereka capai. "},
            {"Maret, Si Penengah Konflik \n" +
                    "\n" +
                    "Individu yang lahir pada bulan Maret cenderung pemalu dalam hal keterbukaan diri. Ini membuat mereka tidak mudah untuk menunjukkan jati diri atau personality mereka kepada sembarang orang. Mereka juga memiliki keinginan hati yang lurus dan baik. \n" +
                    "\n" +
                    "Harmonisasi adalah kunci utama bagi mereka yang lahir pada bulan Maret. Makanya tak jarang mereka sering kali dianggap sebagai orang yang cocok sebagai penengah dua kubu yang beroposisi. Mereka juga dianggap trustworthy. "},
            {"April, Si Penyuka Tantangan \n" +
                    "\n" +
                    "Kesan kuat dan atletis biasanya melekat pada mereka yang lahir pada bulan April. Individu kelahiran bulan April cenderung akan cepat merasa senang jika mendapat perhatian dari banyak pihak, singkatnya mereka ingin kerja keras mereka dihargai oleh orang-orang. Kelahiran bulan April juga biasanya menyukai tantangan dan punya banyak pengalaman menyenangkan dalam hidup. \n" +
                    "\n" +
                    "Meski kamu merasa ketakutan saat pertama kali mencoba sesuatu, dorongan asli dalam hatimu selalu mengatakan bahwa sebenarnya hal menantang tersebut memang perlu untuk kamu taklukkan. Itulah mengapa mereka yang lahir pada bulan April biasanya juga dikenal sebagai pribadi yang mudah dalam mengalahkan rasa takut dalam diri sendiri. "},
            {"Mei, Si Cerdas yang Atraktif \n" +
                    "\n" +
                    "Banyak individu yang lahir pada bulan Mei dikenal sangat atraktif, baik secara fisik maupun personality. Mereka cenderung lebih menggunakan otak kiri, yang berarti bahwa sifat orang-orang kelahiran bulan Mei ini lebih logis dibanding kreatif. Sejalan dengan hal tersebut, mereka sebenarnya juga punya peluang besar untuk sukses di mata pelajaran Matematika atau bidang sains seperti fisika. \n" +
                    "\n" +
                    "Individu kelahiran bulan Mei sangat senang bermain dengan fakta-fakta dan sering merasa terhibur dengan artikel atau tayangan yang lebih memiliki basis nyata dibandingkan fantasi semu. Mereka juga dikenal memiliki figur yang jelas mengenai mimpi dan masa depan mereka. "},
            {"Juni, Si Kalem \n" +
                    "\n" +
                    "Sensitif dan peka, dua kesan inilah yang paling sering menempel pada mereka yang lahir pada bulan Juni. Hal yang unik adalah mereka tidak akan memberitahu kita apakah mereka tengah merasa sedih ataupun tersakiti. Individu kelahiran bulan Juni merupakan pendengar yang baik, mereka juga punya rasa peduli yang besar terhadap orang lain dan cenderung sangat sopan. \n" +
                    "\n" +
                    "Sifat ini sering membuat orang lain datang kepada mereka untuk meminta saran. Mereka yang lahir pada bulan Juni biasanya senang membahagiakan orang lain. \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Namun di lain sisi, hal tersebut bisa berakibat buruk. Contohnya jika mereka punya hasrat yang sama dengan teman mereka, individu kelahiran bulan Juni ini cenderung memilih untuk mengalah demi orang lain. "},
            {"Juli, Si Extrovert \n" +
                    "\n" +
                    "Orang-orang yang lahir pada bulan Juli kebanyakan memiliki sifat asli yang enerjik, artinya mereka asyik untuk diajak hangout. Mereka juga punya satu pesona tersendiri yang membuat orang lain merasa ingin lebih dekat dengan mereka. Selain itu individu yang lahir bulan Juli punya selera humor yang cerdas. \n" +
                    "\n" +
                    "Segala karakteristik ini membuat orang-orang cepat sekali nyaman terhadap mereka. Menghabiskan waktu bersama individu kelahiran bulan Juli biasanya tidak akan pernah terasa bosan karena mereka selalu punya energi dan senyum sumringah untuk menaikkan mood orang-orang di sekitar mereka. "},
            {"Agustus, Si Pemimpin Alami \n" +
                    "\n" +
                    "Karakteristik individu yang lahir bulan Agustus memiliki kesamaan dengan mereka yang lahir pada bulan Juli dari segi selera humor. Mereka juga senang tertawa dan membuat lelucon. Kepribadian ini membuat orang lain mengagumi karakter personal mereka. \n" +
                    "\n" +
                    "Jika kamu merupakan kelahiran Agustus, berbahagialah karena kamu punya bakat alami dalam hal leadership. Sayangnya, tak banyak individu kelahiran Agustus yang sadar akan potensi mereka. Padahal kemampuan ini bisa dimanfaatkan untuk menyukseskan hidup, baik dalam bisnis maupun urusan personal. "},
            {"September, Si Penyuka Detail \n" +
                    "\n" +
                    "Detail oriented mungkin merupakan kata yang tepat untuk menggambarkan karakteristik orang-orang yang lahir pada bulan September. Hal ini dikarenakan mereka cenderung perfeksionis dalam memandang sesuatu. Standar ini uniknya tak hanya mereka terapkan pada orang lain, tetapi juga pada mereka sendiri. \n" +
                    "\n" +
                    "Ini bisa jadi merupakan suatu hal yang dapat memberikan manfaat karena kebanyakan dari mereka yang lahir pada bulan September memiliki manajemen waktu serta metode pengerjaan tugas yang cukup baik. Mereka juga biasanya punya ekspektasi tinggi jika menyangkut hal-hal yang berbau organisasional, dan punya kritik tajam jika apa yang mereka harapkan tidak sesuai. "},
            {"Oktober, Si Penebar Aura Positif \n" +
                    "\n" +
                    "Individu yang lahir pada bulan Oktober cenderung bersifat carefree, artinya mereka tidak suka kehidupan mereka diatur ataupun dikekang. Mereka juga punya sifat alami yakni independen dan selalu fokus untuk melihat sisi positif dari suatu hal. Inilah yang membuat banyak orang sering bergantung kepada individu yang lahir pada bulan Oktober. \n" +
                    "\n" +
                    "Kecenderungan sifat di atas juga membuat mereka yang lahir di bulan ini menjadi pribadi yang menyenangkan, talkative dan mudah dalam membuat teman baru. "},
            {"November, Si Pengamat yang Misterius \n" +
                    "\n" +
                    "Mereka yang lahir pada bulan November punya kecenderungan sifat keras kepala dan sangat secretive. Maksud dari secretive ini artinya mereka selalu menyimpan rahasia mereka rapat-rapat dan tak menceritakannya pada orang lain, tidak peduli seberapa dekat hubungan mereka dengan orang tersebut. Hal ini sering membuat orang-orang salah paham akan maksud mereka sebenarnya. \n" +
                    "\n" +
                    "Individu yang lahir pada bulan November juga memiliki level fokus yang luar biasa terhadap sesuatu. ereka juga sangat peka dan self-motivated, dua hal yang memberikan kontribusi terhadap sifat mereka yang secretive karena mereka tidak terlalu mempercayai orang lain. \n" +
                    "\n" +
                    "Kalau kamu merupakan kelahiran bulan November, biasanya kamu tidak terlalu suka jika harus menerima bantuan dari orang lain. Bahkan ketika orang tersebut menawarkan atau memaksa kamu menerima bantuan, kamu tetap enggan untuk mengatakan ‘ya’ dan memilih fokus serta percaya pada kemampuanmu. \n" +
                    "\n" +
                    "Kamu sebenarnya punya segudang potensi untuk bisa menjadi pemimpin. Namun terkadang sifat “masa bodo”-mu itu membuatmu tidak tertarik dengan segala atribut dan jabatan penting yang ditawarkan tadi. "},
            {"Desember, Si Kuat yang Inspiratif \n" +
                    "\n" +
                    "Mereka yang lahir bulan Desember senang menjadi pusat perhatian dan cenderung aktif. Hal ini mengindikasikan bahwa kamu tidak suka hanya berdiam diri di rumah dan tidak melakukan apapun. \n" +
                    "\n" +
                    "Individu yang lahir pada bulan Desember biasanya sangat bangga terhadap diri sendiri dan tidak peduli dengan pandangan lemah orang lain yang terkadang mengintimidasi. \n" +
                    "\n" +
                    "Karakteristik ini membuat mereka tidak akan keberatan untuk fighting back jika ada pihak yang berusaha menjatuhkan mereka. \n" +
                    "\n" +
                    "Individu kelahiran bulan Desember sering juga dikenal sebagai tipe manusia yang selalu gigih dalam membela harga diri mereka. Salah satu sifat kesatria yang tidak dimiliki oleh banyak orang. "}
    };

    //ini adalah data yang mau kita masukkan
    public static String[][] data = new String[][]{
            { "Capricorn", "Sifat Baik dan Buruk Zodiak Capricorn \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Orang yang lahir pada tanggal antara 21 Desember sampai 19 Januari berada di bawah pengaruh zodiak Capricorn, yang berlambang kambing. Orang yang berzodiak Capricorn mengutamakan kesuksesan, status, posisi, reputasi, loyalitas, konsentrasi, pemecahan masalah, bertanggung jawab, memperlihatkan kebijaksanaan, dan keseriusan belajar melalui pengalaman. Namun, ada kalanya orang berzodiak Capricorn cenderung bersikap memandang buruk (pesimis), selalu terpaksa, membebani, takut menghadapi hambatan, memperlihatkan batasan, kurang simpati, terlalu khawatir, dan pemikiran sempit. Capricorn termasuk dalam kategori kardinal, yaitu aktif. Dengan kualitas ini Anda dianggap baik untuk memulai setiap proyek baru. Lambang-lambang yang termasuk dalam kategori kardinal selain Capricorn adalah Aries, Cancer dan Libra. \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Pasangan yang Tepat untuk Capricorn \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Dalam pergaulan, orang yang berkelahiran Capricorn agak posesif (mengekang). Dalam pergaulan yang membuahkan cinta, Capricorn sering mencemburui kekasihnya tanpa alasan yang jelas. Sifat seperti ini menyebabkan perilakunya sulit untuk dimengerti dan terkadang seperti kekanak-kanakan. Untuk mengatasi masalah ini, seseorang yang berkepribadian dewasa, ramah dan penuh pengertian adalah pendamping ideal bagi Capricorn. Orang yang di bawah naungan Aries (21 Maret – 20 April), Taurus (21 April – 20 Mei) atau Libra (23 September – 22 Oktober) memang sesuai bagi Capricorn. Sikap Aries yang penuh perhatian dapat mendamaikan hati Capricorn. Bersamanya, Anda (Capricorn) akan merasa dibutuhkan dan dicintai. Taurus yang tenang juga tepat bagi Capricorn. Sikap Taurus yang kerap melindungi dan jujur, memang yang Anda butuhkan. Berpasangan dengan Libra yang bijaksana, juga akan membahagiakan Capricorn. Libra sangat berhati – hati dalam tutur kata sehingga perasaan Capricorn yang sensitif, tidak akan terluka. \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Sebaliknya, hubungan Capricorn dengan Aquarius (21 Januari – 18 Februari) atau Gemini (21 Mei – 20 Juni) dianggap kurang sesuai. Ini karena hubungan Capricorn – Aquarius bukanlah hubungan yang ideal. Tapi Anda (Capricorn) jangan risau. Sikap Anda yang menyukai praktis dapat mengatasi hal tersebut. Ini berlaku demikian karena Aquarius memiliki pandangan yang luas ketika rasa cemburu Anda sedang meluap-luap. Sementara sifat Gemini, yang sulit dipegang, bukanlah bintang yang mempesona Capricorn. Tidak mudah bagi Anda yang mudah cemburu mendampingi perilakunya yang sering berubah – ubah. Namun begitu, hidup bersama Gemini tidak akan ada ketegangan lantaran dia suka berpesta, berteman banyak dan menikmati kesenangan. \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Karir dan Keuangan Capricorn \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Capricorn memang bercita – cita mencari kekuasaan dalam karir sehingga Anda harus siap bekerja dengan tekun. Capricorn ditakdirkan menjadi manajer dan administrator yang baik. Diibaratkan berpasangan dengan Leo, kalau Leo sangat baik menjadi raja atau ratu, Capricorn sangat cocok menjadi perdana menteri. Keberhasilan Capricorn dalam usaha mengatasi masalah dan risiko akhirnya membuat Capricorn berhasil mendapatkan manfaat dari segi keuangan. Sikap rajin bekerja Capricorn juga menyebabkan kepala dan teman seorganisasi menghormatinya. Dari segi keuangan, Capricorn pada umumnya memperoleh harta dan mampu membelanjakan harta itu di jalan yang wajar. Capricorn misalnya tidak gemar bersikap boros atau menghabiskan uangnya untuk tujuan perjudian atau investasi yang belum pasti untung ruginya. \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Keluarga dan Rumah Tangga Capricorn \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Rumah kelahiran Capricorn biasanya rapi dan tersusun. Cara Capricorn mengatur rumah tangga sama dengan cara mengurus karirnya. Capricorn bijak mengelola anak – anak dan serius dengan aturan yang tepat dipatuhi mereka. Pastinya Capricorn bangga menjadi orang tua.  "},
            {"Aquarius", "Sifat Baik dan Buruk Zodiak Aquarius \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Orang yang lahir pada tanggal antara 20 Januari sampai 18 Febuari berada di bawah pengaruh zodiak Aquarius, yang berlambang gelombang (alur air). Orang Aquarius tertarik dengan petualangan, berjiwa kemanusiaan, ingin tahu, ada semangat berontak, bersikap spontan, progesif, persahabatan, hak asasi, kelompok, dan mampu memberi manfaat untuk sekitar. Namun, ada kalanya Aquarius menghadapi gangguan, tak bisa diharapkan, suka membantah, memberontak, tak lengkap, perilaku salah, tak kosisten, perangai radikal, kurang metode, dan mendatangkan bencana. Aquarius termasuk dalam kategori tetap, yaitu termasuk stabilitas, ketabahan, ketahanan, dan kesempurnaan. Dengan kualitas ini Aquarius baik untuk memastikan sesuatu berjalan lancar atau berhasil. Lambang – lambang yang termasuk dalam kategori tetap selain Aquarius adalah Taurus, Leo dan Scorpio. \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Pasangan yang Tepat untuk Aquarius \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Teman atau kekasih yang paling cocok bagi Aquarius adalah Aries dan Gemini. Aries merupakan pendamping yang cocok bagi Aquarius. Semangat Aries yang tinggi dalam menambah ilmu merupakan hal menarik perhatian bagi Aquarius. Aries sebaliknya menyenangi sikap Aquarius yang terbuka. Gemini juga memiliki persamaan dengan Aquarius. Kedua – duanya memandang daya intelektual bukan rupa dan tubuh semata – mata. Keinginan Aquarius berburu karir turut disenangi oleh Gemini. Sementara itu, Aquarius harus bersabar ketika berdamping dengan Capricorn dan Virgo. Oleh sebab Aquarius bersikap dingin, mungkin akan sulit bergaul dengan Capricorn yang sikapnya tertutup. Namun begitu, keduanya sama – sama cerdas dan memendam rasa. Selanjutnya, Aquarius mungkin kurang sesuai berdampingan dengan Virgo. Hidupnya menjadi kaku dan horisontal bila dipasangkan denganVirgo yang serius. \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Karir dan Keuangan Aquarius \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Kelahiran Aquarius ini biasanya tekun bekerja dan ingin orang lain sama tekun dalam bekerja sama. Lantaran itu, Aquarius menyukai karir yang mengikat dirinya dengan dasar filosofis, kekreatifan dan berlandaskan metode serta teknik yang tersusun. Aquarius cepat menguasai karir dan berupaya memberikan kontribusi ide bagi peningkatan diri dan organisasi, dan gemar membantu teman sekerja. Walau bagaimana pun, untuk berhasil ke tujuan karir yang tertinggi, Aquarius perlu mengembangkan kepekaan emosi, perasaan mendalam dan kesabaran yang tinggi. Dari segi perolehan uang, kelahiran Aquarius cenderung bersikap idealis dan kemanusiaan. Aquarius biasanya pemurah dan suka menyumbang untuk sosial dan politik tetapi tanpa mengharap balasan atau sanjungan. Aquarius membutuhkan uang untuk kebutuhan yang bermanfaat bagi diri, keluarga atau orang lain. Tapi bukan untuk status diri sendiri semata – mata. \n" +
                    "\n" +
                    "Keluarga dan Rumah Tangga Aquarius \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Dalam keluarga dan rumah tangga, kelahiran Aquarius mudah berubah, yaitu tidak stabil. Namun, Aquarius tetap menginginkan sebuah rumah yang baik untuk memperlakukan keluarga dan teman. Demi keharmonisan rumah tangga dan keluarga, Aquarius harus memasukkan fitur-fitur stabilitas dan kaulitas. Selain mengutamakan daya intelektual, Aquarius sebenarnya harus meresapkan cinta ke dalam rumah dan keluarga.  "},
            {"Pisces", "Sifat Baik dan Buruk Zodiak Pisces \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Orang yang lahir antara tanggal 19 Febuari sampai 20 Maret dikatakan bernaung di bawah zodiak Pisces, yang berlambang ikan. Pisces mengutamakan cinta universal, bersifat manja, selalu mencari ilham, memperlihatkan kepercayaan, ada kesepahaman, berjiwa puitis, menyukai musik, beragama, bersifat setia, mampu menghibur diri, mengutamakan kerohanian, dan tidak mudah mengaku kalah. Namun, ada kalanya Pisces merasa bingung, bersalah, mudah mengaku kalah, mudah kecewa, khawatir, risau, terlibat dalam penipuan, ketagihan, dan mudah menurut kemauan hati. Pisces termasuk dalam kategori variabel, yaitu mudah mengalami daya perubahan, daya adaptasi dan daya keseimbangan. Dengan kategori variabel ini, Pisces adalah kreatif meskipun tidak selalu praktis. Lambang-lambang yang termasuk dalam kategori fleksibel selain Pisces adalah Gemini, Virgo dan Sagitarius. \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Pasangan yang Tepat untuk Pisces \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Orang berzodiak Pisces suka pada pujian dan mengharapkan ungkapan cinta dari kekasih. Justru itu, seseorang yang berkeperibadian kuat adalah pendamping yang tepat untuk Pisces. Zodiak Taurus yang bersifat pendiam tetapi mantap, sesuai untuk Pisces. Sikap Taurus yang dewasa, bersikap melindungi, akan mampu menenteramkan hati Pisces yang sensitif ini. Selain itu, Cancer yang matang dan gemar melindungi, juga diidamkan Pisces. Pasangan Cancer dan Pisces akan senada seirama lantaran keduanya sama – sama berpandangan konservatif. Sebaliknya, Aries) bukan teman yang tepat untuk Pisces. Lagak cakap Aries yang terlalu cerewet menyulitkan Pisces yang sensitif. Aries juga banyak meminta – minta buat Pisces. Gemini juga bukan ideal untuk Pisces. Sifatnya yang pembosan dan sering berubah – ubah dapat menyebabkan Pisces tersinggung. \n" +
                    "\n" +
                    "Karir dan Keuangan Pisces \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Kelahiran Pisces gemar menerima tantangan dan suka dihargai. Karir yang banyak tantangan juga berarti Pisces harus banyak belajar, merantau, dan menimba pengalaman di mana – mana. Sikap penyayang membuat karir kelahiran Pisces sebagai dokter, perawat atau guru.Walaupun karir Pisces memang menjamin pendapatan yang cukup lumayan tetapi uang bukanlah segala – galanya. Pisces cenderung menjadi pemurah jika memiliki kelebihan uang untuk diri dan keluarga. \n" +
                    "\n" +
                    "Keluarga dan Rumah Tangga Pisces \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Dalam kehidupan keluarga dan rumah tangga kelahiran Pisces ini harus melakukan lebih banyak komunikasi lisan. Pisces tidak suka dikekang, sebaliknya ingin merdeka. Pertukaran ide dan pendapat yang tidak emosional dan tenang, memanfaatkan orang lain. Pisces menggemari lingkungan rumah tangga yang mampu membuahkan kepentingan intelektual dan pikiran. Pisces suka memperlakukan tetangga sebagai keluarga. Keseluruhannya, demi keharmonisan diri, keluarga dan tetangga, Pisces membutuhkan keseimbangan antara layanan emosi dan layanan intelektual, atau antara keluarga dengan tetangga.  "},
            {"Aries", "Sifat Baik dan Buruk Zodiak Aries \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Orang yang lahir pada tanggal antara 21 Maret sampai 20 April dikatakan bernaung di bawah zodiak Aries, yang berlambang Biri-biri jantan. Dengan demikian, Aries seorang yang berani, yakin, inisiatif, mengutamakan tindakan, ada pertahanan diri, ada rasa merintis, ada daya juang, dan pencinta / memperjuangkan nasib. Namun, ada kalanya Aries ini terlalu pemikir, ada kekasaran, kesombongan  diri, gemar memicu permusuhan, agresif, hasil kerja tak sempurna, dan ada kelemahan. Aries termasuk dalam kategori kardinal, yaitu aktif. Dengan kualitas ini Aries dianggap baik untuk memulai setiap proyek baru. Lambang-lambang yang termasuk dalam kategori kardinal selain Aries adalah Capricorn, Cancer dan Libra. \n" +
                    "\n" +
                    "Pasangan yang Tepat untuk Aries \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Aries punya daya pesona yang tinggi. Dalam pergaulan, Aries kelihatan lincah, pintar, berkeperibadian kuat dan teman bual yang mengasyikan. Zodiak Taurus, Gemini dan Aquarius adalah kekasih yang tepat bagi Aries. Taurus yang matang adalah pendamping yang tepat bagi Aries. Dengan sikapnya yang tenang; Taurus yang berlambang Lembu Jantan, mampu menundukkan Biri – biri Jantan (Aries) yang tidak mau duduk diam. Gemini juga cocok menjadi kekasih yang ideal bagi Aries. Kebetulan Gemini dan Aries mempunyai banyak persamaan, yaitu aktif , cerdas dan bijak. Dengan kematangannya, Aries dapat menutupi kekurangan Gemini. Bersama Aquarius, Aries mampu mengecapi bahagia. Aries tidak mempersoalkan sifat kekasih yang romantik seperti Aquarius. Sebaliknya kecerdasan Aquarius menjadi daya tarikan yang kuat buat Aries. Sebaliknya, Aries harus berhati – hati ketika berkasih dengan Capricorn atau Cancer. Capricorn bukan pula pasangan yang ideal bagi Aries yang aktif dan terbuka. Sifat Capricorn yang konservatif dan tertutup dapat membosankan Aries. Namun, Capricorn setia orangnya! Sebaliknya, Aries sulit bergaul dengan Cancer yang sensitif. Bila Aries salah bicara, Cancer mungkin murung berkelanjutan. Walau bagaimana pun, Cancer jujur \u200B\u200Bdan pelindung orangnya. \n" +
                    "\n" +
                    "Karir dan Keuangan Aries \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Kelahiran berlambang Aries ini selalu bercita – cita merintis karir sendiri dari hanya bekerja dengan majikan. Walau bagaimana pun, Aries jarang menyelesaikan proyek sampai ke penghasilan yang memuaskan! Namun, pada jangka pendek, tidak ada yang mampu mengatasi daya rintis Aries. Lantaran itu, Aries mampu berhasil ke puncak karir. Orang Aries perlu memperbaiki kualitas manajemen dan administrasi pada jangka panjang. Pada umumnya, Aries mementingkan tindakan, dan pemantauan daripada mencari dan mengumpulkan uang semata – mata. Orang yang kelahiran Aries biasanya pekerja yang kuat dan rajin dan Aries mampu memperoleh banyak uang karena kekuatan tenaga dan pemikiran. \n" +
                    "\n" +
                    "Keluarga dan Rumah Tangga Aries \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Orang yang berlambang Aries adalah raja dalam rumah (bos)! Pria Aries akan menyerahkan tugas hal – ihwal dalam rumah tangga kepada pihak perempuan (istrinya). Sementara perempuan Aries pula akan cenderung untuk memerintah! Aries menyukai keluarga yang besar dan membutuhkan peran setiap anggota keluarganya. Dalam hal ini, Aries adalah orang pecinta keluarga yang baik meskipun Aries tidak selalu suka terkurung di dalam rumah. Aries menyukai anak – anak dan sebenarnya lembut dan ramah dengan pasangannya. Pada keseluruhan, Aries suka pulang ke rumah setelah bekerja lama di luar rumah.  "},
            {"Taurus", "Sifat Baik dan Buruk Zodiak Taurus \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Orang yang lahir pada tanggal antara 21 April sampai 20 Mei dikatakan bernaung di bawah zodiak Taurus, yang berlambang Lembu Jantan. Dengan demikian, Taurus mengutamakan kekayaan, ketinggian spiritual, kaut daya rasa, loyalitas, gemar berpelesiran, kesuburan, terlalu praktis, murah rezeki dan ketabahan. Walau bagaimana pun, ada kalanya Taurus bersikap terlalu kebendaan, terlalu mengekang, keras hati, suka menurut rasa hati dan buntu pikiran. Taurus termasuk dalam kategori tetap, yaitu termasuk stabilitas, daya ketabahan, daya tahan, dan daya kesempurnaan. Dengan kualitas ini Taurus baik untuk mempastikan sesuatu berjalan lancar atau berhasil. Lambang-lambang yang termasuk dalam kategori tetap selain Taurus adalah Aquarius, Leo dan Scorpio. \n" +
                    "\n" +
                    "Pasangan yang Tepat untuk Taurus \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Cancer dan Virgo adalah pasangan yang ideal bagi Taurus. Cancer memang pendamping tepat bagi Taurus. Keperibadian Cancer yang matang dan tidak berubah – ubah sesuai dengan cita rasa Taurus. Lagi pula, Cancer mempunyai pandangan yang konservatif (kolot) seperti Taurus. Sikap Virgo yang tenang dan agak kolot juga sesuai bagi Taurus. Sebaliknya, Taurus harus berhati – hati ketika dipasangkan dengan Aries atau Gemini. Pasangan Taurus – Aries mungkin tidak sesuai. Ini karena, Aries bercita – cita tinggi, lincah dan terbuka dibandingkan dengan Taurus yang tenang tapi matang. Gemini juga bukan pasangan ideal bagi Taurus. Sifat Gemini yang mudah berubah – ubah dapat menyebabkan Taurus mudah merasa kecewa. \n" +
                    "\n" +
                    "Karir dan Keuangan Taurus \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Dalam hal pekerjaan, Taurus sangat rajin, tekun, cermat, cerewet, kreatif dan mementingkan ‘deadline’. Semua ini menguntungkan setiap majikan atau organisasi. Namun, Taurus sangat inginkan bosnya serajin dan sekreatif seperti dirinya. Taurus menghormati orang memiliki kesadaran luas dalam urusan kemasyarakatan dan politik. Dalam bisnis, Taurus cukup pintar atau lihai. Taurus tidak pernah bersikap malas, tetapi merasa senang bekerja dan mengharapkan hasil yang memuaskan. Taurus kurang gemar menanggung risiko yang tidak perlu dan dengan demikian Taurus berhasil menempati taraf kepala seperti manajer atau supervisor. Keterampilan manajemen diperkuat oleh bakat alami Taurus pada manajemen dan pengendalian yang terperinci dengan penuh kesabaran dan keterlibatan. Taurus juga mampu memperlihatkan hasil yang baik dalam perkebunan dan pertanian. \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Umumnya, orang Taurus akan memilih uang dan kekuasaan dari prestise atau pengakuan publik. Justru itu, Taurus hanya akan mengejar prestise dan kemegahan sekiranya ia dapat memberi dampak langsung pada pundi-pundi uang. Kekayaan bagi Taurus, adalah kesenangan dan keamanan. Kekayaan adalah stabilitas. Dan Taurus hanya akan merasa memiliki kekayaan kalau dia dapat melihat dan mencicipinya! Sehubungan dengan itu, Taurus cemerlang dalam lembaga perkebunan dan pertanian. Dalam upaya mencapai tujuan ini, Taurus harus mengembangkan kemampuan intelektual dan komunikasi. Namun, sikap toleran selalu diperlukan untuk memastikan keberhasilan Taurus. \n" +
                    "\n" +
                    "Keluarga dan Rumah Tangga Taurus \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Rumah dan keluarga merupakan dua ‘harta’ (aset) dan tanggung jawab adalah hal yang sangat penting bagi Taurus. Orang kelahiran Taurus memang sayangkan anak – anak. Untuk perlengkapan rumah, orang Taurus gemar membeli furnitur dan perhiasan untuk kenyamanan. Rumah bukan untuk tempat tinggal semata, tetapi tempat untuk kreativitas dan hiburan. Oleh sebab itu, semua alat dan furnitur selalu tersusun dan bersih. Semakin tua, Taurus gemar tinggal di rumah, terutama rumah yang jauh dari kebisingan. Taurus memang menyukai tanah tempat kelahirannya ketika menjelang hari tua. Taurus memang penyayang tapi agak tegas pada anak – anak. Segala – galanya disediakan dan diawasi demi kebajikan dan kebaikan mereka. Bagi Taurus, kasih sayang bukan diucap tapi dipraktekkan. Walau bagaimana pun, Taurus tidak menyenangi kebisingan oleh anak – anak.  "},
            {"Gemini", "Sifat Baik dan Buruk Zodiak Gemini \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Orang yang lahir pada tanggal antara 21 Mei sampai 20 Juni dikatakan bernaung di bawah zodiak Gemini, yang berlambang Saudara Kembar. Dengan demikian, Gemini terampil berkomunikasi, suka bepergian, serbaguna, cerdas, ada kekuatan berbicara, mampu menulis, kedekatan pada sanak saudara dan tetangga, gemar migrasi, dan bersikap terbuka. Namun, ada kalanya Gemini bersikap hanya suka sekejap saja, bersikap keanak-anakan, gugup, suka bermuka dua, berbicara kosong, tak lengkap dan suka berpura-pura. Gemini termasuk dalam kategori variabel, yaitu mudah mengalami daya perubahan, daya adaptasi dan daya keseimbangan. Dengan kategori variabel ini, Gemini adalah kreatif meskipun tidak selalu praktis. Lambang-lambang yang termasuk dalam kategori bervariasi selain Gemini adalah Pisces, Virgo dan Sagitarius. \n" +
                    "\n" +
                    "Pasangan yang Tepat untuk Gemini \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Pendamping yang cocok untuk Gemini adalah seseorang yang cerdas dan memahami cita rasa Gemini yang selalu berubah – ubah. Zodiak Aries dan Taurus adalah pasangan yang tepat buat Anda. Gemini memiliki daya pesona yang dapat meluluhkan hati seseorang, terutama Aries. Ketangkasan, kecerdasan dan kelincahan Gemini adalah merupakan fitur – fitur yang disenangi oleh Aries. Sebaliknya, Aries sendiri juga adalah pendamping yang setia dan penuh perhatian buat Gemini. Taurus yang tenang adalah pasangan yang tepat buat Gemini. Kepribadian Taurus yang kuat, matang dan selalu melindungi, dapat mengelola sifat Gemini yang pembosan dan mudah berubah – ubah. Sedangkan Cancer dan Virgo bukanlah pasangan yang ideal bagi Gemini. Sifat Gemini yang selalu berubah – ubah menyebabkan Gemini sulit berdampingan dengan Cancer yang sifatnya juga demikian. Namun, Cancer adalah jenis yang setia orangnya! Dengan Virgo yang dingin sifatnya, juga kurang cocok bagi Gemini. Kesukaan Virgo pada kerapian menyulitkan Gemini. \n" +
                    "\n" +
                    "Karir dan Keuangan Gemini \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Gemini harus sadar memiliki keterampilan berkomunikasi yang tinggi. Dengan keterampilan ini, Gemini berupaya memindahkan hasrat dan tujuan dalam diri ke orang lain secara logis. Metode transfer ini membuat orang Gemini sangat menonjol dalam karir yang melibatkan penulisan, pendidikan, perjualan dan jurnalisme. Banyak contoh yang melibatkan orang Gemini, terkenal sebagai penyair, pelukis, musisi dan ahli sufi. Sampai sekarang, pencapaian tertinggi bagi orang Gemini adalah untuk mengajarkan kebenaran, apakah bidang sains atau sejarah. Tidak berlebihan jika dikatakan orang berzodiak Gemini adalah pembawa ilham yang mengagumkan! Benak Gemini selalu berisi dengan falsafah hidup yang meransang jiwa orang lain. \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Dari segi keuangan, Gemini cenderung peduli terhadap kekayaan pembelajaran dan ide dari kekayaan materi. Gemini gemar membuat diskusi atau ‘tawar – menawar’ dalam hal yang melibatkan keuangan. Gemini dapat memperoleh uang dengan banyak cara. Oleh sebab itu, sikap keuangan dan keinginan Gemini tampaknya berubah dari hari ke sehari.Perasaan terhadap uang juga turut berubah; kadang Gemini sangat ceria dengan uang, tetapi pada saat yang lain, Gemini seolah – olah tidak mempedulikan uang! Secara keseluruhan, tujuan keuangan sering dianggap sebagai cara untuk membantu keluarga. \n" +
                    "\n" +
                    "Keluarga dan Rumah Tangga Gemini \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Dalam urusan rumah, orang Gemini terlihat agak cerewet. Gemini cenderung menginginkan semua anggota keluarga mengikuti aturan yang ditetapkan. Jika ini tidak dipatuhi, Gemini mudah mengeluh dan mengkritik. Namun, orang Gemini adalah anggota keluarga yang baik dan suka memperlakukan keluarga dengan cara yang praktis dan bermanfaat. Gemini cukup kompeten dalam bersih-bersih dan berkemas.  "},
            {"Cancer", "Sifat Baik dan Buruk Zodiak Cancer \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Orang yang lahir pada tanggal antara 21 Juni sampai 20 Juli dikatakan bernaung di bawah zodiak Cancer, yang berlambang Kepiting. Dengan demikian, Cancer menyukai rumah tangga, keluarga, kesehatan, makanan, ada rasa simpati, memberi perlindungan, agak sensitif, punya kesabaran, kejujuran, dan kecerdasan. Namun, ada kalanya Cancer bersikap kekanak-kanakan, berbolak-balik, berpura-pura, tidak aman, terlalu bertahan dan takut pada perpisahan. Cancer termasuk dalam kategori kardinal, yaitu aktif. Dengan kualitas ini Cancer dianggap baik untuk memulai setiap proyek baru. Lambang-lambang yang termasuk dalam kategori kardinal selain Cancer adalah Aries, Capricorn dan Libra. \n" +
                    "\n" +
                    "Pasangan yang Tepat untuk Cancer \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Seseorang yang berperibadian yang matang adalah pasangan yang ideal buat Cancer. Di sini, zodiak Taurus dan Virgo merupakan pendamping yang ideal bagi Cancer. Taurus yang tenang adalah pasangan yang dicari oleh Cancer. Bersama – sama Taurus, Cancer akan tenteram. Sikap Taurus yang matang dan berperibadian yang kuat menjadikan Cancer berasa terlindungi. Virgo juga pasangan yang sesuai untuk Cancer. Namun demikian, Virgo cenderung menjadi dingin dan tidak romantis. Cancer perlu menunggu ungkapan cintanya. Bersabarlah, karena Virgo memang lambat dalam soal cinta ini. Namun, Virgo juga seorang yang hangat. Sebaliknya, hubungan Cancer dengan Aries dan Gemini adalah kurang sesuai. Aries gemar bicara, sementara Cancer adalah seorang yang sangat sensitif. Kalau Aries suka berteman dan mudah berkumpul dengan teman – temannya; Cancer justru sebaliknya. Zodiak Gemini yang mudah bosan dan berubah – ubah sifatnya, juga membuat hubungan Cancer dengan Gemini kurang sesuai. Cancer mudah kesal lantaran Gemini tidak memperlihatkan sifat tetap yang dibutuhkan. \n" +
                    "\n" +
                    "Karir dan Keuangan Cancer \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Dari segi karir, orang Cancer memang membutuhkan waktu yang agak lama sebelum mampu memulai bisnis (bisnis) secara sendirian. Dengan demikian, Cancer memang patuh pada pemimpinnya atau majikannya di tempat kerja. Cancer gemar bekerja dengan anak – anak, sehingga Cancer menjadi pendidik atau guru yang dedikasi. Dari segi keuangan, Cancer kerap memperoleh harta melalui bisnis keluarga. Contoh sumber keuangan yang mudah diperoleh Cancer adalah dalam bisnis yang berbentuk hotel, restoran, klub malam atau urusan jual beli tanah. Untuk memantapkan pegangan keuangan, Cancer harus memperbaiki diri, misalnya mengurangi rasa murung, dan meningkatkan stabilitas dan kemantapan. \n" +
                    "\n" +
                    "Keluarga dan Rumah Tangga Cancer \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Dalam soal rumah tangga kesuksesan Cancer lebih menyolok. Lingkungan rumah dan keluarga yang diciptanya merupakan pekerjaan seni yang disorot. Cancer erat dengan keluarga, sanak saudara, dan terutama ibunya. Cancer menyayangi anak – anak dan siap memberikan apa yang mereka butuhkan. Mempertahankan institusi kekeluargaan merupakan alasan utama mengapa Cancer terus hidup. Cancer memiliki banyak hal untuk diajarkan kepada orang lain. Lantaran berorientasi keluarga, rumah tangga Cancer selalu bersih, rapi dan menyenangkan.  "},
            {"Leo", "Sifat Baik dan Buruk Zodiak Leo \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Orang yang lahir pada tanggal antara 21 Juli sampai 21 Agustus dikatakan bernaung di bawah zodiak Leo, yang berlambang Singa. Anda mengutamakan rasa cinta, ramah, bersifat pemurah, ada daya kepemimpinan, menonjolkan kemegahan, selalu hidup, menyoroti keagungan, keberanian, kemampuan, dekat dengan anak-anak, berbakat dan suka pada hiburan. Walau bagaimana pun, ada kalanya Leo ini kerap menunjukkan ego, banyak bicara, memperlihatkan sifat kekuasaan, suka pamer, mengejar kemewahan, dan memenuhi komplek rendah diri dan bangga diri. Leo termasuk dalam kategori tetap, yaitu termasuk stabilitas, ketabahan, ketahanan, dan kesempurnaan. Dengan kualitas ini Anda akan baik untuk mempastikan sesuatu berjalan lancar atau berhasil. Lambang-lambang yang termasuk dalam kategori tetap selain Anda adalah Taurus, Aquarius dan Scorpio. \n" +
                    "\n" +
                    "Pasangan yang Tepat untuk Leo \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Leo suka bergaul sehingga tidak dapat berdampingan dengan seseorang yang cemburu dan mengungkung. Dalam situasi ini, Libra, Sagitarius, dan Taurus adalah pendamping ideal buat Leo. Hubungan dengan Libra dapat membahagiakan Leo. Seperti sifat Leo, Libra juga membutuhkan cinta yang menyenangkan. Libra tidak suka memutuskan hubungan lantaran dia matang dalam membuat keputusan. Pasangan yang juga tepat bagi Leo adalah Sagitarius dan Taurus. Sifat Sagitarius yang periang bisa membuat Leo berbahagia. Daya pikir Sagitarius yang luas sehingga mengesankan Leo. \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Meskipun kurang romantis, namun Sagitarius tahu bagaimana cara menyenangkan kekasihnya. Taurus yang matang, penyabar dan penyayang memang cocok buat Leo, terutama dalam meningkatkan mutu karir. Sebaliknya, Capricorn dan Scorpio agak kurang sesuai. Capricorn yang cemburu bukanlah pasangan yang ideal bagi Leo. Zodiak Leo juga merasa terlalu kaku dan kolot dalam soal berpikir. Bila Leo melemparkan sesuatu ide, Capricorn mungkin mengambil waktu yang lama untuk memahaminya. Leo juga agak sulit bergaul dengan Scorpio. Ketika Scorpio merasa marah, Leo pastinya tidak dapat bertahan (bersabar). Kata – kata Scorpio yang berbentuk omelan juga membosankan Leo. \n" +
                    "\n" +
                    "Karir dan Keuangan Leo \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Leo memang suka terlihat mewah dan bergaya. Leo baik dalam hal membuat keputusan tetapi gemar menyerahkan hal yang lebih detail kepada bawahannya. Leo dihormati rekan kerja dan bawahan, sebagian karena Leo memang memahami perasaan orang sekelilingnya. Dalam setiap karir, Leo selalu berusaha mencapai posisi tertinggi meskipun harus mulai dari bawah. Ini berarti, Leo seorang yang tekun bekerja. Walau bagaimana pun, Leo seorang yang tidak suka diarahkan untuk ‘buat itu dan ini’. Dari segi perolehan keuangan, Leo memang seorang kepala yang hebat tetapi ini bukan berarti Leo manajer yang baik. Namun, Leo memiliki wawasan dan jika bekerja sebagai eksekutif, daya manajemennya lebih berhasil. Leo memang seorang yang pemurah. Leo siap menggunakan kekayaannya untuk membantu orang lain. \n" +
                    "\n" +
                    "Keluarga dan Rumah Tangga Leo \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Dari segi eksterior, memang Leo gemar memperlakukan dan mencintai orang lain. Namun, dari segi internal, hanya segelintir teman yang tahu apa sebenarnya kehidupan harian Leo. Bagi orang berlambang Leo, rumah adalah ruang yang menyenangkan, rekreasi, mahligai, dan kamar pribadi. Leo sangat setia pada keluarga. Leo menyukai anak – anak dan memastikan mereka dijaga dan dirawat dengan sewajarnya "},
            {"Virgo", "Sifat Baik dan Buruk Zodiak Virgo \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Orang yang lahir pada tanggal antara 22 Agustus hingga 22 September dikatakan bernaung di bawah zodiak Virgo, yang berlambang Seorang Gadis. Dengan demikian, Virgo suka pada kerja, hasil kerja sempurna, punya pahlawan diri, suci, mengutamakan kesehatan, ada kesadaran, memberikan konsentrasi berdisiplin, praktis, siap melayani dan komprehensif. Namun, ada kalanya Virgo merasa khawatir, cerewet, berpandangan sempit, terlalu tertib, suka mengeluh, tidak mudah mengaku kalah, dan ada suka mengkritik. Virgo termasuk dalam kategori variabel, yaitu mudah mengalami daya perubahan, daya adaptasi dan daya keseimbangan. Dengan kategori variabel ini, Virgo adalah zodiak kreatif meskipun tidak selalu praktis. Lambang-lambang yang termasuk dalam kategori bervariasi selain Virgo adalah Gemini, Pisces dan Sagitarius. \n" +
                    "\n" +
                    "Pasangan yang Tepat untuk Virgo \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Zodiak Cancer dapat menjadi teman atau kekasih yang baik bagi Virgo. Sementara bersama Virgo yang serius, Cancer yang cemburu; tidak akan merasa resah. Selain sifat Cancer yang sulit diharapkan akan membuat Virgo menjadi ceria memikirkan sesuatu yang tersirat di pikiran. Pasangan yang juga tepat bagi Virgo adalah Leo. Sifat Leo yang gemar berubah menurut kehendak hati; tetapi Leo tahu cara untuk menyenangkan teman atau kekasih seperti Virgo. Sebaliknya, Sagitarius bukan pasangan yang ideal buat Virgo. Sagitarius pecinta kebebasan sedangkan Virgo cenderung untuk merencanakan sesuatu dalam hidup dengan teliti. Selanjutnya, sifat Virgo agak tertutup, misalnya dalam hal mengungkapkan rasa cinta, sementara sifat Sagitarius lebih terbuka, sehingga tidak segan – segan menciumi kekasihnya di depan umum. \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Karir dan Keuangan Virgo \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Virgo mencapai saat mantap dalam karir ketika dia dapat memperlihatkan ilmu dan keahliannya yang dapat dimengerti oleh orang lain. Ini berarti, kelahiran Virgo perlu mengembangkan bakat bicara ketika berkomunikasi dengan orang lain. Karir dan pekerjaan yang sesuai adalah guru atau wartawan. Virgo begitu aktif dalam menjalankan tugas harian. Virgo suka belajar setiap jenis pekerjaan asalkan ada imbalan dalam bentuk uang. Karena Virgo seorang yang tekun, efisien dan selalu produktif; sebagai imbalan atas sikap itu, Virgo selalu berada dalam kecukupan finansial. Virgo mudah dapat uang tetapi Virgo bukan seorang pemboros. Kalau terlibat dalam investasi sekalipun, Virgo selalu berhati – hati sehingga risikonya tidak tinggi. \n" +
                    "\n" +
                    "Keluarga dan Rumah Tangga Virgo \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Rumah orang berzodiak Virgo selalu rapi, bersih dan teratur. Kalau berada di dalam rumah Virgo, Anda jangan coba – coba mengalihkan susunan perabotannya! Namun, Virgo perlu perhatian terhadap anak – anak dan anggota – anggota keluarga yang tinggal serumah dengannya, sebab tidak semua orang sama cita rasa dalam hal mengemas rumah dan menyusun furnitur. Virgo menyukai anak – anak, tetapi agak tegas, lantaran Virgo bercita – cita menjadikan anak – anak bermoral dan pandai berdikari ketika dewasa.  "},
            {"Libra ", "Sifat Baik dan Buruk Zodiak Libra \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Orang yang lahir pada tanggal antara 23 September sampai 22 Oktober dikatakan bernaung di bawah zodiak Libra, yang berlambang Alat Penimbang (Dacin). Dengan demikian, orang yang berzodiak Libra biasanya berciri-ciri harmonis, seimbang, menyukai pernikahan, mendapati perhubungan, mengutamakan kesetaraan, aliansi, diplomasi, berseni, suka membantu, selalu dalam keadaan ceria, dapat menjadi pasangan yang ideal dan menyukai keadilan. Namun, ada kalanya Libra bersikap bolak-balik, pura-pura, tidak jujur, tujuan kurang tegas, atau tindakan kurang seimbang. Libra termasuk dalam kategori kardinal, yaitu aktif (berprinsip memulai sesuatu). Dengan kualitas ini Libra dianggap baik untuk merangsang dan memulai setiap proyek baru. Lambang-lambang yang termasuk dalam kategori kardinal selain Libra adalah Aries, Cancer dan Capricorn. \n" +
                    "\n" +
                    "Pasangan yang Tepat untuk Libra \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Libra adalah seorang kekasih yang cerdas dan selalu menjaga perbuatan dan pertuturannya agar kekasihnya tidak tersinggung. Pendamping yang ideal buat Libra adalah Taurus dan Leo. Bintang Taurus yang matang dan sabar sangat diperlukan untuk mengendalikan sifat Libra yang selalu dalam keraguan. Sementara, Leo yang tangkas, dapat menjadi kekasih yang baik buat Libra. Dia tahu menyenangkan hati Libra yang suka menimbang – nimbang keputusan dan selalu dalam kondisi keraguan. Sebaliknya, hubungan Libra dengan Aries dan Gemini diperkirakan kurang sesuai. Aries yang suka bergantung pada teman / pasangannya sudah tentu tidak sesuai dengan Libra yang memang suka menimbang – nimbang dan selalu ragu – ragu itu. Selain itu, Aries menyukai keputusan yang cepat, sedangkan Libra memang agak lambat dalam memberi keputusan. Begitu juga halnya hubungan Libra dengan Gemini, bukanlan hubungan yang ideal. Sifat Gemini yang cepat bosan dan sering berubah – ubah memungkinkan Libra cepat merasa kecewa. \n" +
                    "\n" +
                    "Karir dan Keuangan Libra \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Di depan umum, orang berlambang Libra ini adalah pembela. Teman atau kenalannya adalah merupakan anggota keluarganya. Mungkin inilah sebabnya Libra ada potensi untuk menjadi ketua atau menonjol dalam kepemimpinan politik. Dalam hal mengembangkan bakat, Libra menyukai karir yang dapat menyatakan ide dan perasaannya secara bebas (terbuka). Sehingga Libra banyak terlibat dalam seni kreatif dan di samping karir yang lain, Libra mampu menonjol sebagai pendidik atau konsultan. Namun, Libra lebih fleksibel dalam pendekatan ke karir. Bagi Libra, hati dan perasaan teman atau orang sekitarnya harus dihormati. Dari segi keuangan, Libra memang berusaha mencari uang, tetapi lebih untuk kepentingan orang lain dari dirinya semata – mata. Setiap uang yang diperoleh dipastikan menjadi kebutuhan menghidupi keluarga atau teman. Mungkin dengan alasan yang demikian, Libra kerap menghabiskan uang yang banyak untuk hiburan atau hal yang serupa. \n" +
                    "\n" +
                    "Keluarga dan Rumah Tangga Libra \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Karakter Libra sebetulnya menyukai rumah yang dikelola, bersih dan rapi tetapi agak malas memperbarui sendiri. Ketika terjangkau, Libra rela menyewa orang lain untuk membereskan rumahnya. Namun, Libra gemar berkebun dan menyukai bunga di dalam rumah. Sesuai dengan sikap Libra yang menyukai harmoni dan kreativitas, dan sering Libra membiarkan anak – anak melakukan apa yang diinginkan mereka."},
            {"Scorpio ", "Sifat Baik dan Buruk Zodiak Scorpio \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Orang yang lahir pada tanggal antara 23 Oktober sampai 22 November dikatakan bernaung di bawah zodiak Scorpio, yang berlambang kalajengking. Scorpio memiliki kemewahan, kreatif, ada keinginan yang kuat, punya stamina, daya sensual yang tinggi dan ada bakat menyembuhkan. Walau bagaimana pun, ada kalanya Scorpio mudah menaruh rasa cemburu, suka menuntut bela, suka ‘membinasakan diri’, ekstrim, fanatik, tamak dan berdaya untuk menyerang. Scorpio termasuk dalam kategori tetap, yaitu termasuk stabilitas, ketabahan, ketahanan, dan kesempurnaan. Dengan kualitas ini Scorpio akan baik untuk memastikan sesuatu berjalan lancar atau berhasil. Lambang-lambang yang termasuk dalam kategori tetap selain Scorpio adalah Taurus, Leo dan Aquarius. \n" +
                    "\n" +
                    "Pasangan yang Tepat untuk Scorpio \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Orang yang bernaung di bawah lambang Taurus dan Cancer merupakan pendamping yang sesuai untuk Scorpio. Taurus adalah pedamping yang diperlukan oleh Scorpio. Dengan kesabaran yang ditunjukkan oleh Taurus, Scorpio mampu melenyapkan sikap kasarnya. Dengan sikap Taurus yang matang dan mantap akan menyebabkan sifat Scorpio yang pencemburu itu akan mudah merasa damai (tenang). Berpasangan dengan Cancer pun akan memberikan kebahagiaan untuk Scorpio. Cancer biasanya seorang yang handal dan mantap. Dia mampu memberi perlindungan dan kedamaian yang diperlukan. Selanjutnya, Cancer juga berpandangan konservatif seperti Scorpio. Sebaliknya, orang yang bernaung di bawah naungan Aries dan Gemini harus dihindari oleh Scorpio. Aries cenderung mengatakan apa pun hal, sedangkan Scorpio takut dikritik. Demikian juga dengan hubungan Scorpio – Gemini. Sifat Gemini yang kekanak – kanakan tidak sesuai bagi Scorpio yang juga cenderung bersifat demikian. \n" +
                    "\n" +
                    "Karir dan Keuangan Scorpio \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Scorpio ingin menjadi pemimpin. Namun, keinginan itu selalu dirahasiakan dan tidak dinyatakan secara umum, barangkali sebagaimana orang yang berlambang Leo. Cita-cita utama Scorpio dalam hidup ialah supaya diangkat oleh teman-teman atau masyarakat sebagai sumber kehidupan dan kebanggaan. Scorpio biasanya sukses sebagai akuntan, pengacara, manajer atau anggota bank. Dari sisi finansial, uang adalah kekuasaan bagi orang Scorpio. Uang akan menjadi penyebab perubahan dan pengawalan. Dalam hubungan ini, jika tidak dikontrol, Scorpio mudah menjadi manusia yang mengutamakan materi dan dikuasai oleh tujuan mendapatkan uang semata. Dari segi lain, karir kebanyakkan orang berlambang Scorpio akan terlibat dalam bidang keuangan seperti akuntan atau manajer bank. Tapi, harus berhati-hati supaya tidak terjadi penyalahgunaan kekuasaan uang. Namun, biasanya Scorpio memperoleh uang dari usaha sendiri yang gigih. \n" +
                    "\n" +
                    "Keluarga dan Rumah Tangga Scorpio \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Scorpio memang senang rumah tangga dan keluarga yang harmonis. Namun, cara yang dilakukan untuk menimbulkan suasana tersebut kadang kala dilakukan secara paksaan yang sudah tentunya menyinggung perasaan setiap anggota keluarga. Dalam hubungan ini, tampaknya Scorpio perlu membangun sikap mengutamakan kehidupan berkeluarga dan rumah tangga. Scorpio seharusnya menciptakan suasana memperlakukan aktivitas keluarga sebagai satu tim, yang mana setiap anggota keluarga harus menyumbangkan peran dan tugas yang sesuai. Ini adalah penting karena sikap Scorpio yang rakus, bersemangat dan siap memberi konsentrasi, jika tidak diimbangi dengan sikap toleran, dapat membawa ke arah sikap ‘tangan besi’.  "},
            {"Sagitarius ", "Sifat Baik dan Buruk Zodiak Sagitarius \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Orang yang lahir pada tanggal antara 23 November sampai 20 Desember dikatakan bernaung di bawah zodiak Sagitarius, yang berlambang Pemanah. Sagitarius suka minat belajar, bersikap optimis, pemanjat, pemahaman diri, bercita-cita tinggi, memiliki hati nurani, berpegang pada agama, psikologi, suka pada kesenangan, bijaksana, selalu ada keberuntungan, gemar eksplorasi dan ada berbagai impian. Namun, ada kalanya Sagitarius berada dalam kelalaian, tidak mematuhi hukum, berada dalam kegelisahan, pembazir, terlalu menurut kehendak hati, tidak jujur dan tidak bertanggung jawab. Sagitarius termasuk dalam kategori variabel, yaitu mudah mengalami daya perubahan, daya adaptasi dan daya keseimbangan. Dengan kategori variabel ini, Sagitarius adalah kreatif meskipun tidak selalu praktis. Lambang-lambang yang termasuk dalam kategori bervariasi selain Sagitarius adalah Gemini, Virgo dan Pisces. \n" +
                    "\n" +
                    "Pasangan yang Tepat untuk Sagitarius \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Sagitarius seorang kekasih yang setia. Pasangan yang dilakukan adalah bukan dari jenis yang cemburu. Jadi, pasangan yang cocok dengan Sagitarius adalah Aries dan Gemini. Aries sesuai dengan Sagitarius karena Aries juga menyukai pada kebebasan. Sifat Aries yang periang dan cerdas juga sangat menyenangi Sagitarius. Begitu juga dengan hubungan Sagitarius dengan Gemini karena Gemini menyukai kebebasan dan periang yang mana sudah tentu sesuai dengan Sagitarius. Sebaliknya, hubungan dengan Capricorn atau Cancer perlu dihindari lantaran kurang sesuai dengan Sagitarius. Capricorn yang cemburu dan posesif agak kurang sesuai bagi Sagitarius yang menyukai kebebasan. Begitu juga hubungan dengan Cancer yang agak sensitif. Ini karena orang Sagitarius tidak bersedia untuk meluangkan waktu untuk menyelami isi hati orang yang sensitif. \n" +
                    "\n" +
                    "Karir dan Keuangan Sagitarius \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Sagitarius agak memilih pekerjaan. Sagitarius seorang pemikir yang memiliki impian yang besar. Sagitarius menginginkan uang, nama, glamour, prestise dan pengakuan masyarakat. Namun, karir yang cocok bagi Sagitarius adalah tugas dan tanggung jawab yang melibatkan layanan amal kepada orang lain seperti perawat, dokter, agen perjalanan, pejabat keuangan atau pejabat di perusahaan menjual obat-obatan. Di tempat kerja, Sagitarius memang rajin, tekun, suka menolong rekan kerja dan suka memuji teman dan kepala. Dengan memiliki karir yang sesuai, Sagitarius biasanya mudah mendapatkan uang. Tapi, Sagitarius tidak mengutamakan uang begitu banyak, lantaran sikap kesederhanaan yang ada dalam dirinya. Ketika menghadapi masalah keuangan, Sagitarius biasanya mudah mendapat bantuan dari keluarga atau bisnis keluarga. Ini berlaku demikian karena memang sifatnya selalu mementingkan teman, sehingga ketika diri Sagitarius berada dalam kesulitan ada saja teman yang mengulurkan bantuan nasihat atau materi. \n" +
                    "\n" +
                    "Keluarga dan Rumah Tangga Sagitarius \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Sagitarius menyukai keluarga dan rumah tangga yang harmonis. Masalah yang dihadapi Sagitarius segera dapat diatasi dengan bantuan anggota keluarga. Sagitarius suka memberi kebebasan kepada anak-anak dan remaja. Namun, ketika berhadapan dengan anak-anak sendiri, Sagitarius cukup mengungkung mereka. Meskipun ada sedikit masalah dengan anak-anak pada tahap awal, namun pada keseluruhan, Sagitarius berhasil mengatasinya berkat kerjasama dan kesepahaman.  "}
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramal);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tName = (TextView) findViewById(R.id.r_name);
        tRamal = (TextView) findViewById(R.id.ramalan);
        String tname = getIntent().getStringExtra(NAME);
        int month = getIntent().getIntExtra(R_MONTH, 0);
        int day = getIntent().getIntExtra(R_DAY, 0);
        String text = "Nama : " + tname;
        tName.setText(text);
        if(month != 0) {
            String tRamalan = dataBulan[month - 1][0];
            tRamal.setText(tRamalan);
        }

        if(month == 1) {
            if(day < 20){
                SetRamalan(0);
            }else{
                SetRamalan(1);
            }
        }else  if(month == 2) {
            if(day < 19){
                SetRamalan(1);
            }else{
                SetRamalan(2);
            }
        }else  if(month == 3) {
            if(day < 21){
                SetRamalan(2);
            }else{
                SetRamalan(3);
            }
        }else  if(month == 4) {
            if(day < 21){
                SetRamalan(3);
            }else{
                SetRamalan(4);
            }
        }else  if(month == 5) {
            if(day < 21){
                SetRamalan(4);
            }else{
                SetRamalan(5);
            }
        }else  if(month == 6) {
            if(day < 21){
                SetRamalan(5);
            }else{
                SetRamalan(6);
            }
        }else  if(month == 7) {
            if(day < 21){
                SetRamalan(6);
            }else{
                SetRamalan(7);
            }
        }else  if(month == 8) {
            if(day < 22){
                SetRamalan(7);
            }else{
                SetRamalan(8);
            }

        }else  if(month == 9) {
            if(day < 23){
                SetRamalan(8);
            }else{
                SetRamalan(9);
            }
        }else  if(month == 10) {
            if(day < 23){
                SetRamalan(9);
            }else{
                SetRamalan(10);
            }
        }else  if(month == 11) {
            if(day < 23){
                SetRamalan(10);
            }else{
                SetRamalan(11);
            }
        }else  if(month == 12) {
            if(day < 22){
                SetRamalan(11);
            }else{
                SetRamalan(1);
            }
        }else{
            SetRamalan(1);
        }
    }

    private void SetRamalan(int zod) {

        tBintang = (TextView) findViewById(R.id.bintang);
        tInfo = (TextView) findViewById(R.id.info);


        String tBin = "Bintang Anda : " + data[zod][0];
        tBintang.setText(tBin);

        String tInf = data[zod][1];
        tInfo.setText(tInf);

    }
}
