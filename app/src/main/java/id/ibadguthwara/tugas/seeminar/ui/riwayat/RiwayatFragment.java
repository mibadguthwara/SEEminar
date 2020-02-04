package id.ibadguthwara.tugas.seeminar.ui.riwayat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import id.ibadguthwara.tugas.seeminar.R;

public class RiwayatFragment extends Fragment {

    private RiwayatViewModel riwayatViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        riwayatViewModel =
                ViewModelProviders.of(this).get(RiwayatViewModel.class);
        View root = inflater.inflate(R.layout.fragment_riwayat, container, false);
        return root;
    }
}