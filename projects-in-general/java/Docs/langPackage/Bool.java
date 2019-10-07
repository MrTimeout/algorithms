
public class Bool
{

    public static void Overview()
    {
        //We can construct a java.lang.Boolean object using two differents constructors:
        java.lang.Boolean bool_true = new java.lang.Boolean(java.lang.Boolean.TRUE); 
        java.lang.Boolean bool_false = new java.lang.Boolean(java.lang.Boolean.FALSE);
        java.lang.Boolean bool_string_true = new java.lang.Boolean("True");
        java.lang.Boolean bool_string_false = new java.lang.Boolean("yes");

        System.out.printf("Bool[%b, %s]\n", bool_false.booleanValue(), bool_true.toString());
        System.out.printf("Bool[%b, %b]\n", java.lang.Boolean.getBoolean(bool_string_true.toString()), java.lang.Boolean.parseBoolean(bool_string_false.toString()));
        System.out.println("Class of java.lang.Boolean is: " + java.lang.Boolean.TYPE);
    }
        
    public static void main(String[] args)
    {
        Overview();
    }

}

/**
 *    java.lang.Object
 *      java.lang.Boolean
 *
 *    implements java.io.Serializable, java.lang.Comparable<Boolean>
 *
 *    package java.lang;
 *
 *    public class Boolean extends java.lang.Object implements java.io.Serializable, java.lang.Comparable<Boolean>
 *    {
 *
 *    }
 */ 
