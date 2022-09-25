package jti.polinema.ac.id.a04_android_recyclerview;
import java.util.ArrayList;

public class MahasiswaClubData {
    private static String [] NamaMahasiswa = {
            "ABDULAH SYAHRONY KURNIAWAN",
            "ALFINZA SANJAYA PUTRA",
            "ALIYAH HANUN SOESHANTONO",
            "ANA QONITAH MUNAWWAROH",
            "ANNISA AULIA NADHILA",
            "ARYA ADMAJA",
            "DIO AULIA ARI KURNIA SANDI",
            "DWI MARIA ULFA",
            "HALDA DINI SILMA ROSIDA",
            "ILHAM LUTFIANSYAH",
            "JUD AMAL MUKHTAR",
            "KARMILA NOVI ARFIANA",
            "MILA YUNITA",
            "MOKHAMAD DWIHARDIK KUSUMA PUTRA",
            "MUHAMMAD REZA KHATAMI",
            "MUHAMMAD HAMAMIY ZADAH",
            "OKTAVIAN VANDI TRI SHAKTI",
            "PRANATA DITO FITRIYANSYAH",
            "QALBII AZZAHRA PUTRA",
            "RARA DENINDA HURIANTO",
            "SHINE DEVI OKTAVIANA RONIX SYAH PUTRI",
            "SILVIA PRADA APRILIA",
            "WELSON MARIO NAIBAHO",
            "YANU MIFTAHUL HABIBILLAH",
            "YUDAS MALABI",
            "YULIA EKA ARDHANI"
    };

    private static String [] detailMahasiswa = {
            "ABDULAH SYAHRONY KURNIAWAN absen 01",
            "ALFINZA SANJAYA PUTRA  absen  02",
            "ALIYAH HANUN SOESHANTONO  absen  03",
            "ANA QONITAH MUNAWWAROH  absen  04",
            "ANNISA AULIA NADHILA  absen  05",
            "ARYA ADMAJA  absen  06",
            "DIO AULIA ARI KURNIA SANDI  absen  07",
            "DWI MARIA ULFA  absen  08",
            "HALDA DINI SILMA ROSIDA  absen  09",
            "ILHAM LUTFIANSYAH  absen  10",
            "JUD AMAL MUKHTAR  absen  11",
            "KARMILA NOVI ARFIANA  absen  12",
            "MILA YUNITA  absen  13",
            "MOKHAMAD DWIHARDIK KUSUMA PUTRA  absen  14",
            "MUHAMMAD REZA KHATAMI  absen  15",
            "MUHAMMAD HAMAMIY ZADAH  absen  16",
            "OKTAVIAN VANDI TRI SHAKTI  absen  17",
            "PRANATA DITO FITRIYANSYAH  absen  18",
            "QALBII AZZAHRA PUTRA  absen  19",
            "RARA DENINDA HURIANTO  absen  20",
            "SHINE DEVI OKTAVIANA RONIX SYAH PUTRI  absen  21",
            "SILVIA PRADA APRILIA  absen  22",
            "WELSON MARIO NAIBAHO  absen  23",
            "YANU MIFTAHUL HABIBILLAH  absen  24",
            "YUDAS MALABI  absen  25",
            "YULIA EKA ARDHANI  absen  26"
    };

    private static int[] gambarMahasiswa = {
            R.drawable.polinema,
            R.drawable.polinema1,
            R.drawable.polinema2,
            R.drawable.polinema3,
            R.drawable.polinema4,
            R.drawable.polinema5,
            R.drawable.polinema6,
            R.drawable.polinema7,
            R.drawable.polinema8,
            R.drawable.polinema9,
            R.drawable.polinema10,
            R.drawable.polinema11,
            R.drawable.polinema12,
            R.drawable.polinema13,
            R.drawable.polinema14,
            R.drawable.polinema15,
            R.drawable.polinema16,
            R.drawable.polinema17,
            R.drawable.polinema18,
            R.drawable.polinema19,
            R.drawable.polinema20,
            R.drawable.polinema21,
            R.drawable.polinema22,
            R.drawable.polinema23,
            R.drawable.polinema24,
            R.drawable.polinema25
    };

    static ArrayList<MahasiswaCLub> getListData(){
        ArrayList<MahasiswaCLub> list = new ArrayList<>();
        for(int position = 0; position <NamaMahasiswa.length; position++){
            MahasiswaCLub club = new MahasiswaCLub();
            club.setNama(NamaMahasiswa[position]);
            club.setDetail(detailMahasiswa[position]);
            club.setPhoto(gambarMahasiswa[position]);
            list.add(club);
        }
        return list;
    }
}
