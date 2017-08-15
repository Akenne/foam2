// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.nanos.auth;


public interface AuthService extends foam.nanos.NanoService {
    public String generateChallenge(String userId);

    public foam.core.X challengedLogin(String userId, String challenge) throws javax.security.auth.login.LoginException;

    public foam.core.X login(String userId, String password) throws javax.security.auth.login.LoginException;

    public Boolean check(foam.core.X x, java.security.Permission permission);

    public foam.core.X updatePassword(foam.core.X x, String oldPassword, String newPassword) throws IllegalStateException;

    public Boolean validateUser(User user) throws IllegalStateException;

    public void logout(foam.core.X x);

    public void start();

}