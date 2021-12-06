public class main {
    public static void main(String[] args) {
        employee[] employeesArray = new employee[5];{
            employeesArray[0] = new employee("ivan ivanov cergeecivh","web disainer", "ivan@mail.ru","89133322233",15000, 35);
            employeesArray[1] = new employee("timur ivanov cergeecivh","developer", "timur@mail.ru","89123522233",15000, 40);
            employeesArray[2] = new employee("valeri ivanov cergeecivh","accountant", "valery@mail.ru","89123522233",15000, 19);
            employeesArray[3] = new employee("arseny ivanov cergeecivh","lawyer", "arseny@mail.ru","89123323233",15000, 45);
            employeesArray[4] = new employee("egor ivanov cergeecivh","secretary", "egor@mail.ru","89123322239",15000, 96);

        }
        for (int i = 0; i < 5; i++) {
            if (employeesArray[i].age > 40){
                employeesArray[i].info();
            }

        }
    }
}
