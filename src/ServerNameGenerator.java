public class ServerNameGenerator {
   static String[] adjectives = {"happy", "tall", "green", "smart", "funny", "big", "delicious", "shiny", "strong", "fast"};

    static String[] nouns = {"dog", "house", "car", "book", "computer", "tree", "phone", "pizza", "friend", "sun"};

    static String returnElement(String[] incomingArr){
       int rand =  (int)(Math.random() * 9);
       System.out.println(rand);
        return incomingArr[rand];
    };

    public static void main(String[] args){

        System.out.printf("%s-%s",returnElement(adjectives),returnElement(nouns));
    }


}
