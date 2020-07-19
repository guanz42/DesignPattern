package cor;

public class EmojiFilter implements IFilter {
    @Override
    public boolean doFilter(Msg msg) {
        System.out.println("do EmojiFilter");
        String m = msg.getMsg();
        m = m.replace(":)", "^v^");
        msg.setMsg(m);
        return true;
    }
}
