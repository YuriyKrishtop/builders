package beans;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Iurii Kryshtop on 13.08.2016.
 */
public class UserBeansTest {

    @Test
    public void BeanTest() {
        UserBean userBean = new UserBean();
        userBean.setName("John");
        userBean.setSurname("Smith");
        assertEquals("John1", userBean.getName());
        assertEquals("Smith", userBean.getSurname());
    }
}
