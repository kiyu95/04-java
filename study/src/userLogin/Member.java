package userLogin;

public class Member {
    private String id;
    private String pwd;

    public Member() {

    }

    Member(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd() {
        this.pwd = pwd;
    }

    public String getInfo() {
        return id;
    }
}
