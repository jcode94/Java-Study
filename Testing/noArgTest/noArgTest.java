public class noArgTest {
    public static void main(String[] args) {
        subClassTest test = new subClassTest();
        System.out.println(test);
    }
}

class parentClassTest {
    int number;

    parentClassTest(int n) {
        number = n;
    }
}

class subClassTest extends parentClassTest {

}
