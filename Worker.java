public class Worker {

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Worker(String fullName, String position, String email, String phoneNumber, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.println("Информация о сотруднике " + fullName + ": ");
        System.out.println("Должность - " + position + ". Возраст - " + age + ". email - " + email + ". Номер телефона - " + phoneNumber + ". Зарплата - " + salary + ".");
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getFullName(){
        return fullName;
    }

    public void setPosition(String position){
        this.position = position;
    }
    public String getPosition(){
        return position;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){ return phoneNumber; }

    public void setSalary(int salary){
        if (salary >= 0){
            this.salary = salary;
        }
        else this.salary = -salary;
    }
    public int getSalary(){
        return salary;
    }

    public void setAge(int age){
        if (age >= 0){
            this.age = age;
        } else {
            System.out.println("Введите корректный возраст!");
        }
    }
    public int getAge(){
        return age;
    }
}
