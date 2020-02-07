import javax.security.auth.login.Configuration;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MobilePhoneDAO {
    private ArrayList<Contact> contactArraylist = new ArrayList<>();


    public boolean add(Contact add){

            if ((query(add.getFirstName(),add.getLastName()) != null)) {
                System.out.println("The contact is already existed");
                return false;
            } else {
                return contactArraylist.add(add);
            }

    }

    public boolean remove(Contact remove){


        if(!contactArraylist.contains(remove)){
            System.out.println("The contact doesn't exist");
            return false;
        } else{
           return  contactArraylist.remove(remove);
        }
    }


    public void display(){
        if(contactArraylist.isEmpty()){
            System.out.println("Empty Contact list");
        }
        for(Contact contact : contactArraylist) {
            System.out.println("name: " + contact.getFirstName() + " " +contact.getLastName());
            System.out.println();
        }
    }

    public Contact  query(String firstName, String lastName) {

        if(contactArraylist.size() == 0) {
            System.out.println("contact list is empty");
            return null;
        }
        for(Contact contact : contactArraylist) {
            if(contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                return contact;
            }
        }
        return null;

    }

}
