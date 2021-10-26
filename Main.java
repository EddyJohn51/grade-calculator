public class Main {
   
    public static void main(String[] args) {
        AssignmentType homework = new AssignmentType("Homework", 0.1);
        Assignment homework_one = new Assignment("Homework 1", homework, 78, 100);

        System.out.println(homework);
        System.out.println(homework_one);

        MainWindow window = new MainWindow();
        javax.swing.SwingUtilities.invokeLater(window);
    }
}
