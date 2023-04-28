public class MyExpulsions extends NumberFormatException {

    private int length;

    public MyExpulsions(int length) {
        super(String.format("Вы ввели: %d значений вместо 6 (фамилия, имя, отчество, дата рождения, телефон и пол)", length));
    }

    public int getLength() {
        return length;
    }

}