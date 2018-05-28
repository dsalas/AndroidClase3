package pe.com.pucp.dti.clase2.Fragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import pe.com.pucp.dti.clase2.Adapters.ContactsAdapter;
import pe.com.pucp.dti.clase2.R;
import pe.com.pucp.dti.clase2.Repository.DataRepository;

/**
 * Created by DIA on 25/05/18.
 */

public class ContactsFragment extends Fragment {

    //Constants
    private static final String TAG = "ContactsFragment";

    //Properties
    TextView fragmentTextView;
    private RecyclerView contactsRecyclerView;
    private RecyclerView.Adapter contactsAdapter;
    private RecyclerView.LayoutManager contactsLayoutManager;
    private Context context;

    // Este método se ejecutará al momento en que se crea el fragment.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView");
        // Se define la vista xml del fragment
        return inflater.inflate(R.layout.contacts_fragment, parent, false);
    }

    // Este método se ejecutará despues de onCreateView().
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Crear elementos gráficos
        setRecyclerView(view);
    }

    // Este método se ejecutará cuando se asocie el fragment a la vista
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    private void setRecyclerView(View view){
        contactsRecyclerView = (RecyclerView) view.findViewById(R.id.contactsRecyclerView);

        // Se utilizará un LayoutManager linear
        contactsLayoutManager = new LinearLayoutManager(this.context);
        contactsRecyclerView.setLayoutManager(contactsLayoutManager);

        // Especificar el adaptador a utilizar y pasar el conjunto de datos
        contactsAdapter = new ContactsAdapter(DataRepository.getContacts());
        contactsRecyclerView.setAdapter(contactsAdapter);
    }
}
