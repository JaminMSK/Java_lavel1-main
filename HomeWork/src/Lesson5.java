/* Сделал Vladislav Torgashev
21.02.2022
 */
class Lesson5 {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan Ivanovitch", "manager", "manager@gmail.com", "+7(968)765-12-10", 25000, 60);
        persArray[1] = new Employee("Ivanov Ivan Ivanovitch1", "manager1", "manager1@gmail.com", "+7(968)765-12-11", 35000, 50);
        persArray[2] = new Employee("Ivanov Ivan Ivanovitch2", "manager2", "manager2@gmail.com", "+7(968)765-12-13", 45000, 40);
        persArray[3] = new Employee("Ivanov Ivan Ivanovitch3", "manager3", "manager3@gmail.com", "+7(968)765-12-14", 55000, 30);
        persArray[4] = new Employee("Ivanov Ivan Ivanovitch4", "manager4", "manager4@gmail.com", "+7(968)765-12-15", 65000, 20);

        for (int i = 0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].print();
    }

    static class Employee {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public Employee(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age;
        }

        public void print() {
            System.out.println(this);
        }
    }
}


