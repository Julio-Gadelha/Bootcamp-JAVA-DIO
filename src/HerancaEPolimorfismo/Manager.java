package HerancaEPolimorfismo;

 public non-sealed class Manager extends Employee {

    private String login;

    private  String password;

    private double commisson;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommisson() {
        return commisson;
    }

    public void setCommisson(double commisson) {
        this.commisson = commisson;
    }
}
