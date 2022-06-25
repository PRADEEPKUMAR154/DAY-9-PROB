   class AddressbookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Adress Book Program ");
        Addressbook addressBook=new Addressbook("Pradeepkumar","Biloor"," 64Street","Bagalkot"," Karnataka",123456789,587106,"pmb@gmail.com");
        addressBook.getFirstName();
        addressBook.getLastName();
        addressBook.getAddress();
        addressBook.getCity();
        // addressBook.getstate();
        addressBook.getZip();
        addressBook.getEmail();
        addressBook.getPhoneNumber();


        System.out.println("address book "+addressBook);


    }
}