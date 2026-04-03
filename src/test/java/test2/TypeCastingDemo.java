package test2;

public class TypeCastingDemo {
    public static void main(String[] args) {

    int i = 10;
    long l=i;
        System.out.println(l);

        float f = 10.5f;

        double d = f;
        System.out.println(f);
    long ll = 10000;
        int inval1=(int)ll;
        System.out.println(inval1);
   double dd = 125.3;
        float ff=(float)dd;

        System.out.println(ff);
        // String to pre=primitive data type
        String s = "10";
        int intnew1 = Integer.parseInt(s);
        s="12.3";
        double dd1 = Double.parseDouble(s);
        double fg = intnew1+dd1;
        System.out.println(fg);
        s="true";
        System.out.println(Boolean.parseBoolean(s));

        //Primitive to String Data type conversion
        int a = 10;
        double d1= 12.2;
        char c = 'A';
        boolean b1 = true;

        String s1 = String.valueOf(a);
        String s2 = String.valueOf(d1);
        String s3 = String.valueOf(c);
        System.out.println(s1+s2+s3);






    }
}
