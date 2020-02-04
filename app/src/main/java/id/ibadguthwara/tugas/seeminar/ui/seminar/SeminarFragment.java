package id.ibadguthwara.tugas.seeminar.ui.seminar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import id.ibadguthwara.tugas.seeminar.R;

public class SeminarFragment extends Fragment {

    private SeminarViewModel seminarViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        seminarViewModel =
                ViewModelProviders.of(this).get(SeminarViewModel.class);
        View root = inflater.inflate(R.layout.fragment_seminar, container, false);
        return root;
    }
}