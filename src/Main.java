

public class Main {
    public static void main(String[] args) {
        var male = new Person();
         male.setName("Gabriel");
         male.setAge(13);
         var female = new Person();
         female.setName("Julio");
         female.setAge(46);
        System.out.println(" Male.name :" + male.getName() + " age " + male.getAge());
        System.out.println(" Male.name :" + female.getName() + " age " + female.getAge());
    }
}

