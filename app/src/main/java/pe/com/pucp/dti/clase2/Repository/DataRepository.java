package pe.com.pucp.dti.clase2.Repository;

import java.util.ArrayList;

import pe.com.pucp.dti.clase2.Model.User;

/**
 * Created by DIA on 28/05/18.
 */

public class DataRepository {

    public static ArrayList<User> getContacts() {
        ArrayList<User> result = new ArrayList<>();
        result.add(new User("1","Salvador T. Miller", "907-694-4743",""));
        result.add(new User("2","Louise A. Crawford", "401-527-6550",""));
        result.add(new User("3","Phillip E. Hooper", "860-774-3227",""));
        result.add(new User("4","Tony T. Roberts", "843-525-4829",""));
        result.add(new User("5","Kyle L. Tyson", "865-224-3331",""));
        result.add(new User("6","Paige A. Schultz", "802-435-3563",""));
        result.add(new User("7","Anthony M. Clayton", "419-618-9265",""));
        return result;
    }
}
