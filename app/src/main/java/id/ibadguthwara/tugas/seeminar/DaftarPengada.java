package id.ibadguthwara.tugas.seeminar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DaftarPengada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_pengada);

        final TextView tDaftar = findViewById(R.id.btn_daftar_pengada_2);
        tDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaftarPengada.this, LoginPengada.class);
                startActivity(intent);
            }
        });

    }
}
