package lesson29;
/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #29
 * @author Boiko Yaroslav
 * @version 22.03.24
 */
public class Lesson29 {
    public static void main(String[] args) {
    RubberList rubberList = new RubberList();
    System.out.println(rubberList);
    System.out.println(rubberList.getFirst());
    rubberList.add(12);
    System.out.println(rubberList);
    System.out.println(rubberList.getFirst() + " " + rubberList.getLast());
    rubberList.add(8);
    System.out.println(rubberList);
    System.out.println(rubberList.getFirst() + " " + rubberList.getLast());
    rubberList.add(22);
    System.out.println(rubberList);
    System.out.println(rubberList.getFirst() + " " + rubberList.getLast());

//    rubberList.add(3);
//    rubberList.add(-8);
//    rubberList.add(2024);
//    rubberList.add(4);
//    rubberList.add(9);
//    System.out.println(rubberList);
//    System.out.println(rubberList.get(2));
//    System.out.println(rubberList.get(3));
//    System.out.println(rubberList.get(-1));
//    System.out.println(rubberList.get(6));
//    rubberList.remove(0);
//    System.out.println(rubberList);
//    rubberList.remove(2);
//    System.out.println(rubberList);
    }
}
