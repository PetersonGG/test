package mb.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Demo01 {
    public static void main(String[] args) {
        test01();
        // test02();
        // test03();
        // test04();
//        test05();
//        test06();
//        test07();
//        test08();
//        test09();
//        test10();
//          test11();
//        test12();
//        test13();
//        test14();
//        test15();
//        test16();
//        test17();
    }

    private static void test17() {
        //打印作家中年龄大于17并且姓名长度大于2的作家
        List<Author> authors = getAuthors();
        authors.stream()
                .filter((author -> author.getAge() > 17 && author.getName().length()>1))
                .forEach(author -> System.out.println(author.getName()) );

    }

    private static void test16() {
        //使用reduce求作者年龄的最小值
        List<Author> authors = getAuthors();
        Optional<Author> min = authors.stream()
                .min((o1, o2) -> o1.getAge() - o2.getAge());



//        authors.stream()
//                .map(author -> author.getAge())
//                .sorted((o1, o2) -> o1-o2)
//             .limit(1)
//               .forEach(System.out::println);

//        Integer reduce = authors.stream()
//                .map(author -> author.getAge())
//                .reduce(Integer.MAX_VALUE, (result, element) -> result > element ? element : result);
//        System.out.println(reduce);
    }

    private static void test15() {
        //使用reduce求作者年龄的最大值
        List<Author> authors = getAuthors();
        Integer reduce = authors.stream()
                .map(author -> author.getAge())
                .reduce(Integer.MIN_VALUE, (result, element) -> result < element ? element : result);
        System.out.println(reduce);

    }

    private static void test14() {
        //使用reduce求所有作者年龄的和
        List<Author> authors = getAuthors();
        Integer reduce = authors.stream()
                .distinct()
                .map(author -> author.getAge())
//                .reduce(1, (integer, integer2) -> integer*integer2);
                .reduce(0, Integer::sum);

        System.out.println(reduce);
    }

    private static void test13() {
        //作家都没有超过一百岁
        List<Author> authors = getAuthors();
        boolean flag = authors.stream()
                .noneMatch(author -> author.getAge() > 100);
        System.out.println(flag);
    }


    private static void test12() {
        //判断是否所有作者年龄大于18
        List<Author> authors = getAuthors();
        boolean flag = authors.stream()
                .allMatch(author -> author.getAge() >= 18);
        System.out.println(flag);

    }

    private static void test11() {
        //判断是否有一个作者年龄大于25
        List<Author> authors = getAuthors();
        boolean flag = authors.stream()
                .anyMatch(author -> author.getAge() > 25);
        System.out.println(flag);

    }

    private static void test10() {
        //获取一个Map集合， map的key为作者名，value 为List <Book>
        List<Author> authors = getAuthors();
        Map<String, List<Book>> maps = authors.stream()
                .distinct()
                .collect(Collectors
                        .toMap(
                                Author::getName,
                                Author::getBookList));

        Set<Map.Entry<String, List<Book>>> entries = maps.entrySet();
        for (Map.Entry<String, List<Book>> entry : entries) {
            System.out.println(entry);
        }

    }

    private static void test09() {
        //获取一个所有书名的Set集合。
        List<Author> authors = getAuthors();
        Set<String> collect = authors.stream()
                .flatMap(author -> author.getBookList().stream())
                .map(book -> book.getName())
                .collect(Collectors.toSet());
        System.out.println(collect);
    }

    private static void test08() {
        //获取一个存放所有作者名字的List集合。
        List<Author> authors = getAuthors();
        List<String> collect = authors.stream()
                .map(Author::getName)
                .collect(Collectors.toList());
        System.out.println(collect);

    }

    private static void test07() {
        //打印现有数据的所有分类。要求对分类进行去重。不能出现这种格式:哲学爱情爱情
        List<Author> authors = getAuthors();
        authors.stream()
                .flatMap(author -> author.getBookList().stream())
                .flatMap(book -> Arrays.stream(book.getCategory().split(",")))
                .distinct()
                .forEach(System.out::println);

    }

    private static void test06() {
        //打印所有书籍的名字。要求对重复的元素进行去重。
        List<Author> authors = getAuthors();
       authors.stream()
                .flatMap(author -> author.getBookList().stream())
                .distinct()
                .forEach(book-> System.out.println(book.getName()));



    }

    private static void test05() {
        //打印年龄最大的作家外的其他玩家，要求不能有重复元素，并且按照年龄降速排序
        List<Author> authors = getAuthors();
        authors.stream()
                .distinct()
                .sorted((o1, o2) -> o2.getAge()-o1.getAge())
                .skip(1)
                .forEach(System.out::println);
    }

    private static void test04() {
        //对年龄进行降序排列，并且要求不能有重复的元素，然后打印其中两个年龄最大作者的名字
        List<Author> authors = getAuthors();
        authors.stream()
                .distinct()
               .sorted((o1,o2) -> o1.getAge()-o2.getAge())
                .limit(2)
                .map(Author::getName)
                .forEach(System.out::println);
    }

    private static void test03() {
        List<Author> authors = getAuthors();
//        authors.stream()
//                .distinct()
//                .map(Author::getAge)
//                .sorted()
//                .forEach(System.out::println);

        authors.stream()
                .sorted((o1, o2)-> o2.getAge()-o1.getAge())
                .forEach(Author-> System.out.println(Author.getAge()));
    }

    private static void test02() {
        List<Author> authors = getAuthors();

        authors.stream()
                .map(Author::getAge)
                .map(age->age+10)
                .forEach(System.out::println);

    }

    private static void test01() {
        List<Author> authors = getAuthors();

        authors.stream()
                .distinct()
                .filter(author -> author.getName().length()>2)
                .map(author-> author.getId())

                .forEach(System.out::println);
    }

    private static List<Author> getAuthors() {
        Author author1 = new Author(1L, "蒙多", "my introduction 1", 18, null);
        Author author2 = new Author(2L, "亚拉所", "my introduction 2", 19, null);
        Author author3 = new Author(3L, "yjw", "my introduction 3", 14, null);
        Author author4 = new Author(4L, "wdt", "my introduction 4", 29, null);
        Author author5 = new Author(5L, "wtf", "my introduction 5", 12, null);
        Author author6 = new Author(6L, "wtf", "my introduction 6", 12, null);


        List<Book> books1 = new ArrayList<>();
        List<Book> books2 = new ArrayList<>();
        List<Book> books3 = new ArrayList<>();

        // 上面是作者和书
        books1.add(new Book(1L, "类别,分类啊", "书名1", 45, "这是简介哦"));
        books1.add(new Book(2L, "高效", "书名2", 84, "这是简介哦"));
        books1.add(new Book(3L, "喜剧", "书名3", 83, "这是简介哦"));

        books2.add(new Book(5L, "天啊", "书名4", 65, "这是简介哦"));
        books2.add(new Book(6L, "高效", "书名5", 89, "这是简介哦"));

        books3.add(new Book(7L, "久啊", "书名6", 45, "这是简介哦"));
        books3.add(new Book(8L, "高效", "书名7", 44, "这是简介哦"));
        books3.add(new Book(9L, "喜剧", "书名8", 81, "这是简介哦"));

        author1.setBookList(books1);
        author2.setBookList(books2);
        author3.setBookList(books3);
        author4.setBookList(books3);
        author5.setBookList(books2);
        author6.setBookList(books1);

        return new ArrayList<>(Arrays.asList(author1, author2, author3, author4, author5));
    }


}
