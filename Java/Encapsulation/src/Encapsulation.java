public class Encapsulation {

    private String role;
    private String user;
    private String permission = "ADMIN";

    public String getRole() {
        return role;
    }

    public void setRole(String role1) {
        this.role = role1;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        if (permission.equals(role)){
            this.user = user;
        }else {
            this.user = "No permission";
        }

    }
}
