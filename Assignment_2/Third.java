

//Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     -Java is pass by value. That means when we pass the parameters in the method, we are creating the copy of the parameters and then passing it. 
     -Whenever new instances are created they will be allocated memory. In our example below lets say a is pointing to 100 and b is pointing to 200.
     -In the below example, when swap method is called, we are copying the variables a and b to x and y and then passing the copied variables x and y. 
     -x and y will now be pointing to different memory locations say x = 150 and y =250.
     -When swap method executes, employee x and employee y will be swapped that means, memory location 250 will have employee x details and memory location y will have employee y details
     -But, employee a and employee b remain unchanged and their memory location is untouched.
    */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }
}