import java.util.Arrays;
public class ArraysExercises {

    static Person[]addPerson(Person[] incomingArray, Person newPerson){

        Person[] longerArrayCopy = Arrays.copyOf(incomingArray, incomingArray.length+1);

        longerArrayCopy[longerArrayCopy.length -1] = newPerson;
        return longerArrayCopy;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

        Person firstPerson = new Person("Bob");
        Person secondPerson = new Person("Jim");
        Person thirdPerson = new Person("Kim");

        Person[] people = {firstPerson, secondPerson, thirdPerson};



        Person[] longerArray = addPerson(people, new Person("test"));

        for(Person person : longerArray){
            System.out.println(person.getName());
        }
    }
}
