import org.testng.Assert;
import org.testng.annotations.Test;

public class TeachMeSkills {

    /*
    НАПИСАТЬ МЕТОД, КОТОРЫЙ ПРИНИМАЕТ ЧИСЛО INT И ВОЗВРАЩАЕТ СТРОКУ
    УСЛОВИЕ:
    ЕСЛИ ЧИСЛО КРАТНО 3 - ВЕРНУТЬ БУКВУ T
    ЕСЛИ ЧИСЛО КРАТНО 5 - ВЕРНУТЬ БУКВУ M
    ЕСЛИ ЧИСЛО КРАТНО 3 И 5 - ВЕРНУТЬ БУКВЫ TMS

    ВО ВСЕХ ОСТАЛЬНЫХ СЛУЧАЯХ ВЕРНУТЬ blablabla
     */

    public static String checkNumber(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "TMS";
        } else if (number % 5 == 0) {
            return "M";
        } else if (number % 3 == 0) {
            return "T";
        } else {
            return "blablabla";
        }
    }

    @Test
    public void test1() {
        Assert.assertEquals(checkNumber(3), "T");
    }

    @Test
    public void test2() {
        Assert.assertEquals(checkNumber(5), "M");
    }

    @Test
    public void test3() {
        Assert.assertEquals(checkNumber(15), "TMS");
    }

    @Test
    public void test4() {
        Assert.assertEquals(checkNumber(7), "blablabla");
    }

    @Test
    public void test5() {
        Assert.assertEquals(checkNumber(0), "blablabla");
    }
}
