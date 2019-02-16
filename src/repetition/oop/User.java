package repetition.oop;

import java.time.LocalDate;
// ALT + Ins -> auto-generator
public class User {
    private int  id;
    private String name, lastame, email, phone,login, password, permission;
    private LocalDate reg_date;
    private boolean activity;

    public User(String name, String lastame, String email, String phone, String login, String password) {
        this.name = name;
        this.lastame = lastame;
        this.email = email;
        this.phone = phone;
        this.login = login;
        this.password = password;
    }
    @Override
    public String toString() {
        return  "================================="+
                "\nid=" + id +
                "\nname='" + name + '\'' +
                "\nlastame='" + lastame + '\'' +
                "\nemail='" + email + '\'' +
                "\nphone='" + phone + '\'' +
                "\nlogin='" + login + '\'' +
                "\npassword='" + password + '\'' +
                "\npermission='" + permission + '\'' +
                "\nreg_date=" + reg_date +
                "\nactivity=" + activity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastame() {
        return lastame;
    }

    public void setLastame(String lastame) {
        this.lastame = lastame;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

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

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public LocalDate getReg_date() {
        return reg_date;
    }

    public void setReg_date(LocalDate reg_date) {
        this.reg_date = reg_date;
    }

    public boolean isActivity() {
        return activity;
    }

    public void setActivity(boolean activity) {
        this.activity = activity;
    }
}
