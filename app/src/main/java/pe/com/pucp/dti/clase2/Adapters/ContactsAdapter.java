package pe.com.pucp.dti.clase2.Adapters;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import pe.com.pucp.dti.clase2.Model.User;
import pe.com.pucp.dti.clase2.R;

/**
 * Created by DIA on 28/05/18.
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder>  {

        private ArrayList<User> contactsDataset;

        // Declarar un constructor dependiento del conjunto de datos
        public ContactsAdapter(ArrayList<User> contactsDataset) {
            this.contactsDataset = contactsDataset;
        }

        // Método invocado por el Layout manager para crear nuevas vistas
        @Override
        public ContactsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                       int viewType) {
            // Crear la nueva vista
            View v = (View) LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.contact_item, parent, false);
            ViewHolder vh = new ViewHolder(v);
            return vh;
        }

        // Método invocado por el Layout manager para remplazar el contenido de una vista
        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            // Obtener del conjunto de datos el elemento en la posición correspondiente
            User currentContact = contactsDataset.get(position);
            // Remplazar los contenidos de la vista en esa posición por los del dato
            holder.userNameTextView.setText(currentContact.getUserName());
            holder.phoneNumberTextView.setText(currentContact.getPhoneNumber());
        }

        // Metodo invocado por el Layout manager para saber el número de elementos del conjunto de datos
        @Override
        public int getItemCount() {
            return contactsDataset.size();
        }

        // ViewHolder: Referencia a la vista que se replicará para cada conjunto de datos
        public static class ViewHolder extends RecyclerView.ViewHolder {
            public TextView userNameTextView;
            public TextView phoneNumberTextView;
            //Importar CircleImageView de de.hdodenhof.circleimageview
            public CircleImageView profileImageview;

            public ViewHolder(View v) {
                super(v);
                //Asociar los elementos del ViewHolder a los elementos de la vista
                userNameTextView = v.findViewById(R.id.userNameTextView);
                phoneNumberTextView = v.findViewById(R.id.phoneNumberTextView);
                profileImageview = v.findViewById(R.id.profileImageView);
            }
        }
}
