package streams;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

class Employee {

    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id : " + id
                + ", Name : " + name
                + ", age : " + age
                + ", Gender : " + gender
                + ", Department : " + department
                + ", Year Of Joining : " + yearOfJoining
                + ", Salary : " + salary;
    }

    public static void main(String[] args) {
        //https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 62500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 54500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 48200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 38900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 65700.0));
        employeeList.add(new Employee(005, "Avinash Balasa", 26, "Male", "DevOps", 2019, 55700.0));

        /*How many male and female employees are there in the organization?
        * For queries such as above where you need to group the input elements, use the Collectors.groupingBy() method.
        * In this query, we use Collectors.groupingBy() method which takes two arguments. We pass Employee::getGender as
        * first argument which groups the input elements based on gender and Collectors.counting() as second argument
        * which counts the number of entries in each group.*/
        System.out.println("\nHow many male and female employees are there in the organization?");
        Map<String, Long> noOfMaleAndFemaleEmployees =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployees);

        /*Print the name of all departments in the organization?*/
        System.out.println("\nPrint the name of all departments in the organization?");
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        System.out.println("\nWhat is the average age of male and female employees?");
        Map<String, Double> avgAgeOfMaleAndFemaleEmployees =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAgeOfMaleAndFemaleEmployees);

        System.out.println("\nGet the details of highest paid employee in the organization?");
        Optional<Employee> highestPaidEmployeeWrapper =
                employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        //employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();;
        if (highestPaidEmployeeWrapper.isPresent()) {
            System.out.println(highestPaidEmployeeWrapper.get().toString());
        }

        System.out.println("\nGet the names of all employees who have joined after 2015?");
        employeeList.stream()
                .filter(e -> e.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .forEach(System.out::println);

        System.out.println("\nCount the number of employees in each department?");
        Map<String, Long> employeeCountByDepartment =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        //System.out.println(employeeCountByDepartment);
        Set<Map.Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();
        for (Map.Entry<String, Long> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nWhat is the average salary of each department?");
        Map<String, Double> avgSalaryOfDepartments =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryOfDepartments);

        System.out.println("\nGet the details of youngest male employee in the product development department?");
        Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper =
                employeeList.stream()
                        .filter(e -> Objects.equals(e.getGender(), "Male") && Objects.equals(e.getDepartment(), "Product Development"))
                        .min(Comparator.comparingInt(Employee::getAge));
        youngestMaleEmployeeInProductDevelopmentWrapper.ifPresent(employee -> System.out.println(employee.toString()));

        System.out.println("\nWho has the most working experience in the organization?");
        Optional<Employee> mostExpEmployee =
                employeeList.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee::getYearOfJoining)));
        //employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        mostExpEmployee.ifPresent(e -> System.out.println(e.toString()));

        System.out.println("\nHow many male and female employees are there in the sales and marketing team?");
        Map<String, Long> countMaleFemaleEmployeesInSalesMarketing =
                employeeList.stream()
                        .filter(e -> Objects.equals(e.getDepartment(), "Sales And Marketing"))
                        .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(countMaleFemaleEmployeesInSalesMarketing);

        System.out.println("\nSeparate the employees who are younger or equal to 25 years from those employees who are older than 25 years.");
        Map<Boolean, List<Employee>> partitionEmployeesByAge =
                employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
        Set<Map.Entry<Boolean, List<Employee>>> entrySet2 = partitionEmployeesByAge.entrySet();
        entrySet2.forEach(entry -> {
            System.out.println("----------------------------");
            if (entry.getKey())
                System.out.println("Employees older than 25 years :");
            else
                System.out.println("Employees younger than or equal to 25 years :");
            System.out.println("----------------------------");
            List<Employee> list = entry.getValue();
            list.stream().map(Employee::getName).forEach(System.out::println);
        });
        partitionEmployeesByAge.entrySet()

        System.out.println("\nWho is the oldest employee in the organization? What is his age and which department he belongs to?");
        Optional<Employee> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        System.out.println(oldestEmployeeWrapper.get());

        System.out.println("\nfind 1st n employee details based on highest salary");
        int n = 4;
        employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(n).forEach(System.out::println);

        System.out.println("\nfind highest salary in each department");
        Map<String, Optional<Employee>> empWithMaxSalaryDeptWise = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
        empWithMaxSalaryDeptWise.entrySet().forEach(entry -> System.out.println(entry.getKey() + "---" + entry.getValue().get().getSalary()));
    }


}