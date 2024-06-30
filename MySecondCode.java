public class MySecondCode {
    public static void main(String[] args) {
        // Declaring and initializing an integer array
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Declaring and initializing a string array
        String[] fruits = { "Apple", "Orange", "Banana", "Mango" };

        // Accessing elements in arrays
        System.out.println("First number: " + numbers[0]);
        System.out.println("Second fruit: " + fruits[1]);

        // Modifying elements in arrays
        numbers[2] = 10;
        System.out.println("Modified number at index 2: " + numbers[2]);

        // Iterating through an array using a for loop
        System.out.println("All fruits:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}
