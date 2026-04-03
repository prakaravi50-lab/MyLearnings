package tests;

public class ConstructorExample {
    //Assign the value through direct object

    int sid;
    String sname;
    char grade;

    void printValues()
    {
        System.out.println(sid+" "+sname+" "+grade);
    }

    //Storing the values using method
   /* void setValues(int id, String name,char gr)
    {
       sid=id;
       sname=name;
       grade=gr;
    }*/

    //Constructor - initialize the variable while object creation
   ConstructorExample(int id1,String name1, char gr1)
    {
        sid =id1;
        sname=name1;
        grade =gr1;
    }

}
