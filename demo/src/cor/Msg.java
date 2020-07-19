package cor;

public class Msg {
    int id;
    String msg;

    public Msg() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    @Override
    public String toString() {
        return "Msg{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                '}';
    }
}