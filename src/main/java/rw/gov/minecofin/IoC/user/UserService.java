package rw.gov.minecofin.IoC.user;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void registerUser(String name,String email){
        userRepository.saveUser(name,email);

    }
}
