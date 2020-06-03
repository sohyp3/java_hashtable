import java.util.*;

class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Map<Integer ,List<String>> h1 = new HashMap<>(); 

    List<String> list1 = new ArrayList<String>();
    List<String> list2 = new ArrayList<String>();
    List<String> list3 = new ArrayList<String>();

    list1.add("suhib");
    list1.add("ist");
    h1.put (2,list1);

    list2.add("name2");
    list2.add("adrs2");
    h1.put (9,list2);

    list3.add("phat");
    list3.add("boy");
    h1.put (8,list3);

  int choice;
    do{
    System.out.print ("====\n0 for exit. \n1 for adding.\n2 for remove.\n3 for search.\n4 for showing \nChose: "); // to let the user to chose between adding / deleting / searching in the records. 
    choice= input.nextInt();
    switch(choice){
        case 1:
            System.out.print("Enter Number (key): ");
            int key = input.nextInt();
            if (h1.containsKey(key)== true){ // if the key is already in use here we can replace it or skip it 
                System.out.print("The Number in use. Do you want to replace it anyways? \n(yes = 1/ no = 0):"); 
                int chk_y_n = input.nextInt();  
                if (chk_y_n == 1){ 
                    System.out.print("Enter Name (Value1): "); 
                    String value1 = input.next();
                    System.out.print("Enter Adress (Value2): "); 
                    String value2 = input.next();
                    List<String> tempList = new ArrayList<String>();
                    tempList.add(value1);
                    tempList.add(value2);           
                    h1.put(key,tempList);
                    System.out.println("Added Succefully");
                    System.out.println(h1);
                }else break;
            }
            else{    
                    System.out.print("Enter Name (Value1): "); 
                    String value1 = input.next();
                    System.out.print("Enter Adress (Value2): "); 
                    String value2 = input.next();
                    List<String> tempList = new ArrayList<String>();
                    tempList.add(value1);
                    tempList.add(value2);           
                    h1.put(key,tempList);
                    System.out.println("Added Succefully");
                    System.out.println(h1);
            }   
            break;

        case 2:
            System.out.print("Who you want to remove? ");
            int rmv = input.nextInt();
            h1.remove(rmv);        
            break;

        case 3:
            System.out.print("Enter the name you want to search for: ");
            String srch = input.next();

            String str = String.valueOf(h1.keySet());
            str = str.replaceAll("\\D+"," ");
            
            String[] stringArray = str.trim().split("\\s+");
            int[] intArray = new int[stringArray.length];
            for (int i = 0; i < stringArray.length; i++) {
                intArray[i] = Integer.parseInt(stringArray[i]);
            }

            for (int i =1; i<=h1.size();i++){
                System.out.println(intArray[i-1]);
                if(h1.get(intArray[i-1]).indexOf(srch) != -1 ) {
                System.out.println(srch + " Found.\nNumber is: " + intArray[i-1]+"\nName, Adress: " + h1.get(intArray[i-1]));
                break;
                }

                else if (i == h1.size()){
                    System.out.println(srch+" Not Found!");
                }
             }
            break;

        case 4: 
            System.out.println(h1);
        }
    }while(choice != 0);

    System.out.println(h1);
  }
}
