package www.smktelkommlg.praktikumfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class SecondFragment extends Fragment {
    private PageViewModel pageViewModel;
    private TextView txtName;
    private TextView txtAbsen;
    private TextView txtKelas;

    public SecondFragment () {
// Required empty public constructor
    }
    public static SecondFragment newInstance() {
        return new SecondFragment();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// initialise ViewModel here
        pageViewModel =
                ViewModelProviders.of(requireActivity()).get(PageViewModel.class);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtName = view.findViewById(R.id.textViewName);
        txtAbsen = view.findViewById(R.id.textViewAbsen);
        txtKelas = view.findViewById(R.id.textViewKelas);
        pageViewModel.getName().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                txtName.setText(s);
            }
        });
        pageViewModel.getAbsen().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                    txtAbsen.setText(s);
                }
        });
        pageViewModel.getKelas().observe(requireActivity(), new Observer<String>() {
            @Override
        public void onChanged(String s) {
                txtKelas.setText(s);
            }
        });
    }
}
