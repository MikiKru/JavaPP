package start.user;

import java.util.Date;

public class User {
    private String login;
    private String password;
    private double salary;
    private boolean activity;
    private Date empl_date;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isActivity() {
        return activity;
    }

    public void setActivity(boolean activity) {
        this.activity = activity;
    }

    public Date getEmpl_date() {
        return empl_date;
    }

    public void setEmpl_date(Date empl_date) {
        this.empl_date = empl_date;
    }
}
