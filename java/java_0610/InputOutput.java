package java_0610;

public class InputOutput {
    public InputOutput() {
    }

    public static void main(String[] var0) throws Exception {
        boolean var1 = false;
        boolean var2 = false;
        System.out.print("첫 번째 문자를 입력하세요 !");
        int var5 = System.in.read();
        System.out.println("입력한 첫번재 문자는 " + var5 + " 입니다.");
        System.out.println("입력한 첫번째 문자는 " + (char)var5 + " 입니다.");
        int var3 = System.in.read();
        int var4 = System.in.read();
        System.out.println("입력한 두번째 문자는 " + var3 + " 입니다.");
        System.out.println("입력한 두번째 문자는 " + var4 + " 입니다.");
        System.out.print("두 번째 문자를 입력하세요!");
        int var6 = System.in.read();
        System.out.println("입력한 두번째 문자는 " + var6 + " 입니다.");
        System.out.println("입력한 두번재 문자는 " + (char)var6 + " 입니다.");
    }
}
