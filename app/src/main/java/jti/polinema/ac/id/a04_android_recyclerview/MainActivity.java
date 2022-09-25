package jti.polinema.ac.id.a04_android_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMahasiswaClub;
    private ArrayList<MahasiswaCLub> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMahasiswaClub=findViewById(R.id.rv_club);
        rvMahasiswaClub.setHasFixedSize(true);

        list.addAll(MahasiswaClubData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvMahasiswaClub.setLayoutManager(new LinearLayoutManager(this));
        ListCLubAdapter listCLubAdapter = new ListCLubAdapter(list);
        rvMahasiswaClub.setAdapter(listCLubAdapter);
    }

}