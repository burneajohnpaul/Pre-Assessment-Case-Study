
import java.util.*;

public class Assessment {

    public static void main(String[] args) {

        List<Peripheral> c = new ArrayList<>();
        Iterator<Peripheral> i = c.iterator();
        Scanner s = new Scanner(System.in);
        int p;

        do {
            System.out.println("1.Add Record");
            System.out.println("2.View Record");
            System.out.println("3.Edit Record");
            System.out.println("4.Delete Record");
            System.out.println("5.Report");
            System.out.println("6.Search");
            System.out.println("7.Exit");
            System.out.print("Enter Your Choice : ");
            p = s.nextInt();
            
            Scanner sc = new Scanner(System.in);
            
            switch (p) {
                case 1:
                    System.out.print("Enter Peripheral Number: ");
                    int number = s.nextInt();
                    System.out.print("Enter Peripheral Name: ");
                    String periname = sc.nextLine();
                    System.out.print("Enter Peripheral Type: ");
                    String empname = sc.nextLine();
                    System.out.print("Enter Peripheral Employee Name: ");
                    String ptype = sc.nextLine();
                    c.add(new Peripheral(number, periname, ptype, empname));
                    System.out.println();
                    System.out.println("----------------------------");
                    System.out.println("|    Added Successfully!   |");
                    System.out.println("----------------------------");
                    System.out.println();
                    break;

                case 2:
                    i = c.iterator();
                    while (i.hasNext()) {
                    System.out.println("--------------------------------------");    
                        Peripheral e = i.next();
                        System.out.println(e.Show());
                    }
                    System.out.println("--------------------------------------");
                    System.out.println("|                Done                |");
                    System.out.println("--------------------------------------");
                    break;

                case 3:
                    boolean found = false;
                    System.out.print("Enter Number to Update: ");
                    number = s.nextInt();
                    ListIterator<Peripheral> li = c.listIterator();
                    while (li.hasNext()) {
                        Peripheral e = li.next();
                        if (e.getNumber() == number) {
                            System.out.print("Change Name: ");
                            periname = sc.nextLine();
                            System.out.print("Change Type: ");
                            ptype = sc.nextLine();
                            System.out.print("Change Employee: ");
                            empname = sc.nextLine();
                            li.set(new Peripheral(number, periname, ptype, empname));
                            found = true;
                        }
                    }
                    System.out.println("--------------------------------------");
                    if (!found) {
                        System.out.println("|          Record Not Found          |");
                    } else {
                        System.out.println("| Record is Updated Successfully...! |");
                    }
                    System.out.println("--------------------------------------");
                    break;

                case 4:
                    found = false;
                    System.out.print("Enter Peripheral Number to Delete :");
                    number = s.nextInt();
                    i = c.iterator();
                    while (i.hasNext()) {
                        Peripheral e = i.next();
                        if (e.getNumber() == number) {
                            i.remove();
                            found = true;
                        }
                    }
                    System.out.println("---------------------------------------");
                    if (!found) {
                        System.out.println("|          Record Not Found           |");
                    } else {
                        System.out.println("|  Record is Deleted Successfully...! |");
                    }
                    System.out.println("---------------------------------------");
                    break;
                    
                     case 5:
                    System.out.println("--------------------------------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                        Peripheral e = i.next();
                        System.out.println(e.Show());
                    }
                    System.out.println("--------------------------------------");
                    System.out.println("|                Done                |");
                    System.out.println("--------------------------------------");
                    break;

                case 6:
                    found = false;
                    System.out.print("Enter Peripheral Number to Search: ");
                    number = s.nextInt();
                    i = c.iterator();
                    System.out.println("--------------------------------------");
                    while (i.hasNext()) {
                        Peripheral e = i.next();
                        if (e.getNumber() == number) {
                            System.out.println(e.Show());
                    
                            found = true;
                        }
                    }
                    System.out.println("--------------------------------------");
                    if (!found) {
                        System.out.println("|        Record Not Found            |");
                    } else {
                        System.out.println("|              Done!                 |");
                    }
                    System.out.println("--------------------------------------");
                  
                           break;

                case 7:
                    p = 0;
                    System.out.println("-----------------------------------------");
                    System.out.println("|          Exit Successfully!           |");
                    System.out.println("-----------------------------------------");
                    break;

            }
        } while (p != 0);
    }
}
