import java.util.*;
import java.text.*;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.io.File;
import java.util.Vector;
import java.util.Enumeration;

public class Main { 
    public static void main(String[] args) {
        VipCustomer acc = new VipCustomer();
        System.out.println(acc.getName());
        System.out.println(acc.getCreditLimit());
        System.out.println(acc.getEmail() );
        System.out.println();
        
        VipCustomer acc2 = new VipCustomer("Diana", 10000);
        System.out.println(acc2.getName());
        System.out.println(acc2.getCreditLimit());
        System.out.println(acc2.getEmail() );
        System.out.println();
        
        VipCustomer acc3 = new VipCustomer("Diana", 10000, "db@email.com");
        System.out.println(acc2.getName());
        System.out.println(acc2.getCreditLimit());
        System.out.println(acc2.getEmail() );
    }
}
