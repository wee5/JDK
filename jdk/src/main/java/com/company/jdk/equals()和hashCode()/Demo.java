/*
* 哈希算法：在关键字和存储位置间建立一个确定的对应关系
* 哈希算法的意义
*   不使用哈希算法时，通过在某结构中查找并比较每个结点，来证明有无和给定对象相同的对象
*   哈希算法通过一次查找给定对象的哈希值（即地址），若地址为空，则结构中没有相同的对象；反之，不能证明对象相同
*
* 未重写的equals()和hashCode()
*   equals()比较地址（通过==比较）
*   hashCode返回地址（是native本地方法，由本地机器实现）
*
* 不重写存在的问题（为什么要重写equlas()）
*   ==，equals()，hashCode()都只能比较地址，即地址相同，则对象相同
*   没有方法证明，当内容相同，则对象相同，即不符合人主观认为的相等条件
*
* 为什么重写equals()就一定要重写hashCode()方法
*   因为需要满以下原则（出自api方法描述，重写前后均是满足此原则的）
*   equals()相同的对象，必须返回相同的哈希值
*   不要求equals不同的对象，返回不同的哈希值；但满足此要求，会减少哈希冲突，提高效率
*
* 重写后的equals()和hashCode()方法
*   equals()比较内容（可证明主观相等）
*   hashCode()返回哈希值,一般是真实地址，也可能哈希冲突导致不是真是地址（只能证明不相等，hashCode不同的对象不相等）
*   证明不相等时，
*
* 重写equals()而不重写hashCode()的影响
*   hashMap，set等集合会出现相同存入相同元素或键的错误
*
* 重写equals()和hashCode()，但所有重写的hashCode均简单地返回1的影响
*   将出现大量的哈希冲突，效率极低
*
* 若不存在哈希冲突，hashCode()返回的是真实地址吗？
*   暂时还不清楚哈希值和地址的关系，只知道以下几点
*   不重写hashCode()时，hashCode返回真实地址，由本地机器实现\
*   打印对象时，@后面的是hashCode()返回的值（重不重写都满足）
*
* */
public class Demo2 {
    public static void main(String[] args) {
        System.out.println("".hashCode()+"___________");

        A a = new A();
        System.out.println(a);
        System.out.println(a.hashCode());
        System.out.println(System.identityHashCode(a)+"___________");

        B b = new B();
        System.out.println(b);
        System.out.println(b.hashCode());
        System.out.println(System.identityHashCode(b)+"___________");

        C c = new C();
        System.out.println(c);
        System.out.println(c.hashCode());
        System.out.println(System.identityHashCode(c)+"___________");
    }

    private static class A{
        public int hashCode(){
            return 33333333;
        }
    }
    private static class B{
        public int hashCode(){
            return 0;
        }
    }
    private static class C{
    }
}
