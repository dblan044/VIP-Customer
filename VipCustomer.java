
public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    //empty constructor
    //calls constructor #3
    public VipCustomer() {  
        this("Default Name", 0, "unkown@email.com");
        System.out.println("Default Constructor");
    }

    //partial constructor
    //has only one default field - email
    //call constructor #3
    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "unkown@email.com");
        System.out.println("Default Email Constructor");
    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("All Fields Constructor");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
    
    
}
