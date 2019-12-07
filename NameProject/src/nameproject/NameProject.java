package nameproject;

public class NameProject {

    public static void main(String[] args) {
        person one = new person("Bob", "Davidson", 4);
        
        
        one.setBirthMonth(10);
        one.setFirstName("Alice");
        one.setLastName("Smith");
        
        System.out.println(one.getFullName());
        System.out.println(one.getBirthMonth());
        
        System.out.println(one);
    }
}

class person{
    
    private String firstName;
    private String lastName;
    private int birthMonth;
    
    person(String First, String Last, int Month){
        firstName = First;
        lastName = Last;
        birthMonth = Month;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getFullName(){
        return firstName + " " + lastName;
    }

    public String getBirthMonth() {
        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        return months[birthMonth - 1];
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }
    
    public String toString(){
        return firstName + " " + lastName + " " + getBirthMonth();
    }
}