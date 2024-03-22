package lesson28;

public class OuterAndInnerClass {
    private String field = "field";

    private void printText() {
        System.out.println("private method print text");
    }

    public void useInnerclass(){
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.getField());
        innerClass.innerPrintText();

    }

    private class InnerClass {
         String getField() {
            return field;
        }

        void innerPrintText() {
            printText();
        }
    }
}
