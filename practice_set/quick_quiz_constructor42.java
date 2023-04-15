
    class MEmployee{
        private int id;
        private String name;
        public MEmployee(){
            id=455;
            name="code with harry";
        }
        public String getName(){
            return name;
        }
        public int getId(){
            return id;
        }
    }
    public class quick_quiz_constructor42 {
        public static void main(String[] args) {
            MEmployee harry = new MEmployee();
            System.out.println(harry.getName());
            System.out.println(harry.getId());
        }
    }

