package ma.cigma.Imane.Controller;

import ma.cigma.Imane.Services.UserServices;
import ma.cigma.Imane.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/All_Users")
public class UserRestController {

    @Autowired
    private UserServices services;

    @GetMapping("/All_Users")
        public Page<User> getAllUser(Pageable pageable)
    {
        Pageable Pageable = null;
        return services.ShowUsers (Pageable);
    }

    @PostMapping("/CreateUser")
    public User fill(@RequestBody User U) {
        return services.fill(U);
    }

}

