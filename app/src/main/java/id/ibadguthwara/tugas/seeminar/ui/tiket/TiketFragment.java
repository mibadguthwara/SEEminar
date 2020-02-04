package id.ibadguthwara.tugas.seeminar.ui.tiket;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import id.ibadguthwara.tugas.seeminar.R;

public class TiketFragment extends Fragment {

    private TiketViewModel tiketViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        tiketViewModel =
                ViewModelProviders.of(this).get(TiketViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tiket, container, false);
        return root;
    }
}