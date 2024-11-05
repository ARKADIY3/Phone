
public class Main {
    public static void main(String[] args) {
    Phone phone1 = new Phone("+7-999-123-45-98","Samsung",180.0);
    Phone phone2 = new Phone("+7-xxx-xxx-xx-xx","Redmi",150.0);
    Phone phone3 = new Phone("+7-000-000-00-01","Nokia",160.0);
    System.out.println(phone1.toString());
    System.out.println(phone2.toString());
    System.out.println(phone3.toString());
        System.out.println(phone1.getReceiveCall(phone1.getName()));
        System.out.println(phone2.getReceiveCall(phone2.getName(), phone2.getNumber()));
    }
}