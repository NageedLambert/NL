import java.util.Scanner;

public class MealSelector {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String mealSuggestion = "";

        System.out.println("[Meal Selector]");

        System.out.print("How many minutes do you have to prep your meal?: ");
        int time = scanner.nextInt();

        System.out.println("What is your mood?:");
        System.out.println("1. Healthy");
        System.out.println("2. Comfort");
        System.out.println("3. Light Snack");
        System.out.print("> ");
        int moodChoice = scanner.nextInt();

        System.out.print("Vegetarian option? (true/false): ");
        boolean isVegetarian = scanner.nextBoolean();
        
        switch (moodChoice) {
            case 1: // Healthy
                if (time < 15) {
                    if (isVegetarian) {
                        mealSuggestion = "Hummus and veggie wrap";
                    } else {
                        mealSuggestion = "Chicken salad wrap";
                    }
                } else { 
                    if (isVegetarian) {
                        mealSuggestion = "Veggie stir fry with tofu";
                    } else {
                        mealSuggestion = "Grilled chicken with vegetables";
                    }
                }
                break;

            case 2: // Comfort
                if (time < 15) {
                    if (isVegetarian) {
                        mealSuggestion = "Cheese quesadilla";
                    } else {
                        mealSuggestion = "Ham and Cheese sandwich";
                    }
                } else { 
                    if (isVegetarian) {
                        mealSuggestion = "Mac and cheese";
                    } else {
                        mealSuggestion = "Pasta with meat sauce";
                    }
                }
                break;

            case 3: // Light Snack
                if (time < 15) {
                    if (isVegetarian) {
                        mealSuggestion = "Fruit and yogurt bowl";
                    } else {
                        mealSuggestion = "Yogurt with granola and honey";
                    }
                } else { 
                    if (isVegetarian) {
                        mealSuggestion = "Tomato soup with bread";
                    } else {
                        mealSuggestion = "Egg drop soup with rice";
                    }
                }
                break;

            default:
                System.out.println("Invalid mood choice.");
                break;
        }
        
        if (mealSuggestion != null && !mealSuggestion.isEmpty()) {
            System.out.println("You should try " + mealSuggestion);
        }

        scanner.close();
    }
}
