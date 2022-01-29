import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        // task 3 (Через Reflection вытащить private поле и поменять ему значение на новое)
        Class<?> student = Class.forName("MathStudent");
        MathStudent anton = (MathStudent) student.getConstructor(String.class, String.class, Integer.TYPE)
                        .newInstance("Anton", "Selivanov", 3);
        System.out.println(anton);
        Field firstName = anton.getClass().getDeclaredField("lastName");
        firstName.setAccessible(true);
        firstName.set(anton, "Durackov");
        System.out.println(anton);

        // task 7 (Получить аннотацию через рефлекшн и вывести на экран студента и название кафедры из аннотации)
        Class<?> studentTwo = Class.forName("BiologyStudent");
        BiologyStudent oleg = (BiologyStudent) studentTwo.getConstructor(String.class, String.class, Integer.TYPE)
                .newInstance("Oleg", "Kranov", 1);
        System.out.println("\n"+anton+ ":\t"+ student.getAnnotations()[0]);
        System.out.println(oleg+ ":\t" + studentTwo.getAnnotations()[0]);
    }
}

