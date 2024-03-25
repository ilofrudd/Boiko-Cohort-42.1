package lesson29;
/**
 * AIT-TR, cohort 42.1, Java Basic, HW #29
 * @author Boiko Yaroslav
 * @version 25.03.24
 */
public class HomeWork29 {
    public static void main(String[] args) {
        RubberList rubberList = new RubberList();
        rubberList.add(23, 2);
        rubberList.add(7);
        rubberList.add(4);
        rubberList.add(12);
        rubberList.add(1);
        rubberList.add(-5);
        System.out.println(rubberList);
        // check contains()
        System.out.println(rubberList.contains(7) + ", " + rubberList.contains(12) + ", " + rubberList.contains(-5));
        System.out.println(rubberList.contains(25));
        // check and indexOf()
        System.out.println(rubberList.indexOf(7) + ", " + rubberList.indexOf(12) + ", " + rubberList.indexOf(-5));
        System.out.println(rubberList.indexOf(25));
        // check get() and remove()
        System.out.println(rubberList.get(2));
        rubberList.remove(2);
        System.out.println(rubberList);
        rubberList.remove(0);
        System.out.println(rubberList);
        rubberList.remove(rubberList.size() - 1);
        System.out.println(rubberList);
    }
}
