import java.util.Scanner;
class Demo24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your email address:");
        String email = sc.nextLine();
        

        System.out.println("Enter your phone number:");
        int phone = sc.nextInt();
        
        System.out.println("Enter a date (MM/DD/YYYY):");
        String date = sc.nextLine();

        DataValidator datavalidate = new DataValidator(email, phone, date);

        System.out.println(datavalidate);

    }
}
    class DataValidator {
    private String email,date;
    private int phone;
    public DataValidator(String email,String date,int  phone  ){
        this.email = email;
        this.date = date;
        this.phone = phone;
        
    }
    public String email() {
        return this.email;
    }
     public String email() {
        return this.date;
    }
     
    public String phone() {
        return this.phone;
    }
    
    }