package id.ibadguthwara.tugas.seeminar.ui.beranda;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import id.ibadguthwara.tugas.seeminar.DaftarPengada;
import id.ibadguthwara.tugas.seeminar.R;

public class BerandaFragment extends Fragment {

    private BerandaViewModel berandaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        berandaViewModel =
                ViewModelProviders.of(this).get(BerandaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_beranda, container, false);

        final TextView tDaftarPengada = root.findViewById(R.id.btn_daftar_pengada);
        tDaftarPengada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DaftarPengada.class);
                startActivity(intent);
            }
        });

        return root;
    }
}