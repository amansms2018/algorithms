class Test {
   public static final String name2="Abc";
    int test_a, test_b;
    Test(int a, int b) {
        test_a = a;
        test_b = b;
        }
    public Test() {
    }
    private  static void message(String s){
         if(name2.equals(s)){
             /////////////////
         }
    }

    private static final String SOME_STRING_LITERAL_CONSTANT = "ABC";

    private void someMethod(String value) {

        if (value.equals(SOME_STRING_LITERAL_CONSTANT)) {

            //do something

        }

    }


    public static void main (String args[]) {
            Test test = new Test();
            System.out.println(test.test_a+" "+test.test_b);
        }

    }
