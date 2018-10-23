package pizza;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author hjsjy
 * @create 2018/10/21
 * @since 1.0.0
 */

public abstract class Pizaa {
    String name;

    ArrayList list=new ArrayList();
    void prepare() {
        System.out.println("---准备做:"+name+"披萨");
        for(Object adds:list){
            System.out.println("---添加"+adds.toString());
        }
    }
    void bake() {
        System.out.println("---烤20分钟");
    }
    void cut() {
        System.out.println("---披萨切块");
    }

    void box() {
        System.out.println("---打包装盒");
    }

    public String getName() {
        return name;
    }
}