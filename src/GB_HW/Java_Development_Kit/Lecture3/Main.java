package GB_HW.Java_Development_Kit.Lecture3;

public class Main {
    private static class Box {
        private Object obj;

        public Box(Object obj) {
            this.obj = obj;
        }
        public Object getObj(){
            return obj;
        }
        public void printInfo(){
            System.out.printf("Box (%s): %s", obj.getClass().getSimpleName(), obj.toString());
        }
    }

    public static void main(String[] args) {
        Box b1 = new Box(20);
        Box b2 = new Box(30);

        System.out.println((Integer)b1.getObj() + (Integer)b2.getObj());

        Box b3 = new Box("Hello");
        Box b4 = new Box("Friend");

        System.out.println(b3.getObj() + (String)b4.getObj());

        Box ibox1 = new Box(20);
        Box ibox2 = new Box(30);
        if(ibox1.getObj() instanceof Integer && ibox2.getObj() instanceof Integer){
            int sum = (Integer) ibox1.getObj() + (Integer) ibox2.getObj();
            System.out.println("sum = " + sum);
        } else {
            System.out.println("The content of the boxes differ by type");
        }

    }
}
