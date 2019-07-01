//MethodReference to instance method (ReferenceVariable::MethodName)

import java.util.function.Supplier;
 
class Company
{
    String name;
     
    public Company(String name) 
    {
        this.name = name;
    }
     
    public String getName()
    {
        return name;
    }
}
 
public class Java8MethodReferences
{
    public static void main(String[] args) 
    {
        Company c = new Company("My_Company");
         
        //Calling getName() of c using lambda
         
        Supplier<String> lambdaSupplier = () -> c.getName();
        System.out.println(lambdaSupplier.get());
         
        //Calling getName() of c using method reference
         
        Supplier<String> referenceSupplier = c::getName;
        System.out.println(referenceSupplier.get());
    }
}
