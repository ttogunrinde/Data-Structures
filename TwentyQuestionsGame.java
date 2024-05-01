import java.io.*;
import java.util.Scanner;

class Node implements Serializable {
    String data;
    Node yes;
    Node no;

    Node(String data) {
        this.data = data;
        this.yes = null;
        this.no = null;
    }
}

public class TwentyQuestionsGame {
    private Node root;

    public TwentyQuestionsGame() {
        this.root = new Node("Is it a living thing?");
    }

    public void constructTree() {
        root.yes = new Node("Does it have legs?");
        root.no = new Node("Is it man-made?");
        root.yes.yes = new Node("Is it a mammal?");
        root.yes.no = new Node("Is it a bird?");
        root.no.yes = new Node("Is it electronic?");
        root.no.no = new Node("Is it edible?");

        // Leaf nodes
        root.yes.yes.yes = new Node("Dog");
        root.yes.yes.no = new Node("Snake");
        root.yes.no.yes = new Node("Eagle");
        root.yes.no.no = new Node("Fish");
        root.no.yes.yes = new Node("Phone");
        root.no.yes.no = new Node("Computer");
        root.no.no.yes = new Node("Apple");
        root.no.no.no = new Node("Chair");
    }

    public void playGame() {
        Node current = root;
        Scanner scanner = new Scanner(System.in);
        while (current.yes != null && current.no != null) {
            System.out.print(current.data + " (yes/no): ");
            String answer = scanner.nextLine().toLowerCase();
            if (answer.equals("yes")) {
                current = current.yes;
            } else {
                current = current.no;
            }
        }
        String guess = current.data;
        System.out.print("Is your object " + guess + "? (yes/no): ");
        String confirm = scanner.nextLine().toLowerCase();
        if (confirm.equals("yes")) {
            System.out.println("I win!");
        } else {
            learnNewQuestion(current);
        }
    }

    public void learnNewQuestion(Node wrongGuessNode) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What question would distinguish your object from " + wrongGuessNode.data + "? ");
        String newQuestion = scanner.nextLine();
        System.out.print("What is the answer for your object? (yes/no): ");
        String newAnswer = scanner.nextLine().toLowerCase();

        // Update tree
        String wrongGuess = wrongGuessNode.data;
        wrongGuessNode.data = newQuestion;
        if (newAnswer.equals("yes")) {
            wrongGuessNode.yes = new Node(wrongGuess);
            System.out.print("What is the new object? ");
            wrongGuessNode.no = new Node(scanner.nextLine());
        } else {
            wrongGuessNode.no = new Node(wrongGuess);
            System.out.print("What is the new object? ");
            wrongGuessNode.yes = new Node(scanner.nextLine());
        }
    }

    public void saveTree(String filename) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(root);
            objectOut.close();
            fileOut.close();
            System.out.println("Tree saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadTree(String filename) {
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            root = (Node) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Tree loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TwentyQuestionsGame game = new TwentyQuestionsGame();
        game.constructTree();

        // Play the game
        game.playGame();

        // Save the tree state
        game.saveTree("tree_state.ser");

        // Create a new instance of the game to load the tree state
        TwentyQuestionsGame newGame = new TwentyQuestionsGame();
        // Load the tree state
        newGame.loadTree("tree_state.ser");

        // Play again
        newGame.playGame();
    }
}
