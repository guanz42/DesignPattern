package cor;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements IFilter {

    List<IFilter> filters = new ArrayList<>();

    public FilterChain add(IFilter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Msg msg) {
        for (IFilter filter : filters) {
            if (!filter.doFilter(msg)) return false;
        }

        return true;
    }
}
