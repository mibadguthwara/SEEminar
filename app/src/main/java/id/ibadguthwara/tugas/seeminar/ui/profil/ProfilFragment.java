package id.ibadguthwara.tugas.seeminar.ui.profil;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import id.ibadguthwara.tugas.seeminar.LoginPengguna;
import id.ibadguthwara.tugas.seeminar.R;

public class ProfilFragment extends Fragment {

    private ProfilViewModel profilViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        profilViewModel =
                ViewModelProviders.of(this).get(ProfilViewModel.class);
        View root = inflater.inflate(R.layout.fragment_profil, container, false);

        final TextView tKeluar = root.findViewById(R.id.txt_keluar_aplikasi);
        tKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LoginPengguna.class);
                startActivity(intent);
            }
        });

        return root;
    }
}
