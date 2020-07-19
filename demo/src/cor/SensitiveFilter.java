package cor;

public class SensitiveFilter implements IFilter {
    @Override
    public boolean doFilter(Msg msg) {
        System.out.println("do SensitiveFilter");
        String m = msg.getMsg();
        m = m.replaceAll("996", "955");
        msg.setMsg(m);
        return false;
    }
}
