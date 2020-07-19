package cor;

public class SpaceFilter implements IFilter {
    @Override
    public boolean doFilter(Msg msg) {
        System.out.println("do SpaceFilter");
        String m = msg.getMsg();
        m = m.replaceAll(" ", "#");
        msg.setMsg(m);
        return true;
    }
}
