package pe.com.pucp.dti.clase2.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import pe.com.pucp.dti.clase2.R;

/**
 * Created by DIA on 25/05/18.
 */

public class HomeFragment extends Fragment {

    //Constants
    private static final String TAG = "HomeFragment";

    //Properties
    TextView fragmentTextView;

    // Este método se ejecutará al momento en que se crea el fragment.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView");
        // Se define la vista xml del fragment
        return inflater.inflate(R.layout.home_fragment, parent, false);
    }

    // Este método se ejecutará despues de onCreateView().
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Crear elementos gráficos
        fragmentTextView = (TextView) view.findViewById(R.id.framgentTextView);
    }
}
