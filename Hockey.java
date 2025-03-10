import java.util.Scanner; 
public class Main
{
    public static void addHockey(){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter Hockey id"); 
        String hockeyid = scan.nextLine(); 
        System.out.println("Enter Hockey name");
        String hockeyname = scan.nextLine(); 
        System.out.println("Enter Hockey weight"); 
        String hockeyweight = scan.nextLine(); 
        System.out.println("Enter Hockey model"); 
        String hockeymodel = scan.nextLine(); 
    }
    
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in); 
        int choice = 0;  
        do {
        System.out.println("Firstar Pte ltd"); 
        System.out.println("1 Add new Hockey-stick"); 
        System.out.println("2 Hockey-stick report"); 
        System.out.println("3 Search new Hockey-stick");
        System.out.println("4 exit"); 
        System.out.println("Enter your choice"); 
        choice = scan.nextInt(); 
        switch(choice){
            case 1 : System.out.println("Add a new Hockey-stick"); 
                    addHockey(); 
            case 2 : System.out.println("Report on Hockey-stick"); 
                    addHockey(); 
                    break; 
            case 3 : System.out.println("Search on Hockey-stick"); 
                    addHockey(); 
                    break; 
            case 4 : System.out.println("Add"); 
                    addHockey(); 
                    break; 
            default: System.out.println("Invalid product"); 
        }; 
    }while(choice != 4); 
    }
}
