package cor;

public class HTMLFilter implements IFilter {
    @Override
    public boolean doFilter(Msg msg) {
        System.out.println("do HTMLFilter");
        String m = msg.getMsg();
        m = m.replace('<', '[');
        m = m.replace('>', ']');
        msg.setMsg(m);
        return true;
    }
}
