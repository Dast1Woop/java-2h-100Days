public class AddCal {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(a + 3);//13
        System.out.println(a + "3");//103
        System.out.println(a + 1 + "3");//113
        System.out.println("1" + a + 3);//1103
        System.out.println('a' + a + 3);//110,因为字符 'a' 对应的 ascii 码为 97
    }
}
