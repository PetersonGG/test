package pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: Reznov
 * @Description:
 * @Date: 2022/6/8
 */
@Data
public class User{
    private String name;
    private int age;


    @Override
    public int hashCode() {

        return 100;
    }
}
