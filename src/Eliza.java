import java.util.*;



public class Eliza {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String question;

        System.out.println("Good day. What is your problem? Enter your response here or Q to quit:");
        question = keyboard.nextLine();

        while (!question.equalsIgnoreCase("q") && !question.equalsIgnoreCase("i am feeling great") ) {


            String sampleString = question;
            String[] items = sampleString.split(" ");
            List<String> itemList = new ArrayList<String>(Arrays.asList(items));
            ListIterator<String> iterator = itemList.listIterator();

            while(iterator.hasNext()){
                String next = iterator.next();
                if (next.equalsIgnoreCase("my")){
                    iterator.set("your");
                }else if(next.equalsIgnoreCase("i")){
                    iterator.set("you");
                }else if(next.equalsIgnoreCase("me")){
                    iterator.set("you");
                }else if(next.equalsIgnoreCase("am")){
                    iterator.set("are");
                }
            }
            itemList.add(0, "Why do you say that ");


            String str = Arrays.toString(itemList.toArray());
            System.out.println(itemList.toString().replace("[","").replace("]","").replace(",", ""));

            question = keyboard.nextLine();


        }
        System.out.println("Thank you.");
    }
}