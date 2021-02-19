import com.qian.changmey.formate.DateUtil;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ProjectName: t_javase
 * @Package: PACKAGE_NAME
 * @ClassName: SimpleDateFormatTest
 * @Author: changmey
 * @Description: SimpleDateFormat测试类
 * @Date: 2020/10/1 8:22
 * @Version: 1.0
 */
public class SimpleDateFormatTest {


    @Test
    public void formatTest() throws ParseException {

        DateUtil.formatDate(new Date());

    }
}
