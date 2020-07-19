package cor;

public class Main {

    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("<script> 大家好，欢迎来到996:)");

        FilterChain fc = new FilterChain();
        fc.add(new HTMLFilter()).add(new SensitiveFilter());

        FilterChain fc2 = new FilterChain();
        fc2.add(new SpaceFilter()).add(new EmojiFilter());

        fc.add(fc2);
        fc.doFilter(msg);

        System.out.println(msg);

    }
}

