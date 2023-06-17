import java.util.Scanner;
public class SwitchNested {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Select an option: \n 1.Option1 \n 2.Option2 \n 3.Option3");
        int selection = sc.nextInt();
        switch(selection){
            case 1:
            System.out.println("Option 1 selected.");
            System.out.println("Select a sub-option: \n a.Sub-option1 \n b.Sub-option2");
            char innerselection = sc.next().charAt(0);
            // charAt(0) is to extract only the first character of the string
            switch(innerselection){
                case 'a':
                System.out.println("Sub-option 1 selected.");
                break;
                case 'b':
                System.out.println("Sub option 2 selected");
                break;
                default:
                System.out.println("Invalid sub-option selection.");
                break;
            }
            break;
            case 2:
            System.out.println("Option 2 selected.");
            break;
            case 3:
            System.out.println("Option 3 selected.");
            break;
            default:
            System.out.println("Invalid option selection.");
            break;
            
        }
        sc.close();

    }
    
}
