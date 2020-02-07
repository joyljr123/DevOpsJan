import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MobilePhoneDAO mb = new MobilePhoneDAO();
        boolean flag = true;
        while(flag){
            System.out.println("What can i do for you?");
            System.out.println("1. Add contact ");
            System.out.println("2. Remove contact ");
            System.out.println("3. Display contact");
            System.out.println("4. Search contact");
            System.out.println("5. Exit");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    addOption(mb);
                    break;

                case 2:
                    removeOption(mb);

                    break;

                case 3:
                    mb.display();
                    break;

                case 4:
                    queryOption(mb);
                    break;

                case 5:
                    flag = false;
                    System.out.println("thank you");
                    break;
                default:
                    System.out.println("Pleas input 1 - 5");
            }
        }




    }

    private static void queryOption(MobilePhoneDAO mb) {
        Scanner sc;
        System.out.println("What's the first name for the contact you want to search");
        sc = new Scanner(System.in);
        String f = sc.next();
        System.out.println("What's the last name for the contact you want to search");
        sc = new Scanner(System.in);
        String l = sc.next();
        Contact find =  mb.query(f,l);
        if(find !=null) {
            System.out.println("Here are the contacts found");
            System.out.println("name: " + find.getFirstName() + " " + find.getLastName());
            System.out.println("email:" + find.getEmail());
            System.out.println("phone : " + find.getPhone());
            System.out.println();
        }
        else {
            System.out.println("Contact not found");
        }
    }

    private static void removeOption(MobilePhoneDAO mb) {
        Scanner sc;
        System.out.println("What's the first name for the contact you want to remove");
        sc = new Scanner(System.in);
        String fn = sc.next();
        System.out.println("What's the last name for the contact you want to remove");

        sc = new Scanner(System.in);
        String ln = sc.next();
        Contact result = mb.query(fn,ln);
        mb.remove(result);
    }

    private static void addOption(MobilePhoneDAO mb) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("What's the first name");
        String firstName = sc.next();
        sc = new Scanner(System.in);
        System.out.println("What's the last name");
        String lastName = sc.next();
        sc = new Scanner(System.in);
        System.out.println("What's the email? ");
        String email = sc.next();
        sc = new Scanner(System.in);
        System.out.println("What's the phone number? ");
        String phone = sc.next();
        Contact ct = new Contact(firstName,lastName,email,phone);
        mb.add(ct);
    }
}
