public class VanExam {

    public static void main(String[] args) {
        Car c = new Van();
        c.run();

        Van van = (Van) c ;
        van.run();
        van.ppangppang();    
    }
}