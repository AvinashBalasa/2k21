package java8;

interface Age {
    int x = 21;
    void getAge();

    //default int getx(){ return x;}

}

class LambdaLab {
    public static void main(String[] args)
    {
        /*// Myclass is implementation class of Age interface
        MyClass obj = new MyClass();

        // calling getage() method implemented at Myclass
        obj.getAge();*/

        Age age = new Age() {
            @Override
            public void getAge() {
                System.out.print("Age is "+x);
            }
        };
        age.getAge();

       /* int x=22;
        Age age = (() ->{ System.out.println("age is "+x); });
        age.getAge();*/

    }
}

// Myclass implement the methods of Age Interface
class MyClass implements Age {
    @Override
    public void getAge()
    {
        // printing the age
        System.out.print("Age is " + x);
    }
}