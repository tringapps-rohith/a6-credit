package credit.credit;

/**
 * Hello world!
 *
 */
import java.util.*;
import java.util.logging.Logger;
class Credit implements cloneable
{
        private String name;
        private String no;
        private String expdate;
        public Credit(String name,String no,String expdate)
        {
                this.name=name;
                this.no=no;
                this.expdate=expdate;
        }
        public Credit()
        {
        }
        public boolean equals(String no1)
        {
                return no.equals(no1);
        }
        public Object clone() throws CloneNotSupportedException
        {
                return super.clone();
        }
        public static void main(String [] args) throws CloneNotSupportedException
        {
                Scanner sin=new Scanner(System.in);
				Logger l=Logger.getLogger("com.api.jar");
                l.info("Enter card holders name\n");
                String name=sin.next();
                l.info("Enter card no\n");
                String no=sin.next();
                l.info("Enter expiry date\n");
                String expdate=sin.next();
                Credit c=new Credit(name,no,expdate);
                Credit c1=(Credit)c.clone();
                l.info("Enter the card no to check by equals method\n");
                String no1=sin.next();
                l.info(c1.equals(no1));
             
        }
}
